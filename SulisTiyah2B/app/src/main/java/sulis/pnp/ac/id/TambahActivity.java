package sulis.pnp.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import sulis.pnp.ac.id.Util.ServerAPI;

public class TambahActivity extends AppCompatActivity {
    EditText et_idanggota, et_nama, et_alamat, et_tahun;
    Button btn_tambah;
    ProgressDialog progressBar;
    Spinner sp_jekel;

    private static final String TAG_SUCCESS = "success";
    private static final String TAG_MESSAGE = "message";
    int success;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);

        sp_jekel = findViewById(R.id.sp_jekel);
        et_idanggota = findViewById(R.id.et_idanggota);
        et_nama = findViewById(R.id.et_nama);
        et_alamat = findViewById(R.id.et_alamat);
        et_tahun = findViewById(R.id.et_tahun);
        btn_tambah = findViewById(R.id.btn_tambah);

        progressBar = new ProgressDialog(this);

        String[] jekel = getResources().getStringArray(R.array.jenis_kelamin);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, jekel);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        sp_jekel.setAdapter(adapter);

        proses_tambah();
    }

    private void proses_tambah() {
        btn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_idanggota.getText().toString().length() == 0) {
                    et_idanggota.setError("Tidak Boleh Kosong!");
                } else if (et_nama.getText().toString().length() == 0) {
                    et_nama.setError("Tidak Boleh Kosong!");
                } else if (et_alamat.getText().toString().length() == 0) {
                    et_alamat.setError("Tidak Boleh Kosong!");
                } else if (et_tahun.getText().toString().length() == 0) {
                    et_tahun.setError("Tidak Boleh Kosong!");
                } else {
                    api_tambah( et_idanggota.getText().toString(),
                            et_nama.getText().toString(),
                            sp_jekel.getSelectedItem().toString(),
                            et_alamat.getText().toString(),
                            et_tahun.getText().toString());
                }
            }

        });
    }

    private void api_tambah(final String idanggota,
                            final String nama,
                            final String jeniskelamin,
                            final String alamat,
                            final String tahun) {

        progressBar.setMessage("Please wait...");
        progressBar.show();
        progressBar.setCancelable(false);

        OkHttpClient client = new OkHttpClient();
        RequestBody formBody = new FormBody.Builder()
                .add("idanggota", idanggota)
                .add("nama", nama)
                .add("jeniskelamin", jeniskelamin)
                .add("alamat", alamat)
                .add("tahun", tahun)
                .build();

        final Request request=new Request.Builder()
                .url(ServerAPI.URL_TAMBAH)
                .post(formBody)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                //Jika terjadi error saat Requesrke API//
                progressBar.dismiss();
                Log.d("Tambah", "Failed"+e);
                Toast.makeText(TambahActivity.this, "Server Sedang maintenance",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            if(response.code()==200){
                                //Terhubung ke API//
                                JSONObject jObj = new JSONObject((response.body().string()));
                                success = jObj.getInt(TAG_SUCCESS);
                                if (success == 1) {
                                    Toast.makeText(TambahActivity.this,jObj.getString(TAG_MESSAGE),Toast.LENGTH_LONG).show();
                                }else{
                                    Toast.makeText(TambahActivity.this,jObj.getString(TAG_MESSAGE),Toast.LENGTH_LONG).show();
                                }
                                //Toast.makeText(TambahActivity.this, "Terhubung ke API",Toast.LENGTH_LONG).show();
                            }else{
                                Toast.makeText(TambahActivity.this, "Server Sedang Maintenance",Toast.LENGTH_LONG).show();
                            }
                            progressBar.dismiss();
                        }catch (Exception e){
                            progressBar.dismiss();
                            Log.d("Tambah", "Failed"+e);
                            Toast.makeText(TambahActivity.this, "Server Sedang Maintenance", Toast.LENGTH_LONG).show();
                        }

                    }
                });
            }
        });
    }
}
package sulis.pnp.ac.id.UAS_1002;

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
import sulis.pnp.ac.id.R;
import sulis.pnp.ac.id.TambahActivity;
import sulis.pnp.ac.id.UAS_1002.Util_1002.ServerAPI_1002;
import sulis.pnp.ac.id.Util.ServerAPI;

public class TambahBuku1002Activity extends AppCompatActivity {
    EditText et_idbuku, et_judulbuku, et_pengarang, et_penerbit, et_tahun;
    Button btn_tambah;
    ProgressDialog progressBar;
    Spinner sp_kategori, sp_status;

    private static final String TAG_SUCCESS = "success";
    private static final String TAG_MESSAGE = "message";
    int success;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_buku1002);

        sp_kategori = findViewById(R.id.sp_kategori);
        sp_status = findViewById(R.id.sp_status);
        et_idbuku = findViewById(R.id.et_idbuku);
        et_judulbuku = findViewById(R.id.et_judulbuku);
        et_pengarang = findViewById(R.id.et_pengarang);
        et_penerbit = findViewById(R.id.et_penerbit);
        et_tahun = findViewById(R.id.et_tahun);
        btn_tambah = findViewById(R.id.btn_tambah);

        progressBar = new ProgressDialog(this);

        //String[] kategori = getResources().getStringArray(R.array.kategori);
        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, kategori);
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        //sp_kategori.setAdapter(adapter);

        //String[] status = getResources().getStringArray(R.array.status);
        //ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item,status);
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        //sp_status.setAdapter(adapter2);

        proses_tambah();
    }

    private void proses_tambah() {
        btn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_idbuku.getText().toString().length() == 0) {
                    et_idbuku.setError("Tidak Boleh Kosong!");
                } else if (et_judulbuku.getText().toString().length() == 0) {
                    et_judulbuku.setError("Tidak Boleh Kosong!");
                } else if (et_pengarang.getText().toString().length() == 0) {
                    et_pengarang.setError("Tidak Boleh Kosong!");
                } else if (et_penerbit.getText().toString().length() == 0) {
                    et_penerbit.setError("Tidak Boleh Kosong!");
                } else if (et_tahun.getText().toString().length() == 0) {
                    et_tahun.setError("Tidak Boleh Kosong!");
                } else {
                    api_tambah (et_idbuku.getText().toString(),
                                et_judulbuku.getText().toString(),
                                sp_kategori.getSelectedItem().toString(),
                                et_pengarang.getText().toString(),
                                et_penerbit.getText().toString(),
                                et_tahun.getText().toString(),
                                sp_status.getSelectedItem().toString());
                }
            }

        });
    }

    private void api_tambah(final String idbuku,
                            final String judulbuku,
                            final String kategori,
                            final String pengarang,
                            final String penerbit,
                            final String tahun,
                            final String status) {

        progressBar.setMessage("Please wait...");
        progressBar.show();
        progressBar.setCancelable(false);

        OkHttpClient client = new OkHttpClient();
        RequestBody formBody = new FormBody.Builder()
                .add("idbuku_1002", idbuku)
                .add("judulbuku_1002", judulbuku)
                .add("kategori_1002", kategori)
                .add("pengarang_1002", pengarang)
                .add("penerbit_1002", penerbit)
                .add("tahun_1002", tahun)
                .add("status_1002", status)
                .build();

        final Request request=new Request.Builder()
                .url(ServerAPI_1002.URL_TAMBAH)
                .post(formBody)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //Jika terjadi error saat Requesrke API//
                        progressBar.dismiss();
                        Log.d("Tambah", "Failed"+e);
                        Toast.makeText(TambahBuku1002Activity.this, ""+e,Toast.LENGTH_LONG).show();
                    }
                });

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
                                    Toast.makeText(TambahBuku1002Activity.this,jObj.getString(TAG_MESSAGE),Toast.LENGTH_LONG).show();
                                }else{
                                    Toast.makeText(TambahBuku1002Activity.this,jObj.getString(TAG_MESSAGE),Toast.LENGTH_LONG).show();
                                }
                                //Toast.makeText(TambahBuku1002Activity.this, "Terhubung ke API",Toast.LENGTH_LONG).show();
                            }else{
                                Toast.makeText(TambahBuku1002Activity.this, "Server Sedang Maintenance9",Toast.LENGTH_LONG).show();
                            }
                            progressBar.dismiss();
                        }catch (Exception e){
                            progressBar.dismiss();
                            Log.d("Tambah", "Failed"+e);
                            Toast.makeText(TambahBuku1002Activity.this, ""+e, Toast.LENGTH_LONG).show();
                        }

                    }
                });
            }
        });
    }
}
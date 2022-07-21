package com.sulis.sulistiyah.SQLite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import com.sulis.sulistiyah.R;
import com.sulis.sulistiyah.SQLite.Model.Dao.MahasiswaDao;
import com.sulis.sulistiyah.SQLite.Model.Mahasiswa;

public class FormMhsActivity extends AppCompatActivity {
    EditText et_no_bp,et_nama,et_tlpn,et_alamat;
    Button btn_simpan;
    private MahasiswaDao mahasiswaDao;

    Toolbar toolbar;
    private int update;
    private int putIdUsername;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_mhs);

        et_no_bp = findViewById(R.id.et_no_bp);
        et_nama = findViewById(R.id.et_nama);
        et_tlpn = findViewById(R.id.et_tlpn);
        et_alamat = findViewById(R.id.et_alamat);

        btn_simpan = findViewById(R.id.btn_simpan);
        mahasiswaDao = new MahasiswaDao(this);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Form Input Mahasiswa");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        
        simpan();
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    private void simpan() {
        btn_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Mahasiswa mahasiswa = new Mahasiswa();
                    mahasiswa.setNo_bp(et_no_bp.getText().toString());
                    mahasiswa.setNama(et_nama.getText().toString());
                    mahasiswa.setNo_tlp(et_tlpn.getText().toString());
                    mahasiswa.setAlamat(et_alamat.getText().toString());
                    mahasiswaDao.save(mahasiswa);
                    Toast.makeText(FormMhsActivity.this,"Data Berhasil Disimpan", Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    Toast.makeText(FormMhsActivity.this,"Error"+e,Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
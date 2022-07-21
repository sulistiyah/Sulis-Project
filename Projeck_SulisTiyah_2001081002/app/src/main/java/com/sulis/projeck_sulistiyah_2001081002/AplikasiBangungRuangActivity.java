package com.sulis.projeck_sulistiyah_2001081002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AplikasiBangungRuangActivity extends AppCompatActivity {
    TextView txt_nama, txt_nobp;
    Button txt_bttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplikasi_bangung_ruang);
        txt_nama = (TextView) findViewById(R.id.txt_nama);
        txt_nobp = (TextView) findViewById(R.id.txt_nobp);
        txt_bttn = findViewById(R.id.txt_bttn);

        txt_bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AplikasiBangungRuangActivity.this, AplikasiBangungRuangActivityKedua.class);
                startActivity(intent);
            }
        });
    }
}
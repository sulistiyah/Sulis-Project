package com.sulis.projeck_sulistiyah_2001081002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AplikasiBangungRuangActivityKedua extends AppCompatActivity {
    public EditText txt_panjang, txt_lebar, txt_tinggi;
    public Button txt_bttn;
    public TextView txt_hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aplikasi_bangung_ruang_kedua);
        txt_panjang = (EditText) findViewById(R.id.txt_panjang);
        txt_lebar = (EditText) findViewById(R.id.txt_lebar);
        txt_panjang = (EditText) findViewById(R.id.txt_tinggi);
        txt_bttn = (Button) findViewById(R.id.txt_bttn);
        txt_hasil = (TextView) findViewById(R.id.txt_hasil);

        txt_bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
            }
        });
    }

    private void SetUpView(){

    }

    private void hitungLuas(){
        int angka1 = Integer.parseInt(txt_panjang.getText().toString());
        int angka2 = Integer.parseInt(txt_lebar.getText().toString());
        int angka3 = Integer.parseInt(txt_tinggi.getText().toString());
        int yaitu = angka1 * angka2 * angka3;
        txt_hasil.setText("Luasnya adalah " +yaitu);
    }
}
package com.sulis.intent_2001081002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView txt_nama, txt_umur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt_nama = findViewById(R.id.txt_nama);
        txt_umur = findViewById(R.id.txt_umur);

        Intent dataIntent=getIntent();
        String data = dataIntent.getStringExtra("nama");
        Integer umur = dataIntent.getIntExtra("umur",0);
        if(data.equals("")){
            data="Tidak ada data yang dikirim";
        }

        txt_nama.setText(data);
        txt_umur.setText(""+umur);
    }
}
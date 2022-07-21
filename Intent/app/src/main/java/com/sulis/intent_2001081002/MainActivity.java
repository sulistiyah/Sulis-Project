package com.sulis.intent_2001081002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn_second;
    EditText txt_nama,txt_umur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_second = findViewById(R.id.btn_second);
        txt_nama = findViewById(R.id.txt_nama);
        txt_umur = findViewById(R.id.txt_umur);

        btn_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("nama",txt_nama.getText().toString());
                intent.putExtra("umur",Integer.parseInt(txt_umur.getText().toString()));
                startActivity(intent);
            }
        });
    }
}
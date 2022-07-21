package com.sulis.intent_2001081002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BelajarIntent extends AppCompatActivity {
    private EditText txt_brg, txt_jpembelian;
    private TextView txt_hasil;
    Button txt_bttn;
    int total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_intent);
        txt_brg = (EditText) findViewById(R.id.txt_brg);
        txt_jpembelian = (EditText) findViewById(R.id.txt_jpembelian);
        txt_hasil = (TextView) findViewById(R.id.txt_hasil);
        txt_bttn = (Button) findViewById(R.id.txt_bttn);

        txt_bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int barang1 = Integer.parseInt(txt_brg.getText().toString());
                int pembelian1 = Integer.parseInt(txt_jpembelian.getText().toString());
                total = barang1 * pembelian1;
                txt_hasil.setText(String.valueOf(total));
            }
        });
    }
}
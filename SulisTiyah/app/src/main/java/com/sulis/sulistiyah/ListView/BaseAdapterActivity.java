package com.sulis.sulistiyah.ListView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.sulis.sulistiyah.ListView.AdapterListView.BukuAdapter;
import com.sulis.sulistiyah.R;

public class BaseAdapterActivity extends AppCompatActivity {
    ListView simpleList;
    String bukuList[] = {"Aplikom", "Phyton", "Kriptografi"};
    static final int [] cover = {R.drawable.book1, R.drawable.book2, R.drawable.book3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter);

        simpleList = findViewById(R.id.simpleListView);
        BukuAdapter bukuAdapter = new BukuAdapter(getApplicationContext(), bukuList,cover);
        simpleList.setAdapter(bukuAdapter);
    }
}
package com.sulis.sulistiyah.ListView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sulis.sulistiyah.R;

public class ArrayAdapterActivity extends AppCompatActivity {
    ListView listData;
    String[] programingList={"JAVA", "PHP", "PHYTON", "HTML"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter);
        listData = findViewById(R.id.listData);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, programingList);
        listData.setAdapter(arrayAdapter);
    }
}
package com.sulis.sulistiyah.RecyclerView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sulis.sulistiyah.R;
import com.sulis.sulistiyah.RecyclerView.Adapter.AdapterLaptop;
import com.sulis.sulistiyah.RecyclerView.Model.ModelLaptop;

public class LaptopActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);
        recyclerView = findViewById(R.id.recyclerView);

        //Model Untuk object ModelLaptop
        ModelLaptop[] dataLaptop = new ModelLaptop[] {
                new ModelLaptop("DELL m4500 core i7", "Rp.3.400.000", "PROSESOR INTER CORE I7 // RAM 4GB DDR3", R.drawable.laptop1),
                new ModelLaptop("TUF AMD FX506IV-R9R6B6T-0", "Rp.19.000.000", "FX506IV-R9R6B6T-0 I AMD Ryzen R9-4900H I 15.6 FHD IPS 144Hz", R.drawable.laptop2),
                new ModelLaptop("LENOVO T430 Core i5 GEN3", "Rp.3.369.000", "Processor Intel(R) Core(TM) CPU i5-3320M @2.60Ghz", R.drawable.laptop3),
                new ModelLaptop("LENOVO IDEAPAD V14ADA LAYAR LEBAR 14 FHD", "Rp.5.589.898", "14 FHD LED NOEBOOK KERJA RAM 4 GB & 8 GB HDD ", R.drawable.laptop4),
        };

        //Adapter Untuk AdapterLaptop
        AdapterLaptop adapter = new AdapterLaptop(dataLaptop, LaptopActivity.this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
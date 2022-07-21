package com.sulis.sulistiyah.TabLayout.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sulis.sulistiyah.R;
import com.sulis.sulistiyah.RecyclerView.Adapter.AdapterLaptop;
import com.sulis.sulistiyah.RecyclerView.LaptopActivity;
import com.sulis.sulistiyah.RecyclerView.Model.ModelLaptop;


public class LaptopFragment extends Fragment {
    View view;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_laptop, container, false);
        recyclerView =view.findViewById(R.id.recyclerView);

        //Model Untuk object ModelLaptop
        ModelLaptop[] dataLaptop = new ModelLaptop[] {
                new ModelLaptop("DELL m4500 core i7", "Rp.3.400.000", "PROSESOR INTER CORE I7 // RAM 4GB DDR3", R.drawable.laptop1),
                new ModelLaptop("TUF AMD FX506IV-R9R6B6T-0", "Rp.19.000.000", "FX506IV-R9R6B6T-0 I AMD Ryzen R9-4900H I 15.6 FHD IPS 144Hz", R.drawable.laptop2),
                new ModelLaptop("LENOVO T430 Core i5 GEN3", "Rp.3.369.000", "Processor Intel(R) Core(TM) CPU i5-3320M @2.60Ghz", R.drawable.laptop3),
                new ModelLaptop("LENOVO IDEAPAD V14ADA LAYAR LEBAR 14 FHD", "Rp.5.589.898", "14 FHD LED NOEBOOK KERJA RAM 4 GB & 8 GB HDD ", R.drawable.laptop4),
        };

        //Adapter Untuk AdapterLaptop
        AdapterLaptop adapter = new AdapterLaptop(dataLaptop, getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
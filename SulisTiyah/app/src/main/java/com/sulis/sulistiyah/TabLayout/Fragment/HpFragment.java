package com.sulis.sulistiyah.TabLayout.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sulis.sulistiyah.R;
import com.sulis.sulistiyah.RecyclerView.Adapter.AdapterHP;
import com.sulis.sulistiyah.RecyclerView.HPActivity;
import com.sulis.sulistiyah.RecyclerView.Model.ModelHP;


public class HpFragment extends Fragment {
    RecyclerView recyclerView;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_hp, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);

        //Model untuk Object ModelHP
        ModelHP[] dataHP = new ModelHP[] {
                new ModelHP("VIVO X50","Rp.5.000.000","128GB/256GB Storage, 48Mp/2160p,Android 10, Funtouch 10.5","Tahun 2020",R.drawable.hp1),
                new ModelHP("VIVO V21","Rp.5.000.000","8GB/256GB, 4.000mAh, FlashCharge 33W","Tahun 2021",R.drawable.hp2),
                new ModelHP("VIVO V15 PRO","3.500.000","Android 9.0 Pie dengan antarmuka Funtouch 9, 128Gb, RAM 6 GB","Tahun 2019",R.drawable.hp3),
                new ModelHP("OPPO A53S","2.900.000","720X1600Pixels, 13+2+2MP, Android 10","Tahun 2020",R.drawable.hp4),
                new ModelHP("OPPO A92S","Rp.4.000.000","1080X2400Pixels, Rasio 20:9(~401ppi) 6GB/128GB, 8GB/128GB, Android 10","Tahun 2020",R.drawable.hp5),
                new ModelHP("Samsung Galaxy A51","Rp.4.000.000","Android 10, Up To Android 11, One UI 3.1,64GB/128GB/256GB Storage","Tahun2019",R.drawable.hp6),
                new ModelHP("Samsung Galaxy Z Flip 3","Rp.15.000.000","128GB/256GB Storage, no card slot, 183g, 6.9mm thickness","Tahun 2021",R.drawable.hp7),
                new ModelHP("Samsung Galaxy S21","Rp.14.000.000","Android 11, One UI 3.1, 27g(Sub6), 229g(mmWave), 8.9mm thivkness","Tahun 2021",R.drawable.hp8),
        };

        //Adapter ntuk AdapterHP
        AdapterHP adapter = new AdapterHP(dataHP, getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return  view;
    }

}
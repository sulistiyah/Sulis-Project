package com.sulis.sulistiyah.ListView.AdapterListView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sulis.sulistiyah.R;

public class BukuAdapter extends BaseAdapter {

    Context context;
    String bukuList[];
    int cover[];
    LayoutInflater inflater;


    public BukuAdapter(Context applicationContext, String[] bukuList, int[] cover) {
        this.context = context;
        this.bukuList = bukuList;
        this.cover = cover;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return bukuList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.list_view_base_adapter, null);
        TextView tvJudul;
        ImageView imgView;

        tvJudul = view.findViewById(R.id.tvJudul);
        imgView = view.findViewById(R.id.imgView);

        tvJudul.setText(bukuList[i]);
        imgView.setImageResource(cover[i]);

        return view;
    }
}

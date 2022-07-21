package com.sulis.sulistiyah.RecyclerView.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sulis.sulistiyah.R;
import com.sulis.sulistiyah.RecyclerView.Model.ModelHP;

public class AdapterHP extends RecyclerView.Adapter<AdapterHP.ViewRecHolder> {
    private ModelHP[] listData;
    private Context mContext;

    public AdapterHP(ModelHP[] listData, Context mContext) {
        this.listData = listData;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewRecHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_recycler_hp,parent, false);

        return new AdapterHP.ViewRecHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewRecHolder holder, int position) {
        final ModelHP modelHP = listData[position];
        holder.tvNamaHP.setText(listData[position].getNamaHP());
        holder.tvHargaHP.setText(listData[position].getHargaHP());
        holder.tvSpekHP.setText(listData[position].getSpesifikasiHP());
        holder.tvTahunHP.setText(listData[position].getTahunHP());
        holder.imgView.setImageResource(listData[position].getImgHP());

    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

    public class ViewRecHolder extends RecyclerView.ViewHolder {
        public TextView tvNamaHP, tvHargaHP, tvSpekHP, tvTahunHP;
        public ImageView imgView;

        public ViewRecHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaHP = itemView.findViewById(R.id.tvNamaHP);
            tvHargaHP = itemView.findViewById(R.id.tvHargaHP);
            tvSpekHP = itemView.findViewById(R.id.tvSpekHP);
            tvTahunHP = itemView.findViewById(R.id.tvTahunHP);
            imgView = itemView.findViewById(R.id.imgView);
        }
    }
}

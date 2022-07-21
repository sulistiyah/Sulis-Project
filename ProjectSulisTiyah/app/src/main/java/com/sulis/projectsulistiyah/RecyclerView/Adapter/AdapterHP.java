package com.sulis.projectsulistiyah.RecyclerView.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sulis.projectsulistiyah.R;
import com.sulis.projectsulistiyah.RecyclerView.Model.ModelHP;

public class AdapterHP extends RecyclerView.Adapter<AdapterHP.ViewRechHolder> {
    private ModelHP[] listData;
    private Context mContext;

    public AdapterHP(ModelHP[] listData, Context mContext) {
        this.listData = listData;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewRechHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_recycler_hp,parent, false);

        return new AdapterHP.ViewRechHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewRechHolder holder, int position) {
        final ModelHP modelhp=listData[position];
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

    public class ViewRechHolder extends RecyclerView.ViewHolder {
        public TextView tvNamaHP,tvHargaHP, tvSpekHP, tvTahunHP;
        public ImageView imgView;

        public ViewRechHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaHP=itemView.findViewById(R.id.tvNamaHP);
            tvHargaHP=itemView.findViewById(R.id.tvHarga);
            tvSpekHP=itemView.findViewById(R.id.tvSpekHP);
            tvTahunHP=itemView.findViewById(R.id.tvTahunHP);
            imgView=itemView.findViewById(R.id.imgView);
        }
    }
}

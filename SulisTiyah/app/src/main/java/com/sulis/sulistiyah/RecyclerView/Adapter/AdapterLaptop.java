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
import com.sulis.sulistiyah.RecyclerView.Model.ModelLaptop;

public class AdapterLaptop extends RecyclerView.Adapter<AdapterLaptop.ViewRecHolder> {
    private ModelLaptop[] listData;
    private Context mContext;

    public AdapterLaptop(ModelLaptop[] listData, Context mContext) {
        this.listData = listData;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewRecHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.list_recycler_laptop,parent,false);

        return new AdapterLaptop.ViewRecHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewRecHolder holder, int position) {
        final ModelLaptop modelLaptop = listData[position];
        holder.tvNamaLaptop.setText(listData[position].getNamaLaptop());
        holder.tvHargaLaptop.setText(listData[position].getHargaLaptop());
        holder.tvSpekLaptop.setText(listData[position].getSpesifikasiLaptop());
        holder.imgView.setImageResource(listData[position].getImgLaptop());

    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

    public class ViewRecHolder extends  RecyclerView.ViewHolder{
        public TextView tvNamaLaptop, tvHargaLaptop, tvSpekLaptop;
        public ImageView imgView;

        public ViewRecHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaLaptop = itemView.findViewById(R.id.tvNamaLaptop);
            tvHargaLaptop = itemView.findViewById(R.id.tvHargaLaptop);
            tvSpekLaptop = itemView.findViewById(R.id.tvSpekLaptop);
            imgView = itemView.findViewById(R.id.imgView);
        }
    }
}

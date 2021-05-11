package com.kagu.warehouseapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kagu.warehouseapp.Model.DataModel;
import com.kagu.warehouseapp.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterData extends RecyclerView.Adapter<AdapterData.MyViewHolder> {
    private Context context;
    private ArrayList<DataModel> warehouse;
    private String url = "";

    public AdapterData(Context context, ArrayList<DataModel> warehouse) {
        this.context = context;
        this.warehouse = warehouse;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.card_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.id.setText(warehouse.get(position).getId());
        holder.codeWarehouse.setText(warehouse.get(position).getCodeWarehouse());
        holder.codeItem.setText(warehouse.get(position).getCodeItem());
        holder.nameItem.setText(warehouse.get(position).getNameItem());
    }

    @Override
    public int getItemCount() {
        return warehouse.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView id, codeWarehouse, codeItem, nameItem;
        private ImageView optionImg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.tv_id);
            codeWarehouse = itemView.findViewById(R.id.tv_codeWarehouse);
            codeItem = itemView.findViewById(R.id.tv_codeItem);
            nameItem = itemView.findViewById(R.id.tv_nameItem);
            optionImg = itemView.findViewById(R.id.optionImg);
        }
    }
}
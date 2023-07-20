package com.example.myapplication;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NguoiAyAdapter extends RecyclerView.Adapter<NguoiAyAdapter.NguoiAyViewHolder> {
    private static List<NguoiAyItem> listNguoiAy;

    public NguoiAyAdapter(List<NguoiAyItem> nguoiaylist) { this.listNguoiAy = nguoiaylist;}

    public static NguoiAyItem getNguoiAy(int position) {
        if (listNguoiAy == null || position < 0 || position >= listNguoiAy.size()) {
            return null;
        }
        return listNguoiAy.get(position);
    }

    @NonNull
    @Override
    public NguoiAyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_nguoiay, parent, false);
        return new NguoiAyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NguoiAyAdapter.NguoiAyViewHolder holder, int position) {

        NguoiAyItem item = listNguoiAy.get(position);
        holder.imageView.setImageURI(Uri.parse(item.getImg()));
        holder.valueLoved.setText(String.valueOf(item.getLoved()));
        holder.valueFA.setText(String.valueOf(item.getFA()));
        holder.valueLGBT.setText(String.valueOf(item.getLGBT()));

    }
    @Override
    public int getItemCount() {
        return listNguoiAy.size();
    }

    static class NguoiAyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView valueLoved, valueFA, valueLGBT,btnLoved, btnFA, btnLGBT;
        public NguoiAyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            valueLoved = itemView.findViewById(R.id.vleLoved);
            valueFA = itemView.findViewById(R.id.vleFa);
            valueLGBT = itemView.findViewById(R.id.vleLGBT);
            btnLoved = itemView.findViewById(R.id.btnLoved);
            btnFA = itemView.findViewById(R.id.btnFA);
            btnLGBT = itemView.findViewById(R.id.btnLGBT);

            btnFA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    NguoiAyItem item = getNguoiAy(getAdapterPosition());
                    int valueFACount = item.getFA();
                    valueFACount++;
                    item.setFA(valueFACount);
                    valueFA.setText(String.valueOf(valueFACount));
                }
            });
            btnLoved.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    NguoiAyItem item = getNguoiAy(getAdapterPosition());
                    int valueLovedCount = item.getLoved();
                    valueLovedCount++;
                    item.setLoved(valueLovedCount);
                    valueLoved.setText(String.valueOf(valueLovedCount));
                }
            });

            btnLGBT.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    NguoiAyItem item = getNguoiAy(getAdapterPosition());
                    int valueLGBTCount = item.getLGBT();
                    valueLGBTCount++;
                    item.setLGBT(valueLGBTCount);
                    valueLGBT.setText(String.valueOf(valueLGBTCount));
                }
            });
        }
    }
}

package com.example.catcareapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPetFunAdapter extends RecyclerView.Adapter<ListPetFunAdapter.ListViewHolder> {

    private ArrayList<PetFun> listPetFun;

    //on click
    private ListPetFunAdapter.OnItemClickCallback onItemClickCallback;

    //on click method
    public void setOnItemClickCallback(ListPetFunAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListPetFunAdapter(ArrayList<PetFun> list){
        this.listPetFun = list;
    }

    @NonNull
    @Override
    public ListPetFunAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_fun, viewGroup, false);
        return new ListPetFunAdapter.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListPetFunAdapter.ListViewHolder holder, int position) {
        PetFun petFun = listPetFun.get(position);
        Glide.with(holder.itemView.getContext())
                .load(petFun.getPhotoThumbnail())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(petFun.getName());
        holder.tvDetail.setText(petFun.getDetail());

        //on click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listPetFun.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPetFun.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

    //on click interface
    public interface OnItemClickCallback {
        void onItemClicked(PetFun data);
    }
}
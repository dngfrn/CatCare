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

public class ListPetGroomAdapter extends RecyclerView.Adapter<ListPetGroomAdapter.ListViewHolder> {

    private ArrayList<PetGrooming> listPetGrooming;

    //on click
    private ListPetGroomAdapter.OnItemClickCallback onItemClickCallback;

    //on click method
    public void setOnItemClickCallback(ListPetGroomAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListPetGroomAdapter(ArrayList<PetGrooming> list){
        this.listPetGrooming = list;
    }

    @NonNull
    @Override
    public ListPetGroomAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_waytobath, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListPetGroomAdapter.ListViewHolder holder, int position) {
        PetGrooming petGrooming = listPetGrooming.get(position);
        Glide.with(holder.itemView.getContext())
                .load(petGrooming.getPhotoThumbnail())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(petGrooming.getName());
        holder.tvDetail.setText(petGrooming.getDetail());

        //on click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listPetGrooming.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPetGrooming.size();
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
        void onItemClicked(PetGrooming data);
    }
}
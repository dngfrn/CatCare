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

public class ListPetHouseAdapter extends RecyclerView.Adapter<ListPetHouseAdapter.ListViewHolder> {

    private ArrayList<PetHouse> listPetHouse;

    //on click
    private ListPetHouseAdapter.OnItemClickCallback onItemClickCallback;

    //on click method
    public void setOnItemClickCallback(ListPetHouseAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListPetHouseAdapter(ArrayList<PetHouse> list){
        this.listPetHouse = list;
    }

    @NonNull
    @Override
    public ListPetHouseAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_house, viewGroup, false);
        return new ListPetHouseAdapter.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListPetHouseAdapter.ListViewHolder holder, int position) {
        PetHouse petHouse = listPetHouse.get(position);
        Glide.with(holder.itemView.getContext())
                .load(petHouse.getPhotoThumbnail())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(petHouse.getName());
        holder.tvDetail.setText(petHouse.getDetail());

        //on click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listPetHouse.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPetHouse.size();
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
        void onItemClicked(PetHouse data);
    }
}
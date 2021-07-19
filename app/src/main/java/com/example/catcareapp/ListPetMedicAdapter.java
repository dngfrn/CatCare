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

public class ListPetMedicAdapter extends RecyclerView.Adapter<ListPetMedicAdapter.ListViewHolder> {

    private ArrayList<PetMedic> listPetMedic;

    //on click
    private ListPetMedicAdapter.OnItemClickCallback onItemClickCallback;

    //on click method
    public void setOnItemClickCallback(ListPetMedicAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListPetMedicAdapter(ArrayList<PetMedic> list){
        this.listPetMedic = list;
    }

    @NonNull
    @Override
    public ListPetMedicAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_medic, viewGroup, false);
        return new ListPetMedicAdapter.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListPetMedicAdapter.ListViewHolder holder, int position) {
        PetMedic petMedic = listPetMedic.get(position);
        Glide.with(holder.itemView.getContext())
                .load(petMedic.getPhotoThumbnail())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(petMedic.getName());
        holder.tvDetail.setText(petMedic.getDetail());

        //on click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listPetMedic.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPetMedic.size();
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
        void onItemClicked(PetMedic data);
    }
}
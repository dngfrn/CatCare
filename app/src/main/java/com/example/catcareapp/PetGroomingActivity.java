package com.example.catcareapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PetGroomingActivity extends AppCompatActivity {
    private RecyclerView rvPetGrooming;
    private ArrayList<PetGrooming> list = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petgrooming);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvPetGrooming = findViewById(R.id.rv_pet_grooming);
        rvPetGrooming.setHasFixedSize(true);

        list.addAll(PetGroomingContents.getListData());
        showRecycleList();
    }

    private void showRecycleList(){
        rvPetGrooming.setLayoutManager(new LinearLayoutManager(this));
        ListPetGroomAdapter listPetGroomAdapter = new ListPetGroomAdapter(list);
        rvPetGrooming.setAdapter(listPetGroomAdapter);

        //on click
        listPetGroomAdapter.setOnItemClickCallback(new ListPetGroomAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(PetGrooming data) {
                showSelectedPetGrooming(data);
            }
        });
    }

    //on click method
    private void showSelectedPetGrooming(PetGrooming petGrooming){
        Intent kirimData = new Intent(PetGroomingActivity.this, DetailGroomActivity.class);
        kirimData.putExtra(DetailGroomActivity.EXTRA_NAMA, petGrooming.getName());
        kirimData.putExtra(DetailGroomActivity.EXTRA_DETAIL, petGrooming.getDetail());
        startActivity(kirimData);
    }
}

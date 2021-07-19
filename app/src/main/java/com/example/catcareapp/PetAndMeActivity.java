package com.example.catcareapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PetAndMeActivity extends AppCompatActivity {
    private RecyclerView rvPetFun;
    private ArrayList<PetFun> list = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petandme);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvPetFun = findViewById(R.id.rv_pet_fun);
        rvPetFun.setHasFixedSize(true);

        list.addAll(PetFunContents.getListData());
        showRecycleList();
    }

    private void showRecycleList(){
        rvPetFun.setLayoutManager(new LinearLayoutManager(this));
        ListPetFunAdapter listPetFunAdapter = new ListPetFunAdapter(list);
        rvPetFun.setAdapter(listPetFunAdapter);

        //on click
        listPetFunAdapter.setOnItemClickCallback(new ListPetFunAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(PetFun data) {
                showSelectedPetFun(data);
            }
        });
    }

    //on click method
    private void showSelectedPetFun(PetFun petFun){
        Intent kirimData = new Intent(PetAndMeActivity.this, DetailFunActivity.class);
        kirimData.putExtra(DetailFunActivity.EXTRA_NAMA, petFun.getName());
        kirimData.putExtra(DetailFunActivity.EXTRA_DETAIL, petFun.getDetail());
        startActivity(kirimData);
    }
}
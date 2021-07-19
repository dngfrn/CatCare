package com.example.catcareapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PetHouseActivity extends AppCompatActivity {
    private RecyclerView rvPetHouse;
    private ArrayList<PetHouse> list = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pethouse);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvPetHouse = findViewById(R.id.rv_pet_house);
        rvPetHouse.setHasFixedSize(true);

        list.addAll(PetHouseContents.getListData());
        showRecycleList();
    }

    private void showRecycleList(){
        rvPetHouse.setLayoutManager(new LinearLayoutManager(this));
        ListPetHouseAdapter listPetHouseAdapter = new ListPetHouseAdapter(list);
        rvPetHouse.setAdapter(listPetHouseAdapter);

        //on click
        listPetHouseAdapter.setOnItemClickCallback(new ListPetHouseAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(PetHouse data) {
                showSelectedPetHouse(data);
            }
        });
    }

    //on click method
    private void showSelectedPetHouse(PetHouse petHouse){
        Intent kirimData = new Intent(PetHouseActivity.this, DetailHouseActivity.class);
        kirimData.putExtra(DetailHouseActivity.EXTRA_NAMA, petHouse.getName());
        kirimData.putExtra(DetailHouseActivity.EXTRA_DETAIL, petHouse.getDetail());
        startActivity(kirimData);
    }
}

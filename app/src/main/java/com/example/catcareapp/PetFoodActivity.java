package com.example.catcareapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PetFoodActivity extends AppCompatActivity {
    private RecyclerView rvPetFood;
    private ArrayList<PetFood> list = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petfood);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvPetFood = findViewById(R.id.rv_pet_food);
        rvPetFood.setHasFixedSize(true);

        list.addAll(PetFoodContents.getListData());
        showRecycleList();
    }

    private void showRecycleList(){
        rvPetFood.setLayoutManager(new LinearLayoutManager(this));
        ListPetFoodAdapter listPetFoodAdapter = new ListPetFoodAdapter(list);
        rvPetFood.setAdapter(listPetFoodAdapter);

        //on click
        listPetFoodAdapter.setOnItemClickCallback(new ListPetFoodAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(PetFood data) {
                showSelectedPetFood(data);
            }
        });
    }

    //on click method
    private void showSelectedPetFood(PetFood petFood){
        Intent kirimData = new Intent(PetFoodActivity.this, DetailFoodActivity.class);
        kirimData.putExtra(DetailFoodActivity.EXTRA_NAMA, petFood.getName());
        kirimData.putExtra(DetailFoodActivity.EXTRA_DETAIL, petFood.getDetail());
        startActivity(kirimData);
    }
}

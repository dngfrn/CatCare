package com.example.catcareapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PetMedicActivity extends AppCompatActivity {
    private RecyclerView rvPetMedic;
    private ArrayList<PetMedic> list = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petmedication);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvPetMedic = findViewById(R.id.rv_pet_medic);
        rvPetMedic.setHasFixedSize(true);

        list.addAll(PetMedicContents.getListData());
        showRecycleList();
    }

    private void showRecycleList(){
        rvPetMedic.setLayoutManager(new LinearLayoutManager(this));
        ListPetMedicAdapter listPetMedicAdapter = new ListPetMedicAdapter(list);
        rvPetMedic.setAdapter(listPetMedicAdapter);

        //on click
        listPetMedicAdapter.setOnItemClickCallback(new ListPetMedicAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(PetMedic data) {
                showSelectedPetMedic(data);
            }
        });
    }

    //on click method
    private void showSelectedPetMedic(PetMedic petMedic){
        Intent kirimData = new Intent(PetMedicActivity.this, DetailMedicActivity.class);
        kirimData.putExtra(DetailMedicActivity.EXTRA_NAMA, petMedic.getName());
        kirimData.putExtra(DetailMedicActivity.EXTRA_DETAIL, petMedic.getDetail());
        startActivity(kirimData);
    }
}

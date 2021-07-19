package com.example.catcareapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

        Button food, grooming, petandme, medic, house;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //BottomNavigationView bottomNavigationView = findViewById(R.id.menu_bawah);
            //bottomNavigationView.setSelectedItemId(R.id.home);

            food = findViewById(R.id.food_button);
            grooming = findViewById(R.id.grooming_button);
            petandme = findViewById(R.id.petandme_button);
            medic = findViewById(R.id.medic_button);
            house = findViewById(R.id.house_button);
            //home = findViewById(R.id.home);
            //profile = findViewById(R.id.profile);
        }


    public void food(View view) {
        Intent intent = new Intent(MainActivity.this, PetFoodActivity.class);
        startActivity(intent);
    }

    public void grooming(View view) {
        Intent intent = new Intent(MainActivity.this, PetGroomingActivity.class);
        startActivity(intent);
    }

    public void petandme(View view) {
        Intent intent = new Intent(MainActivity.this, PetAndMeActivity.class);
        startActivity(intent);
    }

    public void medic(View view) {
        Intent intent = new Intent(MainActivity.this, PetMedicActivity.class);
        startActivity(intent);
    }

    public void house(View view) {
        Intent intent = new Intent(MainActivity.this, PetHouseActivity.class);
        startActivity(intent);
    }
}

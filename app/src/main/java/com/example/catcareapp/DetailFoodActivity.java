package com.example.catcareapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailFoodActivity extends AppCompatActivity {

    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_DETAIL = "extra_detail";
    private TextView tvNama, tvDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvNama = findViewById(R.id.tv_name);
        tvDetail = findViewById(R.id.tv_detail);

        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);

        tvNama.setText(nama);
        tvDetail.setText(detail);

    }
}
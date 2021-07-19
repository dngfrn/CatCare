package com.example.catcareapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class DetailHouseActivity extends AppCompatActivity {

    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_DETAIL = "extra_detail";
    private TextView tvNama, tvDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_house);
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
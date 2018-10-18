package com.devjurnal.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class RincianActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rincian);


        // TODO 9. GetExtra Data Intent
        String DataJudul = getIntent().getStringExtra("DataJudul");
        String DataPoster= getIntent().getStringExtra("DataPoster");
        String DataDetail = getIntent().getStringExtra("DataDetail");

        // TODO 10. Tampilkan data Judul
        getSupportActionBar().setTitle(DataJudul);


        // TODO 11. Tampilkan Data Detail
        TextView tvContentDetail = (TextView) findViewById(R.id.contentDetail);
        tvContentDetail.setText(DataDetail.toString());

        // TODO 12 Tampilkan Gambar
        ImageView ivDetailPoster = (ImageView) findViewById(R.id.ivDetailPoster);
        Glide.with(RincianActivity.this).load(DataPoster).into(ivDetailPoster);
    }
}

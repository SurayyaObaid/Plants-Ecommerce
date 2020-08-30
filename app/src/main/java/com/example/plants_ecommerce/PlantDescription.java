package com.example.plants_ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlantDescription extends AppCompatActivity {
    ImageView image;
    TextView title, price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_description);
        title = findViewById(R.id.plantTitle);
        price = findViewById(R.id.plantPrice);
        image = findViewById(R.id.plantImage);
        Intent in= getIntent();
        Bundle desc = getIntent().getExtras();
        title.setText(desc.getString("title"));
        price.setText(desc.getString("price"));
        Bitmap bitmap = getIntent().getParcelableExtra("image");
        image.setImageBitmap(bitmap);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int resId = bundle.getInt("resId");
            image.setImageResource(resId);

    }
}}
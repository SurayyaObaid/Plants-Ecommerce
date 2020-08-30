package com.example.plants_ecommerce;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class BuySeeds extends AppCompatActivity {
    private static final String TAG="BuySeeds";

    private ArrayList<String> names= new ArrayList<>();
    private ArrayList<Integer> images= new ArrayList<>();

    Button description1,description2,description3,description4;
    TextView title1,title2,title3,title4,price1,price2,price3,price4;
    ImageView image1,image2,image3,image4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_seeds);
        title1 = findViewById(R.id.title1);
        price1 = findViewById(R.id.price1);
        image1 = findViewById(R.id.image1);

        title2 = findViewById(R.id.title2);
        price2 = findViewById(R.id.price2);
        image2 = findViewById(R.id.image2);

        title3 = findViewById(R.id.title3);
        price3 = findViewById(R.id.price3);
        image3 = findViewById(R.id.image3);

        title4 = findViewById(R.id.title4);
        price4 = findViewById(R.id.price4);
        image4 = findViewById(R.id.image4);
        description1 = findViewById(R.id.description1);
        description2 = findViewById(R.id.description2);
        description3 = findViewById(R.id.description3);
        description4 = findViewById(R.id.description4);
        description1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(BuySeeds.this,PlantDescription.class);
                Bundle bundle = new Bundle();
                bundle.putString("title",title1.getText().toString());
                bundle.putString("price",price1.getText().toString());
                Bitmap bitmap = getIntent().getParcelableExtra("image");
                image1.setImageBitmap(bitmap);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        description2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(BuySeeds.this,PlantDescription.class);
                Bundle bundle = new Bundle();
                bundle.putString("title",title2.getText().toString());
                bundle.putString("price",price2.getText().toString());
                Bitmap bitmap = getIntent().getParcelableExtra("image");
                image2.setImageBitmap(bitmap);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        description3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(BuySeeds.this,PlantDescription.class);
                Bundle bundle = new Bundle();
                bundle.putString("title",title3.getText().toString());
                bundle.putString("price",price3.getText().toString());
                Bitmap bitmap = getIntent().getParcelableExtra("resId");
                image3.setImageBitmap(bitmap);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        description4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(BuySeeds.this,PlantDescription.class);
                Bundle bundle = new Bundle();
                bundle.putString("title",title4.getText().toString());
                bundle.putString("price",price4.getText().toString());
                Bitmap bitmap = getIntent().getParcelableExtra("image");
                image4.setImageBitmap(bitmap);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        addListenerOnCartButton();
        //addListenerOnWishButton();
        ImageButton recommend=(ImageButton)findViewById(R.id.recommend);
        recommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(BuySeeds.this,PlantDescription.class);
                startActivity(in);
            }
        });

    }


    //wishlist toast method
    /*
    private void addListenerOnWishButton() {
        ImageButton wish=(ImageButton)findViewById(R.id.wish);
        ImageButton wish2=(ImageButton)findViewById(R.id.wish2);
        ImageButton wish3=(ImageButton)findViewById(R.id.wish3);
        ImageButton wish4=(ImageButton)findViewById(R.id.wish4);
        ImageButton wish5=(ImageButton)findViewById(R.id.wish5);
        ImageButton wish6=(ImageButton)findViewById(R.id.wish6);
        ImageButton wish7=(ImageButton)findViewById(R.id.wish7);
        ImageButton wish8=(ImageButton)findViewById(R.id.wish8);
        wish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySeeds.this,"Added to Wishlist",Toast.LENGTH_SHORT).show();
            }
        });
        wish2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySeeds.this,"Added to Wishlist",Toast.LENGTH_SHORT).show();
            }
        });
        wish3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySeeds.this,"Added to Wishlist",Toast.LENGTH_SHORT).show();
            }
        });
        wish4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySeeds.this,"Added to Wishlist",Toast.LENGTH_SHORT).show();
            }
        });
        wish5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySeeds.this,"Added to Wishlist",Toast.LENGTH_SHORT).show();
            }
        });
        wish6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySeeds.this,"Added to Wishlist",Toast.LENGTH_SHORT).show();
            }
        });
        wish7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySeeds.this,"Added to Wishlist",Toast.LENGTH_SHORT).show();
            }
        });
        wish8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySeeds.this,"Added to Wishlist",Toast.LENGTH_SHORT).show();
            }
        });
    }*/
    //cart toast method

    private void addListenerOnCartButton() {
        /*ImageButton cart=(ImageButton)findViewById(R.id.cart);
        ImageButton cart2=(ImageButton)findViewById(R.id.cart2);
        ImageButton cart3=(ImageButton)findViewById(R.id.cart3);
        ImageButton cart4=(ImageButton)findViewById(R.id.cart4);
        ImageButton cart5=(ImageButton)findViewById(R.id.cart5);
        ImageButton cart6=(ImageButton)findViewById(R.id.cart6);
        ImageButton cart7=(ImageButton)findViewById(R.id.cart7);
        ImageButton cart8=(ImageButton)findViewById(R.id.cart8);*/
        /*cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySeeds.this,
                        "Added to cart!", Toast.LENGTH_SHORT).show();
            }
        });*/

       /* cart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySeeds.this,
                        "Added to cart!", Toast.LENGTH_SHORT).show();
            }
        });
        cart3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySeeds.this,
                        "Added to cart!", Toast.LENGTH_SHORT).show();
            }
        });
        cart4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySeeds.this,
                        "Added to cart!", Toast.LENGTH_SHORT).show();
            }
        });
        cart5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySeeds.this,
                        "Added to cart!", Toast.LENGTH_SHORT).show();
            }
        });

        cart6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySeeds.this,
                        "Added to cart!", Toast.LENGTH_SHORT).show();
            }
        });
        cart7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySeeds.this,
                        "Added to cart!", Toast.LENGTH_SHORT).show();
            }
        });
        cart8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySeeds.this,
                        "Added to cart!", Toast.LENGTH_SHORT).show();
            }
        });*/

        getImage();
    }


    private void getImage(){
        Log.d(TAG,"initImages");
        images.add(R.drawable.car5);
        names.add("Money Plant");

        images.add(R.drawable.car3);
        names.add("Money Plant");

        images.add(R.drawable.car4);
        names.add("Money Plant");

        images.add(R.drawable.car6);
        names.add("Money Plant");


        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG,"recycler method");
        LinearLayoutManager layoutManager =new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //RecyclerView recyclerView=findViewById(R.id.recommendrecycler);
       // recyclerView.setLayoutManager(layoutManager);
        //RecommendRecycler adapter=new RecommendRecycler(this,names,images);
        //recyclerView.setAdapter(adapter);
    }

}

package com.lakshanandroid.shopymart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView tShirts, SportShirt, FemaleDress, Sweater;
    private  ImageView SunGlass, Hats, Walltes,Shoes;
    private  ImageView HandFree, Laptops, Watches, Phones;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        tShirts = (ImageView) findViewById(R.id.t_shirt);
        SportShirt = (ImageView) findViewById(R.id.Sport_Dress);
        FemaleDress = (ImageView) findViewById(R.id.Femal_Dress);
        Sweater = (ImageView) findViewById(R.id.Swetear);
        SunGlass = (ImageView) findViewById(R.id.Sunglass);

        Hats = (ImageView) findViewById(R.id.Hat);
        Walltes = (ImageView) findViewById(R.id.Wallet);
        Shoes = (ImageView) findViewById(R.id.Shoes);
        HandFree = (ImageView) findViewById(R.id.Handfree);
        Laptops = (ImageView) findViewById(R.id.Laptop);
        Watches = (ImageView) findViewById(R.id.Watch);
        Phones = (ImageView) findViewById(R.id.Phone);


        tShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddProductActivity.class);
                intent.putExtra("category", "tShirts");
                startActivity(intent);
            }
        });

        SportShirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddProductActivity.class);
                intent.putExtra("category", "SportShirts");
                startActivity(intent);
            }
        });

        FemaleDress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddProductActivity.class);
                intent.putExtra("category", "FemaleDress");
                startActivity(intent);
            }
        });

        Sweater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddProductActivity.class);
                intent.putExtra("category", "Sweater");
                startActivity(intent);
            }
        });

        SunGlass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddProductActivity.class);
                intent.putExtra("category", "SunGlass");
                startActivity(intent);
            }
        });

        Hats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddProductActivity.class);
                intent.putExtra("category", "Hats");
                startActivity(intent);
            }
        });

        Walltes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddProductActivity.class);
                intent.putExtra("category", "Walltes");
                startActivity(intent);
            }
        });

        Shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddProductActivity.class);
                intent.putExtra("category", "Shoes");
                startActivity(intent);

            }
        });

        HandFree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddProductActivity.class);
                intent.putExtra("category", "HandFree");
                startActivity(intent);
            }
        });

        Laptops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddProductActivity.class);
                intent.putExtra("category", "Laptops");
                startActivity(intent);
            }
        });

        Watches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddProductActivity.class);
                intent.putExtra("category", "Watches");
                startActivity(intent);
            }
        });

        Phones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {

                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddProductActivity.class);
                intent.putExtra("category", "Phones");
                startActivity(intent);
            }
        });
    }
}

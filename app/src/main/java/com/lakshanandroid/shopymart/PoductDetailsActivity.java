package com.lakshanandroid.shopymart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PoductDetailsActivity extends AppCompatActivity {

    private FloatingActionButton addToCartBtn;
    private ImageView ProductImage;
    private ElegantNumberButton numberButton;
    private TextView productPrice, productDescrition, productName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poduct_details);

        addToCartBtn = (FloatingActionButton)findViewById(R.id.add_produtc_cart_btn);
        numberButton = (ElegantNumberButton)findViewById(R.id.number_btn);
        ProductImage = (ImageView)findViewById(R.id.product_image_details);
        productDescrition = (TextView)findViewById(R.id.produt_description_details);
        productName = (TextView)findViewById(R.id.produt_name_details);
        productPrice = (TextView)findViewById(R.id.produt_price_details);



    }
}

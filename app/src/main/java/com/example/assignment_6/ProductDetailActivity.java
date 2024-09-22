package com.example.assignment_6;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail); // Make sure this matches your XML file name

        ImageView productImage = findViewById(R.id.product_image);
        TextView productName = findViewById(R.id.product_name);

        // Get the data from the intent
        String name = getIntent().getStringExtra("product_name");
        int imageResId = getIntent().getIntExtra("product_image", -1);

        // Set the data to the views
        productName.setText(name);

        productImage.setImageResource(imageResId);
    }
}

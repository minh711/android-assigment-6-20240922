package com.example.assignment_6;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ProductDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        // Set up the toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Product Details");

        ImageView productImage = findViewById(R.id.product_image);
        TextView productName = findViewById(R.id.product_name);
        TextView productDescription = findViewById(R.id.product_description);

        String name = getIntent().getStringExtra("product_name");
        int imageResId = getIntent().getIntExtra("product_image", -1);
        String description = getIntent().getStringExtra("product_description");

        productName.setText(name);
        productImage.setImageResource(imageResId);
        productDescription.setText(description);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}

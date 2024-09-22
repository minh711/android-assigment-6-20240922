package com.example.assignment_6;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class CartActivity extends AppCompatActivity {

    private TextView cartItemCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Cart");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        cartItemCount = findViewById(R.id.cart_item_count);
        updateCartItemCount();
    }

    private void updateCartItemCount() {
        int itemCount = 5;
        cartItemCount.setText("Items in cart: " + itemCount);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}

package com.example.ashish.foodies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

public class food_menu extends AppCompatActivity {
    CardView starters, maincourse, desert, drinks, todayspecial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        starters = findViewById(R.id.starters);
        maincourse = findViewById(R.id.maincourse);
        desert = findViewById(R.id.desert);
        drinks = findViewById(R.id.drinks);
        todayspecial = findViewById(R.id.todayspecial);

        final String[] data = {"Chinese", "Italian", "North Indian", "Fast food", "South Indian", "Bakery"};
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayout.HORIZONTAL, false));
        recyclerView.setAdapter(new programmingadapter(food_menu.this, data));
        starters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(food_menu.this, DemoActivity.class);
                intent.putExtra("data", "starters");
                startActivity(intent);
            }
        });
        maincourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(food_menu.this, DemoActivity.class);
                intent.putExtra("data", "maincourse");
                startActivity(intent);
            }
        });
        desert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(food_menu.this, DemoActivity.class);
                intent.putExtra("data", "desert");
                startActivity(intent);
            }
        });
        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(food_menu.this, DemoActivity.class);
                intent.putExtra("data", "drinks");
                startActivity(intent);
            }
        });
        todayspecial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(food_menu.this, DemoActivity.class);
                intent.putExtra("data", "desert");
                startActivity(intent);
            }
        });

    }
}

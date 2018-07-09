package com.example.ashish.foodies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DemoActivity extends AppCompatActivity {

    TextView demo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        demo = findViewById(R.id.demo_data);

        String data = getIntent().getStringExtra("data");

        demo.setText(data);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}

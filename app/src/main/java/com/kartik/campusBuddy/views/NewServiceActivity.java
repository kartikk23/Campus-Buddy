package com.kartik.campusBuddy.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kartik.campusBuddy.R;
import com.kartik.campusBuddy.databinding.ActivityNewServiceBinding;

public class NewServiceActivity extends AppCompatActivity {

    ActivityNewServiceBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNewServiceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnGym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NewServiceActivity.this, ServiceDetailsActivity.class));
            }
        });
    }
}
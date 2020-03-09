package com.example.customerapplicationbase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.customerapplicationbase.ui.home.HomeFragment;

public class StartupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
    }

    public void onTestExistedUserButtonClicked(View view) {
        Log.d("TAG", "test:existed user");
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onTestNewUserButtonClicked(View view) {
        Log.d("TAG", "test:new user");
    }
}

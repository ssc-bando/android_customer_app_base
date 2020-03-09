package com.example.customerapplicationbase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.customerapplicationbase.ui.home.HomeFragment;
import com.example.customerapplicationbase.ui.register.RegsiterProgressActivity;
import com.example.customerapplicationbase.ui.register.ShowPermissionFragment;

public class StartupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
    }

    public void onTestExistedUserButtonClicked(View view) {
        Log.d("TAG", "test:existed user");
        Intent intent = new Intent(this, LoggingInActivity.class);
        startActivity(intent);
    }

    public void onTestNewUserButtonClicked(View view) {
        Log.d("TAG", "test:new user");
        Intent intent = new Intent(this, RegsiterProgressActivity.class);
        startActivity(intent);
    }
}

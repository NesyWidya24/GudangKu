package com.kagu.warehouseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class StartActivity extends AppCompatActivity {
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        if (getSupportActionBar()!=null)
            getSupportActionBar().hide();

        Window w = getWindow();
        //mengatur tampilan awal menjadi fullscreen
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        handler = new Handler();
        handler.postDelayed(() -> {
            startActivity(new Intent(StartActivity.this, LoginActivity.class));
            StartActivity.this.finish();
        }, 3000L);
    }
}
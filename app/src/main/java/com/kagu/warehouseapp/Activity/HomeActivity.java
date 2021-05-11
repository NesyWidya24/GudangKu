package com.kagu.warehouseapp.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.kagu.warehouseapp.R;
import com.kagu.warehouseapp.SessionManager;

public class HomeActivity extends AppCompatActivity {
    private TextView etMainEmail, etMainName;

    SessionManager sessionManager;

    String email, name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sessionManager = new SessionManager(HomeActivity.this);

        if (!sessionManager.isLoggedIn()) {
            moveToLogin();
        }

        etMainEmail = findViewById(R.id.etMainEmail);
        etMainName = findViewById(R.id.etMainName);

        email = sessionManager.getUserDetail().get(SessionManager.EMAIL);
        name = sessionManager.getUserDetail().get(SessionManager.NAME);

        etMainEmail.setText(email);
        etMainName.setText(name);
    }

    private void moveToLogin() {
        Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.actionLogout:
                sessionManager.logoutSession();
                moveToLogin();
        }
        return super.onOptionsItemSelected(item);
    }
}
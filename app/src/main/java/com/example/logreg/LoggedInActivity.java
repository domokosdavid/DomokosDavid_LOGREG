package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoggedInActivity extends AppCompatActivity {
    private Button btnKijelentkezes;
    private TextView felhasznaloNeve;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_logged_in);

        init();
        felhasznaloNeve.setText(R.id.reg_felhasznev);
        btnKijelentkezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kijelentkezesre = new Intent(LoggedInActivity.this, MainActivity.class);
                startActivity(kijelentkezesre);
                Toast.makeText(getApplicationContext(), "Sikeresen kijelentkeztél", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

    private void init(){
        btnKijelentkezes = findViewById(R.id.btnKijelentkezes);
        felhasznaloNeve = findViewById(R.id.felh_neve);
    }
}
package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoggedInActivity extends AppCompatActivity {
    private Button btnKijelentkezes;
    private TextView felhasznaloNeve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);

        init();
        btnKijelentkezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kijelentkezesre = new Intent(LoggedInActivity.this, MainActivity.class);
                startActivity(kijelentkezesre);
                finish();
            }
        });
    }

    private void init(){
        btnKijelentkezes = findViewById(R.id.btnKijelentkezes);
        felhasznaloNeve = findViewById(R.id.felh_neve);
    }
}
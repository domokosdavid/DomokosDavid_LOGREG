package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnRegisztracio;
    private Button btnBejelentkezes;
    private EditText logFelhNev;
    private EditText logJelszo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btnRegisztracio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regisztraciora = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(regisztraciora);
                finish();
            }
        });

        btnBejelentkezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(R.id.reg_felhasznev == R.id.log_felhnev && R.id.reg_jelszo == R.id.log_jelszo){
                    Intent bejelentkezesre = new Intent(MainActivity.this, LoggedInActivity.class);
                    startActivity(bejelentkezesre);
                    finish();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Hibás adatok!", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
    private void init(){
        btnRegisztracio = findViewById(R.id.btn_regisztracio);
        btnBejelentkezes = findViewById(R.id.btn_bejelentkezes);
        logFelhNev = findViewById(R.id.log_felhnev);
        logJelszo = findViewById(R.id.log_jelszo);
    }
}
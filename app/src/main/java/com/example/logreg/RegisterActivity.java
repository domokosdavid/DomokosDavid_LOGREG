package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private Button regRegisztracio;
    private Button regVissza;
    private EditText regEmail;
    private EditText regFelhNev;
    private EditText regJelszo;
    private EditText regTeljesNev;
    private DBHelper adatbazis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        init();

        regVissza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent visszara = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(visszara);
                finish();
            }
        });

        regRegisztracio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = regEmail.getText().toString().trim();
                String felhnev = regFelhNev.getText().toString().trim();
                String jelszo = regJelszo.getText().toString().trim();
                String teljesnev = regTeljesNev.getText().toString().trim();

                if (email.isEmpty() || felhnev.isEmpty() || jelszo.isEmpty() || teljesnev.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Töltse ki az összes mezőt", Toast.LENGTH_SHORT).show();
                }
                else{
                    adatbazis.rogzites(email,felhnev,jelszo,teljesnev);
                    Toast.makeText(getApplicationContext(), "Sikeres regisztráció", Toast.LENGTH_SHORT).show();
                }

            }
        });

}
    private void init(){
        regRegisztracio = findViewById(R.id.reg_Regisztracio);
        regVissza = findViewById(R.id.reg_Vissza);
        regEmail = findViewById(R.id.reg_email);
        regFelhNev = findViewById(R.id.reg_felhasznev);
        regJelszo = findViewById(R.id.reg_jelszo);
        regTeljesNev = findViewById(R.id.reg_teljesnev);
        adatbazis = new DBHelper(this);
    }
}
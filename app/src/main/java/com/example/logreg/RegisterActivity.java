package com.example.logreg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {
    private Button regRegisztracio;
    private Button regVissza;

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

}
    private void init(){
        regRegisztracio = findViewById(R.id.reg_Regisztracio);
        regVissza = findViewById(R.id.reg_Vissza);
    }
}
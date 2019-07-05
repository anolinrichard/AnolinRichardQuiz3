package com.example.richardrodulfo.anolinrichardquiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtName, txtPassword, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.etName);
        txtPassword = findViewById(R.id.etPassword);
        txtEmail = findViewById(R.id.etEmail);
    }

    public void goNext(View v){
        Intent i = new Intent(this,activity2.class);
        startActivity(i);
    }

    public void saveInfo(View v) {
        SharedPreferences sp = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("user", txtName.getText().toString());
        editor.putString("pwd", txtPassword.getText().toString());
        editor.putString("eml", txtEmail.getText().toString());
        editor.commit();
        Toast.makeText(this, "Registered Successfully!", Toast.LENGTH_LONG).show();
    }
}

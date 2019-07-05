package com.example.richardrodulfo.anolinrichardquiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class activity2 extends AppCompatActivity {

    TextView txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        txtEmail = findViewById(R.id.etEmail);
    }

    public void onDisplay(View v){
        SharedPreferences sp = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        Toast.makeText(this, sp.getString("eml", ""), Toast.LENGTH_SHORT).show();
    }

    public void onReturn (View v){
        Intent i2 = new Intent(this,MainActivity.class);
        startActivity(i2);
    }
}

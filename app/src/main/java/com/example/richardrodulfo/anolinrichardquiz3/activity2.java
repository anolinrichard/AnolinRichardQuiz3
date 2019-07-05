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

    TextView txtName,txtPassword, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        txtName = findViewById(R.id.tvName);
        txtPassword = findViewById(R.id.tvPassword);
    }

    public void onDisplay(View v){
        SharedPreferences sp = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        txtName.setText(sp.getString("user", ""));
        txtPassword.setText(sp.getString("pwd", ""));
        Toast.makeText(this,"eml", Toast.LENGTH_LONG).show();
    }

    public void onReturn (View v){
        Intent i2 = new Intent(this,MainActivity.class);
        startActivity(i2);
    }
}

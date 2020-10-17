package com.example.testtttttttttt;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button btlogin;
    EditText txUser, txtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btlogin = (Button) findViewById(R.id.bt_sigin);
        txUser = (EditText) findViewById(R.id.editTextTextEmailAddress);
        txtPass = (EditText) findViewById(R.id.editTextTextPassword);

        btlogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (txUser.getText().toString().equals("admin") && txtPass.getText().toString().equals("123")) {
                    Toast.makeText(getApplicationContext(), "Đăng nhập thành công", Toast.LENGTH_LONG).show();
                    doOpenProfile();
                } else
                    Toast.makeText(getApplicationContext(), "Sai tên đăng nhập, mật khẩu", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void doOpenProfile() {
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }
}
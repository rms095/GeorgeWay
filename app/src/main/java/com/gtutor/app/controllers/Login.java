package com.gtutor.app.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        final Button btLogin = (Button) findViewById(R.id.bLogin);
        //  final Button btRegisterL = (Button) findViewById(R.id.btRegisterL);
        //  final TextView tvForgetPW = (TextView) findViewById(R.id.tvForgetPassword);

        //create link for Register page
        final TextView tvRegister = (TextView) findViewById(R.id.TVRegister);


        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RegisterIntent = new Intent(Login.this, LoginRegister.class);
                Login.this.startActivity(RegisterIntent);

            }
        });
    }

        public void OnButtonClick(View v)
    {
        //get the values entered in edit text
        final EditText etUserName = (EditText)findViewById(R.id.etUserNameL);
        String Username = etUserName.getText().toString();
        final EditText etPasword = (EditText)findViewById(R.id.etPasswordL);
        String Password = etPasword.getText().toString();

        //Check for values
        if (Username.isEmpty()||Password.isEmpty())
        {
            Toast showMsg = Toast.makeText(Login.this,"Please Enter All Field",Toast.LENGTH_SHORT);
            showMsg.show();
        }

        //database check for username and password

        //if check successful, call homepage
        Intent homepage = new Intent(Login.this,HomePage.class);
        startActivity(homepage);


    }






    }


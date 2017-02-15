package com.gtutor.app.controllers;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.*;

public class LoginRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);


        final Button btRegister = (Button) findViewById(R.id.bRegister);
      //  final Button btLogin = (Button) findViewById(R.id.btLoginR);

        //created link for Login page
        final TextView tvLogin = (TextView)findViewById(R.id.TVLogin);

       tvLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent LoginIntent = new Intent(LoginRegister.this, Login.class);
               LoginRegister.this.startActivity(LoginIntent);
           }
       });

    }

    public void OnButtonCLick(View v)
    {
        //get the values entered in edit text
        final EditText etFname = (EditText) findViewById(R.id.etFName);
        String FirstName = etFname.getText().toString();
        final EditText etLname = (EditText) findViewById(R.id.etLName);
        String LastName = etLname.getText().toString();
        final EditText etCountry = (EditText) findViewById(R.id.etCountry);
        String Country = etCountry.getText().toString();
        final EditText etUserName = (EditText) findViewById(R.id.etUserName);
        String Username = etUserName.getText().toString();
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        String Password = etPassword.getText().toString();
        final EditText etCPassword = (EditText)findViewById(R.id.etConfirmPassword);
        String cPassword = etCPassword.getText().toString();
        final EditText etAge = (EditText) findViewById(R.id.etAge);
        int age = Integer.parseInt(etAge.getText().toString());
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        String Email = etEmail.getText().toString();

         //check for values
        if (Username==(null)||Username.isEmpty()||Username.equals(" ")||Username.equals("")||Password.isEmpty()||cPassword.isEmpty()||Email.isEmpty()) {
            Toast showmsg = Toast.makeText(LoginRegister.this, "Please enter all fields", Toast.LENGTH_SHORT);
            //display message
            showmsg.show();
        }

            else
            {
                //check entered password and confirm password
                if (!Password.equals(cPassword))
                {
                    Toast showmsg = Toast.makeText(LoginRegister.this,"Password does not match", Toast.LENGTH_SHORT);
                    //display message
                    showmsg.show();
                }

            }


    }
}

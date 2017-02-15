package com.gtutor.app.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void OnButtonClick(View v)
    {
        if(v.getId()==R.id.bCalci) {
            Intent calciPage = new Intent(HomePage.this, Calculator.class);
            HomePage.this.startActivity(calciPage);
        }
        if(v.getId()==R.id.bContents) {
            Intent contentsPage = new Intent(HomePage.this, Contents.class);
            HomePage.this.startActivity(contentsPage);
        }
        if(v.getId()==R.id.bQuery) {
            Intent queryPage = new Intent(HomePage.this, Query.class);
            HomePage.this.startActivity(queryPage);
        }
        if(v.getId()==R.id.bFeedback) {
            Intent feedbackPage = new Intent(HomePage.this, Feedback.class);
            HomePage.this.startActivity(feedbackPage);
        }
    }

}

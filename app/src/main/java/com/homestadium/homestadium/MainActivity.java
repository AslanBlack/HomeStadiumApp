package com.homestadium.homestadium;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void loginActivity(View view){
        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
    }

    public void CreateAccountActivity(View view){
        startActivity(new Intent(getApplicationContext(), CreateAccountActivity.class));
    }







}

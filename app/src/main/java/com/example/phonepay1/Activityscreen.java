package com.example.phonepay1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Activityscreen extends AppCompatActivity {
Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityscreen);




        if (Build.VERSION.SDK_INT>=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.blue));
        }




        new Handler().postDelayed(() -> {
            Intent intent=new Intent(Activityscreen.this,Activity2.class);

            startActivity(intent);
            finish();

        },1000);

    }
    }








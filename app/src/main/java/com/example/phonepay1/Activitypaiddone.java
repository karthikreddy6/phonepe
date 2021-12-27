package com.example.phonepay1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.TextView;

public class Activitypaiddone extends AppCompatActivity {

    MediaPlayer playsound;

    private TextView amount;
    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitypaiddone);
        amount = findViewById(R.id.paiddone);



        if (Build.VERSION.SDK_INT>=21) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.h));


        }


        playsound = MediaPlayer.create(this, R.raw.paysound);
        playsound.start();

        String amount2 = getIntent().getStringExtra("keyamount");

        String shopname2 = getIntent().getStringExtra("keyname");

        amount.setText(" Payment of ₹ " + amount2 + " to " + shopname2 + " successful");


        new Handler().postDelayed(() -> {
            Intent intent = new Intent(Activitypaiddone.this, paidnew.class);
            intent.putExtra("keyamount", amount2);
            intent.putExtra("keyname", shopname2);
            playsound.release();
            startActivity(intent);
            finish();
        }, 2000);




    }

}
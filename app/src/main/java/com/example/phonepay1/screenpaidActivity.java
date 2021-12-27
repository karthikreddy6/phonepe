package com.example.phonepay1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.TextView;


public class screenpaidActivity extends AppCompatActivity {

   private TextView amount,shopname;


   Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screenpaid);
        amount=findViewById(R.id.editTextamount);
        shopname=findViewById(R.id.name);


        if (Build.VERSION.SDK_INT>=21){
            window=this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.blue));
        }



        String amount2 =getIntent().getStringExtra("keyamount");

        String shopname2 =getIntent().getStringExtra("keyname");

        amount.setText("Processing  payment  of  ₹"+amount2);
        shopname.setText(""+shopname2);

            new Handler().postDelayed(() -> {
                Intent intent = new Intent(screenpaidActivity.this, Activitypaiddone.class);
                intent.putExtra("keyamount",amount2);
                intent.putExtra("keyname",shopname2);
                startActivity(intent);
                finish();
            }, 3500);




        }
    }

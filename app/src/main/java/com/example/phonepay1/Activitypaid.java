package com.example.phonepay1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Activitypaid extends AppCompatActivity {

    TextView amount3,on;
    Window window;
    Button button7,button8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitypaid);


        button7 = findViewById(R.id.button2);
         button8 =findViewById(R.id.done);

        if (Build.VERSION.SDK_INT >= 21) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.green));
        }




        amount3 = findViewById(R.id.paymentsucess);

        String amount1 = getIntent().getStringExtra("keyamount");
        String name = getIntent().getStringExtra("keyname");

        amount3.setText("Payment of ₹" + amount1 + " to " + name + " successful.");

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activitypaid.this,Activitydone.class);
                intent.putExtra("keyamount",amount1);
                intent.putExtra("keyname",name);
                startActivity(intent);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Activitypaid.this,Activity2.class);
                startActivity(intent1);

            }
        });
    }
}
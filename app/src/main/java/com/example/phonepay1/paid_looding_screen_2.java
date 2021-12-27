package com.example.phonepay1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.TextView;

public class paid_looding_screen_2 extends AppCompatActivity {

    private TextView amount,shopname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paid_looding_screen2);


        if (Build.VERSION.SDK_INT>=21){
            Window window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.blue));
        }
        amount=findViewById(R.id.editTextamount);

        shopname = findViewById(R.id.name);



        String amount2 =getIntent().getStringExtra("keyamount1");

        String shopname2 =getIntent().getStringExtra("keyname2");

        amount.setText("Processing  payment  of  ₹"+amount2);
        shopname.setText(shopname2);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(paid_looding_screen_2.this, screen_paid_down_2.class);
            intent.putExtra("keyamount1",amount2);
            intent.putExtra("keyname2",shopname2);
            startActivity(intent);
            finish();
        }, 3000);





    }
}
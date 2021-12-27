package com.example.phonepay1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class name_people extends AppCompatActivity {

    EditText amount, shopname;
    Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_people);

        amount = findViewById(R.id.amount1);
        shopname = findViewById(R.id.shopname1);


        done = findViewById(R.id.done);


        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.violet));
        }


        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = shopname.getText().toString();

                String amount1 = amount.getText().toString();

                Intent intent = new Intent(name_people.this, paid_looding_screen_2.class);
                intent.putExtra("keyamount1", amount1);
                intent.putExtra("keyname2", name);
                startActivity(intent);
            }


        });

    }


}

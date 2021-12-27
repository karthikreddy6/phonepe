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

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Activitydone extends AppCompatActivity {


    TextView name,amount,amount2,date;
    Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitydone);




        date=findViewById(R.id.tnss);

        String time =getIntent().getStringExtra("keytime");

        String date2 =getIntent().getStringExtra("keydate");

        date.setText(time+" on "+date2);



        Calendar calendar= Calendar.getInstance();
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("hh:mm a ");
        String time1 = simpleDateFormat.format(calendar.getTime());

        Calendar calendar1= Calendar.getInstance();
        SimpleDateFormat simpleDateFormat2 =new SimpleDateFormat("dd MMM yyyy.");
        String date3 = simpleDateFormat2.format(calendar1.getTime());
        date.setText(time1+" on "+date3);







        if (Build.VERSION.SDK_INT>=21) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.green));


            name=findViewById(R.id.pname);
        amount=findViewById(R.id.payamount);
        amount2=findViewById(R.id.pbankamount);

        String amount3 =getIntent().getStringExtra("keyamount");

        String shopname2 =getIntent().getStringExtra("keyname");

        amount.setText(" ₹"+amount3);
        amount2.setText("₹"+amount3);
        name.setText(shopname2);

    }









}
}
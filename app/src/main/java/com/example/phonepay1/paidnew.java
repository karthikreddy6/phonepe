package com.example.phonepay1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class paidnew extends AppCompatActivity {
    Window window;
    TextView date1,paidname,paidamount ;
    ImageView imageView;
    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paidnew);

        Button buttonvd=findViewById(R.id.paidvd);

        paidname=findViewById(R.id.paidnewname);
       paidamount=findViewById(R.id.paidnewamount);
        imageView = findViewById(R.id.chouse1);


        date1=findViewById(R.id.textView8);

        bitmap= paidnnew_name.bitmap ;
        imageView.setImageBitmap(bitmap);

        Calendar calendar= Calendar.getInstance();
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("hh:mm a ");
        String time = simpleDateFormat.format(calendar.getTime());

        Calendar calendar1= Calendar.getInstance();
        SimpleDateFormat simpleDateFormat2 =new SimpleDateFormat("dd MMM yyyy.");
        String date2 = simpleDateFormat2.format(calendar1.getTime());
        date1.setText( "Paid successfull at "+time+" on "+date2);







        String amount3 =getIntent().getStringExtra("keyamount");

        String shopname2 =getIntent().getStringExtra("keyname");



        paidamount.setText("₹"+amount3);
        paidname.setText(shopname2);



        Button Chouse = findViewById(R.id.button7);

        Chouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {






            }
        });

     buttonvd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {






                Intent intent = new Intent(paidnew.this,Activitydone.class);
                intent.putExtra("keyamount",amount3);
                intent.putExtra("keyname",shopname2);
                intent.putExtra("keydate",date2);
                intent.putExtra("keytime",time);

                startActivity(intent);
            }
        });



        if (Build.VERSION.SDK_INT >= 21) {
            window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.green));

        }








    }


    }



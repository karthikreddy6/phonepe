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
import android.widget.EditText;
import android.widget.ImageView;

import java.io.FileNotFoundException;
import java.io.IOException;

public class paidnnew_name extends AppCompatActivity {

    EditText amount,shopname;
    Button done;
    ImageView cameraimage;
    private static final int SELECT_PHOTO = 1;


    Uri uri;
    public static Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paidnnew_name);

        amount =findViewById(R.id.amount);
        shopname=findViewById(R.id.shopname);
        cameraimage = findViewById(R.id.camara_image);

         done = findViewById(R.id.done1);









        cameraimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_PICK);

                intent.setType("image/*");
                startActivityForResult(intent, 1);
            }
        });

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name =shopname.getText().toString();

                String amount1 =amount.getText().toString();

                Intent intent = new Intent(paidnnew_name.this,screenpaidActivity.class);
                intent.putExtra("keyamount",amount1);
                intent.putExtra("keyname",name);
                startActivity(intent);
            }





        });





    }



    @Override
    protected void onActivityResult ( int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == SELECT_PHOTO && resultCode == RESULT_OK && data != null && data.getData() != null) {

            uri = data.getData();
            try {

                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                cameraimage.setImageBitmap(bitmap);


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

}
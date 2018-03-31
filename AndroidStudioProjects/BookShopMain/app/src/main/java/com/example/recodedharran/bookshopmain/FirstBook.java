package com.example.recodedharran.bookshopmain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.example.recodedharran.bookshopmain.BookiesActivity;

public class FirstBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_book);

        ImageView myImage=(ImageView)findViewById(R.id.turn_back);
        myImage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent bookies =new Intent(FirstBook.this,MainActivity.class);
                startActivity(bookies);

            }
        });





    }}

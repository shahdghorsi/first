package com.example.recodedharran.bookshopmain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;


import com.example.recodedharran.bookshopmain.MyModels.Books;

import java.util.ArrayList;

public class BookiesActivity extends AppCompatActivity {

   // ArrayList<Books> wordList = new ArrayList<Books>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookies);


        Books bookies1 = new Books("La Recherch D'absolu", "Honore de Balzac", "280", R.drawable.balzac1,true);
        Books bookies2 = new Books("Papercraft", "Mandy Cooper", "200", R.drawable.book2,true);
        Books bookies3 = new Books("Language Art", "Stephanie Kallos", "185", R.drawable.book3,false);
        Books bookies4 = new Books("The Woorld of Abstract Art", "Emily Robbins", "205", R.drawable.book4,false);
        Books bookies5 = new Books("Pieces of Light", "Charles Fernyhough", "205", R.drawable.book5,false);
        ArrayList<Books> list = new ArrayList<Books>();

        list.add(bookies1);
        list.add(bookies2);
        list.add(bookies3);
        list.add(bookies4);
        list.add(bookies5);

        BooksAdapter adapter = new BooksAdapter(BookiesActivity.this, list);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

        ImageView myImage=(ImageView)findViewById(R.id.turn_back);
        myImage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                    Intent bookies =new Intent(BookiesActivity.this,MainActivity.class);
                    startActivity(bookies);

            }
        });

    }
    }





package com.example.recodedharran.bookshopmain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText pass= (EditText) findViewById(R.id.pass);
        final EditText gmail=(EditText) findViewById(R.id.gmail);
        final CheckBox check=(CheckBox) findViewById(R.id.check);


        Button login=(Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(pass.getText().toString().equals("shahd") && gmail.getText().toString().equals("shghorsi@gmail.com") && check.isChecked() )
                {
                    Intent bookies =new Intent(MainActivity.this,BookiesActivity.class);
                    startActivity(bookies);
                }
                else if(!(pass.getText().toString().equals("shahd"))){
                    Toast.makeText(MainActivity.this, "Please enter your password correctly !",
                            Toast.LENGTH_LONG).show();
                }
                else if(!(gmail.getText().toString().equals("shghorsi@gmail.com"))){
                    Toast.makeText(MainActivity.this, "Please enter your gmail correctly !",
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please check the box !",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
















    }
}

package com.example.empinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edtname;
    private  EditText edtage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtage= findViewById(R.id.txtname2);
        edtname= findViewById(R.id.txtname);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jeff = new Intent(MainActivity.this,empk.class);
                jeff.putExtra("edtname" ,edtname.getText().toString());
                jeff.putExtra("edtage" ,edtage.getText().toString());
                startActivity(jeff);
            }
        });







    }
}
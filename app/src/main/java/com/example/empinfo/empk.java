package com.example.empinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class empk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empk);
        TextView texage =findViewById(R.id.textView2);
       TextView txttot =findViewById(R.id.text2);
       Intent inn= getIntent();
       String sdd= inn.getStringExtra("edtname");
        String txage= inn.getStringExtra("edtage");
        texage.setText(txage);
        txttot.setText(sdd);
        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jeff = new Intent(empk.this,MainActivity.class);
                startActivity(jeff);
            }
        });
    }

}
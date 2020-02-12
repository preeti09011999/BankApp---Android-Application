package com.example.bankapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BankAct extends AppCompatActivity {

    TextView titlepage, subtitlepage, completeName, userName;

    //target element
    titlepage = findViewById(R.id.titlepage);
    subtitlepage = findViewById(R.id.subtitlepage);
    completeName = findViewById(R.id.completeName);
    userName = findViewById(R.id.userName);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);
    }
}

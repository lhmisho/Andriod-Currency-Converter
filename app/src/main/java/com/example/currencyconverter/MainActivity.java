package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertMoney(View view){
        EditText editCurrency = (EditText) findViewById(R.id.currencyEdit);
        Log.i("Test", editCurrency.getText().toString());
        Double amount = Double.parseDouble(editCurrency.getText().toString());
        Double convertUsdToBd = amount * 80;
        Toast.makeText(MainActivity.this, convertUsdToBd.toString() + "Taka", Toast.LENGTH_SHORT).show();
    }
}
package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lab2","Metoda onCreate");
        Toast.makeText(this, "Metoda onCreate",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Lab2","Metoda onResume");
        Toast.makeText(this, "Metoda onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Lab2","Metoda onStop");
        Toast.makeText(this, "Metoda onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Lab2","Metoda onPause");
        Toast.makeText(this, "Metoda onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("Lab2","Metoda onRestart");
        Toast.makeText(this, "Metoda onRestart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Lab2","Metoda onStart");
        Toast.makeText(this, "Metoda onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Lab2","Metoda onDestroy");
        Toast.makeText(this, "Metoda onDestroy",Toast.LENGTH_SHORT).show();
    }
}
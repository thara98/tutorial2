package com.example.usingstring2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtMsg2 = findViewById(R.id.TvMsg2);
        txtMsg2.setText(R.string.Mas2);

        Log.i("lifecycle", "Oncraete called: ");

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("lifecycle" ,"OnStart called: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("lifecycle" ,"OnRestart called: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("lifecycle" ,"OnPause called: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lifecycle" ,"createStop called: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("lifecycle" ,"createDestroy called: ");
    }
    }

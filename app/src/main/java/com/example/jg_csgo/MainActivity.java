package com.example.jg_csgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private final String LOG_TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send_id(View view) {
        Log.d(LOG_TAG,"Button Clicked");
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}

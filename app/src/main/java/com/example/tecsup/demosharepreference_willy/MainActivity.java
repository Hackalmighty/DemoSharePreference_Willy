package com.example.tecsup.demosharepreference_willy;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences pre = getApplicationContext().getSharedPreferences("demo_pref",MODE_PRIVATE);
    }
}

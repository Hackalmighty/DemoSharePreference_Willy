package com.example.tecsup.demosharepreference_willy;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences pref = getApplicationContext().
                getSharedPreferences("demo_pref",MODE_PRIVATE);

        SharedPreferences.Editor editor = pref.edit();
        String nombre = pref.getString("nombre", "Willy");

        editor.putString("nombre", "Santiago");
        editor.commit();
        TextView t = findViewById(R.id.tv_nombre);
        t.setText(nombre);
    }
}

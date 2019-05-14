package com.example.tecsup.demosharepreference_willy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {
    TextView usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        SharedPreferences pref = getApplicationContext().
                getSharedPreferences("demo_pref",MODE_PRIVATE);
        String nombre = pref.getString("usuario", "Willy");
        usuario = findViewById(R.id.usuario);
        usuario.setText(nombre);
    }

    public void Logout(View v){

        SharedPreferences pref = getApplicationContext().
                getSharedPreferences("demo_pref",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("usuario", usuario.getText().toString());
        editor.commit();

        Intent i = new Intent(this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(i);
        this.finish();

    }
}

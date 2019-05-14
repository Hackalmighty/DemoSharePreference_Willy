package com.example.tecsup.demosharepreference_willy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText usuario;
    EditText pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //mostrar thema
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.usuario);
        pwd = findViewById(R.id.pwd);
        SharedPreferences pref = getApplicationContext().
                getSharedPreferences("demo_pref",MODE_PRIVATE);
        String usuario = pref.getString("usuario", "");
        if (!usuario.equals("")){
            IrActividad2();
        }


    }

    public void Login (View v){
        //Validar password
        //Validar usuario

        SharedPreferences pref = getApplicationContext().
                getSharedPreferences("demo_pref",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("usuario", usuario.getText().toString());
        editor.commit();
        IrActividad2();


    }
    private void IrActividad2(){
        Intent i = new Intent(this, Actividad2.class);
        i.  setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(i);
        this.finish();
    }
}

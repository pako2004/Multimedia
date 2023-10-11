package com.example.ejemploactividades;

import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class Modificar extends AppCompatActivity {


    private String nombre;
    private int edad;
    private boolean consentimiento;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        if(savedInstanceState==null)
        {
            Intent intent = getIntent();
            nombre = intent.getStringExtra("nombre");
            edad = intent.getIntExtra("edad",-1);
            consentimiento= intent.getBooleanExtra("consentimiento", false);
        }else
        {
            nombre= savedInstanceState.getString("nombre");
            edad = savedInstanceState.getInt("edad");
            consentimiento=savedInstanceState.getBoolean("consentimiento");

        }
        EditText etNombre = findViewById(R.id.etNombre);
        EditText etEdad = findViewById(R.id.etEdad);
        CheckBox cbConsentimiento = findViewById(R.id.cbConsentimiento);

        Intent backIntent=new Intent();

        backIntent.putExtra("nombre",nombre);
        backIntent.putExtra("edad",edad);
        backIntent.putExtra("consentimiento",consentimiento);

        setResult(Activity.RESULT_OK, backIntent);


    }

}
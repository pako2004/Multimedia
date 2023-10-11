package com.example.ejemploactividades;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String nombre;
    private int edad;
    private boolean consentimiento;

/*    public ActivityResultLauncher<Intent> modificarResultLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),

        @Override
        public void onActivityResult(ActivityResult result) {
            if(result.getResultCode() == Activity.RESULT_OK)
            {
                Intent data = result.getData();
                //Aqui recuperamos la informacion que se envia desde la actividad previamente lanzada
                nombre=data.getStringExtra.("nombre");
                edad=data.getIntExtra.("edad");
                consentimiento.data.GetBooleanExtra.("consentimiento);
            }
    }
})*/



public void actualizarInterfazConNuevosDatos()
{
    TextView tvNombre=findViewById(R.id.tv_nombre);
    TextView tvEdad=findViewById(R.id.tv_edad);
    TextView tvConsentimiento=findViewById(R.id.tv_consentimiento);
    Resources res=getResources();
    tvNombre.setText(res.getString(R.string.nombre)+": "+nombre);
    tvEdad.setText(res.getString(R.string.edad)+": "+edad);
    if (consentimiento)
    {
        tvConsentimiento.setText((res.getString(R.string.consiente)));
    }
    else
    { tvConsentimiento.setText(res.getString(R.string.no_consiente));}

}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState==null)
        {
            nombre="Pako";
            edad=19;
            consentimiento=true;
        }else
        {
            nombre=savedInstanceState.getString("nombre");
            edad=savedInstanceState.getInt("edad");
            consentimiento=savedInstanceState.getBoolean("consentimiento");
        }
        TextView tvNombre=findViewById(R.id.tv_nombre);
        TextView tvEdad=findViewById(R.id.tv_edad);
        TextView tvConsentimiento=findViewById(R.id.tv_consentimiento);
        Resources res=getResources();
        tvNombre.setText(res.getString(R.string.nombre)+": "+nombre);
        tvEdad.setText(res.getString(R.string.edad)+": "+edad);
        if (consentimiento)
        {
            tvConsentimiento.setText((res.getString(R.string.consiente)));
        }
        else
        { tvConsentimiento.setText(res.getString(R.string.no_consiente));}



    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("nombre",nombre);
        outState.putInt("edad",edad);
        outState.putBoolean("consentimiento",consentimiento);

    }

    public void Editar(View view)
    {
        Intent myIntent = new Intent().setClass(this,Modificar.class);
        myIntent.putExtra("nombre",nombre);
        myIntent.putExtra("edad",edad);
        myIntent.putExtra("consentimiento",consentimiento);
    }


}

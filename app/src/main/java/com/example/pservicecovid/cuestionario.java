package com.example.pservicecovid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class cuestionario extends AppCompatActivity {
    private Spinner spSeleccion;
    private Spinner spRespuesta0, spRespuesta1, spRespuesta2,spRespuesta3,spRespuesta4,spRespuesta5,spRespuesta6,spRespuesta7,spRespuesta8,spRespuesta9,spRespuesta10, spRespuesta11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuestionario);

        spSeleccion = (Spinner)findViewById(R.id.spSeleccion);
        spRespuesta0 = (Spinner)findViewById(R.id.spRespuesta0);
        spRespuesta1 = (Spinner)findViewById(R.id.spRespuesta1);
        spRespuesta2 = (Spinner)findViewById(R.id.spRespuesta2);
        spRespuesta3 = (Spinner)findViewById(R.id.spRespuesta3);
        spRespuesta4 = (Spinner)findViewById(R.id.spRespuesta4);
        spRespuesta5 = (Spinner)findViewById(R.id.spRespuesta5);
        spRespuesta6 = (Spinner)findViewById(R.id.spRespuesta6);
        spRespuesta7 = (Spinner)findViewById(R.id.spRespuesta7);
        spRespuesta8 = (Spinner)findViewById(R.id.spRespuesta8);
        spRespuesta9 = (Spinner)findViewById(R.id.spRespuesta9);
        spRespuesta10 = (Spinner)findViewById(R.id.spRespuesta10);
        spRespuesta11 = (Spinner)findViewById(R.id.spRespuesta11);

        final String [] menu = {"Selecciona El Area: ","Cuestionario","Geolocalización"};
        final String [] respuesta = {"Selecciona Respuesta: ","Si","No"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, menu);
        spSeleccion.setAdapter(adapter);
        spSeleccion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> Lista, View view, int position, long id) {
                if(Lista.getItemAtPosition(position).equals("Geolocalización")){
                    Intent intent = new Intent(cuestionario.this, geolocalizacion.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, respuesta);
        spRespuesta0.setAdapter(adapter2);


        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, respuesta);
        spRespuesta1.setAdapter(adapter3);


        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, respuesta);
        spRespuesta2.setAdapter(adapter4);


        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, respuesta);
        spRespuesta3.setAdapter(adapter5);


        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, respuesta);
        spRespuesta4.setAdapter(adapter6);


        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, respuesta);
        spRespuesta5.setAdapter(adapter7);

        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, respuesta);
        spRespuesta6.setAdapter(adapter8);

        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, respuesta);
        spRespuesta7.setAdapter(adapter9);

        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, respuesta);
        spRespuesta8.setAdapter(adapter10);

        ArrayAdapter<String> adapter11 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, respuesta);
        spRespuesta9.setAdapter(adapter11);

        ArrayAdapter<String> adapter12 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, respuesta);
        spRespuesta10.setAdapter(adapter12);

        ArrayAdapter<String> adapter13 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, respuesta);
        spRespuesta11.setAdapter(adapter13);
        spRespuesta11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> Lista, View view, int position, long id) {
                if(Lista.getItemAtPosition(position).equals("Si")){
                    Toast.makeText(getApplicationContext(), "Datos Enviados", Toast.LENGTH_SHORT).show();
                }
                if(Lista.getItemAtPosition(position).equals("No")){
                    Toast.makeText(getApplicationContext(), "Datos Enviados", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}

package com.example.pservicecovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class geolocalizacion extends AppCompatActivity {
    private Spinner spSeleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geolocalizacion);

        spSeleccion = (Spinner)findViewById(R.id.spSeleccion);

        final String [] menu = {"Selecciona El Area: ","Cuestionario","Geolocalización"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, menu);
        spSeleccion.setAdapter(adapter);
        spSeleccion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> Lista, View view, int position, long id) {
                if(Lista.getItemAtPosition(position).equals("Cuestionario")){
                    Intent intent = new Intent(geolocalizacion.this, cuestionario.class);
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}
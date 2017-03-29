package com.example.android.taller_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;

public class Principal extends AppCompatActivity {


    private Intent i;
    private Bundle b;
    private Spinner comboMaterial,comboDije,comboTipo;
    private RadioButton rPesos,rdolares;

    //Mostrar la info en el comboBox
    private ArrayAdapter<String> adapterMaterial;
    private ArrayAdapter<String> adapterDije;
    private ArrayAdapter<String> adapterTipo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        // Capturando los combos
        comboMaterial =  (Spinner)findViewById(R.id.cmb_Material);
        comboDije = (Spinner)findViewById(R.id.cmb_tipoDije);
        comboTipo = (Spinner)findViewById(R.id.cmb_tipo);


        // Captura los radio
        rPesos = (RadioButton)findViewById(R.id.rdb_pesos);
        rdolares= (RadioButton)findViewById(R.id.rdb_dolar);


       // i =  new Intent(this,Saludo.class);
        b = new Bundle();

        // Mostrando la Información en los comboBox

        //Array AdapterMaterial
        String[] opcMaterial = this.getResources().getStringArray(R.array.str_material);

        adapterMaterial = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, opcMaterial);

        comboMaterial.setAdapter(adapterMaterial);

        //Array AdapterDije
        String[] opcDije = this.getResources().getStringArray(R.array.str_dije);

        adapterDije = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, opcDije);

        comboDije.setAdapter(adapterDije);


        //Array AdapterTipo
        String[] opcTipo = this.getResources().getStringArray(R.array.str_tipo);

        adapterTipo = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, opcTipo);

        comboTipo.setAdapter(adapterTipo);


    }



}

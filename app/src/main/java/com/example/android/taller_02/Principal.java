package com.example.android.taller_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity {


    private TextView totalPagar;
    private Intent i;
    private Bundle b;
    private EditText cantidad;
    private Spinner comboMaterial,comboDije,comboTipo;
    private RadioButton rPesos,rdolares;
    private static int cambioDolar= 3200;

    private int aux;
    private int costo;
    private String cadenaTotal="";

    //Mostrar la info en el comboBox
    private ArrayAdapter<String> adapterMaterial;
    private ArrayAdapter<String> adapterDije;
    private ArrayAdapter<String> adapterTipo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);



        cantidad = (EditText) findViewById(R.id.txtCantidad);
        totalPagar = (TextView)findViewById(R.id.lbl_totalPagar);

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

    public void Comprar(View v){

        //b = getIntent().getExtras();
        //cantidad= b.getString("Cantidad");
      //  apell = b.getString("Apellido");

        /*
                comboDije.equals(getResources().getString(R.string.str_martillo)) &&
                    comboDije.equals(getResources().getString(R.string.str_ancla)) &&
                    comboTipo.equals(getResources().getString(R.string.str_oro)) &&
                    comboTipo.equals(getResources().getString(R.string.str_rosado)) &&
                    comboTipo.equals(getResources().getString(R.string.str_plata)) &&
                    comboTipo.equals(getResources().getString(R.string.str_niquel))
        */


        if(rPesos.isChecked()){

            if(comboMaterial.equals(getResources().getString(R.string.str_cuero))
                && comboDije.equals(getResources().getString(R.string.str_martillo))
                    && comboTipo.equals(getResources().getString(R.string.str_oro))
                    )
            {

                costo = 100;


            }
            /*
            else {
                if(comboMaterial.equals(getResources().getString(R.string.str_cuero))
                        && comboDije.equals(getResources().getString(R.string.str_ancla))
                        && comboTipo.equals(getResources().getString(R.string.str_rosado))
                {
                    costo = 100;

                  //  aux = costo * integer.ParseInt(cantidad) * cambioDolar;

                }
            }*/


        }

        if(rdolares.isChecked()){

            totalPagar.setText("Dolares");

        }





    }



}

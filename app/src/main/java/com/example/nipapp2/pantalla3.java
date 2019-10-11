package com.example.nipapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class pantalla3 extends AppCompatActivity {

    /*private Spinner mSpinner;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);
        configureNextButton();

        /*mSpinner= (Spinner) findViewById(R.id.seleccionar);
        ArrayList<String> years= new ArrayList<>();
        years.add("11 Años");
        years.add("12 Años");
        years.add("13 Años");

        ArrayAdapter ap = new ArrayAdapter(pantalla3.this, android.R.layout.simple_spinner_dropdown_item, years);

        mSpinner.setAdapter(ap);
        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String año = (String) mSpinner.getAdapter().getItem(i);

                Toast.makeText(pantalla3.this, "Seleccionaste: "+año, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });*/

    }
    private void configureNextButton(){

        ImageButton nextButton = (ImageButton) findViewById(R.id.next);

        nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(pantalla3.this,pantalla4.class));
            }

        });
    }
}

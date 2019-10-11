package com.example.nipapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class genial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genial);
        configureNextButton();
        configureNextButton2();
    }

    private void configureNextButton(){

        Button nextButton = (Button) findViewById(R.id.consentirme);

        nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(genial.this,ZonaDeJuego.class));
            }

        });
    }
    private void configureNextButton2(){

        Button nextButton = (Button) findViewById(R.id.seguir);

        nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(genial.this,operacion.class));
            }

        });
    }
}

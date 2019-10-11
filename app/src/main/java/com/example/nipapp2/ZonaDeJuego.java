package com.example.nipapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ZonaDeJuego extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zona_de_juego);
        configureNextButton();
    }

    private void configureNextButton(){

        ImageButton nextButton = (ImageButton) findViewById(R.id.zona);

        nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(ZonaDeJuego.this,pantalla8.class));
            }

        });
    }
}

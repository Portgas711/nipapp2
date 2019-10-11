package com.example.nipapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class pantalla8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla8);
        configureNextButton();
        configureNextButton2();
        configureNextButton3();
        configureNextButton4();
    }

    private void configureNextButton(){

        ImageButton nextButton = (ImageButton) findViewById(R.id.tienda);

        nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(pantalla8.this,Tienda.class));
            }

        });
    }

    private void configureNextButton2(){

        ImageButton nextButton = (ImageButton) findViewById(R.id.almacen);

        nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(pantalla8.this,Almacen.class));
            }

        });
    }

    private void configureNextButton3(){

        Button nextButton = (Button) findViewById(R.id.comida);

        nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(pantalla8.this,comida.class));
            }

        });
    }

    private void configureNextButton4(){

        Button nextButton = (Button) findViewById(R.id.armario);

        nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(pantalla8.this,armario.class));
            }

        });
    }
}

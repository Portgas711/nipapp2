package com.example.nipapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class felicitaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felicitaciones);
        configureNextButton();
    }

    private void configureNextButton(){

        Button nextButton = (Button) findViewById(R.id.aceptar);

        nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(felicitaciones.this,genial.class));
            }

        });
    }
}

package com.example.nipapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class operacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacion);
        configureNextButton();
        configureNextButton2();
        configureNextButton3();

    }

    private void configureNextButton(){

        ImageButton nextButton = (ImageButton) findViewById(R.id.next5);

        nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(operacion.this,felicitaciones.class));
            }

        });
    }
    private void configureNextButton2(){

        Button ayuda1 = (Button) findViewById(R.id.ayuda1);
        ayuda1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast2 =
                Toast.makeText(getApplicationContext(),"biennnnnnn",Toast.LENGTH_LONG);
                toast2.setGravity(Gravity.CENTER|Gravity.LEFT,500,0);
                toast2.show();
            }
        });

    }
    private void configureNextButton3(){

        Button ayuda2 = (Button) findViewById(R.id.ayuda2);
        ayuda2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast3 =
                        Toast.makeText(getApplicationContext(),"bienn2222",Toast.LENGTH_LONG);
                toast3.setGravity(Gravity.CENTER|Gravity.LEFT,500,0);
                toast3.show();
            }
        });

    }

}

package com.example.nipapp2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;


public class pantalla2 extends AppCompatActivity {

    MediaPlayer mp;
    private EditText TextEmail;
    private EditText TextPassword;
    private ImageButton btnRegistrar;
    private ProgressDialog progressDialog;



    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        //inicializamos el objeto firebaseAuth
        firebaseAuth = FirebaseAuth.getInstance();

        //Referenciamos los views
        TextEmail = (EditText) findViewById(R.id.ingrese_correo);
        TextPassword = (EditText) findViewById(R.id.ingrese_password);

        btnRegistrar = (ImageButton) findViewById(R.id.next);

        progressDialog = new ProgressDialog(this);

        //attaching listener to button
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registraruser();

            }
        });
        configureNextButton2();
    }
    private void registraruser(){
        String email = TextEmail.getText().toString().trim();
        String password = TextPassword.getText().toString().trim();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "Se debe ingresar un email", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password)){
            Toast.makeText(this, "Se debe ingresar contraseña", Toast.LENGTH_SHORT).show();
            return;
        }
        progressDialog.setMessage("Realizando registro en linea");
        progressDialog.show();
        configureNextButton();
        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //checking if success

                        if(task.isSuccessful()){

                            Toast.makeText(pantalla2.this,"Se ha registrado el usuario con el email: "+ TextEmail.getText(),Toast.LENGTH_LONG).show();
                            ImageButton nextButton = (ImageButton) findViewById(R.id.next);

                            nextButton.setOnClickListener(new View.OnClickListener(){

                                @Override
                                public void onClick(View view){
                                    mp.start();
                                    Vibrator vibrador = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                                    vibrador.vibrate(500);
                                    startActivity(new Intent(pantalla2.this,curso.class));
                                }

                            });
                        }else{
                            configureNextButton();
                            Toast.makeText(pantalla2.this,"No se pudo registrar el usuario ",Toast.LENGTH_LONG).show();
                        }
                        progressDialog.dismiss();
                    }
                });

    }



    private void configureNextButton(){

        ImageButton nextButton = (ImageButton) findViewById(R.id.next);
        mp = MediaPlayer.create(this,R.raw.gatito2);
        nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                mp.start();
                Vibrator vibrador = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrador.vibrate(500);
                startActivity(new Intent(pantalla2.this,curso.class));
            }

        });
    }

    private void configureNextButton2(){

        ImageButton nextButton = (ImageButton) findViewById(R.id.atras);

        nextButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(pantalla2.this,MainActivity.class));
            }

        });
    }

}

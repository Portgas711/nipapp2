package com.example.nipapp2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (Button)findViewById(R.id.play);



        configureNextButton();
    }
    private void configureNextButton(){

        Button nextButton = (Button) findViewById(R.id.play);

        mp = MediaPlayer.create(this,R.raw.gatito2);
        Button Button = (Button) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                Vibrator vibrador = (Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                vibrador.vibrate(500);
                startActivity(new Intent(MainActivity.this, pantalla2.class));
            }

        });
    }
}

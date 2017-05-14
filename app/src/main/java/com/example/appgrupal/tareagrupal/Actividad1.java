package com.example.appgrupal.tareagrupal;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Actividad1 extends AppCompatActivity {

    //variables y objeto soundpool

    SoundPool sp;
    int idsonido1, idsonido2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);


        //constructor soundpool
        sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);

        idsonido1 = sp.load(this, R.raw.acierto, 0);
        idsonido2 = sp.load(this, R.raw.fallo, 0);

    }
        public void respuestavenus(View v){

        //reproduccion sonido
        sp.play(idsonido2, 1, 0, 1, 0, 1);
    }
        public void respuestasaturno(View v){

        //reproduccion sonido
        sp.play(idsonido2, 1, 0, 1, 0, 1);
      }

      public void respuestamercurio(View v){

          sp.play(idsonido1, 1, 0, 1, 0, 1);

          //metodo cambio de actividad
          Intent i= new Intent(this,com.example.appgrupal.tareagrupal.Actividad2.class);

          //comienzo
          startActivity(i);
          //final
          finish();
      }
}

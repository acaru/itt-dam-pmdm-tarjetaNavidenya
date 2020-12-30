package com.example.felicitacion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Método alternativo para ocultar el Action Bar
        getSupportActionBar().hide();
        */

        //Instanciar animaciones para el avatar y para el titulo
        Animation animAparecer = AnimationUtils.loadAnimation(this, R.anim.aparecer);
        Animation animDerecha = AnimationUtils.loadAnimation(this, R.anim.sliderecha2);

        //Instanciar avatar y le asigno una animación
        ImageView albertoAvatar = (ImageView) findViewById(R.id.avatar2);
        albertoAvatar.startAnimation(animDerecha);

        //Titulo (fuente y animacion)
        Typeface miFuente = Typeface.createFromAsset(getAssets(), "lady_radical.ttf");
        TextView titulo = findViewById(R.id.titulo);
        titulo.setTypeface(miFuente);

        //Comenzar animación de aparecer
        titulo.startAnimation(animAparecer);

        //Crear un objeto mediplayer para comenzar el sonido y en bucle para que no se acabe
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.jingle_bells_8bit);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
    }
}
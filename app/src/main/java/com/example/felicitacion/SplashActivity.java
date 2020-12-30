package com.example.felicitacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Instanciar fuentes externas
        Typeface miFuente = Typeface.createFromAsset(getAssets(), "lady_radical.ttf");

        //Generar texto y usar la fuente
        TextView texto = findViewById(R.id.textoSplash);
        texto.setTypeface(miFuente);

        //Crear animación del texto y ejecutarla
        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.splash);
        texto.startAnimation(animacion);

        //Setear listener para modificar según estado de la animación
        animacion.setAnimationListener(this);

        //Crear efecto de sonido y ejecutarlo
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.efectosplash);
        mediaPlayer.start();
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    //Crear intent con las distintas "activities" para pasar de una a otra
    @Override
    public void onAnimationEnd(Animation animation) {
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
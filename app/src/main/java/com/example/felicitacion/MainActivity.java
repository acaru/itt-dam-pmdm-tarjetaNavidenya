package com.example.felicitacion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Titulo (fuente y animacion)
        Typeface miFuente = Typeface.createFromAsset(getAssets(), "Ring Bells.ttf");
        TextView titulo = findViewById(R.id.titulo);
        titulo.setTypeface(miFuente);
        Animation miAnimacion = AnimationUtils.loadAnimation(this, R.anim.animacion);
        titulo.startAnimation(miAnimacion);

        //Texto 1 y texto 2 (fuente y animacion)
        Typeface miFuente2 = Typeface.createFromAsset(getAssets(), "MerryChristmasFlake.ttf");
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        textView2.setTypeface(miFuente2);
        textView3.setTypeface(miFuente2);
        Animation slideUp = AnimationUtils.loadAnimation(this, R.anim.slideup);
        textView2.startAnimation(slideUp);
        textView3.startAnimation(slideUp);

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.happy_birthday);
        mediaPlayer.start();
    }
}
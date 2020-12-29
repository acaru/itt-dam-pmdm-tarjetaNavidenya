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

        Typeface miFuente = Typeface.createFromAsset(getAssets(), "lady_radical.ttf");
        TextView texto = findViewById(R.id.textoSplash);
        texto.setTypeface(miFuente);

        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.splash);
        texto.startAnimation(animacion);

        animacion.setAnimationListener(this);

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.efectosplash);
        mediaPlayer.start();
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

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
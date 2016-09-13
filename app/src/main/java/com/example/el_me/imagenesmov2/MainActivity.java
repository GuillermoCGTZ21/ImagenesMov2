package com.example.el_me.imagenesmov2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {
        ImageView gandalf = (ImageView) findViewById(R.id.gandalf);
        ImageView aragorn = (ImageView) findViewById(R.id.aragorn);
        Button firstButton = (Button) findViewById(R.id.firstButton);
        Button secondButton = (Button) findViewById(R.id.secondButton);

        gandalf.animate().alpha(0f).setDuration(2000);
        aragorn.setVisibility(View.VISIBLE);
        aragorn.animate().alpha(1f).setDuration(2000);

        firstButton.setEnabled(false);
        firstButton.setVisibility(View.INVISIBLE);

        secondButton.setEnabled(true);
        secondButton.setVisibility(View.VISIBLE);
    }

    public void movesmaug(View view) {
        ImageView smaug = (ImageView) findViewById(R.id.smaug);
        ImageView aragorn = (ImageView) findViewById(R.id.aragorn);
        Button secondButton = (Button) findViewById(R.id.secondButton);
        Button tercerButton = (Button) findViewById(R.id.tercerButton);

        aragorn.animate().alpha(0f).setDuration(2000);
        smaug.setVisibility(View.VISIBLE);
        smaug.animate().translationYBy(3000f).setDuration(2000);

        secondButton.setEnabled(false);
        secondButton.setVisibility(View.INVISIBLE);

        tercerButton.setEnabled(true);
        tercerButton.setVisibility(View.VISIBLE);
    }

    public void moveanillo(View view) {
        ImageView anillo = (ImageView) findViewById(R.id.anillo);
        ImageView smaug = (ImageView) findViewById(R.id.smaug);
        Button tercerButton = (Button) findViewById(R.id.tercerButton);
        Button resetButton = (Button) findViewById(R.id.resetButton);

        smaug.animate().alpha(0f).setDuration(3000);
        anillo.setVisibility(View.VISIBLE);
        anillo.animate().translationXBy(-3000f).setDuration(2000);

        tercerButton.setEnabled(false);
        tercerButton.setVisibility(View.INVISIBLE);

        resetButton.setEnabled(true);
        resetButton.setVisibility(View.VISIBLE);
    }


    public void resetImages(View view) {
        Button firstButton = (Button) findViewById(R.id.firstButton);
        Button resetButton = (Button) findViewById(R.id.resetButton);
        Button tercerButton = (Button) findViewById(R.id.tercerButton);
        ImageView gandalf = (ImageView) findViewById(R.id.gandalf);
        ImageView aragorn = (ImageView) findViewById(R.id.aragorn);
        ImageView smaug = (ImageView) findViewById(R.id.smaug);
        ImageView anillo = (ImageView) findViewById(R.id.anillo);

        smaug.setVisibility(View.INVISIBLE);
        smaug.setTranslationY(-3000);
        aragorn.setVisibility(View.INVISIBLE);
        anillo.setVisibility(View.INVISIBLE);
        anillo.setTranslationX(3000);
        gandalf.setAlpha(1f);

        resetButton.setEnabled(false);
        resetButton.setVisibility(View.INVISIBLE);

        tercerButton.setEnabled(false);
        tercerButton.setVisibility(View.INVISIBLE);

        firstButton.setEnabled(true);
        firstButton.setVisibility(View.VISIBLE);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView smaug = (ImageView) findViewById(R.id.smaug);
        smaug.setTranslationY(-3000);

        ImageView anillo = (ImageView) findViewById(R.id.anillo);
        smaug.setTranslationX(3000);
    }
}
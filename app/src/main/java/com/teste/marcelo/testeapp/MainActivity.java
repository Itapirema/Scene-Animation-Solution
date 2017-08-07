package com.teste.marcelo.testeapp;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable load;

    private final int mTapScreenTextAnimDuration = 100;
    private final int mTapScreenTextAnimBreak = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = (ImageView) findViewById(R.id.img_test);
        /*image.setBackgroundResource(R.drawable.sprites_animation);
        final AnimationDrawable load =(AnimationDrawable)image.getBackground();
        load.start();*/

        final int[] mTapScreenTextAnimRes = {R.drawable.image_hd, R.drawable.placeholder, R.drawable.image_hd,
                R.drawable.placeholder, R.drawable.image_hd, R.drawable.placeholder, R.drawable.image_hd, R.drawable.placeholder,
                R.drawable.image_hd, R.drawable.placeholder, R.drawable.image_hd};

        new SceneAnimation(image, mTapScreenTextAnimRes, mTapScreenTextAnimDuration, mTapScreenTextAnimBreak);



    }
}

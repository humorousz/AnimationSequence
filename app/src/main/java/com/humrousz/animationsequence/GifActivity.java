package com.humrousz.animationsequence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.humrousz.sequence.AnimationImageView;
import com.humrousz.sequence.FrescoSequence;

public class GifActivity extends AppCompatActivity {
    private AnimationImageView mGifImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif);
        mGifImage = findViewById(R.id.gif_image);
    }


    public void gifClick(View v){
        mGifImage.setSequenceFactory(new FrescoSequence.FrescoGifSequenceFactory());
        mGifImage.setImageResourceFromAssets("lion.gif");
    }
}

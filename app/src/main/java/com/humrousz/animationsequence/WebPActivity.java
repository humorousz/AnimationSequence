package com.humrousz.animationsequence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.humrousz.sequence.AnimationImageView;
import com.humrousz.sequence.view.AnimatedImageView;


public class WebPActivity extends AppCompatActivity {

    private AnimationImageView mFrescoImage;
    private AnimatedImageView mGoogleImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_p);
        mFrescoImage = findViewById(R.id.fresco_sequence_image);
        mGoogleImage = findViewById(R.id.google_sequence_image);
    }


    void frescoClick(View v){
        mFrescoImage.setImageResourceFromAssets("rmb.webp");
    }

    void googleClick(View v){
        mGoogleImage.setImageResourceFromAssets("newyear.webp");
    }
}

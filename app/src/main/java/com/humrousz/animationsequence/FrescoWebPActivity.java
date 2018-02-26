package com.humrousz.animationsequence;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.humrousz.sequence.AnimationImageView;

public class FrescoWebPActivity extends AppCompatActivity {
    private AnimationImageView mFrescoImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresco_web_p);
        mFrescoImage = findViewById(R.id.fresco_sequence_image);
    }

    void frescoClick(View v){
        mFrescoImage.setImageResourceFromAssets("rmb.webp");
    }
}

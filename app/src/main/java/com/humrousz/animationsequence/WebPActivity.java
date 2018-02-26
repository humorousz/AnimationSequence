package com.humrousz.animationsequence;

import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.humrousz.sequence.AnimationImageView;
import com.humrousz.sequence.view.AnimatedImageView;

import java.util.logging.Logger;


public class WebPActivity extends AppCompatActivity {
    private static final String TAG = "WebPActivity";
    private AnimatedImageView mGoogleImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_p);
        mGoogleImage = findViewById(R.id.google_sequence_image);
    }

    public void loadFromAssets(View v){
        mGoogleImage.setImageURI(Uri.parse("newyear.webp"));
    }

    public void loadFromDrawable(View v){
        mGoogleImage.setLoopDefault();
        mGoogleImage.setLoopCount(2);
        mGoogleImage.setImageResource(R.drawable.newyear);
    }

    public void loadFromFile(View v){
        Uri uri = Uri.parse("file:"+Environment.getExternalStorageDirectory().toString()+"/animation");
        mGoogleImage.setImageURI(uri);
    }
}

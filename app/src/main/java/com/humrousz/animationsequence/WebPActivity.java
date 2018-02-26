package com.humrousz.animationsequence;

import android.net.Uri;
import android.os.Environment;
import android.support.rastermill.FrameSequenceDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.humrousz.sequence.AnimationImageView;
import com.humrousz.sequence.view.AnimatedImageView;

import java.io.IOException;
import java.io.InputStream;
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

    /**
     * 使用Drawable+ImageView方式,这里的mFrescoImage当作普通的View
     * @param v
     */
    public void loadFromInputStream(View v){
        InputStream in = null;
        try {
            in = getResources().getAssets().open("rmb.webp");
            final FrameSequenceDrawable drawable = new FrameSequenceDrawable(in);
            drawable.setLoopCount(1);
            drawable.setLoopBehavior(FrameSequenceDrawable.LOOP_FINITE);
            drawable.setOnFinishedListener(new FrameSequenceDrawable.OnFinishedListener() {
                @Override
                public void onFinished(FrameSequenceDrawable frameSequenceDrawable) {

                }
            });
            mGoogleImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

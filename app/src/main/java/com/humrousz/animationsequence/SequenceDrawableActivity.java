package com.humrousz.animationsequence;

import android.net.Uri;
import android.support.rastermill.FrameSequenceDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class SequenceDrawableActivity extends AppCompatActivity {

    private ImageView mImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sequence_drawable);
        mImage = findViewById(R.id.sequence_drawable_image);
    }

    @Override
    protected void onResume() {
        super.onResume();
        try {
            InputStream in = null;
            in = getResources().getAssets().open("rmb.webp");
            final FrameSequenceDrawable drawable = new FrameSequenceDrawable(in);
            drawable.setLoopCount(1);
            drawable.setLoopBehavior(FrameSequenceDrawable.LOOP_FINITE);
            drawable.setOnFinishedListener(new FrameSequenceDrawable.OnFinishedListener() {
                @Override
                public void onFinished(FrameSequenceDrawable frameSequenceDrawable) {

                }
            });
            mImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

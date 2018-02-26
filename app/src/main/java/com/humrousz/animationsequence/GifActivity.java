package com.humrousz.animationsequence;

import android.net.Uri;
import android.support.rastermill.FrameSequence;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.humrousz.sequence.AnimationImageView;
import com.humrousz.sequence.AnimationSequenceDrawable;
import com.humrousz.sequence.BaseSequenceFactory;
import com.humrousz.sequence.FrescoSequence;

import java.io.IOException;
import java.io.InputStream;

public class GifActivity extends AppCompatActivity {
    private AnimationImageView mGifImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif);
        mGifImage = findViewById(R.id.gif_image);
    }

    public void loadFromAssets(View v){
        mGifImage.setSequenceFactory(FrescoSequence.getSequenceFactory(FrescoSequence.GIF));
        mGifImage.setLoopCount(-1);
        mGifImage.setImageURI(Uri.parse("lion.gif"));
    }

    public void loadFromDrawable(View v){
        mGifImage.setLoopDefault();
        mGifImage.setLoopCount(2);
        mGifImage.setSequenceFactory(FrescoSequence.getSequenceFactory(FrescoSequence.GIF));
        mGifImage.setImageResource(R.drawable.lion);
    }

    /**
     * 使用Drawable+ImageView方式,这里的mFrescoImage当作普通的View
     * @param v
     */
    public void loadFromInputStream(View v){
        InputStream in = null;
        try {
            in = getResources().getAssets().open("lion.gif");
            BaseSequenceFactory factory = FrescoSequence.getSequenceFactory(FrescoSequence.GIF);
            final AnimationSequenceDrawable drawable = new AnimationSequenceDrawable(factory.createSequence(in));
            drawable.setLoopCount(1);
            drawable.setLoopBehavior(AnimationSequenceDrawable.LOOP_FINITE);
            drawable.setOnFinishedListener(new AnimationSequenceDrawable.OnFinishedListener() {
                @Override
                public void onFinished(AnimationSequenceDrawable frameSequenceDrawable) {

                }
            });
            mGifImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

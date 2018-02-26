package com.humrousz.animationsequence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void webClick(View v){
        Intent intent = new Intent(MainActivity.this,WebPActivity.class);
        startActivity(intent);
    }

    public void gifClick(View v){
        Intent intent = new Intent(MainActivity.this,GifActivity.class);
        startActivity(intent);
    }

    public void drawableClick(View v){
        Intent intent = new Intent(MainActivity.this,SequenceDrawableActivity.class);
        startActivity(intent);
    }
}

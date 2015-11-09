package com.example.ronald.framebyframeanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView iv = (ImageView) findViewById(R.id.imageView);

        iv.setBackgroundResource(R.drawable.animation);
        iv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                AnimationDrawable anim = (AnimationDrawable) iv.getBackground();
                anim.start();

            }
        });


    }
}

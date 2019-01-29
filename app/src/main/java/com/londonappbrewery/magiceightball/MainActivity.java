package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn;
        final ImageView ballRoll=findViewById(R.id.image_Ball);
        final int [] img={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
        btn=findViewById(R.id.askButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Ball","Button Pressed");
                Random randomNoGenerator=new Random();
                int num=randomNoGenerator.nextInt(5);
                Log.d("Ask","Random no="+num);
                ballRoll.setImageResource(img[num]);
            }
        });
    }
}

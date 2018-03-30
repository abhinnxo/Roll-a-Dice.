package com.abhinnkrishn.honey1.mysnakes;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

int c=0;

    public void r(View view)
    {

        int m[]= {
                R.drawable.one,
                R.drawable.two,
                R.drawable.three,
                R.drawable.four,
                R.drawable.five,
                R.drawable.six,
                R.drawable.one,
                R.drawable.two,
                R.drawable.three,
                R.drawable.four,



        };
         c++;
        Toast.makeText(MainActivity.this,"Button clicked-"+c,Toast.LENGTH_SHORT).show();
         int a=(int)(Math.random()*10);

        ImageView dice=(ImageView)findViewById(R.id.d);
        dice.setImageResource(m[a]);



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

package com.example.bday;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.vid_play);
        Button b2 = (Button) findViewById(R.id.image_view);
        b1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent myintent2 = new Intent(MainActivity.this,videoplay.class);
                startActivity(myintent2);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent3 = new Intent(MainActivity.this,imagescroll.class);
                startActivity(myintent3);

            }
        });


    }

}
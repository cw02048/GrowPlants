package com.example.ryucaptain.growplants;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ChoosePlant extends AppCompatActivity {
    /*   static final int CAT_CH=1;
       static final int DOG_CH=2;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_plant);

        ImageView cat=(ImageView)findViewById(R.id.tomato);
        ImageView dog=(ImageView)findViewById(R.id.pepper);

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(ChoosePlant.this,SetTomato.class);
                startActivity(in);
            }
        });

        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(ChoosePlant.this,SetCarrot.class);
                startActivity(in);
            }
        });
    }
}

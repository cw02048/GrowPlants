package com.example.ryucaptain.growplants;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.graphics.Canvas;
import android.graphics.Color;

import android.graphics.Matrix;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;



class MyView extends View {

    int height = 1250;

    Bitmap mb, b, mc, c;

    Matrix m = new Matrix();

    public MyView(Context context) {

        super(context);

        setBackgroundResource(R.drawable.playbackground);

        b = BitmapFactory.decodeResource(getResources(), R.drawable.tomato);

        mb = b;

        c = BitmapFactory.decodeResource(getResources(), R.drawable.play);

        mc = c;

        m.preScale(1, -1);

    }


    private int inc = -7;

    @Override

    protected void onDraw(Canvas canvas) {

        height += inc;

        if (height > 1250 || height < 600) {

            inc *= -1;

            mb = Bitmap.createBitmap(mb, 0, 0, b.getWidth(), b.getHeight(), m, false);

        }

        Bitmap sb = Bitmap.createScaledBitmap(mb, 300, 300, false);

        canvas.drawBitmap(sb, 375, height, null);

        invalidate();

    }

}


public class PlayTomato extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        MyView w = new MyView(this);

        setContentView(w);

    }

}
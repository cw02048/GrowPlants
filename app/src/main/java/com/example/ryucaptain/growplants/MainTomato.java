package com.example.ryucaptain.growplants;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainTomato extends AppCompatActivity {

    TextView text;
    ImageView tomatoImage, image_user, image_cloud;
    Button play_btn, camera_btn, grow_btn;
    String name,sex,date;
    static final int DIALOG_TOMATO_INFO=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        name=intent.getStringExtra("NAME_TOMATO");
        date=intent.getStringExtra("DATE_TOMATO");
        sex=intent.getStringExtra("SEX_TOMATO");

        if (sex.equals("남자")) {
            setContentView(R.layout.male_tomato);
        }
        else {
            setContentView(R.layout.female_tomato);
        }

        tomatoImage=(ImageView)findViewById(R.id.tomato);

        tomatoImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DIALOG_TOMATO_INFO);
            }
        });

        image_user = (ImageView)findViewById(R.id.user);
        image_cloud = (ImageView)findViewById(R.id.cloud);
        play_btn = (Button) findViewById(R.id.playbutton);
        camera_btn = (Button) findViewById(R.id.camerabutton);
        grow_btn = (Button) findViewById(R.id.growbutton);

        image_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(image_cloud.getVisibility() == View.GONE) {
                    image_cloud.setVisibility(View.VISIBLE);
                    play_btn.setVisibility(View.VISIBLE);
                    camera_btn.setVisibility(View.VISIBLE);
                    grow_btn.setVisibility(View.VISIBLE);
                }
                else {
                    image_cloud.setVisibility(View.GONE);
                    play_btn.setVisibility(View.GONE);
                    camera_btn.setVisibility(View.GONE);
                    grow_btn.setVisibility(View.GONE);
                }
            }
        });
    }

    public void onButtonClicked(View view){
        Intent intent=null;

        switch (view.getId()){
            case R.id.infobutton:
                intent = new Intent(MainTomato.this,InfoTomato.class);
                break;
            case R.id.camerabutton:
                intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                break;
            case R.id.growbutton:
                intent = new Intent(MainTomato.this, MainFragment.class);
                break;
            case R.id.playbutton:
                intent = new Intent(MainTomato.this, PlayTomato.class);
                break;
        }
        if(intent!=null){
            startActivity(intent);
        }
    }

    protected Dialog onCreateDialog(int id){
        switch(id) {
            case DIALOG_TOMATO_INFO:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle(name + "의 정보");
                builder.setIcon(R.drawable.tomato);
                builder.setMessage("\n이름 : " + name +"\n\n" + "생일 : " + date);
                builder.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog=builder.create();
                return alertDialog;
        }
        return null;
    }
}
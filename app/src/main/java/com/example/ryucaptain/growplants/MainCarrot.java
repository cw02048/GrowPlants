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

public class MainCarrot extends AppCompatActivity {

    TextView text;
    String name,date,sex;
    static final int DIALOG_CARROT_INFO = 1;
    ImageView image_carrot, image_user, image_cloud;
    Button memo_btn, camera_btn, grow_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent=getIntent();
        name=intent.getStringExtra("NAME_CARROT");
        date=intent.getStringExtra("DATE_CARROT");
        sex=intent.getStringExtra("SEX_CARROT");

        if (sex.equals("남자")) {
            setContentView(R.layout.male_carrot);
        }
        else {
            setContentView(R.layout.female_carrot);
        }


        image_carrot=(ImageView)findViewById(R.id.carrot);


        image_carrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DIALOG_CARROT_INFO);
            }
        });

        image_user = (ImageView)findViewById(R.id.user);
        image_cloud = (ImageView)findViewById(R.id.cloud);
        memo_btn = (Button) findViewById(R.id.playbutton);
        camera_btn = (Button) findViewById(R.id.camerabutton);
        grow_btn = (Button) findViewById(R.id.growbutton);

        image_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(image_cloud.getVisibility() == View.GONE) {
                    image_cloud.setVisibility(View.VISIBLE);
                    memo_btn.setVisibility(View.VISIBLE);
                    camera_btn.setVisibility(View.VISIBLE);
                    grow_btn.setVisibility(View.VISIBLE);
                }
                else {
                    image_cloud.setVisibility(View.GONE);
                    memo_btn.setVisibility(View.GONE);
                    camera_btn.setVisibility(View.GONE);
                    grow_btn.setVisibility(View.GONE);
                }
            }
        });

    }

    public void onButtonClicked(View view){
        Intent intent = null;

        switch (view.getId()){
            case R.id.infobutton:
                intent = new Intent(MainCarrot.this,InfoCarrot.class);
                break;
            case R.id.camerabutton:
                intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                break;
            case R.id.growbutton:
                intent = new Intent(MainCarrot.this, MainFragment.class);
                break;
            case R.id.playbutton:
                intent = new Intent(MainCarrot.this, PlayCarrot.class);
                break;
        }
        if(intent!=null){
            startActivity(intent);
        }
    }

    protected Dialog onCreateDialog(int id){
        switch (id){
            case DIALOG_CARROT_INFO:
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle(name+"의 정보")
                        .setIcon(R.drawable.carrot)
                        .setMessage("\n이름 : " + name +"\n\n" + "생일 : " + date)
                        .setNegativeButton("닫기", new DialogInterface.OnClickListener() {
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

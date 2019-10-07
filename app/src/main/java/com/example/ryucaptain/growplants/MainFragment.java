package com.example.ryucaptain.growplants;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);

        getFragmentManager().beginTransaction().add(R.id.fragment_container, new Tomato_Fragment()).commit();
    }


    public void selectFragment(View view){
        Fragment fr=null;

        switch (view.getId()){
            case R.id.button1:
                fr = new Tomato_Fragment();
                break;
            case R.id.button2:
                fr = new Carrot_Fragment();
                break;
        }

        getFragmentManager().beginTransaction().replace(R.id.fragment_container, fr).commit();
    }
}

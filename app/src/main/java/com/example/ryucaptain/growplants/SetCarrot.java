package com.example.ryucaptain.growplants;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.Calendar;

public class SetCarrot extends AppCompatActivity {

    final static int DATE_DIALOG_ID=1;
    EditText nametext,daytext;
    String sex;
    Intent in;

    private int mYear,mMonth,mDay;
    public int year,month,day;

    public SetCarrot(){
        final Calendar c=Calendar.getInstance();
        mYear=c.get(Calendar.YEAR);
        mMonth=c.get(Calendar.MONTH);
        mDay=c.get(Calendar.DAY_OF_MONTH);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_carrot);

        daytext=(EditText)findViewById(R.id.day);
        nametext=(EditText)findViewById(R.id.name);

        Button b=(Button)findViewById(R.id.ok);

        daytext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DATE_DIALOG_ID);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in=new Intent(SetCarrot.this,MainCarrot.class);
                in.putExtra("NAME_CARROT",nametext.getText().toString());
                in.putExtra("DATE_CARROT",daytext.getText().toString());
                in.putExtra("SEX_CARROT",sex);
                startActivity(in);
            }
        });
    }

    public void onRadioButtonClicked(View view){
        boolean checked=((RadioButton)view).isChecked();

        switch (view.getId()){
            case R.id.female:
                sex=((RadioButton)view).getText().toString();
                break;
            case R.id.male:
                sex=((RadioButton)view).getText().toString();
                break;
        }
    }

    private DatePickerDialog.OnDateSetListener mDateSetListener=new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int i, int i1, int i2) {
            year=i;
            month=i1+1;
            day=i2;
            daytext.setText(year+"."+month+"."+day);
        }
    };

    protected Dialog onCreateDialog(int id){
        switch (id){
            case DATE_DIALOG_ID:
                return new DatePickerDialog(this,mDateSetListener,mYear,mMonth,mDay);
        }
        return null;
    }
}

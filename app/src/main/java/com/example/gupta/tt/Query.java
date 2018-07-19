package com.example.gupta.tt;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class Query extends AppCompatActivity {
    ImageView classimage, roomimage,timetableimage;
    Button next;
    CheckBox classbool, roombool,teacherbool,timetablebool;
    String getclass,getroom,getteacher,gettimetable;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);
        classimage = findViewById(R.id.classimage);
        roomimage = findViewById(R.id.roomimage);
        timetableimage = findViewById(R.id.timetableimage);
        next=findViewById(R.id.next);

        classbool=findViewById(R.id.classcheckbox);
        roombool=findViewById(R.id.roomcheckbox);
        teacherbool=findViewById(R.id.teachercheckbox);
        timetablebool=findViewById(R.id.timetablecheckbox);

        classbool.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    getclass="True";

                    Log.d("CLASSS", "onCreate: " +getclass);
                }

                else{
                    getclass="False";
                }

            }
        });

        roombool.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    getroom="True";
                }

                else{
                    getroom="False";
                }

            }
        });

        teacherbool.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    getteacher="True";
                }

                else{
                    getteacher="False";
                }
            }
        });



        timetablebool.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){

                    gettimetable="True";
                }

                else{
                    gettimetable="False";
                }
            }
        });




        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Query.this,QueryEditPage.class);
                intent.putExtra("getclass",getclass);
                intent.putExtra("getteacher",getteacher);
                intent.putExtra("getroom",getroom);
                intent.putExtra("gettimetable",gettimetable);
                startActivity(intent);

            }
        });


    }




}

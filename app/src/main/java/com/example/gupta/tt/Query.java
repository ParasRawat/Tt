package com.example.gupta.tt;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Query extends AppCompatActivity {
    ImageView classimage, roomimage,timetableimage;
    Dialog teacherdialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);
        classimage=findViewById(R.id.classimage);
        roomimage=findViewById(R.id.roomimage);
        timetableimage=findViewById(R.id.timetableimage);
        teacherdialog=new Dialog(this);


        classimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teacherdialog.setContentView(R.layout.classquerypopup);
                teacherdialog.show();


            }
        });

    }




}

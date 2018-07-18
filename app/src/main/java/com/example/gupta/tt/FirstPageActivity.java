package com.example.gupta.tt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FirstPageActivity extends AppCompatActivity {
    ImageView editinfo,queryview, edittimetable,timetableview;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        editinfo=findViewById(R.id.imageditinfo);
        queryview=findViewById(R.id.imagequery);

        editinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstPageActivity.this,AddTTActivity.class));

            }
        });

        queryview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FirstPageActivity.this,Query.class));
            }
        });

    }
}

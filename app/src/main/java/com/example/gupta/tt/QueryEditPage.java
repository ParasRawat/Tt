package com.example.gupta.tt;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class QueryEditPage extends AppCompatActivity {
    String getclass,getroom,getteacher,gettimetable;
    TextView textView;
    String True="True";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query_edit_page);
        Bundle bundle=getIntent().getExtras();
        getclass=bundle.getString("getclass");
        getroom=bundle.getString("getroom");
        getteacher=bundle.getString("getteacher");
        gettimetable=bundle.getString("gettimetable");

        textView=findViewById(R.id.text);

        textView.append("Get Class="+getclass+"\n"+"Get Timetable="+gettimetable+"\n"+"Get Teacher ="+getteacher+"\n"+ "Get Room="+getroom);

            Log.d("IF", "onCreate: Function if statemnt");
            check(getclass);




    }
    void check(String getclass){

        Log.d("CHECKK", "check: ENTERED THE CLASS" +getclass);


            Log.d("iffff", "check: ENTERRED THE FUNCTION IF CONDITION");

            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

            classfragment classfragment=new classfragment();
            fragmentTransaction.replace(R.id.first,classfragment).commit();
        }

}

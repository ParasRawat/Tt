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

    int num;




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




            if (getclass != null) {
                Log.d("whATS", "onCreate: __________-----------------------________");
                check(getclass);

            }

            if (getroom != null) {


                check3(getroom);

            }
            if (getteacher != null) {

                check2(getteacher);


        }
    }





    void check(String getclass){

        Log.d("CHECKK", "check: ENTERED THE CLASS" +getclass);


            Log.d("iffff", "check: ENTERRED THE FUNCTION IF CONDITION");

            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

            classfragment classfragment=new classfragment();
            fragmentTransaction.replace(R.id.first,classfragment).commit();
        }

    void check2(String getteacher){

        Log.d("CHECKK", "check: ENTERED THE CLASS" +getteacher);


        Log.d("iffff", "check: ENTERRED THE FUNCTION IF CONDITION");

        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        teacherfragment teacherfragment=new teacherfragment();
        fragmentTransaction.replace(R.id.first,teacherfragment).commit();
    }

    void check3(String getroom){

        Log.d("CHECKK", "check: ENTERED THE CLASS" +getroom);


        Log.d("iffff", "check: ENTERRED THE FUNCTION IF CONDITION");

        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        roomfragment roomfragment=new roomfragment();
        fragmentTransaction.replace(R.id.first,roomfragment).commit();
    }


}

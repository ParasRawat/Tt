package com.example.gupta.tt;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    Spinner day,slot;
    RadioGroup rg;
    RadioButton rb;
    boolean added=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b=(Button) findViewById(R.id.button);
        day =(Spinner) findViewById(R.id.day);
        slot =(Spinner) findViewById(R.id.slot);
        rg=(RadioGroup) findViewById(R.id.radios);


        //SPINNER
        ArrayAdapter<CharSequence> day_adapter=ArrayAdapter.createFromResource(this,R.array.days,android.R.layout.simple_spinner_item);
        day_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        day.setAdapter(day_adapter);
        day.setPrompt("Day");


        ArrayAdapter<CharSequence> slot_adapter=ArrayAdapter.createFromResource(this,R.array.slots,android.R.layout.simple_spinner_item);
        slot_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        slot.setAdapter(slot_adapter);

        //BUTTON
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rb=(RadioButton)findViewById(rg.getCheckedRadioButtonId());
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater=MainActivity.this.getLayoutInflater();
                builder.setView(inflater.inflate(R.layout.activity_main2,null))
                        .setTitle("| "+(String) day.getSelectedItem()+"\t"+ (String) slot.getSelectedItem()+" | "+rb.getText().toString())
                        .setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                addData();
                                Toast.makeText(MainActivity.this,"ADDED",Toast.LENGTH_LONG).show();
                            }
                        })
                        .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        })
                .create()
                .show();
            }
        });
     }

     public void addData(){
        added=true;
     }
}

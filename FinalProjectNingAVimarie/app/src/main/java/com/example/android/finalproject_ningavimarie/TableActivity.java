package com.example.android.finalproject_ningavimarie;

import android.app.ActionBar;
import android.support.v4.widget.ImageViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import android.view.View.OnClickListener;

public class TableActivity extends AppCompatActivity { //implements View.OnClickListener {

    Date date1 = Data.receiveDate1();
    Date date2 = Data.receiveDate2();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        Data.Init();

        System.out.println("ChuanBuGuoQuDe" + date1);
        System.out.println("ChuanBuGuoQuDe" + date2);



        if(Data.isConflict(date1,date2,0)){
            ImageView table1=(ImageView)findViewById(R.id.table1);
            table1.setImageResource(R.drawable.rec); //plot block with red
        }

        final ImageView TABLE1=(ImageView)findViewById(R.id.table1);
        TABLE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,0) == false) {
                    Data.addTime(date1,date2, 0);
                    TABLE1.setImageResource(R.drawable.rec2);
                }
                else{
                    Toast.makeText(TableActivity.this,
                            "This Table is Unavailable!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        ////
        if(Data.isConflict(date1,date2,1)){
            ImageView table2=(ImageView)findViewById(R.id.table2);
            table2.setImageResource(R.drawable.rec); //plot block with red
        }
//
        final ImageView TABLE2=(ImageView)findViewById(R.id.table2);
        TABLE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,1) == false) {
                    Data.addTime(date1,date2, 1);
                    TABLE2.setImageResource(R.drawable.rec2);
                }
                else{
                    Toast.makeText(TableActivity.this,
                            "This Table is Unavailable!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        ////
        if(Data.isConflict(date1,date2,2)){
            ImageView table3=(ImageView)findViewById(R.id.table3);
            table3.setImageResource(R.drawable.rec); //plot block with red
        }
//
        final ImageView TABLE3=(ImageView)findViewById(R.id.table3);
        TABLE3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,2) == false) {
                    Data.addTime(date1,date2, 2);
                    TABLE3.setImageResource(R.drawable.rec2);
                }
                else{
                    Toast.makeText(TableActivity.this,
                            "This Table is Unavailable!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });


//        ////
//        if(Data.isConflict(date1,date2,3)){
//            ImageView table3=(ImageView)findViewById(R.id.table4);
//            table3.setImageResource(R.drawable.rec); //plot block with red
//        }
////
//        final ImageView TABLE4=(ImageView)findViewById(R.id.table4);
//        TABLE4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(Data.isConflict(date1,date2,3) == false) {
//                    Data.addTime(date1,date2, 3);
//                    TABLE4.setImageResource(R.drawable.rec2);
//                }
//                else{
//                    Toast.makeText(TableActivity.this,
//                            "This Table is Unavailable!",
//                            Toast.LENGTH_LONG).show();
//                }
//            }
//        });

    }

}


//  SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
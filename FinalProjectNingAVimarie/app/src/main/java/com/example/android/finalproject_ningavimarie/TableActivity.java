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


        final ImageView TABLE2=(ImageView)findViewById(R.id.table1);
        TABLE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,0) == false) {
                    Data.addTime(date1,date2, 0);
                    TABLE2.setImageResource(R.drawable.rec2);
                }
                else{
                    Toast.makeText(TableActivity.this,
                            "This Table is Unavailable!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

    }

}


//  SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
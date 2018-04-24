package com.example.android.finalproject_ningavimarie;

import android.app.ActionBar;
import android.support.v4.widget.ImageViewCompat;
import android.support.v4.widget.TintableImageSourceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import android.util.Log;

import android.view.View.OnClickListener;

public class TableActivity extends AppCompatActivity { //implements View.OnClickListener {

    Date date1 = Data.receiveDate1();
    Date date2 = Data.receiveDate2();

    final TableTracker tracker = new TableTracker();

    public void Confirm(View view){
        int Val = Validate();
        if(Val == 1) {
            for (int i = 0; i < tracker.value.length; i++) {
                if (tracker.value[i] == true) {
                    Data.addTime(date1, date2, i);
                    Toast.makeText(TableActivity.this,
                            "You have successfully reserved this table!",
                            Toast.LENGTH_LONG).show();
                }
            }
        }
        else if(Val == -1){
            Toast.makeText(TableActivity.this,
                    "Cannot reverve more than two tables!",
                    Toast.LENGTH_LONG).show();
        }
        else if(Val == 0){
            Toast.makeText(TableActivity.this,
                    "Please select at least one table!",
                    Toast.LENGTH_LONG).show();
        }
    }

    public class TableTracker{
        boolean[] value = new boolean[14];

        public TableTracker(){
            Arrays.fill(value, false);
        }

        public void setTracker(int n, boolean flag){
            this.value[n] = flag;
        }

    }

    public int Validate(){
        int count = 0;
        for (int i = 0; i < tracker.value.length; i++) {
            if (tracker.value[i] == true) {
                count++;
            }
        }
        if(count>2){
            return -1;
        }
        else if(count == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        Data.Init();

        System.out.println("ChuanBuGuoQuDe" + date1);
        System.out.println("ChuanBuGuoQuDe" + date2);



        //final boolean Table1Track = false;
        //final Integer Table1Track = new Integer(0);


        if(Data.isConflict(date1,date2,0)){
            ImageView table=(ImageView)findViewById(R.id.table1);
            table.setImageResource(R.drawable.rec); //plot block with red
        }
        if(Data.isConflict(date1,date2,1)){
            ImageView table=(ImageView)findViewById(R.id.table2);
            table.setImageResource(R.drawable.rec); //plot block with red
        }
        if(Data.isConflict(date1,date2,2)){
            ImageView table=(ImageView)findViewById(R.id.table3);
            table.setImageResource(R.drawable.rec); //plot block with red
        }
        if(Data.isConflict(date1,date2,3)){
            ImageView table=(ImageView)findViewById(R.id.table4);
            table.setImageResource(R.drawable.rec); //plot block with red
        }
        if(Data.isConflict(date1,date2,4)){
            ImageView table=(ImageView)findViewById(R.id.table5);
            table.setImageResource(R.drawable.rec); //plot block with red
        }
        if(Data.isConflict(date1,date2,5)){
            ImageView table=(ImageView)findViewById(R.id.table6);
            table.setImageResource(R.drawable.rec); //plot block with red
        }
        if(Data.isConflict(date1,date2,6)){
            ImageView table=(ImageView)findViewById(R.id.table7);
            table.setImageResource(R.drawable.rec); //plot block with red
        }
        if(Data.isConflict(date1,date2,7)){
            ImageView table=(ImageView)findViewById(R.id.table8);
            table.setImageResource(R.drawable.rec); //plot block with red
        }
        if(Data.isConflict(date1,date2,8)){
            ImageView table=(ImageView)findViewById(R.id.table9);
            table.setImageResource(R.drawable.rec); //plot block with red
        }
        if(Data.isConflict(date1,date2,9)){
            ImageView table=(ImageView)findViewById(R.id.table10);
            table.setImageResource(R.drawable.rec); //plot block with red
        }

        if(Data.isConflict(date1,date2,10)){
            ImageView table=(ImageView)findViewById(R.id.table11);
            table.setImageResource(R.drawable.heart); //plot block with red
        }

        if(Data.isConflict(date1,date2,11)){
            ImageView table=(ImageView)findViewById(R.id.table12);
            table.setImageResource(R.drawable.heart); //plot block with red
        }

        if(Data.isConflict(date1,date2,12)){
            ImageView table=(ImageView)findViewById(R.id.table13);
            table.setImageResource(R.drawable.heart); //plot block with red
        }

        if(Data.isConflict(date1,date2,13)){
            ImageView table=(ImageView)findViewById(R.id.table14);
            table.setImageResource(R.drawable.circle1); //plot block with red
        }




        final ImageView TABLE1=(ImageView)findViewById(R.id.table1);
        TABLE1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,0) == false) {
                    if( tracker.value[0] == false) {
                        //Data.addTime(date1, date2, 0);
                        TABLE1.setImageResource(R.drawable.rec2);
                        tracker.setTracker(0, true);
                        //setTable1Track(true);
                    }
                    else if(tracker.value[0] == true){
                        TABLE1.setImageResource(R.drawable.rec1);
                        //Table1Track = false;
                        tracker.setTracker(0, false);
                    }

                }
                else{
                    Toast.makeText(TableActivity.this,
                            "This Table is Unavailable!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        ////
//
        final ImageView TABLE2=(ImageView)findViewById(R.id.table2);
        TABLE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,1) == false) {
                    if( tracker.value[1] == false) {
                        //Data.addTime(date1, date2, 1);
                        TABLE2.setImageResource(R.drawable.rec2);
                        tracker.setTracker(1, true);
                    }
                    else if(tracker.value[1] == true){
                        TABLE2.setImageResource(R.drawable.rec1);
                        //Table1Track = false;
                        tracker.setTracker(1, false);
                    }
                }
                else{
                    Toast.makeText(TableActivity.this,
                            "This Table is Unavailable!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        ////
        final ImageView TABLE3=(ImageView)findViewById(R.id.table3);
        TABLE3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,2) == false) {
                    if( tracker.value[2] == false) {
                        //Data.addTime(date1, date2, 1);
                        TABLE3.setImageResource(R.drawable.rec2);
                        tracker.setTracker(2, true);
                    }
                    else if(tracker.value[2] == true){
                        TABLE3.setImageResource(R.drawable.rec1);
                        //Table1Track = false;
                        tracker.setTracker(2, false);
                    }
                }
                else{
                    Toast.makeText(TableActivity.this,
                            "This Table is Unavailable!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        //
        final ImageView TABLE4=(ImageView)findViewById(R.id.table4);
        TABLE4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,3) == false) {
                    if( tracker.value[3] == false) {
                        //Data.addTime(date1, date2, 1);
                        TABLE4.setImageResource(R.drawable.rec2);
                        tracker.setTracker(3, true);
                    }
                    else if(tracker.value[3] == true){
                        TABLE4.setImageResource(R.drawable.rec1);
                        //Table1Track = false;
                        tracker.setTracker(3, false);
                    }
                }
                else{
                    Toast.makeText(TableActivity.this,
                            "This Table is Unavailable!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });


        final ImageView TABLE5=(ImageView)findViewById(R.id.table5);
        TABLE5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,4) == false) {
                    if( tracker.value[4] == false) {
                        //Data.addTime(date1, date2, 1);
                        TABLE5.setImageResource(R.drawable.rec2);
                        tracker.setTracker(4, true);
                    }
                    else if(tracker.value[4] == true){
                        TABLE5.setImageResource(R.drawable.rec1);
                        //Table1Track = false;
                        tracker.setTracker(4, false);
                    }
                }
                else{
                    Toast.makeText(TableActivity.this,
                            "This Table is Unavailable!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        final ImageView TABLE6=(ImageView)findViewById(R.id.table6);
        TABLE6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,5) == false) {
                    if( tracker.value[5] == false) {
                        //Data.addTime(date1, date2, 1);
                        TABLE6.setImageResource(R.drawable.rec2);
                        tracker.setTracker(5, true);
                    }
                    else if(tracker.value[5] == true){
                        TABLE6.setImageResource(R.drawable.rec1);
                        //Table1Track = false;
                        tracker.setTracker(5, false);
                    }
                }
                else{
                    Toast.makeText(TableActivity.this,
                            "This Table is Unavailable!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        final ImageView TABLE7=(ImageView)findViewById(R.id.table7);
        TABLE7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,6) == false) {
                    if( tracker.value[6] == false) {
                        //Data.addTime(date1, date2, 1);
                        TABLE7.setImageResource(R.drawable.rec2);
                        tracker.setTracker(6, true);
                    }
                    else if(tracker.value[6] == true){
                        TABLE7.setImageResource(R.drawable.rec1);
                        //Table1Track = false;
                        tracker.setTracker(6, false);
                    }
                }
                else{
                    Toast.makeText(TableActivity.this,
                            "This Table is Unavailable!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        final ImageView TABLE8=(ImageView)findViewById(R.id.table8);
        TABLE8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,7) == false) {
                    if( tracker.value[7] == false) {
                        //Data.addTime(date1, date2, 1);
                        TABLE8.setImageResource(R.drawable.rec2);
                        tracker.setTracker(7, true);
                    }
                    else if(tracker.value[7] == true){
                        TABLE8.setImageResource(R.drawable.rec1);
                        //Table1Track = false;
                        tracker.setTracker(7, false);
                    }
                }
                else{
                    Toast.makeText(TableActivity.this,
                            "This Table is Unavailable!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        final ImageView TABLE9=(ImageView)findViewById(R.id.table9);
        TABLE9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,8) == false) {
                    if( tracker.value[8] == false) {
                        //Data.addTime(date1, date2, 1);
                        TABLE9.setImageResource(R.drawable.rec2);
                        tracker.setTracker(8, true);
                    }
                    else if(tracker.value[8] == true){
                        TABLE9.setImageResource(R.drawable.rec1);
                        //Table1Track = false;
                        tracker.setTracker(8, false);
                    }
                }
                else{
                    Toast.makeText(TableActivity.this,
                            "This Table is Unavailable!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        final ImageView TABLE10=(ImageView)findViewById(R.id.table10);
        TABLE10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,9) == false) {
                    if( tracker.value[9] == false) {
                        //Data.addTime(date1, date2, 1);
                        TABLE10.setImageResource(R.drawable.rec2);
                        tracker.setTracker(9, true);
                    }
                    else if(tracker.value[9] == true){
                        TABLE10.setImageResource(R.drawable.rec1);
                        //Table1Track = false;
                        tracker.setTracker(9, false);
                    }
                }
                else{
                    Toast.makeText(TableActivity.this,
                            "This Table is Unavailable!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        final ImageView TABLE11=(ImageView)findViewById(R.id.table11);
        TABLE11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,10) == false) {
                    if( tracker.value[10] == false) {
                        //Data.addTime(date1, date2, 1);
                        TABLE11.setImageResource(R.drawable.heart2);
                        tracker.setTracker(10, true);
                    }
                    else if(tracker.value[10] == true){
                        TABLE11.setImageResource(R.drawable.heart1);
                        //Table1Track = false;
                        tracker.setTracker(10, false);
                    }
                }
                else{
                    Toast.makeText(TableActivity.this,
                            "This Table is Unavailable!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        final ImageView TABLE12=(ImageView)findViewById(R.id.table12);
        TABLE12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,11) == false) {
                    if( tracker.value[11] == false) {
                        //Data.addTime(date1, date2, 1);
                        TABLE12.setImageResource(R.drawable.heart2);
                        tracker.setTracker(11, true);
                    }
                    else if(tracker.value[11] == true){
                        TABLE12.setImageResource(R.drawable.heart1);
                        //Table1Track = false;
                        tracker.setTracker(11, false);
                    }
                }
                else{
                    Toast.makeText(TableActivity.this,
                            "This Table is Unavailable!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        final ImageView TABLE13=(ImageView)findViewById(R.id.table13);
        TABLE13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,12) == false) {
                    if( tracker.value[12] == false) {
                        //Data.addTime(date1, date2, 1);
                        TABLE13.setImageResource(R.drawable.heart2);
                        tracker.setTracker(12, true);
                    }
                    else if(tracker.value[12] == true){
                        TABLE13.setImageResource(R.drawable.heart1);
                        //Table1Track = false;
                        tracker.setTracker(12, false);
                    }
                }
                else{
                    Toast.makeText(TableActivity.this,
                            "This Table is Unavailable!",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        final ImageView TABLE14=(ImageView)findViewById(R.id.table14);
        TABLE14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Data.isConflict(date1,date2,13) == false) {
                    if( tracker.value[13] == false) {
                        //Data.addTime(date1, date2, 1);
                        TABLE14.setImageResource(R.drawable.circle2);
                        tracker.setTracker(13, true);
                    }
                    else if(tracker.value[13] == true){
                        TABLE14.setImageResource(R.drawable.circle);
                        //Table1Track = false;
                        tracker.setTracker(13, false);
                    }
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
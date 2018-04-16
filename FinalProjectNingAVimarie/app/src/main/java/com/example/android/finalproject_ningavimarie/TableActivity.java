package com.example.android.finalproject_ningavimarie;

import android.support.v4.widget.ImageViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TableActivity extends AppCompatActivity {
    private ImageView TABLE1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
      //  TABLE1.setOnClickListener(this);



        Date date1 = Data.receiveDate1();
        Date date2 = Data.receiveDate2();

        System.out.println("ChuanBuGuoQuDe" + date1);
        System.out.println("ChuanBuGuoQuDe" + date2);





        if(Data.isConflict(date1,date2) == false){
            Data.addTime(date1,date2);
            Data.getAllTime();
        }
        else {
            ImageView table1=(ImageView)findViewById(R.id.table1);
            table1.setImageResource(R.drawable.rec); //plot block with red

        }

        //public void table1.onclicklinstern(){}
        //if(image==red.png){toggle: unavaiable}
        //else if (image==white.png){set image}


        //plot block with white


        //else{}


//        Time t;
//
//        int a[] = Data.showAllAvailable(t);
//        for(int i=0; i < a.size; i++){
//            if(a[i] == true){
//                changeImage;
//            }
//        }
    }


}

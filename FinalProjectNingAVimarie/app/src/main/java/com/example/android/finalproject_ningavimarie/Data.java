package com.example.android.finalproject_ningavimarie;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by anning on 2018/4/14.
 */

public class Data {
    public static ArrayList<Date> timeArrays = new ArrayList<>();
    public static Date chuanbuguoqu1 = new Date();
    public static Date chuanbuguoqu2 = new Date();

    static SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");

    static DateFormat format = new SimpleDateFormat("hh:mm");

    public static void addTime(Date d1, Date d2){
//        try {
//            a.add(formatter.parse(format.format(d1)));
//            System.out.println("babababababbababbaba" + format.format(d1));
//            //a.add(d1);
//            a.add(formatter.parse(format.format(d2)));
//            System.out.println("hahahahahahahhahah" + format.format(d2));
//            //a.add(d2);
//        }catch (ParseException e1){
//            System.out.println("Fail!?????????????????????????");
//        }

        timeArrays.add(d1);
        timeArrays.add(d2);
    }

    public static void getAllTime(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(timeArrays);
        System.out.println(" ");
        System.out.println(" ");
    }


    public static void sendDate1(Date d){
        chuanbuguoqu1 = d;
    }

    public static void sendDate2(Date d){
        chuanbuguoqu2 = d;
    }

    public static Date receiveDate1(){
        return chuanbuguoqu1;
    }

    public static Date receiveDate2(){
        return chuanbuguoqu2;
    }

    public static boolean isConflict(Date newDate1, Date newDate2){
        int size = timeArrays.size();
        if(size%2 != 0){
            System.out.println("Time Array Error");
            return false;
        }
        for(int i = 0; i < size;){
            Date oldDate1 = timeArrays.get(i);
            Date oldDate2 = timeArrays.get(i+1);
            int flag1 = newDate1.compareTo(oldDate2);
            int flag2 = newDate2.compareTo(oldDate1);
            //Compare the End of inDate to the Start of newDate
            if(flag1 < 0 && flag2 > 0){
                return true;
            }
            i = i + 2;

        }
        return false;
    }

//    public static boolean[] showAllAvailable(Date t){
//        boolean available[TableNumber] = 0;
//        for(int i = 0; i <= TableNumber; i++ ){
//            a[i] = tableAvailable(i,t);
//        }
//    }



//    public static boolean showTableAvailable(int tablenumber, Time t){
//        ArrayList array = ArrayList.get(tablenumber);
//        //decide is ArrayList conflict with the current time t
//        for(int i = 0; i <= array.size; ){
//            t.start
//        }
//    }

}


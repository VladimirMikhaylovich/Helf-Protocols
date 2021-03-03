package com.example.android.helfprotocols;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Today {
    public static String GetToday(){
        Date date1 = new Date();
        long date11 = date1.getTime();
        SimpleDateFormat date = new SimpleDateFormat("d MMM yyyy");
        String text = date.format(date1.getTime());
        return text;
    }
}

package com.example.android.helfprotocols;

public class Temperature {
    static int num;
    public static int RandomNumber(){
        int a = 1; //диапазон от
        int b = 7; //диапазон до
        num = a +(int)(Math.random()*b);
        return num;
    }
}

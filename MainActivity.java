package com.example.android.helfprotocols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void create (View view){
        showText();}
    private void showText() {
        TextView todayDateTextView = (TextView) findViewById(R.id.dateToday);  // Show today date
        todayDateTextView.setText("" + Today.GetToday());

        TextView todayTempTextView = (TextView) findViewById(R.id.tempToday);  //show today temperature
        todayTempTextView.setText("36." + Temperature.RandomNumber());

        TextView todaySymTextView = (TextView) findViewById(R.id.symToday);  //show today symptomes
        todaySymTextView.setText("Нет");

        TextView lastWeekTextView1 = (TextView) findViewById(R.id.dataLastWeek1);
        lastWeekTextView1.setText(""+oldData.day1());

        TextView lastWeekTextView2 = (TextView) findViewById(R.id.dataLastWeek2);
        lastWeekTextView2.setText(""+oldData.day2());

        TextView lastWeekTextView3 = (TextView) findViewById(R.id.dataLastWeek3);
        lastWeekTextView3.setText(""+oldData.day3());

        TextView lastWeekTextView4 = (TextView) findViewById(R.id.dataLastWeek4);
        lastWeekTextView4.setText(""+oldData.day4());

        TextView lastWeekTextView5 = (TextView) findViewById(R.id.dataLastWeek5);
        lastWeekTextView5.setText(""+oldData.day5());

        TextView lastWeekTextView6 = (TextView) findViewById(R.id.dataLastWeek6);
        lastWeekTextView6.setText(""+oldData.day6());

        TextView lastWeekTextView7 = (TextView) findViewById(R.id.dataLastWeek7);
        lastWeekTextView7.setText(""+oldData.day7());

        TextView lastWeekTextView8 = (TextView) findViewById(R.id.dataLastWeek8);
        lastWeekTextView8.setText(""+oldData.day8());

        TextView lastWeekTextView9 = (TextView) findViewById(R.id.dataLastWeek9);
        lastWeekTextView9.setText(""+oldData.day9());

        TextView lastWeekTextView10 = (TextView) findViewById(R.id.dataLastWeek10);
        lastWeekTextView10.setText(""+oldData.day10());

        TextView lastWeekTextView11 = (TextView) findViewById(R.id.dataLastWeek11);
        lastWeekTextView11.setText(""+oldData.day11());

    }
}
package com.example.andy.baseball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int number;
    int number1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void oneuplift(View view) {

        display1lift();
    }

    public void twouplift(View view) {

        display2lift();
    }

    public void threeuplift(View view) {

        display3lift();
    }

    public void display1lift() {
        TextView a = (TextView) findViewById(R.id.viewnumberlift);
        int b = (int) (Math.random() * 10);

        if (b > 5) {
            number++;
        }
        a.setText(String.valueOf(number));
    }


    private void display2lift() {
        TextView a = (TextView) findViewById(R.id.viewnumberlift);
        for (int i = 0; i < 2; i++) {
            number++;
        }
        a.setText(String.valueOf(number));
    }

    private void display3lift() {
        TextView a = (TextView) findViewById(R.id.viewnumberlift);
        for (int i = 0; i < 3; i++) {
            number++;
        }
        a.setText(String.valueOf(number));
    }



    public void zeroup(View view) {

        display0();
    }


    public void oneupright(View view) {

        display1right();
    }

    public void twoupright(View view) {

        display2right();
    }

    public void threeupright(View view) {

        display3right();
    }

    public void display1right() {
        TextView a = (TextView) findViewById(R.id.viewnumberright);
        int b = (int) (Math.random() * 10);

        if (b > 5) {
            number1++;
        }
        a.setText(String.valueOf(number1));
    }


    private void display2right() {
        TextView a = (TextView) findViewById(R.id.viewnumberright);
        for (int i = 0; i < 2; i++) {
            number1++;
        }
        a.setText(String.valueOf(number1));
    }

    private void display3right() {
        TextView a = (TextView) findViewById(R.id.viewnumberright);
        for (int i = 0; i < 3; i++) {
            number1++;
        }
        a.setText(String.valueOf(number1));
    }

    public void display0() {
        TextView a = (TextView) findViewById(R.id.viewnumberright);
        TextView b = (TextView) findViewById(R.id.viewnumberlift);
        number1 = 0;
        a.setText(String.valueOf(number1));
        b.setText(String.valueOf(number));
    }
}

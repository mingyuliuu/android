package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        showRandomNumber();
    }

    public void showRandomNumber() {

        // Get the text view where the random number will be displayed
        TextView randomView = (TextView)
                findViewById(R.id.textview_random);

        // Get the text view where the heading is displayed
        TextView headingView = (TextView)
                findViewById(R.id.textview_label);

        int max_value = getIntent().getIntExtra(TOTAL_COUNT, 0);

        Random rd = new Random();
        int random = 0;
        if(max_value>0){
            random = rd.nextInt(max_value);
        }
        randomView.setText(random+"");

        headingView.setText(getString(R.string.random_heading, max_value));
    }
}

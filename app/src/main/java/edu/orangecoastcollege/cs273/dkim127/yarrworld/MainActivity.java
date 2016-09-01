package edu.orangecoastcollege.cs273.dkim127.yarrworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // restoring user settings from a previous session
        super.onCreate(savedInstanceState);
        // inflating (!) opening the layout called activity_main (activity_main.xml)
        setContentView(R.layout.activity_main);
    }
}

package edu.orangecoastcollege.cs273.dkim127.yarrworld;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button speakButton;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // restoring user settings from a previous session
        super.onCreate(savedInstanceState);
        // inflating (!) opening the layout called activity_main (activity_main.xml)
        setContentView(R.layout.activity_main);

        speakButton = (Button) findViewById(R.id.speakButton);

        // wire up the speak button to perform an onClick event
        speakButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // use the static reference to toast
                // Toast = vanishes after a set amount of time
                // Dialog = requires user input
                Toast.makeText(context, R.string.toast_text, Toast.LENGTH_LONG).show();
            }
        });

    }

}

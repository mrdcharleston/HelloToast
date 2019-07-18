package com.example.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button makeToastButton;
    private TextView counterTextView;
    private Button counterButton;
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makeToastButton = findViewById(R.id.toast_button);
        counterTextView = findViewById(R.id.counter);
        counterButton = findViewById(R.id.counter_button);


        makeToastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Hello Toast!",Toast.LENGTH_SHORT);
                toast.show();

            }
        });

        counterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                counterTextView.setText((String.valueOf(number ++)));


            }
        });

    }




}

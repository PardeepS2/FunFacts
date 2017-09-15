package com.example.gurdeep.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private factbook factbook = new factbook();
    // Declare our View Variables
    private TextView factTextView;
    private Button   showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assign the views from the layout file to the corresponding variables

        factTextView = (TextView) findViewById(R.id.factTtextView);
        showFactButton = (Button) findViewById(R.id.ShowFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String fact = factbook.getFact();
                factTextView.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener);
    }
}

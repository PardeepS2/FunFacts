package com.example.gurdeep.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

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
                // The button was clicked, so update the fact TextView with the new fact.
                String fact = "Ostriches can run faster than horses";
                factTextView.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener);
    }
}

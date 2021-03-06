package com.example.gurdeep.funfacts;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private factbook factbook = new factbook();
    private ColorWheel colorWheel = new ColorWheel();
    // Declare our View Variables
    private TextView factTextView;
    private Button   showFactButton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assign the views from the layout file to the corresponding variables

        factTextView = (TextView) findViewById(R.id.factTtextView);
        showFactButton = (Button) findViewById(R.id.ShowFactButton);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String fact = factbook.getFact();
                factTextView.setText(fact);
                int colors = colorWheel.getcolor();
                relativeLayout.setBackgroundColor(colors);
                showFactButton.setTextColor(colors);
            }
        };

        showFactButton.setOnClickListener(listener);
        Toast.makeText(this, "yay! our activity is created", Toast.LENGTH_SHORT).show();
    }
}

package com.example.fitorfib;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // grabe the two components thatgonna change
        TextView exTitle = (TextView)findViewById(R.id.exTitle);
        ImageView exImage = (ImageView)findViewById(R.id.exImage);
        ConstraintLayout mainGb = (ConstraintLayout)findViewById(R.id.mainBg);

        // get the  things passed from intent
        String exerciseTitle = getIntent().getStringExtra(MainActivity.ETRA_ITEM_TILTLE);
        exTitle.setText(exerciseTitle);

        //logic on which button was pressed so that we know how to change the background
        if(exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHTS)){
            //change the background color
            exImage.setImageDrawable(getResources().getDrawable(R.drawable.imga1,getApplicationContext().getTheme()));
            //change the image
            mainGb.setBackgroundColor(Color.parseColor("#2ca5f5"));
        }else if(exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_CARDIO)){
            mainGb.setBackgroundColor(Color.parseColor("#916bcd"));
        }else{
            mainGb.setBackgroundColor(Color.parseColor("#52ad56"));
        }


    }
}
package com.example.fitorfib;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    // declaring some title
    public static final String EXERCISE_WEIGHTS ="Weights";
    public static final String EXERCISE_CARDIO = "Cardio";
    public static final String EXERCISE_YOGA = "Yoga";
    public  static  final String ETRA_ITEM_TILTLE ="xxxxxx";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create techinicaly the buttons
        // 1 . grabe the views
        ConstraintLayout btnWeight = (ConstraintLayout)findViewById(R.id.btnWeight);
        ConstraintLayout btnYoga = (ConstraintLayout)findViewById(R.id.btnYoga);
        ConstraintLayout btnCardio = (ConstraintLayout)findViewById(R.id.btnCardio);

        //2. add the event listeners N.B its capital letter...
        btnWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            loadDetailActivity(MainActivity.EXERCISE_WEIGHTS);
            }
        });
        btnYoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadDetailActivity(MainActivity.EXERCISE_YOGA);
            }
        });
         btnCardio.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 loadDetailActivity(MainActivity.EXERCISE_CARDIO);
             }
         });
    }
    private  void loadDetailActivity(String exerciseTitle){
        //loading the activities
        Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
        // parameters from where and what
        //send some payload /....
        intent.putExtra(MainActivity.ETRA_ITEM_TILTLE,exerciseTitle);
        //do the magic
        startActivity(intent);
    }
}
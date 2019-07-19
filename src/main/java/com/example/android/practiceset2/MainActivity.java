package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int points_a=0,points_b=0;

    public void three_point_teamA(View v){
        points_a+=3;
        display_teamA(points_a);
    }

    public void five_point_teamA(View v){
        points_a+=2;
        display_teamA(points_a);
    }

    public void free_play_teamA(View v){
        points_a+=1;
        display_teamA(points_a);
    }

    public void three_point_teamB(View v){
        points_b+=3;
        display_teamB(points_b);
    }

    public void five_point_teamB(View v){
        points_b+=2;
        display_teamB(points_b);
    }

    public void free_play_teamB(View v){
        points_b+=1;
        display_teamB(points_b);
    }

    public void resetScore(View v){
        points_a=0;
        points_b=0;
        display_teamA(points_a);
        display_teamB(points_b);
    }

    private void display_teamA(int score)
    {
        TextView scoreTextView=(TextView)findViewById(R.id.team_a_score);
        scoreTextView.setText(""+score);
    }

    private void display_teamB(int score)
    {
        TextView scoreTextView=(TextView)findViewById(R.id.team_b_score);
        scoreTextView.setText(""+score);
    }
}

package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeperapp.R;

import static com.example.android.scorekeeperapp.R.id.TeamA;
import static com.example.android.scorekeeperapp.R.id.TeamB;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int outsTeamA=0;
    int outsTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Displays the given score for Team A.
     */

    public void displayRunsForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);

        scoreView.setText(String.valueOf(score));

    }

    public void displayOutsForTeamA(int outs) {

        TextView outView = (TextView) findViewById(R.id.team_a_outs);

        outView.setText(String.valueOf(outs));
    }

    public void runsForA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayRunsForTeamA(scoreTeamA);
    }

    public void outsForA(View view) {
        outsTeamA = outsTeamA + 1;
        displayOutsForTeamA(outsTeamA);
        if (outsTeamA>= 3) {
            outsTeamA=0;
        }
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayRunsForTeamB(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);

        scoreView.setText(String.valueOf(score));

    }

    public void displayOutsForTeamB(int outs) {

        TextView outView = (TextView) findViewById(R.id.team_b_outs);

        outView.setText(String.valueOf(outs));
    }

    public void runsForB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayRunsForTeamB(scoreTeamB);
    }

    public void outsForB(View view) {
        outsTeamB = outsTeamB + 1;
        displayOutsForTeamB(outsTeamB);
        if (outsTeamB>= 3) {
            outsTeamB=0;
        }
    }



    public void resetAllPoints(View view) {
        scoreTeamA=0;
        scoreTeamB=0;
        outsTeamA=0;
        outsTeamB=0;
        displayRunsForTeamA(scoreTeamA);
        displayRunsForTeamB(scoreTeamB);
        displayOutsForTeamA(outsTeamA);
        displayOutsForTeamB(outsTeamB);
    }


}
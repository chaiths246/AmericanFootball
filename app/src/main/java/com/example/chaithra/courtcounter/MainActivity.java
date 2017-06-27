package com.example.chaithra.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    Button kickButtonA, kickButtonB, touchDown2A, touchDown2B, fieldGoalA, fieldGoalB, SafetyA, safetyB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kickButtonA = (Button) findViewById(R.id.kick);
        kickButtonA.setEnabled(false);
        kickButtonB = (Button) findViewById(R.id.kickb);
        kickButtonB.setEnabled(false);
        touchDown2A = (Button) findViewById(R.id.Touchdown2);
        touchDown2A.setEnabled(false);
        touchDown2B = (Button) findViewById(R.id.Touchdown2b);
        touchDown2B.setEnabled(false);
        fieldGoalA = (Button) findViewById(R.id.FieldGoal);
        fieldGoalA.setEnabled(true);
        fieldGoalB = (Button) findViewById(R.id.fieldgoalb);
        fieldGoalB.setEnabled(true);
        SafetyA = (Button) findViewById(R.id.safety);
        SafetyA.setEnabled(true);
        safetyB = (Button) findViewById(R.id.safetyb);
        safetyB.setEnabled(true);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);


    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void SixPoints(View view) {
        kickButtonA.setEnabled(true);
        touchDown2A.setEnabled(true);
        fieldGoalA.setEnabled(false);
        SafetyA.setEnabled(false);
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);

    }

    public void SinglePoint(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
        kickButtonA.setEnabled(false);
        touchDown2A.setEnabled(false);
        fieldGoalA.setEnabled(true);
        SafetyA.setEnabled(true);

    }

    public void TwoPoint(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
        kickButtonA.setEnabled(false);
        touchDown2A.setEnabled(false);
        fieldGoalA.setEnabled(true);
        SafetyA.setEnabled(true);
    }

    public void ThreePoints(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void safety2(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void SixPointsb(View view) {
        kickButtonB.setEnabled(true);
        touchDown2B.setEnabled(true);
        fieldGoalB.setEnabled(false);
        safetyB.setEnabled(false);
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);

    }

    public void SinglePointb(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
        kickButtonB.setEnabled(false);
        touchDown2B.setEnabled(false);
        fieldGoalB.setEnabled(true);
        safetyB.setEnabled(true);
    }

    public void TwoPointb(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
        kickButtonB.setEnabled(false);
        touchDown2B.setEnabled(false);
        fieldGoalB.setEnabled(true);
        safetyB.setEnabled(true);
    }

    public void ThreePointsb(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void safety2b(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}

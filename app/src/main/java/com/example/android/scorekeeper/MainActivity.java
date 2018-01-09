package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    //Tracks the score for team A in the 1st set.
    int scorePlayerASet1 = 0;

    //Tracks the score for team A in the 2nd set.
    int scorePlayerASet2 = 0;

    //Tracks the score for team A in the 3nd set.
    int scorePlayerASet3 = 0;

    //Tracks the score for team B in the 1st set.
    int scorePlayerBSet1 = 0;

    //Tracks the score for team B in the 2nd set.
    int scorePlayerBSet2 = 0;

    //Tracks the score for team B in the 3nd set.
    int scorePlayerBSet3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Increase the score for Player A by 1 point in the 1st set.
     */
    public void addOneForPlayerASet1(View v) {
        scorePlayerASet1 = scorePlayerASet1 + 1;
        displayForPlayerASet1(scorePlayerASet1);
    }

    /**
     * Increase the score for Player A by 1 point in the 2nd set.
     */
    public void addOneForPlayerASet2(View v) {
        scorePlayerASet2 = scorePlayerASet2 + 1;
        displayForPlayerASet2(scorePlayerASet2);

    }

    /**
     * Increase the score for Player A by 1 point in the 3rd set.
     */
    public void addOneForPlayerASet3(View v) {
        scorePlayerASet3 = scorePlayerASet3 + 1;
        displayForPlayerASet3(scorePlayerASet3);

    }

    /**
     * Displays the given score for Player A in the 1st set.
     */
    public void displayForPlayerASet1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score_set1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player A in the 2nd set.
     */
    public void displayForPlayerASet2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score_set2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player A in the 3rd set.
     */
    public void displayForPlayerASet3(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score_set3);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Player B by 1 point in the 1st set.
     */
    public void addOneForPlayerBSet1(View v) {
        scorePlayerBSet1 = scorePlayerBSet1 + 1;
        displayForPlayerBSet1(scorePlayerBSet1);
    }


    /**
     * Increase the score for Player B by 1 point in the 2nd set.
     */
    public void addOneForPlayerBSet2(View v) {
        scorePlayerBSet2 = scorePlayerBSet2 + 1;
        displayForPlayerBSet2(scorePlayerBSet2);
    }

    /**
     * Increase the score for Player B by 1 point in the 3rd Set.
     */
    public void addOneForPlayerBSet3(View v) {
        scorePlayerBSet3 = scorePlayerBSet3 + 1;
        displayForPlayerBSet3(scorePlayerBSet3);
    }

    /**
     * Displays the given score for Player B in the 1st set.
     */
    public void displayForPlayerBSet1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score_set1);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player B in the 2nd set.
     */
    public void displayForPlayerBSet2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score_set2);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player B in the 3rd set.
     */
    public void displayForPlayerBSet3(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score_set3);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the score for both players back to 0.
     */
    public void resetScore(View v) {
        scorePlayerASet1 = 0;
        scorePlayerASet2 = 0;
        scorePlayerASet3 = 0;
        scorePlayerBSet1 = 0;
        scorePlayerBSet2 = 0;
        scorePlayerBSet3 = 0;

        displayForPlayerASet1 (scorePlayerASet1);
        displayForPlayerASet2 (scorePlayerASet2);
        displayForPlayerASet3 (scorePlayerASet3);
        displayForPlayerBSet1 (scorePlayerBSet1);
        displayForPlayerBSet2 (scorePlayerBSet2);
        displayForPlayerBSet3 (scorePlayerBSet3);
    }

}
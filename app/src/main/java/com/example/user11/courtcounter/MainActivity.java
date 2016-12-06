package com.example.user11.courtcounter;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int ScoreTeamA = 0;
    int ScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Handle action bar item ckicks here. The action bar will
        //automatically handle clicks on the Home/Up Button, so long
        //as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * inreases a score for Team A by 3.
     */
    public void addThreeForTeamA(View v) {
        ScoreTeamA = ScoreTeamA + 3;
        displayForTeamA(ScoreTeamA);

    }

    /**
     * inreases a score for Team B by 3.
     */
    public void adddThreeForTeamB(View v) {
        ScoreTeamB = ScoreTeamB + 3;
        displayForTeamB(ScoreTeamB);

    }

    /**
     * inreases a score for Team A.
     */
    public void adddTwoForTeamA(View v) {
        ScoreTeamA = ScoreTeamA + 2;
        displayForTeamA(ScoreTeamA);
        ;
    }

    /**
     * inreases a score for Team B.
     */
    public void adddTwoForTeamB(View v) {
        ScoreTeamB = ScoreTeamB + 2;
        displayForTeamB(ScoreTeamB);
        ;
    }

    /**
     * inreases a score for Team A.
     */
    public void adddOneForTeamA(View v) {
        ScoreTeamA = ScoreTeamA + 1;
        displayForTeamA(ScoreTeamA);
    }

    /**
     * inreases a score for Team B.
     */
    public void adddOneForTeamB(View v) {
        ScoreTeamB = ScoreTeamB + 1;
        displayForTeamB(ScoreTeamB);
    }

    public void resetScore(View v) {
        ScoreTeamA = 0;
        ScoreTeamB = 0;
        displayForTeamA(ScoreTeamA);
        displayForTeamB(ScoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}

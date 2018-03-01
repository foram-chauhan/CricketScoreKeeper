/**
 * Author :: Foram Chauhan
 * Date :: 11 December,2016
 */
package com.example.dell.cricketscorekeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Initialising the static variables
    int runsTeamA =0;
    int wicketsTeamA = 0;
    int oversTeamA = 0;
    int runsTeamB =0;
    int wicketsTeamB = 0;
    int oversTeamB = 0;
    int totalBallsA = 0;
    int totalBallsB = 0;

    //Initialising the Views
    Button btnAddSixA;
    Button btnAddFourA;
    Button btnAddTwoA;
    Button btnAddOneA;
    Button btnAddWicketA;
    Button btnAddSixB;
    Button btnAddFourB;
    Button btnAddTwoB;
    Button btnAddOneB;
    Button btnAddWicketB;
    Button btnReset;
    Button btnRules;
    TextView runsViewA;
    TextView wicketsViewA;
    TextView oversViewA;
    TextView runsViewB;
    TextView wicketsViewB;
    TextView oversViewB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finding views by their IDs
        //Team A
        btnAddSixA = (Button)findViewById(R.id.btnAddSixA);
        btnAddFourA = (Button)findViewById(R.id.btnAddFourA);
        btnAddTwoA = (Button)findViewById(R.id.btnAddTwoA);
        btnAddOneA = (Button)findViewById(R.id.btnAddOneA);
        btnAddWicketA = (Button)findViewById(R.id.btnAddWicketA);

        //Team B
        btnAddSixB = (Button)findViewById(R.id.btnAddSixB);
        btnAddFourB = (Button)findViewById(R.id.btnAddFourB);
        btnAddTwoB = (Button)findViewById(R.id.btnAddTwoB);
        btnAddOneB = (Button)findViewById(R.id.btnAddOneB);
        btnAddWicketB = (Button)findViewById(R.id.btnAddWicketB);

        //Reset and Rules Button
        btnReset= (Button)findViewById(R.id.btnReset);
        btnRules = (Button)findViewById(R.id.btnRules);

        //Implementing OnClickListener Interface
        btnAddSixA.setOnClickListener(this);
        btnAddFourA.setOnClickListener(this);
        btnAddTwoA.setOnClickListener(this);
        btnAddOneA.setOnClickListener(this);
        btnAddWicketA.setOnClickListener(this);

        btnAddSixB.setOnClickListener(this);
        btnAddFourB.setOnClickListener(this);
        btnAddTwoB.setOnClickListener(this);
        btnAddOneB.setOnClickListener(this);
        btnAddWicketB.setOnClickListener(this);

        btnReset.setOnClickListener(this);
        btnRules.setOnClickListener(this);
    }
    /**
     * Displays the runs, wickets and overs Of Team A
     */
    public void displayForTeamA(int runs,int wickets,int overs){
         runsViewA = (TextView)findViewById(R.id.numberOfRunsA);
         wicketsViewA = (TextView)findViewById(R.id.numberOfWicketsA);
         oversViewA = (TextView)findViewById(R.id.numberOfOversA);

        runsViewA.setText(String.valueOf(runs));
        wicketsViewA.setText(String.valueOf(wickets));
        oversViewA.setText(String.valueOf(overs));
    }
    /**
     * Displays the runs, wickets and overs Of Team B
     */
    public void displayForTeamB(int runs,int wickets,int overs){
        runsViewB = (TextView)findViewById(R.id.numberOfRunsB);
        wicketsViewB = (TextView)findViewById(R.id.numberOfWicketsB);
        oversViewB = (TextView)findViewById(R.id.numberOfOversB);

        runsViewB.setText(String.valueOf(runs));
        wicketsViewB.setText(String.valueOf(wickets));
        oversViewB.setText(String.valueOf(overs));
    }

    //Implementation of onClick Method

    /**
     * On click of any button totalBalls increases for the calculation of Overs on each button click event.
     * And then show the updated score using displayForTeamA or displayForTeamB methods.
     * @param view
     */
    @Override
    public void onClick(View view) {
        if(view.equals(btnAddSixA)){
            runsTeamA = runsTeamA + 6;
            totalBallsA = totalBallsA + 1;
            oversTeamA = totalBallsA/6;
            displayForTeamA(runsTeamA,wicketsTeamA,oversTeamA);
        }
        if(view.equals(btnAddFourA)){
            runsTeamA = runsTeamA + 4;
            totalBallsA = totalBallsA + 1;
            oversTeamA = totalBallsA/6;
            displayForTeamA(runsTeamA,wicketsTeamA,oversTeamA);
        }
        if(view.equals(btnAddTwoA)){
            runsTeamA = runsTeamA + 2;
            totalBallsA = totalBallsA + 1;
            oversTeamA = totalBallsA/6;
            displayForTeamA(runsTeamA,wicketsTeamA,oversTeamA);
        }
        if(view.equals(btnAddOneA)){
            runsTeamA = runsTeamA + 1;
            totalBallsA = totalBallsA + 1;
            oversTeamA = totalBallsA/6;
            displayForTeamA(runsTeamA,wicketsTeamA,oversTeamA);
        }
        if(view.equals(btnAddWicketA)){
            wicketsTeamA = wicketsTeamA + 1;
            totalBallsA = totalBallsA + 1;
            oversTeamA = totalBallsA/6;
            displayForTeamA(runsTeamA,wicketsTeamA,oversTeamA);
        }
        /**
         * Calculations For Team B
         */
        if(view.equals(btnAddSixB)){
            runsTeamB = runsTeamB + 6;
            totalBallsB = totalBallsB + 1;
            oversTeamB = totalBallsB/6;
            displayForTeamB(runsTeamB,wicketsTeamB,oversTeamB);
        }
        if(view.equals(btnAddFourB)){
            runsTeamB = runsTeamB + 4;
            totalBallsB = totalBallsB + 1;
            oversTeamB = totalBallsB/6;
            displayForTeamB(runsTeamB,wicketsTeamB,oversTeamB);
        }
        if(view.equals(btnAddTwoB)){
            runsTeamB = runsTeamB + 2;
            totalBallsB = totalBallsB + 1;
            oversTeamB = totalBallsB/6;
            displayForTeamB(runsTeamB,wicketsTeamB,oversTeamB);
        }
        if(view.equals(btnAddOneB)){
            runsTeamB = runsTeamB + 1;
            totalBallsB = totalBallsB + 1;
            oversTeamB = totalBallsB/6;
            displayForTeamB(runsTeamB,wicketsTeamB,oversTeamB);
        }
        if(view.equals(btnAddWicketB)){
            wicketsTeamB = wicketsTeamB + 1;
            totalBallsB = totalBallsB + 1;
            oversTeamB = totalBallsB/6;
            displayForTeamB(runsTeamB,wicketsTeamB,oversTeamB);
        }

        /**
         * On click of Reset, initialise the static variables. and update the score accordingly.
         */
        if(view.equals(btnReset)){
            runsTeamA = 0; runsTeamB = 0;
            wicketsTeamA = 0; wicketsTeamB = 0;
            oversTeamA = 0; oversTeamB = 0;
            displayForTeamA(runsTeamA,wicketsTeamA,oversTeamA);
            displayForTeamB(runsTeamB,wicketsTeamB,oversTeamB);
        }
        /**
         * On click of Rules, go to another Activity called ActivityRules.java
         */
        if(view.equals(btnRules)){
            Intent intent = new Intent(this, ActivityRules.class);
            startActivity(intent);
        }
    }
}

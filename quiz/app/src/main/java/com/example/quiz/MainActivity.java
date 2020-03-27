package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score = 0;

    /**
     * Question 1 answer
     * @param view check RadioButton
     */
    public void onRadioButtonClickedQuestion1(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId())  {
            case R.id.radio_button_1:
                if (checked)
                    getIntent().putExtra("score", 1);
                break;
            case R.id.radio_button_2:
                if (checked)
                    break;
            case R.id.radio_button_3:
                if (checked)
                    break;
        }
    }

    /**
     * Question 2 answer
     * @param view check RadioButton
     */
    public void onRadioButtonClickedQuestion2(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId())  {
            case R.id.radio_button_4:
                if (checked)
                    getIntent().putExtra("score", 1);
                break;
            case R.id.radio_button_5:
                if (checked)
                    break;
            case R.id.radio_button_6:
                if (checked)
                    break;
        }
    }

    public void submit (View view) {

        RadioButton brazilabutton = (RadioButton) findViewById(R.id.radio_button_1);
        boolean isbrazila = brazilabutton.isChecked();

        RadioButton baghdadbutton = (RadioButton) findViewById(R.id.radio_button_4);
        boolean isbaghdad = baghdadbutton.isChecked();


        CheckBox cairoCheckBox = (CheckBox) findViewById(R.id.cairo);
        boolean iscairo = cairoCheckBox.isChecked();

               //if you type Russia with space the answer will be wrong

        EditText russiaEditText = (EditText) findViewById(R.id.russia_view);
        boolean isRussia = russiaEditText.getText().toString().matches("Russia");

        int score = calculateScore(isbrazila,isbaghdad,iscairo,isRussia);

        Toast.makeText(this, getString(R.string.app_name) + score, Toast.LENGTH_LONG).show();

}

    private int calculateScore(boolean isbrazila,boolean isbaghdad,boolean iscairo,boolean isRussia) {
        int startingScore = 0;

        if (isbrazila) {
            startingScore = startingScore + 1;
        }

        if (isbaghdad) {
            startingScore = startingScore + 1;
        }

        if (iscairo)
        {
            startingScore = startingScore + 1;
        }
        if (isRussia) {
            startingScore = startingScore + 1;
        }

        return score + startingScore;
    }

}
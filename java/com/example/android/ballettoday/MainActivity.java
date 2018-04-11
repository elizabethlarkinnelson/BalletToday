package com.example.android.ballettoday;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int questionsCorrect = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/*    This method is called when the submit answers button is pressed*/

    public void submitQuiz(View view){
        CheckBox tutu = (CheckBox) findViewById(R.id.ballet_dress);
        CheckBox french = (CheckBox) findViewById(R.id.language);
        CheckBox ballerino = (CheckBox) findViewById(R.id.male_dancer);

        boolean hasDress = tutu.isChecked();
        if (hasDress == true) {
            questionsCorrect += 1;
        }
        boolean hasLanguage = french.isChecked();
        if (hasLanguage == true) {
            questionsCorrect += 1;
        }
        boolean hasBoyName = ballerino.isChecked();
        if (hasBoyName == true) {
            questionsCorrect += 1;
        }

        makeToast(questionsCorrect);
        resetQuestionCount();

    }

 /*   This method displays a toast with the number of correct questions
*/
    public void makeToast(int numCorrect){

        Context context = getApplicationContext();
        CharSequence text = "Congrats, you got " + numCorrect + " correct!";

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

    }

 /*   This method resets the correct answer count to zero*/

    public void resetQuestionCount() {

        questionsCorrect = 0;
    }


}

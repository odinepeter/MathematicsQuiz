package comq.example.tobie.mathematicsquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int answer1_mark;
    int answer2_mark;
    int answer3_mark;
    int answer4_mark;
    int answer5_mark;
    int answer6_mark;
    int answer7_mark;
    int answer8_mark;
    int answer9_mark;
    int answer10_mark;
    int final_mark;
    String answerDisplay;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //This hides the keyboard from appearing at first launch of the app
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {

        Log.e(LOG_TAG, "" + this.findViewById(R.id.question1_opt3));
        //     RadioGroup rg1 = findViewById(R.id.rg1);
//        if(rg1.getCheckedRadioButtonId()==-1){
//            Toast.makeText(this, "question one not answered",Toast.LENGTH_LONG).show();
//            CheckBox CB1 = findViewById(R.id.question5_opt1);
//            boolean checked =vc
//        }
        //correct answer for question 1 is opt2
        Boolean correct_answer1;
        RadioButton question1_opt1 = (RadioButton) findViewById(R.id.question1_opt1);
        RadioButton question1_opt2 = (RadioButton) findViewById(R.id.question1_opt2);
        RadioButton question1_opt3 = (RadioButton) findViewById(R.id.question1_opt3);
        RadioButton question1_opt4 = (RadioButton) findViewById(R.id.question1_opt4);

        question1_opt1.setChecked(false);
        question1_opt2.setChecked(false);
        question1_opt3.setChecked(false);
        question1_opt4.setChecked(false);
        correct_answer1 = question1_opt2.isChecked();
        if (correct_answer1) {
            answer1_mark = 10;
        } else {
            answer1_mark = 0;
        }
        //correct answer for question 2 is opt3
        Boolean correct_answer2;
        RadioButton question2_opt1 = (RadioButton) findViewById(R.id.question2_opt1);
        RadioButton question2_opt2 = (RadioButton) findViewById(R.id.question2_opt2);
        RadioButton question2_opt3 = (RadioButton) findViewById(R.id.question2_opt3);
        RadioButton question2_opt4 = (RadioButton) findViewById(R.id.question2_opt4);

        question2_opt1.setChecked(false);
        question2_opt2.setChecked(false);
        question2_opt3.setChecked(false);
        question2_opt4.setChecked(false);
        correct_answer2 = question2_opt3.isChecked();
        if (correct_answer2) {
            answer2_mark = 10;
        } else {
            answer2_mark = 0;
        }
        //correct answer for question 3 is opt3
        Boolean correct_answer3;
        RadioButton question3_opt1 = (RadioButton) findViewById(R.id.question3_opt1);
        RadioButton question3_opt2 = (RadioButton) findViewById(R.id.question3_opt2);
        RadioButton question3_opt3 = (RadioButton) findViewById(R.id.question3_opt3);
        RadioButton question3_opt4 = (RadioButton) findViewById(R.id.question3_opt4);

        question3_opt1.setChecked(false);
        question3_opt2.setChecked(false);
        question2_opt3.setChecked(false);
        question3_opt4.setChecked(false);
        correct_answer3 = question3_opt3.isChecked();

        if (correct_answer3) {
            answer3_mark = 10;
        } else {
            answer3_mark = 0;
        }
        //correct answer for question 4 is opt2
        Boolean correct_answer4;
        RadioButton question4_opt1 = (RadioButton) findViewById(R.id.question4_opt1);
        RadioButton question4_opt2 = (RadioButton) findViewById(R.id.question4_opt2);
        RadioButton question4_opt3 = (RadioButton) findViewById(R.id.question4_opt3);
        RadioButton question4_opt4 = (RadioButton) findViewById(R.id.question4_opt4);

        question4_opt1.setChecked(false);
        question4_opt2.setChecked(false);
        question4_opt3.setChecked(false);
        question4_opt4.setChecked(false);
        correct_answer4 = question4_opt2.isChecked();
        if (correct_answer4) {
            answer4_mark = 10;
        } else {
            answer4_mark = 0;
        }
        //correct answer for question 5 is opt1, opt3 and opt4
        Boolean answer5_opt1;
        Boolean answer5_opt2;
        Boolean answer5_opt3;
        Boolean answer5_opt4;

        CheckBox question5_opt1 = (CheckBox) findViewById(R.id.question5_opt1);
        answer5_opt1 = question5_opt1.isChecked();
        CheckBox question5_opt2 = (CheckBox) this.findViewById(R.id.question5_opt2);
        answer5_opt2 = question5_opt2.isChecked();
        CheckBox question5_opt3 = (CheckBox) this.findViewById(R.id.question5_opt3);
        answer5_opt3 = question5_opt3.isChecked();
        CheckBox question5_opt4 = (CheckBox) this.findViewById(R.id.question5_opt4);
        answer5_opt4 = question5_opt4.isChecked();
        boolean checked5 = question5_opt1.isChecked() || question5_opt2.isChecked() || question5_opt3.isChecked() || question5_opt4.isChecked();
        question5_opt1.setChecked(false);
        question5_opt2.setChecked(false);
        question5_opt3.setChecked(false);
        question5_opt4.setChecked(false);

        if (answer5_opt1 && !answer5_opt2 && answer5_opt3 && answer5_opt4) {
            answer5_mark = 10;
        } else {
            answer5_mark = 0;
        }
        //correct answer for question 6 is the string"hexagon" lowercase
        String correct_answer6;
        EditText answer_6 = (EditText) findViewById(R.id.answer_6);
        correct_answer6 = answer_6.getText().toString().toLowerCase();
        answer_6.setEnabled(false);
        if (correct_answer6.equals("hexagon")) {
            answer6_mark = 10;
        } else {
            answer6_mark = 0;
        }
        //correct answer for question 7 is opt2, opt3 and opt4
        Boolean answer7_opt1;
        Boolean answer7_opt2;
        Boolean answer7_opt3;
        Boolean answer7_opt4;

        CheckBox question7_opt1 = (CheckBox) findViewById(R.id.question7_opt1);
        answer7_opt1 = question7_opt1.isChecked();
        CheckBox question7_opt2 = (CheckBox) findViewById(R.id.question7_opt2);
        answer7_opt2 = question7_opt2.isChecked();
        CheckBox question7_opt3 = (CheckBox) findViewById(R.id.question7_opt3);
        answer7_opt3 = question7_opt3.isChecked();
        CheckBox question7_opt4 = (CheckBox) findViewById(R.id.question7_opt4);
        answer7_opt4 = question7_opt4.isChecked();
        boolean checked7 = question7_opt1.isChecked() || question7_opt2.isChecked() || question7_opt3.isChecked() || question7_opt4.isChecked();

        question7_opt1.setChecked(false);
        question7_opt2.setChecked(false);
        question7_opt3.setChecked(false);
        question7_opt4.setChecked(false);

        if (!answer7_opt1 && answer7_opt2 && answer7_opt3 && answer7_opt4) {
            answer7_mark = 10;
        } else {
            answer7_mark = 0;
        }
        //correct answer for question 8 is the string "diameter" in lowercase
        String correct_answer8;
        EditText answer_8 = (EditText) findViewById(R.id.answer_8);
        correct_answer8 = answer_8.getText().toString().toLowerCase();
        answer_8.setEnabled(false);
        if (correct_answer8.equals("diameter")) {
            answer8_mark = 10;
        } else {
            answer8_mark = 0;
        }
        Boolean correct_answer9;
        RadioButton question9_opt1 = (RadioButton) findViewById(R.id.question9_opt1);
        RadioButton question9_opt2 = (RadioButton) findViewById(R.id.question9_opt2);
        RadioButton question9_opt3 = (RadioButton) findViewById(R.id.question9_opt3);
        RadioButton question9_opt4 = (RadioButton) findViewById(R.id.question9_opt4);

        question9_opt1.setChecked(false);
        question9_opt2.setChecked(false);
        question9_opt3.setChecked(false);
        question9_opt4.setChecked(false);
        correct_answer9 = question9_opt4.isChecked();
        if (correct_answer9) {
            answer9_mark = 10;
        } else {
            answer9_mark = 0;
        }
        //correct answer for question 5 is opt1, opt3 and opt4
        Boolean answer10_opt1;
        Boolean answer10_opt2;
        Boolean answer10_opt3;
        Boolean answer10_opt4;

        CheckBox question10_opt1 = (CheckBox) findViewById(R.id.question10_opt1);
        answer10_opt1 = question10_opt1.isChecked();
        CheckBox question10_opt2 = (CheckBox) findViewById(R.id.question10_opt2);
        answer10_opt2 = question10_opt2.isChecked();
        CheckBox question10_opt3 = (CheckBox) findViewById(R.id.question10_opt3);
        answer10_opt3 = question10_opt3.isChecked();
        CheckBox question10_opt4 = (CheckBox) findViewById(R.id.question10_opt4);
        answer10_opt4 = question10_opt4.isChecked();
        boolean checked10 = question10_opt1.isChecked() || question10_opt2.isChecked() || question10_opt3.isChecked() || question10_opt4.isChecked();
        question10_opt1.setChecked(false);
        question10_opt2.setChecked(false);
        question10_opt3.setChecked(false);
        question10_opt4.setChecked(false);

        if (!answer10_opt1 && answer10_opt2 && !answer10_opt3 && answer10_opt4) {
            answer10_mark = 10;
        } else {
            answer10_mark = 0;
        }
        RadioGroup rg1 = findViewById(R.id.rg1);
        RadioGroup rg2 = findViewById(R.id.rg2);
        RadioGroup rg3 = findViewById(R.id.rg3);
        RadioGroup rg4 = findViewById(R.id.rg4);
        RadioGroup rg5 = findViewById(R.id.rg5);

        if (rg1.getCheckedRadioButtonId() == -1) {
            //if no RadioButton is checked
            Toast.makeText(this, "Question 1 is not answered", Toast.LENGTH_SHORT).show();

        } else if (rg2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 2 is not answered", Toast.LENGTH_SHORT).show();

        } else if (rg3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 3 is not answered", Toast.LENGTH_SHORT).show();

        } else if (rg4.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 4 is not answered", Toast.LENGTH_SHORT).show();

        } else if (rg5.getCheckedRadioButtonId() == -1) {

            Toast.makeText(this, "Question 9 is not answered", Toast.LENGTH_SHORT).show();
        } else if (!checked5) {
            Toast.makeText(this, "Question 5 is not answered", Toast.LENGTH_SHORT).show();

        } else if (answer_6.length() == 0) {
            Toast.makeText(this, "Question 6 is not answered", Toast.LENGTH_SHORT).show();

        } else if (!checked7) {
            Toast.makeText(this, "Question 7 is not answered", Toast.LENGTH_SHORT).show();

        } else if (answer_8.length() == 0) {
            Toast.makeText(this, "Question 8 is not answered", Toast.LENGTH_SHORT).show();

        } else if (!checked10) {
            Toast.makeText(this, "Question 10 is not answered", Toast.LENGTH_SHORT).show();

        } else {
            //if at least one RadioButton & checkbox is checked and the editText not empty


            //final mark for the whole test
            final_mark = answer1_mark + answer2_mark + answer3_mark + answer4_mark + answer5_mark + answer6_mark + answer7_mark + answer8_mark + answer9_mark + answer10_mark;
            if (final_mark >= 70) {
                answerDisplay = " Excellent! you scored " + final_mark + "%" + " Grade is A ";
            } else if (final_mark == 60) {
                answerDisplay = "Very good! you scored " + final_mark + "%" + " Grade is B ";
            } else if (final_mark == 50) {
                answerDisplay = "Good! you scored " + final_mark + "%" + " Grade is C ";
            } else if (final_mark == 40) {
                answerDisplay = "Fair! you scored " + final_mark + "%" + " Grade is D";
            } else {
                answerDisplay = "Failed! try again, you scored " + final_mark + "%" + " Grade is F";
            }
            Toast.makeText(this, answerDisplay, Toast.LENGTH_LONG).show();

        }
    }
}

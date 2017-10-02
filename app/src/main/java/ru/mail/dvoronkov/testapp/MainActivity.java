package ru.mail.dvoronkov.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ru.mail.dvoronkov.testapp.activity.AnswerActivity;

public class MainActivity extends AppCompatActivity {

    public static final String BUNDLE_KEY_POSITION = "bundle.position";

    public Questionary[] tasks = {new Questionary(R.string.question1, R.string.answer1),
                                  new Questionary(R.string.question2, R.string.answer2),
                                  new Questionary(R.string.question3, R.string.answer3)};
    private int position = 0;

    private Button mAnswerButton;
    private Button mNextButton;
    private TextView mQuestionTextView;
    private TextView mAnswerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*        setTitle(R.string.testMessage);
        Log.d("onCreate", "----- firstLog -----");
        mAnswerButton = (Button) findViewById(R.id.buttonAnswer);
        mNextButton = (Button) findViewById(R.id.buttonNext);
        mQuestionTextView = (TextView) findViewById(R.id.textQuestion);
        mAnswerTextView = (TextView) findViewById(R.id.textAnswer);

        if (savedInstanceState != null) {
            mQuestionTextView.setText(tasks[savedInstanceState.getInt(BUNDLE_KEY_POSITION, 0)].getQuestion());
            position = savedInstanceState.getInt(BUNDLE_KEY_POSITION, 0);
        } else {
            mQuestionTextView.setText(tasks[0].getQuestion());
        }

        mNextButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if (position < tasks.length - 1) position++;
                mQuestionTextView.setText(tasks[position].getQuestion());
                mAnswerTextView.setText("");
            }
        });

        mAnswerButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Log.d("OnClickListener", "----- answer -----");
                Intent i = new Intent(MainActivity.this, AnswerActivity.class);
                i.putExtra(AnswerActivity.CORRECT_ANSWER, tasks[position].getAnswer());
                startActivityForResult(i, 0);
            }
        });*/

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        mAnswerTextView.setText(tasks[position].getAnswer());
    }

    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt(BUNDLE_KEY_POSITION, position);
    }
}

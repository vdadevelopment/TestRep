package ru.mail.dvoronkov.testapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import ru.mail.dvoronkov.testapp.R;

public class AnswerActivity extends AppCompatActivity {

    public final static String CORRECT_ANSWER = "ru.mail.dvoronkov.testapp.activity.CORRECT_ANSWER";
    public final static String ANSWER_RESPONCE = "ru.mail.dvoronkov.testapp.activity.ANSWER_RESPONCE";

    private TextView mAnswerTextView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        mAnswerTextView = (TextView) findViewById(R.id.answerTextView);
        mAnswerTextView.setText(getIntent().getIntExtra(CORRECT_ANSWER, 0));
    }
}
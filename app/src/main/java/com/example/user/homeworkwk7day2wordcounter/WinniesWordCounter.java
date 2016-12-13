package com.example.user.homeworkwk7day2wordcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 13/12/2016.
 */
public class WinniesWordCounter extends AppCompatActivity {
    EditText inputEditText;
    Button countButton;
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEditText=(EditText)findViewById(R.id.input_text);
        countButton=(Button)findViewById(R.id.count_button);

        countButton.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            Log.d("WinniesWordCounter", "Count button clicked");
            String input = inputEditText.getText().toString();
            Log.d("WinniesWordCounter", "Input:" + input);
            WordCounter wordCounter = new WordCounter();
            wordCounter.addSplitWords(input);
            wordCounter.size();

            answerText = (TextView)findViewById(R.id.answer_text);
            int answer = wordCounter.size();
            String answerDisplay = Integer.toString(answer);
            answerText.setText(answerDisplay);

            }
        });

    }
}

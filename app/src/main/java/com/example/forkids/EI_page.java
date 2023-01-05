package com.example.forkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class EI_page extends AppCompatActivity {

    private TextView questionTV , questionNumberTv ;
    private Button option1Btn , option2Btn , option3Btn , option4Btn ;
    private ArrayList<QuizModal> quizModalArrayList ;
    Random random ;
    int currentScore = 0 , questionAttempted = 1 , currentPos ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ei_page);

        // Intent intent = getIntent();

        questionTV = findViewById(R.id.idtvQuestion);
        questionNumberTv = findViewById(R.id.idTVQuestionAttempted);
        option1Btn = findViewById(R.id.idOption1);
        option2Btn = findViewById(R.id.idOption2);
        option3Btn = findViewById(R.id.idOption3);
        option4Btn = findViewById(R.id.idOption4);

        quizModalArrayList = new ArrayList<>();
        random = new Random();
        
        getQuizQuestion(quizModalArrayList);

        currentPos = random.nextInt(quizModalArrayList.size());
        setDataToViews(currentPos);

        option1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option1Btn.getText().toString().trim().toLowerCase())); {
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);
            }
        });


        option2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option2Btn.getText().toString().trim().toLowerCase())); {
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);
            }
        });

        option3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option3Btn.getText().toString().trim().toLowerCase())); {
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);
            }
        });

        option4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizModalArrayList.get(currentPos).getAnswer().trim().toLowerCase().equals(option4Btn.getText().toString().trim().toLowerCase())); {
                    currentScore++;
                }
                questionAttempted++;
                currentPos = random.nextInt(quizModalArrayList.size());
                setDataToViews(currentPos);
            }
        });


    }

    private void setDataToViews(int currentPos) {

        questionNumberTv.setText("Questions Attempted :" + questionAttempted +"/10");
        questionTV.setText(quizModalArrayList.get(currentPos).getQuestion());
        option1Btn.setText(quizModalArrayList.get(currentPos).getOption1());
        option2Btn.setText(quizModalArrayList.get(currentPos).getOption2());
        option3Btn.setText(quizModalArrayList.get(currentPos).getOption3());
        option4Btn.setText(quizModalArrayList.get(currentPos).getOption4());



    }

    private void getQuizQuestion(ArrayList<QuizModal> quizModalArrayList) {

        quizModalArrayList.add(new QuizModal("This is first question" , "this is option 1" , "this is option 2" , "this is option 3" , "this is option 4" , "this is option 1"));

        quizModalArrayList.add(new QuizModal("This is second question" , "this is option 1" , "this is option 2" , "this is option 3" , "this is option 4" , "this is option 1"));

        quizModalArrayList.add(new QuizModal("This is third question" , "this is option 1" , "this is option 2" , "this is option 3" , "this is option 4" , "this is option 1"));

        quizModalArrayList.add(new QuizModal("This is forth question" , "this is option 1" , "this is option 2" , "this is option 3" , "this is option 4" , "this is option 1"));
        
        
    }
}
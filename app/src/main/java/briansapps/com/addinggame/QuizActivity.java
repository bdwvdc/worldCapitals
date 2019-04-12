package briansapps.com.addinggame;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5;

    TextView score, question;

    private Questions mQuestions = new Questions();

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionLength = mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        r = new Random();


        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.questions);


        updateQuestion(r.nextInt(mQuestionLength));


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button1.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));

                } else {
                    gameOver();
                }    }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                    if (button2.getText() == mAnswer) {
                        mScore++;
                        score.setText("Score: " + mScore);
                        updateQuestion(r.nextInt(mQuestionLength));

                    } else {
                        gameOver();
                    }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button3.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));

                } else {
                    gameOver();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button4.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));

                } else {
                    gameOver();
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button5.getText() == mAnswer){
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionLength));

                } else {
                    gameOver();
                }
            }
        });
    }

    private void updateQuestion(int num) {

        question.setText(mQuestions.getQuestions(num));
        button1.setText(mQuestions.getChoice1(num));
        button2.setText(mQuestions.getChoice2(num));
        button3.setText(mQuestions.getChoice3(num));
        button4.setText(mQuestions.getChoice4(num));
        button5.setText(mQuestions.getChoice5(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }

    private void gameOver() {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(QuizActivity.this);
                    alertDialogBuilder
                            .setMessage("Game Over! Your score is " + mScore + " points.")
                            .setCancelable(false)
                            .setPositiveButton("NEW GAME",
                                    new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            startActivity(new Intent(getApplicationContext(), QuizActivity.class));
                                        }
                                    })

                            .setNegativeButton("EXIT",
                                    new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {
                                            finish();
                                        }
                                    });

                    }
}
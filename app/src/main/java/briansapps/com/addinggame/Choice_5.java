package briansapps.com.addinggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Choice_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_5);

        Button Return_1 = findViewById(R.id.return_button);
        Return_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Return_1();

            }
        });
    }
    private void Return_1() {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }
}

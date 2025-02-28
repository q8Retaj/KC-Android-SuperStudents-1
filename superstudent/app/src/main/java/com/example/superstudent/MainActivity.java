package com.example.superstudent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity<compSelectionTextView, wonLostTieTextView> extends AppCompatActivity {

   private static final String TAG = "MainActivity" ;

    TextView userSelectionTextView, compSelectionTextView, wonLostTieTextView,scoreTextView;
    
    int userScore = 0,compScore = 0 ;
    
    Random random;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userSelectionTextView = findViewById(R.id.userSelectionTextView);
        compSelectionTextView = findViewById(R.id.compSelectionTextView);
        wonLostTieTextView = findViewById(R.id.wonLostTieTextView);
        scoreTextView = findViewById(R.id.scoretextView);

        userSelectionTextView.setText("");
        compSelectionTextView.setText("");
        wonLostTieTextView.setText("");
        
        random = new Random();
                


    }
    public void Button(View view){
}
public void rpsButtonSelected(View view) {

        int userSelection = Integer.parseInt(view.getTag().toString());
    Log.i(TAG, "rpsButtonSelected:" + userSelection );
    matchGame(userSelection);
}

private void matchGame(int userSelection){
        
        int low = 1;
        int high =3;
        
        int compSelection = random.nextInt(high); +low;
        
        if (userSelection == compSelection){
            //Tie
            wonLostTieTextView.setText("Tie");
            else if((userSelection - compSelection) % 3 == 1){
                //User win
                userScore++;
                wonLostTieTextView.setText("Yay,you Won!");
            }else {
                //Comp Wins
                compScore++;
                wonLostTieTextView.setText("Oops,you Lost");
                
                switch (userSelection){
                    case 1:
                        userSelectionTextView.setText("Rock");
                        break;
                    case 2:
                        userSelectionTextView.setText("Paper");
                        break;
                        case 3;
                        userSelectionTextView.setText("Scissor");
                        break;
                }

                switch (compSelection){
                    case 1:
                        compSelectionTextView.setText("Rock");
                        break;
                    case 2:
                        compSelectionTextView.setText("Paper");
                        break;
                    case 3;
                       compSelectionTextView.setText("Scissor");
                        break;
                }
                
                setScoreTextView(userScore, compScore);
            }
        }
        private void setScoreTextView(int userScore,int compScore;){
            scoreTextView.setText(String.valueOf(userScore)+ " : " +String.valueOf(compScore) );
    }
}

    private  setScoreTextView(int userScore, int compScore) {
    }

}
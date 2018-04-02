package com.asaria.tictactoe;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int  playerSymbol = 0; // 1 for X , 2 for O
    int grid = 0; //3 for 3 X 3 , 5 for 5 X 5

    //to represent if the X or O button have been clicked
    boolean Xon = false;
    boolean Oon = false;

    //to rep that 3 X 3 or 5 X 5 has been clicked
    boolean threeOn = false;
    boolean fiveOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //see how u can prevent the other button from being pressed
    public void chooseX(View view){
        playerSymbol = 1;
        Xon = true;
        Button btn = (Button) findViewById(R.id.chosenX);
        btn.setBackgroundColor(Color.RED);

        //set the color of the O button to gray
        if(Oon){
            Oon = false;
           Button o = (Button) findViewById(R.id.chosenO);
           o.setBackgroundColor(Color.GRAY);
        }

    }

    public void chooseO(View view){
        playerSymbol = 2;
        Oon = true;
        Button btn = (Button) findViewById(R.id.chosenO);
        btn.setBackgroundColor(Color.RED);

        //set the color of the X button to gray
        if(Xon){
            Xon = false;
            Button x = (Button) findViewById(R.id.chosenX);
            x.setBackgroundColor(Color.GRAY);
        }
    }

    public void choose3X3(View view){

        threeOn = true;
        grid = 3;

        Button gridThree = (Button) findViewById(R.id.threeByThree);
        gridThree.setBackgroundColor(Color.RED);

        if(fiveOn){
            fiveOn = false;
            Button gridFive = (Button) findViewById(R.id.fiveByFive);
            gridFive.setBackgroundColor(Color.GRAY);
        }
    }

    public void choose5X5(View view){

        fiveOn = true;
        grid = 5;

        Button gridFive = (Button) findViewById(R.id.fiveByFive);
        gridFive.setBackgroundColor(Color.RED);

        if(threeOn){
            threeOn = false;

            Button gridThree = (Button) findViewById(R.id.threeByThree);
            gridThree.setBackgroundColor(Color.GRAY);
        }
    }
    //called when start button in activity_main is clicked
     public void startGame(View view){

        if(grid != 0 && playerSymbol != 0){
            if (grid == 3){
                Intent board3X3 = new Intent(this , board.class);
                if(playerSymbol == 1)
                    board3X3.putExtra("symbol","X");
                else board3X3.putExtra("symbol","O");
                startActivity(board3X3);

            }else{
                Intent board5X5 = new Intent(this,board5.class);
                if(playerSymbol == 1)
                    board5X5.putExtra("symbol","X");
                else board5X5.putExtra("symbol","O");
                startActivity(board5X5);}

        }


    }
}

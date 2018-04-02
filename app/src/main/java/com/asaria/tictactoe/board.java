package com.asaria.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class board extends AppCompatActivity {
    Button[] buts = new Button[15];
    String symbol = "X";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);




        buts[0] = (Button) findViewById(R.id.btn1);
        buts[1] = (Button) findViewById(R.id.btn2);
        buts[2] = (Button) findViewById(R.id.btn3);
        buts[3] = (Button) findViewById(R.id.btn4);
        buts[4] = (Button) findViewById(R.id.btn5);
        buts[5] = (Button) findViewById(R.id.btn6);
        buts[6] = (Button) findViewById(R.id.btn7);
        buts[7] = (Button) findViewById(R.id.btn8);
        buts[8] = (Button) findViewById(R.id.btn9);
        buts[9] = (Button) findViewById(R.id.btn10);
        buts[10] = (Button) findViewById(R.id.btn11);
        buts[11] = (Button) findViewById(R.id.btn12);
        buts[12] = (Button) findViewById(R.id.btn13);
        buts[13] = (Button) findViewById(R.id.btn14);
        buts[14] = (Button) findViewById(R.id.btn15);




    }

    

}

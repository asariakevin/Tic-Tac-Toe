package com.asaria.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class board extends AppCompatActivity {
    Button[] buts = new Button[15];
    String symbol = "X"; //default symbol

    Integer Xwon = 0,Owon = 0; //0 for false

    Integer arrayXCounter = 0,arrayOCounter = 0; //counter of elements in the arrays
    int[] arrayX = new int[50];
    int[] arrayO = new int[5];


    //checks if the arrangement of any symbol results in a win and if so sets its flag to 1
    public  void checkWinner(int first,int second,int third,Integer whoWon){
        Log.d("checkWinner","checkWinner Executed");
        if(first == 1){


            if((second == 2 && third == 3)||(second == 3 && third == 2)){
                Xwon = 1;

            }else if((second == 4 && third == 7)||(second == 7 && third == 4)){
                Xwon = 1;
            }else if((second == 5 && third == 9)||(second == 9 && third == 5)){
                Xwon = 1;
            }
        }else if(first == 2){

            if((second == 1 && third == 3)||(second == 3 && third == 1)){
                Xwon = 1;

            }else if((second == 5 && third == 8)||(second == 8 && third == 5)){
                Xwon = 1;
            }
        }else if(first == 3){

            if((second == 1 && third == 2)||(second == 2 && third == 1)){
                Xwon = 1;

            }else if((second == 6 && third == 9)||(second == 9 && third == 6)){
                Xwon = 1;
            }else if((second == 5 && third == 7)||(second == 7 && third == 5)){
                Xwon = 1;
            }
        }else if(first == 4){

            if((second == 1 && third == 7)||(second == 7 && third == 1)){
                Xwon = 1;

            }else if((second == 5 && third == 6)||(second == 6 && third == 5)){
                Xwon = 1;
            }
        }else if(first == 5){

            if((second == 4 && third == 6)||(second == 6 && third == 4)){
                Xwon = 1;

            }else if((second == 3 && third == 7)||(second == 7 && third == 3)){
                Xwon = 1;
            }else if((second == 1 && third == 9)||(second == 9 && third == 1)){
                Xwon = 1;
            }
        }else if(first == 6){

            if((second == 9 && third == 3)||(second == 3 && third == 9)){
                Xwon = 1;

            }else if((second == 4 && third == 5)||(second == 5 && third == 4)){
                Xwon = 1;
            }
        }else if(first == 7){

            if((second == 5 && third == 3)||(second == 3 && third == 5)){
                Xwon = 1;

            }else if((second == 4 && third == 1)||(second == 1 && third == 4)){
                Xwon = 1;
            }else if((second == 8 && third == 9)||(second == 9 && third == 8)){
                Xwon = 1;
            }
        }else if(first == 8){

            if((second == 2 && third == 5)||(second == 5 && third == 2)){
                Xwon = 1;

            }else if((second == 9 && third == 7)||(second == 7 && third == 9)){
                Xwon = 1;
            }
        }else if(first == 9){

            if((second == 6 && third == 3)||(second == 3 && third == 6)){
                Xwon = 1;

            }else if((second == 8 && third == 7)||(second == 7 && third == 8)){
                Xwon = 1;
            }else if((second == 5 && third == 1)||(second == 1 && third == 5)){
                Xwon = 1;
            }
        }

    }

    //to check if the arrangements of X is a win
    public void runCheckWinnerForX(){

        Log.d("runCheckWinnerForX","runCheckWinnerForX Executed");

    /*    checkWinner(arrayX[0],arrayX[1],arrayX[2],Xwon);
        Log.d("arrayX.length","L 3");


        Log.d("arrayX.length","L 4");
        if(Xwon != 1){
            checkWinner(arrayX[0],arrayX[2],arrayX[4],Xwon);
            checkWinner(arrayX[1],arrayX[2],arrayX[3],Xwon);


        }

        checkWinner(arrayX[0],arrayX[1],arrayX[2],Xwon); //1,2,3
        checkWinner(arrayX[0],arrayX[1],arrayX[3],Xwon); //1,2,4
        checkWinner(arrayX[0],arrayX[1],arrayX[4],Xwon); //1,2,5
        checkWinner(arrayX[0],arrayX[2],arrayX[3],Xwon); //1,3,4
        checkWinner(arrayX[0],arrayX[2],arrayX[4],Xwon); //1,3,5
        checkWinner(arrayX[0],arrayX[3],arrayX[4],Xwon); //1,4,5
        checkWinner(arrayX[1],arrayX[2],arrayX[3],Xwon); //2,3,4
        checkWinner(arrayX[1],arrayX[3],arrayX[4],Xwon); //2,3,5
        checkWinner(arrayX[1],arrayX[3],arrayX[4],Xwon); //2,4,5
        checkWinner(arrayX[2],arrayX[4],arrayX[5],Xwon); //3,4,5

        Log.d("arrayX.length","L 5");*/


       if(arrayXCounter == 3){
            checkWinner(arrayX[0],arrayX[1],arrayX[2],Xwon);
            Log.d("arrayX.length","L 3");
        }else if(arrayXCounter == 4){
            checkWinner(arrayX[0],arrayX[1],arrayX[2],Xwon);
            Log.d("arrayX.length","L 4");
            if(Xwon != 1){
                checkWinner(arrayX[0],arrayX[1],arrayX[3],Xwon);
                checkWinner(arrayX[0],arrayX[2],arrayX[3],Xwon);
                checkWinner(arrayX[1],arrayX[2],arrayX[3],Xwon);


            }
        }else if(arrayXCounter == 5){
            checkWinner(arrayX[0],arrayX[1],arrayX[2],Xwon); //1,2,3
            checkWinner(arrayX[0],arrayX[1],arrayX[3],Xwon); //1,2,4
            checkWinner(arrayX[0],arrayX[1],arrayX[4],Xwon); //1,2,5
            checkWinner(arrayX[0],arrayX[2],arrayX[3],Xwon); //1,3,4
            checkWinner(arrayX[0],arrayX[2],arrayX[4],Xwon); //1,3,5
            checkWinner(arrayX[0],arrayX[3],arrayX[4],Xwon); //1,4,5
            checkWinner(arrayX[1],arrayX[2],arrayX[3],Xwon); //2,3,4
            checkWinner(arrayX[1],arrayX[3],arrayX[4],Xwon); //2,3,5
            checkWinner(arrayX[1],arrayX[3],arrayX[4],Xwon); //2,4,5
            checkWinner(arrayX[2],arrayX[4],arrayX[5],Xwon); //3,4,5

            Log.d("arrayX.length","L 5");
        }

    }


    public void runCheckWinnerForO(){
        if(arrayO.length == 3){
            checkWinner(arrayO[0],arrayO[1],arrayO[2],Owon);
        }else if(arrayO.length == 4){
            checkWinner(arrayO[0],arrayO[1],arrayO[2],Owon);

            if(Owon != 1){
                checkWinner(arrayO[0],arrayO[2],arrayO[4],Owon);
                checkWinner(arrayO[1],arrayO[2],arrayO[3],Owon);


            }
        }else if(arrayO.length == 5){
            checkWinner(arrayO[0],arrayO[1],arrayO[2],Owon); //1,2,3
            checkWinner(arrayO[0],arrayO[1],arrayO[3],Owon); //1,2,4
            checkWinner(arrayO[0],arrayO[1],arrayO[4],Owon); //1,2,5
            checkWinner(arrayO[0],arrayO[2],arrayO[3],Owon); //1,3,4
            checkWinner(arrayO[0],arrayO[2],arrayO[4],Owon); //1,3,5
            checkWinner(arrayO[0],arrayO[3],arrayO[4],Owon); //1,4,5
            checkWinner(arrayO[1],arrayO[2],arrayO[3],Owon); //2,3,4
            checkWinner(arrayO[1],arrayO[3],arrayO[4],Owon); //2,3,5
            checkWinner(arrayO[1],arrayO[3],arrayO[4],Owon); //2,4,5
            checkWinner(arrayO[2],arrayO[4],arrayO[5],Owon); //3,4,5
        }

    }
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



    public void clickedBtn2(View view){

        if(symbol.equals("X")){
            arrayX[arrayXCounter++]=2;

            if(arrayX.length >= 3){
                runCheckWinnerForX();

            }

        }else {
            arrayO[arrayOCounter++] = 2;
            if(arrayX.length >= 3){
                runCheckWinnerForX();

            }
        }

        buts[1].setText(symbol);
    }

    public void clickedBtn3(View view){

        if(symbol.equals("X")){
            arrayX[arrayXCounter++]=3;
            runCheckWinnerForX();
        }else arrayO[arrayOCounter++] = 3;

        buts[2].setText(symbol);
        Log.d("Xwon",Xwon.toString());
        Log.d("arrayXCounter",arrayXCounter.toString());
    }

    public void clickedBtn4(View view){

        if(symbol.equals("X")){
            arrayX[arrayXCounter++]=4;

        }else arrayO[arrayOCounter++] = 4;

        buts[3].setText(symbol);

        Log.d("Xwon",Xwon.toString());
        Log.d("arrayXCounter",arrayXCounter.toString());
    }

    public void clickedBtn5(View view){

        if(symbol.equals("X")){
            arrayX[arrayXCounter++]=5;

            if(arrayX.length >= 3){
                runCheckWinnerForX();

            }


        }else arrayO[arrayOCounter++] = 5;

        buts[4].setText(symbol);
    }

    public void clickedBtn6(View view){

        if(symbol.equals("X")){
            arrayX[arrayXCounter++]=6;

            if(arrayX.length >= 3){
                runCheckWinnerForX();

            }

        }else arrayO[arrayOCounter++] = 6;

        buts[5].setText(symbol);

        Log.d("Xwon",Xwon.toString());
        Log.d("arrayXCounter",arrayXCounter.toString());
    }

    public void clickedBtn7(View view){

        if(symbol.equals("X")){
            arrayX[arrayXCounter++]=7;

            if(arrayX.length >= 3){
                runCheckWinnerForX();

            }

        }else arrayO[arrayOCounter++] = 7;

        buts[6].setText(symbol);

        Log.d("Xwon",Xwon.toString());
        Log.d("arrayXCounter",arrayXCounter.toString());
    }

    public void clickedBtn8(View view){

        if(symbol.equals("X")){
            arrayX[arrayXCounter++]=8;

            if(arrayX.length >= 3){
                runCheckWinnerForX();

            }



        }else arrayO[arrayOCounter++] = 8;

        buts[7].setText(symbol);

        Log.d("Xwon",Xwon.toString());
        Log.d("arrayXCounter",arrayXCounter.toString());
    }

    public void clickedBtn9(View view){

        if(symbol.equals("X")){
            arrayX[arrayXCounter++]=9;

            if(arrayX.length >= 3){
                runCheckWinnerForX();

            }

        }else arrayO[arrayOCounter++] = 9;

        buts[8].setText(symbol);

        if(Xwon == 1){

            startActivity(new Intent(this,board5.class));
        }
        Log.d("Xwon",Xwon.toString());
        Log.d("arrayXCounter",arrayXCounter.toString());
    }

    public void clickedBtn1(View view){

        if(symbol.equals("X")){
            arrayX[arrayXCounter++]=1; //add the int 1 to arrayX

            Button bt1 = (Button) findViewById(R.id.btn1);
            bt1.setText(symbol);

            if(arrayX.length >= 3){
                runCheckWinnerForX();

            }

        }else{
            arrayO[arrayOCounter++] = 1;
            if(arrayO.length >= 3){
                runCheckWinnerForO();

            }
        }

        Log.d("Xwon",Xwon.toString());
        Log.d("arrayXCounter",arrayXCounter.toString());
    }
}

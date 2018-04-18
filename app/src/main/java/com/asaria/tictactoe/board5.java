package com.asaria.tictactoe;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



import java.util.Random;



public class board5 extends AppCompatActivity {
    Button arr[]=new Button[25];
    char[] board = new char[25];
    private char currentPlayerMark= 'x';
    char winner ;
    int winsX = 0;
    int winsO = 0;

    boolean[] butPressed = new boolean[25];
    int[] butsNotPressed = new int[25];
    int num_of_butsNotPressed = 25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board5);

        //to get the char the player has choosen
        Intent in = getIntent();
        Bundle symbol = in.getExtras();

        currentPlayerMark = symbol.getChar("symbol");



        arr [0] =  findViewById(R.id.btn1);

        arr[1] =  findViewById(R.id.btn2);

        arr[2] =  findViewById(R.id.btn3);

        arr[3] =  findViewById(R.id.btn4);

        arr[4] =  findViewById(R.id.btn5);

        arr[5] =  findViewById(R.id.btn6);

        arr[6] =  findViewById(R.id.btn7);

        arr[7] =  findViewById(R.id.btn8);

        arr[8] =  findViewById(R.id.btn9);
        arr [9] =  findViewById(R.id.btn10);

        arr[10] =  findViewById(R.id.btn11);

        arr[11] =  findViewById(R.id.btn12);

        arr[12] =  findViewById(R.id.btn13);

        arr[13] =  findViewById(R.id.btn14);

        arr[14] =  findViewById(R.id.btn15);

        arr[15] =  findViewById(R.id.btn16);

        arr[16] =  findViewById(R.id.btn17);

        arr[17] =  findViewById(R.id.btn18);
        arr [18] =  findViewById(R.id.btn19);

        arr[19] =  findViewById(R.id.btn20);

        arr[20] =  findViewById(R.id.btn21);

        arr[21] =  findViewById(R.id.btn22);

        arr[22] =  findViewById(R.id.btn23);

        arr[23] =  findViewById(R.id.btn24);

        arr[24] =  findViewById(R.id.btn25);


        //initialize the butPressed to false
        for(int i = 0;i < 25;i++){
            butPressed[i] = false;
        }

        for(int i = 0;i < 25;i++){
            butsNotPressed[i] = 24 - i;
        }
    }

    public void updateScoreLoses(){
        TextView losesTextView = (TextView) findViewById(R.id.playerX2);
        losesTextView.setText(Integer.toString(winsX));

    }
    public void updateScoreWins() {
        TextView winsTextView = (TextView) findViewById(R.id.playerO2);
        winsTextView.setText(Integer.toString(winsO));

    }

    public void changePlayer() {


        if (currentPlayerMark == 'x') {
            currentPlayerMark = 'o';
        } else {
            currentPlayerMark = 'x';
        }
    }
    public void resetBtn(View v) {
        for(int i = 0;i < 25;i++){
            arr[i].setText("");
        }

        for(int i = 0;i < 25;i++){
            board[i] = '-';

        }

        //initialize the butPressed to false
        for(int i = 0;i < 25;i++){
            butPressed[i] = false;
        }

        for(int i = 0;i < 25;i++){
            butsNotPressed[i] = 24 - i;
        }

        num_of_butsNotPressed =25;

        //to get the char the player has choosen
        Intent in = getIntent();
        Bundle symbol = in.getExtras();

        currentPlayerMark = symbol.getChar("symbol");



    }

    public void btn1(View view) {

        if(!butPressed[0]){
            butPressed[0] = true;

            arr[0].setText(Character.toString(currentPlayerMark));
            board[0] = currentPlayerMark;
            remove(0);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

            Log.d("checkRows",Boolean.toString(checkRowsForWin()));
            Log.d("checkCol",Boolean.toString(checkColsForWin()));
            Log.d("checkDiagnol",Boolean.toString(checkDiagnolsForWin()));

        }

    }

    public void btn2(View view) {

        if(!butPressed[1]){
            butPressed[1] = true;

            arr[1].setText(Character.toString(currentPlayerMark));
            board[1] = currentPlayerMark;
            remove(1);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }

    }

    public void btn3(View view) {
        if(!butPressed[2]){
            butPressed[2] = true;

            arr[2].setText(Character.toString(currentPlayerMark));
            board[2] = currentPlayerMark;

            remove(2);
            changePlayer();
            playerMarkO();
            checkForWinner();
        }}

    public void btn4(View view) {
        if(!butPressed[3]){
            butPressed[3] = true;

            arr[3].setText(Character.toString(currentPlayerMark));
            board[3] = currentPlayerMark;

            remove(3);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }}

    public void btn5(View view) {
        if(!butPressed[4]){
            butPressed[4] = true;

            arr[4].setText(Character.toString(currentPlayerMark));
            board[4] = currentPlayerMark;

            remove(4);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }}

    public void btn6(View view) {
        if(!butPressed[5]){
            butPressed[5] = true;

            arr[5].setText(Character.toString(currentPlayerMark));
            board[5] = currentPlayerMark;

            remove(5);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();


        }}

    public void btn7(View view) {
        if(!butPressed[6]){
            butPressed[6] = true;

            arr[6].setText(Character.toString(currentPlayerMark));
            board[6] = currentPlayerMark;
            remove(6);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }}

    public void btn8(View view) {
        if(!butPressed[7]){
            butPressed[7] = true;

            arr[7].setText(Character.toString(currentPlayerMark));
            board[7] = currentPlayerMark;

            remove(7);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }}

    public void btn9(View view) {
        if(!butPressed[8]){
            butPressed[8] = true;

            arr[8].setText(Character.toString(currentPlayerMark));
            board[8] = currentPlayerMark;

            remove(8);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }}
    public void btn10(View view) {
        if(!butPressed[9]){
            butPressed[9] = true;

            arr[9].setText(Character.toString(currentPlayerMark));
            board[9] = currentPlayerMark;

            remove(9);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();


            Log.d("checkRows",Boolean.toString(checkRowsForWin()));
            Log.d("checkCol",Boolean.toString(checkColsForWin()));
            Log.d("checkDiagnol",Boolean.toString(checkDiagnolsForWin()));
        }}

    public void btn11(View view) {
        if(!butPressed[10]){
            butPressed[10] = true;

            arr[10].setText(Character.toString(currentPlayerMark));
            board[10] = currentPlayerMark;
            remove(10);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }}

    public void btn12(View view) {
        if(!butPressed[11]){
            butPressed[11] = true;

            arr[11].setText(Character.toString(currentPlayerMark));
            board[11] = currentPlayerMark;
            remove(11);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }}

    public void btn13(View view) {
        if(!butPressed[12]){
            butPressed[12] = true;

            arr[12].setText(Character.toString(currentPlayerMark));
            board[12] = currentPlayerMark;
            remove(12);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }}

    public void btn14(View view) {
        if(!butPressed[13]){
            butPressed[13] = true;

            arr[13].setText(Character.toString(currentPlayerMark));
            board[13] = currentPlayerMark;

            remove(13);
            changePlayer();

            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }}

    public void btn15(View view) {
        if(!butPressed[14]){
            butPressed[14] = true;

            arr[14].setText(Character.toString(currentPlayerMark));
            board[14] = currentPlayerMark;

            remove(14);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();


        }}

    public void btn16(View view) {
        if(!butPressed[15]){
            butPressed[15] = true;

            arr[15].setText(Character.toString(currentPlayerMark));
            board[15] = currentPlayerMark;

            remove(15);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }}

    public void btn17(View view) {

        if(!butPressed[16]){
            butPressed[16] = true;
            arr[16].setText(Character.toString(currentPlayerMark));
            board[16] = currentPlayerMark;

            remove(16);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }}

    public void btn18(View view) {
        if(!butPressed[17]){
            butPressed[17] = true;

            arr[17].setText(Character.toString(currentPlayerMark));
            board[17] = currentPlayerMark;

            remove(17);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }}
    public void btn19(View view) {
        if(!butPressed[18]){
            butPressed[18] = true;

            arr[18].setText(Character.toString(currentPlayerMark));
            board[0] = currentPlayerMark;

            remove(18);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();


            Log.d("checkRows",Boolean.toString(checkRowsForWin()));
            Log.d("checkCol",Boolean.toString(checkColsForWin()));
            Log.d("checkDiagnol",Boolean.toString(checkDiagnolsForWin()));
        }}

    public void btn20(View view) {
        if(!butPressed[19]){
            butPressed[19] = true;

            arr[19].setText(Character.toString(currentPlayerMark));
            board[19] = currentPlayerMark;

            remove(19);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }}

    public void btn21(View view) {
        if(!butPressed[20]){
            butPressed[20] = true;

            arr[20].setText(Character.toString(currentPlayerMark));
            board[20] = currentPlayerMark;

            remove(20);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }}

    public void btn22(View view) {
        if(!butPressed[21]){
            butPressed[21] = true;

            arr[21].setText(Character.toString(currentPlayerMark));
            board[21] = currentPlayerMark;

            remove(21);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }}

    public void btn23(View view) {
        if(!butPressed[22]){
            butPressed[22] = true;

            arr[22].setText(Character.toString(currentPlayerMark));
            board[22] = currentPlayerMark;

            remove(22);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }}

    public void btn24(View view) {
        if(!butPressed[23]){
            butPressed[23] = true;

            arr[23].setText(Character.toString(currentPlayerMark));
            board[23] = currentPlayerMark;

            remove(23);
            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();


        }}

    public void btn25(View view) {
        if(!butPressed[24]){
            butPressed[24] = true;

            arr[24].setText(Character.toString(currentPlayerMark));
            board[24] = currentPlayerMark;

            remove(24);

            changePlayer();
            playerMarkO();
            checkForWinner();

            updateScoreLoses();
            updateScoreWins();

        }}



    public void playerMarkO() {
        if(num_of_butsNotPressed > 0){


                Random r = new Random();
                int random = r.nextInt(num_of_butsNotPressed);
                Log.d("random index",Integer.toString(random));

                int index = butsNotPressed[random];
                Log.d("value of randomIndex",Integer.toString(index));
                arr[index].setText(Character.toString(currentPlayerMark));
                board[index] = currentPlayerMark;
                for(int i = 0;i< 25;i++){
                    if(index == i)
                        butPressed[i]= true;
                }

                remove(index);


                changePlayer();


        }

    }

    private boolean checkText(char c1, char c2, char c3,char c4, char c5) {
        if((c1 == 'x') && (c1 == c2) && (c2 == c3)&& (c3 == c4) && (c4 == c5)){
            ++winsX;
            winner = 'x';
            return  true;
        }else if((c1 == 'o') && (c1 == c2) && (c2 == c3)&& (c3 == c4) && (c4 == c5)){

            ++winsO;
            winner = 'o';
            return true;
        }else return false;
    }

    private boolean checkRowsForWin() {
        if (checkText(board[0], board[1], board[2], board[3], board[4]))
            return true;
        else if (checkText(board[5], board[6], board[7], board[8], board[9]))
            return true;
        else if (checkText(board[10], board[11], board[12], board[13], board[14]))
            return true;
        else if (checkText(board[15], board[16], board[17], board[18], board[19]))
            return true;
        else if (checkText(board[20], board[21], board[22], board[23], board[24]))
            return true;
        else return false;
    }


    private boolean checkColsForWin() {

        if (checkText(board[0], board[5], board[10], board[15], board[20]))
            return true;
        else if (checkText(board[1], board[6], board[11], board[16], board[21]))
            return true;
        else if (checkText(board[2], board[7], board[12], board[17], board[22]))
            return true;
        else if (checkText(board[3], board[8], board[13], board[18], board[23]))
            return true;
        else if (checkText(board[4], board[9], board[14], board[19], board[24]))
            return true;
        else return false;
    }


    private boolean checkDiagnolsForWin(){
        if (checkText(board[0], board[6], board[12], board[18], board[24]))
            return true;
        else if (checkText(board[4], board[8], board[12], board[16], board[20]))
            return true;
        else return false;
    }

    private boolean checkForWinner(){
        return(checkColsForWin()||checkRowsForWin()||checkDiagnolsForWin());

    }

    //to search for the index of a number in buttonsNotPressed
    public int search(int numberToBeSearched){
        int position  = 10; //default position

        for(int i = 0;i < num_of_butsNotPressed;i++){

            if(butsNotPressed[i] == numberToBeSearched){
                position = i;
                break;
            }
        }

        return position;

    }

    //to remove a button that has been pressed from buttonsNotPressed array
    public void remove(int button){
        int index = search(button);

        if( index != num_of_butsNotPressed - 1) {


            //minus one note
            for (int i = index; i < num_of_butsNotPressed - 1; i++) {
                butsNotPressed[i] = butsNotPressed[i + 1];
            }
        }else{

            Log.d("remove","last index detected");
        }
        num_of_butsNotPressed--;

        for(int i = 0;i < num_of_butsNotPressed;i++){
            Log.d("buttonsPressed"+Integer.toString(i),Integer.toString(butsNotPressed[i]));
        }

    }

}



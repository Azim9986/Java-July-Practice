package Assignments.GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private final int computerNumber;
    private int userinput;
    private int no_of_guesses;

    public Game() {
        Random random  = new Random();
//        this.computerNumber = Math.random();
        computerNumber =random.nextInt(100);
        no_of_guesses = 0;
    }
    public int getComputerNumber(){
        return computerNumber;
    }

    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        this.userinput = sc.nextInt();
        no_of_guesses ++;
    }
    public boolean isCorrectNumber(){

        return computerNumber == this.userinput;
    }

    public int getNo_of_guesses() {
        return no_of_guesses;
    }

    public void setNo_of_guesses(int no_of_guesses) {
        this.no_of_guesses = no_of_guesses;
    }
}

package com.comapany;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

   public Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }
    public void level(){
        if (noOfGuesses<5){
            System.out.println("You are Pro");
        }
        else {
            System.out.println("You are Noob");
        }
    }

}
public class Guess_The_Number2{
    public static void main(String[] args) {
        Game g = new Game();
        boolean b= false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
        System.out.println("");
        System.out.println("The No. of Guesses");
        g.getNoOfGuesses();
        System.out.println("Your Level is :");
        g.level();
    }
}
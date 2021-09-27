package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    Random rn = new Random();
    int guessNumber = rn.nextInt(100)+1;
    int tries = 0;
    boolean end = false;
    do {
        System.out.println("Guess a number between 1 and 100:");
        int userInput = input.nextInt();
        if (userInput < guessNumber){
            System.out.println("too low");
        }
        else if (userInput > guessNumber){
            System.out.println("too high");
        }
        else{
            System.out.println("correct!");
            end = true;
        }
        tries++;
    } while (!end);
        System.out.println("You took "+tries+" go(s) to get the answer");
    }
}

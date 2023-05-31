//Task 2: Number Guessing Game 
import java.util.Scanner;
import java.lang.Math;

public class Task_2 {
  public static void main(String[] args) {

    int answer = (int)(Math.random() * 100) + 1;
    int i = 5;
    
    try (Scanner input = new Scanner(System.in)) {
        boolean correct = false;
        System.out.println("Welcome to Number Guessing Game !!! \nTo win the game, you must correctly guess a number between 1 and 100. \nYou are allowed a maximum of 5 attempts.");
   
        while (i > 0) {
          System.out.println("Enter your guess: ");
          int guess = input.nextInt();
          
          if (guess == answer) {
            System.out.println("You guessed the number correct!\nYou win!");
            break;
          }
          
          else if (guess > answer) {
            System.out.println("Your guess is too high.\nYou have " + (i - 1) + " attempts left.");
            i--;
          }
          else {
            System.out.println("Your guess is too low.\nYou have " + (i - 1) + " attempts left.");
          }
          i--;
        }

        if (correct == false) {
          System.out.println("You ran out of attempts.\nYou lose this game!");
        }
    }
  }
}

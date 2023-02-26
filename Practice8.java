

import java.util.Random;
import java.util.Scanner;

class Game {
    int num, choice, chance;
    int count = 1;
    String name;

    Game() {
        Random rnd = new Random();
        num = rnd.nextInt(0, 100);
    }

    void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in range 0 - 100");
        choice = sc.nextInt();
    }

    void suggetion(){
        if (choice<num) {
            System.out.println("Try with bigger number");
        }
        else if (choice>num) {
            System.out.println("Try with smaller number");
        }
        else{
            System.out.println("You guessed the number");
        }
    }

    int isCorrect() {
        if (choice == num) {
            return 1;
        } else {
            return 0;
        }
    }

    void numOfGuess() {
        chance = 5 - count;
        System.out.println("Remaining guess:" + chance);
        count++;
    }

    void greetUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Welcome " + name + "!");
        System.out.println("You have only 5 chance to guess the number");
    }
}

public class Practice8 {
    public static void main(String[] args) {
        int count = 1;
        Game user = new Game();
        user.greetUser();
        int returnvalue = user.isCorrect();
        returnvalue = 0;
        while (count <= 5) {

            if(returnvalue == 1){
                System.out.println("Congrats! You win");
                break;
            }
            else{
                user.takeUserInput();
                user.suggetion();
                returnvalue = user.isCorrect();
                user.numOfGuess();
            }
            count++;
        }
        if (returnvalue == 0) {
            System.out.println("Better luck next time");
        }
        System.out.println("Correct number is:"+user.num);
    }
}
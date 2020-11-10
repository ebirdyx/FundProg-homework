package GuessGame.views;

import GuessGame.controllers.GameController;
import GuessGame.models.Answer;

import java.util.Scanner;

public class Console {
    private GameController gameController;   // created a variable type 'GameController' that is an attribute to the console class

    public Console(GameController gameController) {
        this.gameController = gameController;
    }

    public boolean processAnswer(Answer answer) {
        switch (answer) {
            case CORRECT:
                System.out.println("Congrats!");
                return true;
            case TOO_LOW:
                System.out.println("Too low, Try again!!");
                break;
            case TOO_HIGH:
                System.out.println("Too high, Try again!!");
                break;
            case OUTSIDE_RANGE:
                System.out.println("Not in range, Try again!!");
                break;
        }
        return false;
    }

    public void run() {
        System.out.println("WELCOME (~˘▾˘)~ Guess the number");
        this.gameController.regenerateNumber();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number.");
            String userInput = scanner.nextLine();

            Answer answer = this.gameController.guess(userInput);
            boolean correct = processAnswer(answer);

            if (correct) {
                System.out.print("Do you want to play again? (yes/no) ");
                userInput = scanner.nextLine();
                switch (userInput) {
                    case "yes":
                        run();
                    case "no":
                        break;
                }
                break;
            }
        }
    }
}

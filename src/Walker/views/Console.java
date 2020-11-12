package Walker.views;

import Walker.controllers.RandomWalkerController;

import java.util.Scanner;


public class Console {
    private RandomWalkerController randomWalkerController;

    public Console(RandomWalkerController walkerController) {
        this.randomWalkerController = walkerController;
    }

    public void run() {
        System.out.println("WELCOME (~˘▾˘)~ Random Walking");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number of steps.");
        String userInput = scanner.nextLine();

        int steps;
        try {
            steps = Integer.parseInt(userInput);
        } catch (NumberFormatException exception) {
            steps = 0;
        }


        for (int i = 0; i < steps; i++) {
            this.randomWalkerController.walk();
            System.out.println("Random walker position is: " + this.randomWalkerController.getPosition().toString());

        }
    }
}

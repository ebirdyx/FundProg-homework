package RandomWalkers.views;

import RandomWalkers.controllers.RandomWalkersController;

import java.util.Scanner;

public class Console {

    private RandomWalkersController walkersController;

    public Console(RandomWalkersController walkersController) {
        this.walkersController = walkersController;

    }

    public void run() {
        System.out.println("WELCOME (~˘▾˘)~ Walkers");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number.");
        String userInput = scanner.nextLine();
        int steps = this.walkersController.simulate(userInput);

        System.out.println("It took " + steps + " number of steps.");
    }
}

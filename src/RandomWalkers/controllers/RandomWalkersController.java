package RandomWalkers.controllers;


import RandomWalkers.models.RandomWalkers;

public class RandomWalkersController {

    private RandomWalkers walkers;

    public RandomWalkersController(RandomWalkers walkers) {
        this.walkers = walkers;
    }
    public int simulate(String userInput){
        int number;
        try {
            number = Integer.parseInt(userInput);
        } catch (NumberFormatException exception) {
            number = 0;
        }

        return this.walkers.simulate(number);
    }
}

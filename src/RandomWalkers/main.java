package RandomWalkers;

import RandomWalkers.controllers.RandomWalkersController;
import RandomWalkers.models.RandomWalkers;
import RandomWalkers.views.Console;

public class main {
    public static void main(String[] args) {
        RandomWalkers randomWalkers = new RandomWalkers();
        RandomWalkersController controller = new RandomWalkersController(randomWalkers);
        Console view = new Console(controller);
        view.run();
    }
}

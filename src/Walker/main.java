package Walker;

import Walker.controllers.RandomWalkerController;
import Walker.models.RandomWalker;
import Walker.views.Console;

public class main {

    public static void main(String[] args) {

        RandomWalker randomWalker = new RandomWalker();
        RandomWalkerController walkerController = new RandomWalkerController(randomWalker);
        Console view = new Console(walkerController);
        view.run();
    }
}
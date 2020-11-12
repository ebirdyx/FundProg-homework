package Walker.controllers;

import Walker.models.Position;
import Walker.models.RandomWalker;

public class RandomWalkerController {
    private RandomWalker randomWalker;

    public RandomWalkerController(RandomWalker randomWalker) {
        this.randomWalker = randomWalker;
    }

    public void walk() {
        this.randomWalker.walk();
    }

    public Position getPosition() {
        return this.randomWalker.getPosition();
    }

    public double getDistanceFromOrigin() {
        return this.randomWalker.getDistanceFromOrigin();
    }
}

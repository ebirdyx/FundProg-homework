

package Walker.models;

import java.util.Random;

public class RandomWalker {

    private Position randomWalkerPosition;

    public RandomWalker() {
        this.randomWalkerPosition = new Position();
    }

    private Direction getRandomDirection() {
        Random random = new Random();
        return Direction.values()[random.nextInt(Direction.values().length)];
    }

    public void walk() {
        Direction direction = getRandomDirection();
        switch (direction) {
            case UP:
                this.randomWalkerPosition.setY(this.randomWalkerPosition.getY() + 1);
                break;
            case DOWN:
                this.randomWalkerPosition.setY(this.randomWalkerPosition.getY() - 1);
                break;
            case LEFT:
                this.randomWalkerPosition.setX(this.randomWalkerPosition.getX() - 1);
                break;
            case RIGHT:
                this.randomWalkerPosition.setX(this.randomWalkerPosition.getX() + 1);
                break;
        }
    }

    public Position getPosition() {
        return this.randomWalkerPosition;
    }

    public double getDistanceFromOrigin() {
        Position originPosition = new Position();

        return Math.sqrt(Math.pow(this.randomWalkerPosition.getX() - originPosition.getX(), 2)
                + Math.pow(this.randomWalkerPosition.getY() - originPosition.getY(), 2));
    }
}

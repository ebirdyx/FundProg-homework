package RandomWalkers.models;

import java.util.Random;

public class RandomWalker {

    private int boundary;

    private Position randomWalkerPosition;

    public RandomWalker(int boundary) {
        this.randomWalkerPosition = new Position();

        this.boundary = boundary;
    }

    private Direction getRandomDirection() {
        Random random = new Random();
        return Direction.values()[random.nextInt(Direction.values().length)];
    }

    private boolean tryWalk(Direction direction) {
        switch (direction) {
            case RIGHT:
                if (this.randomWalkerPosition.getX() + 1 < this.boundary) {
                    this.randomWalkerPosition.setX(this.randomWalkerPosition.getX() + 1);
                    return true;
                }
                break;
            case LEFT:
                if (this.randomWalkerPosition.getX() - 1 >= 0) {
                    this.randomWalkerPosition.setX(this.randomWalkerPosition.getX() - 1);
                    return true;
                }
                break;
            case DOWN:
                if (this.randomWalkerPosition.getY() - 1 >= 0) {
                    this.randomWalkerPosition.setY(this.randomWalkerPosition.getY() - 1);
                    return true;
                }
                break;
            case UP:
                if (this.randomWalkerPosition.getY() + 1 < this.boundary) {
                    this.randomWalkerPosition.setY(this.randomWalkerPosition.getY() + 1);
                    return true;
                }
                break;
        }
        return false;
    }

    /**
     * we loop forever until we find a direction we can move to.
     * testing every step if movable.One correct step to break;
     */
    public void walk() {

        while (true) {
            Direction direction = getRandomDirection();
            boolean success = tryWalk(direction);
            if (success) break;
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

package Walker.models;

public class Position {

    private int x;
    private int y;

    /**
     * This is a constructor with purpose of initializing values
     */
    public Position() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString(){
        return "(x: " + this.x + ",y: " + this.y + ")";
    }
}

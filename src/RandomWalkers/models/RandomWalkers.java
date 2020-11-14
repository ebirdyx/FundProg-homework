package RandomWalkers.models;

public class RandomWalkers {

    private RandomWalker[] walkers;
    private Grid grid;

    /**
     * Initialize list of walkers and grid.
     * @param n
     */
    private void init(int n) {
        this.walkers = new RandomWalker[n];
        for (int i = 0; i < n; i++) {
            this.walkers[i] = new RandomWalker(n);
        }
        this.grid = new Grid();
        this.grid.clear(n);
    }

    /**
     * Method simulate we initialize the grid and walkers,
     * we walk all the walkers until all the grid is visited.
     *
     * @param n
     * @return
     */
    public int simulate(int n) {
        init(n);
        int steps = 0;

        while (true) {

            for (int i = 0; i < n; i++) {
                this.walkers[i].walk();
                Position position = this.walkers[i].getPosition();
                this.grid.makeCellVisited(position);
            }
            steps++;

            if (this.grid.isAllGridVisited()) {
                break;
            }
        }
        return steps;
    }
}

package RandomWalkers.models;


public class Grid {

    final int NOT_VISITED = 0;
    final int VISITED = 1;

    // attributes

    private int[][] cells;  // cells - name of variable

    private int n;

    /**
     * Initialize new grid and clears the cells.
     * @param n is the grid side.
     */
    public void clear(int n) {
        this.n = n; // this is how u add n to the method from private int n
        this.cells = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                this.cells[i][j] = NOT_VISITED;
            }
        }

    }

    /**
     * Making a cell visited.
     *
     * @param cell Position of the cell to visit.
     */
    public void makeCellVisited(Position cell) {
        this.cells[cell.getX()][cell.getY()] = VISITED;
    }

    /**
     * looping over all the cells so if all aren't visited return false.
     *
     * @return true if all are visited.
     */
    public boolean isAllGridVisited() {

        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
                if (this.cells[i][j] == NOT_VISITED) {
                    return false;
                }
            }
        }

        return true;
    }
}

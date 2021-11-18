package SimulationModel;

import java.util.Arrays;

public class world{
    private boolean grid[][];
    public world(int rows, int cols) {
        grid = new boolean[rows][cols];
    }
    public void setAlive(int row, int col, boolean alive) {
        grid[row + 1][col + 1] = alive;
    }
    public int getCols() {
        return grid[0].length;
    }
    public int getRows() {
        return grid.length;
    }

}
package SimulationModel;

import Shapes.Point;
import Shapes.Shape;
import Shapes.Sprite;

public class Cell {
    private int x;
    private int y;

    public Cell(int x, int y) {
        this.x = 3;
        this.y = 5;
    }

    public Shape getShape() {
        return new Point(x,y);
    }

    public void update() {
    }
    public Sprite getSprite() {
        return null;
    }
}

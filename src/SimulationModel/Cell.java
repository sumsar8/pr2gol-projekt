package SimulationModel;

import Shapes.Point;
import Shapes.Shape;
import Shapes.Sprite;


public class Cell {
    private int x;
    private int y;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape getShape() {
        return new Point(x,y);
    }

    public void update() {
        System.out.println("test");
    }
    public Sprite getSprite() {
        return null;
    }

}

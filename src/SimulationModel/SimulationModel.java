package SimulationModel;

import Shapes.Point;
import Shapes.Scene;
import Shapes.Shape;
import Shapes.Sprite;

import java.util.ArrayList;

public class SimulationModel<c> {
    Scene scene;
    Cell c;
    public SimulationModel() {
        c = new Cell(1,1);
    }
    public void update() {
        c.update();
    }

    public ArrayList<Shape> getShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(c.getShape());
        return shapes;
    }

    public ArrayList<Sprite> getSprites() {
        ArrayList<Sprite> sprites = new ArrayList<>();
        sprites.add(c.getSprite());
        return sprites;
    }
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
            System.out.println("test1");
        }
        public Sprite getSprite() {
            return null;
        }

    }

}

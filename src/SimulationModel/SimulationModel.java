package SimulationModel;

import Shapes.Scene;
import Shapes.Shape;
import Shapes.Sprite;

import java.util.ArrayList;

public class SimulationModel<c> {
    Scene scene;
    Cell c;
    public SimulationModel() {
        c = new Cell(2,2);
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
}

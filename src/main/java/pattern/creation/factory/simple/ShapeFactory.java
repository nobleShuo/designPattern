package pattern.creation.factory.simple;


import pattern.creation.factory.simple.impl.CircleShapeImpl;
import pattern.creation.factory.simple.impl.RectangleShapeImpl;
import pattern.creation.factory.simple.impl.SquareShapeImpl;

/**
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 11:16 AM
 */
public class ShapeFactory {
    /**
     * @param shapeType
     * @return
     */
    public static IShape getShape(String shapeType) {
        switch (shapeType) {
            case "CIRCLE":
                return new CircleShapeImpl();
            case "RECTANGLE":
                return new RectangleShapeImpl();
            case "SQUARE":
                return new SquareShapeImpl();
            default:
                return null;
        }
    }
}

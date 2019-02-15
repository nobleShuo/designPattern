package pattern.creation.factory.abstracts.impl.factory;

import pattern.creation.factory.abstracts.IAbstractFactory;
import pattern.creation.factory.abstracts.IShape;
import pattern.creation.factory.abstracts.impl.CircleShapeImpl;
import pattern.creation.factory.abstracts.impl.RectangleShapeImpl;
import pattern.creation.factory.abstracts.impl.SquareShapeImpl;

/**
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 1:36 PM
 */
public class ShapeFactoryImpl implements IAbstractFactory {

    @Override
    public IShape getShape(String shapeType) {
        switch (shapeType) {
            case "circle":
                return new CircleShapeImpl();
            case "rectangle":
                return new RectangleShapeImpl();
            case "square":
                return new SquareShapeImpl();
            default:
                return null;
        }
    }
}

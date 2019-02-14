package pattern.factory.abstracts.impl.factory;

import pattern.factory.abstracts.IAbstractFactory;
import pattern.factory.abstracts.IShape;
import pattern.factory.abstracts.impl.CircleShapeImpl;
import pattern.factory.abstracts.impl.RectangleShapeImpl;
import pattern.factory.abstracts.impl.SquareShapeImpl;

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

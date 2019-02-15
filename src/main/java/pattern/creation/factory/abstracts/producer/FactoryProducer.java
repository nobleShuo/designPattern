package pattern.creation.factory.abstracts.producer;

import pattern.creation.factory.abstracts.IAbstractFactory;
import pattern.creation.factory.abstracts.impl.factory.ColorFactoryImpl;
import pattern.creation.factory.abstracts.impl.factory.ShapeFactoryImpl;

/**
 * 工厂制造者
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 2:02 PM
 */
public class FactoryProducer {
    public static IAbstractFactory getFactory(String choice) {
        switch (choice) {
            case "SHAPE":
                return new ShapeFactoryImpl();
            case "COLOR":
                return new ColorFactoryImpl();
            default:
                return null;
        }
    }
}

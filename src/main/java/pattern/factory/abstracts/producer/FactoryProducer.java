package pattern.factory.abstracts.producer;

import pattern.factory.abstracts.IAbstractFactory;
import pattern.factory.abstracts.impl.factory.ColorFactoryImpl;
import pattern.factory.abstracts.impl.factory.ShapeFactoryImpl;

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

package pattern.factory.abstracts;

import pattern.factory.abstracts.impl.DefaultColorImpl;
import pattern.factory.abstracts.impl.DefaultShapeImpl;

/**
 * 抽象工厂
 *
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 1:32 PM
 */
public interface IAbstractFactory {

    default IColor getColor(String colorType) {
        return new DefaultColorImpl();
    }

    default IShape getShape(String shapeType) {
        return new DefaultShapeImpl();
    }
}

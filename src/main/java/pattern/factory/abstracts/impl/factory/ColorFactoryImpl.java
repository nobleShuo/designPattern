package pattern.factory.abstracts.impl.factory;

import pattern.factory.abstracts.IAbstractFactory;
import pattern.factory.abstracts.IColor;
import pattern.factory.abstracts.IShape;
import pattern.factory.abstracts.impl.BlueColorImpl;
import pattern.factory.abstracts.impl.GreenColorImpl;
import pattern.factory.abstracts.impl.RedColorImpl;

/**
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 1:40 PM
 */
public class ColorFactoryImpl implements IAbstractFactory {
    @Override
    public IColor getColor(String colorType) {
        switch (colorType) {
            case "RED":
                return new RedColorImpl();
            case "GREEN":
                return new GreenColorImpl();
            case "BLUE":
                return new BlueColorImpl();
            default:
                return null;
        }
    }
}

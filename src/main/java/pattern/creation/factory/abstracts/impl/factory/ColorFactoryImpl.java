package pattern.creation.factory.abstracts.impl.factory;

import pattern.creation.factory.abstracts.IAbstractFactory;
import pattern.creation.factory.abstracts.IColor;
import pattern.creation.factory.abstracts.impl.BlueColorImpl;
import pattern.creation.factory.abstracts.impl.GreenColorImpl;
import pattern.creation.factory.abstracts.impl.RedColorImpl;

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

package pattern.factory.method.impl.factory;

import pattern.factory.method.IColor;
import pattern.factory.method.IFactory;
import pattern.factory.method.impl.BlueColorImpl;

/**
 * 蓝色的具体工厂的实现
 *
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 3:28 PM
 */
public class BlueColorFactoryIml implements IFactory {
    @Override
    public IColor getColor() {
        return new BlueColorImpl();
    }
}

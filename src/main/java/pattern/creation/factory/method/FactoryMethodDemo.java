package pattern.creation.factory.method;

import pattern.creation.factory.method.impl.factory.BlueColorFactoryIml;
import pattern.creation.factory.method.impl.factory.GreenColorFactoryIml;
import pattern.creation.factory.method.impl.factory.RedColorFactoryIml;

/**
 * 工厂模式的例子
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 3:34 PM
 */
public class FactoryMethodDemo {
    public static void main(String[] args) {
        new RedColorFactoryIml().getColor().fill();
        new GreenColorFactoryIml().getColor().fill();
        new BlueColorFactoryIml().getColor().fill();
    }
}

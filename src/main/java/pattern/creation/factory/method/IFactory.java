package pattern.creation.factory.method;

import pattern.creation.factory.method.impl.DefaultColorImpl;

/**
 * 工厂的接口
 *
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 3:19 PM
 */
public interface IFactory {
    default IColor getColor() {
        return new DefaultColorImpl();
    }
}

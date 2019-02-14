package pattern.factory.simple;

import java.util.Objects;

/**
 * 简单工厂模式例子
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 11:28 AM
 */
public class SimpleFactoryDemo {
    public static void main(String[] args) {
        Objects.requireNonNull(ShapeFactory.getShape("CIRCLE")).draw();
        Objects.requireNonNull(ShapeFactory.getShape("RECTANGLE")).draw();
        Objects.requireNonNull(ShapeFactory.getShape("SQUARE")).draw();
    }
}

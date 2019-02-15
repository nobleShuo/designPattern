package pattern.creation.factory.abstracts;

import pattern.creation.factory.abstracts.producer.FactoryProducer;

import java.util.Objects;

/**
 * 抽象工厂模式演示
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 2:05 PM
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //得到形状的工厂
        IAbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Objects.requireNonNull(shapeFactory).getShape("circle").draw();
        //得到颜色工厂
        IAbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Objects.requireNonNull(colorFactory).getColor("RED").fill();
    }
}

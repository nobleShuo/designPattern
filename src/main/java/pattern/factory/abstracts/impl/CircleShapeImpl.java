package pattern.factory.abstracts.impl;


import pattern.factory.abstracts.IShape;

/**
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 11:15 AM
 */
public class CircleShapeImpl implements IShape {
    @Override
    public void draw() {
        System.out.println("我在圆形的方法中");
    }
}

package pattern.factory.simple.impl;

import pattern.factory.simple.IShape;

/**
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 11:12 AM
 */
public class RectangleShapeImpl implements IShape {
    @Override
    public void draw() {
        System.out.println("我在矩形的方法中");
    }
}

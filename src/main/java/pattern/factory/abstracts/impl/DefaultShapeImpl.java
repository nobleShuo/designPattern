package pattern.factory.abstracts.impl;


import pattern.factory.abstracts.IShape;

/**
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 1:59 PM
 */
public class DefaultShapeImpl implements IShape {

    @Override
    public void draw() {
        System.out.println("默认形状");
    }
}

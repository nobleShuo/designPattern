package pattern.factory.method.impl;

import pattern.factory.method.IColor;
/**
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 1:58 PM
 */
public class DefaultColorImpl implements IColor {
    @Override
    public void fill() {
        System.out.println("默认颜色");
    }
}

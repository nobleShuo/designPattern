package pattern.factory.method.impl;

import pattern.factory.method.IColor;
/**
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 11:44 AM
 */
public class RedColorImpl implements IColor {
    @Override
    public void fill() {
        System.out.println("这是红色的方法");
    }
}

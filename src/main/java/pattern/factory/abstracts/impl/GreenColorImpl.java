package pattern.factory.abstracts.impl;

import pattern.factory.abstracts.IColor;

/**
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 11:44 AM
 */
public class GreenColorImpl implements IColor {

    @Override
    public void fill() {
        System.out.println("这是绿色的方法");
    }
}

package pattern.singleton;

/**
 * 嵌套类实现单例,最经典
 *
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 5:03 PM
 */
public class StaticClassSingleton {
    private StaticClassSingleton() {
    }

    /**
     * 主要是使用了 嵌套类可以访问外部类的静态属性和静态方法 的特性
     */
    private static class Holder {
        private static StaticClassSingleton instance = new StaticClassSingleton();
    }

    public static StaticClassSingleton getInstance() {
        return Holder.instance;
    }
}

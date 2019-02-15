package pattern.creation.singleton;

/**
 * 懒汉模式
 * 加上synchronized线程安全,延迟加载,使用时候才会加载
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 4:56 PM
 */
public class LazySingleton {
    private LazySingleton() {
    }

    /**
     * 和饿汉模式相比，这边不需要先实例化出来，注意这里的 volatile，它是必须的
     */
    private static volatile LazySingleton instance = null;

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

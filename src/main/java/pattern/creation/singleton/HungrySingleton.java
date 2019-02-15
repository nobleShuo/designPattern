package pattern.creation.singleton;

import java.util.Date;

/**
 *
 * 饿汉单例模式,
 * 虚拟机启动时候就会加载,有可能你没有使用这个实例,但是这个实例已经被加载了
 * 饿汉式是线程安全的,在类创建的同时就已经创建好一个静态的对象供系统使用,以后不在改变
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/14 4:48 PM
 */
public class HungrySingleton {

    private HungrySingleton() {
    }

    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }



    /**
     *  瞎写一个静态方法。这里想说的是，如果我们只是要调用 Singleton.getDate(...)，本来是不想要生成 Singleton 实例的，不过没办法，已经生成了
     * @param mode
     * @return
     */
    public static Date getDate(String mode) {
        return new Date();
    }

}

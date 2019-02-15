package pattern.creation.prototype;

/**
 * 原子模式例子
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/15 11:09 AM
 */
public class PrototypePatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User("qi_s", "qi_s", "略略略", 10);
        System.out.println(user);
        System.out.println(user.hashCode());
        System.out.println(user.clone());
        System.out.println(user.clone().hashCode());

    }
}

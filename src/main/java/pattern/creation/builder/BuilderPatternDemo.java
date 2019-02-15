package pattern.creation.builder;

/**
 * 建造者模式例子
 *
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/15 10:49 AM
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        User user = User.builder().userName("qi_s").password("qi_s").age(10).nickName("略略略").build();
        System.out.println(user);
    }
}

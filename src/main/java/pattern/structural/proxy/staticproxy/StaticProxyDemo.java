package pattern.structural.proxy.staticproxy;

/**
 * 静态代理演示
 *
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/21 10:43 AM
 */
public class StaticProxyDemo {
    public static void main(String[] args) {
        IUserService userService = new UserProxyImpl(new UserServiceImpl());
        userService.getName();
        userService.getSex();
    }
}

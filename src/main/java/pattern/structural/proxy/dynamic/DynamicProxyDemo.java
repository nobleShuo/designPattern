package pattern.structural.proxy.dynamic;

/**
 * 动态代理的测试
 *
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/21 11:41 AM
 */
public class DynamicProxyDemo {
    public static void main(String[] args) {
        IUserService userService = new UserServiceImpl();
        //输出目标的对象信息
        System.out.println(userService.getClass());
        IUserService proxyUser = (IUserService) new ProxyFactory(userService).getProxyInstance();
        //输出代理类的对象信息
        System.out.println(proxyUser.getClass());
        System.out.println("返回值:" + proxyUser.save("小明"));
    }
}

package pattern.structural.proxy.cglib;

/**
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/21 2:19 PM
 */
public class CglibProxyDemo {
    public static void main(String[] args) {
        //需要代理的实例
        UserServiceImpl userService = new UserServiceImpl();
        System.out.println(userService.getClass());
        //代理对象实例
        UserServiceImpl proxyInstance = (UserServiceImpl)new ProxyFactory(userService).getProxyInstance();
        System.out.println(proxyInstance.getClass());
        proxyInstance.save("小名");
    }
}

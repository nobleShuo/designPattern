package pattern.structural.proxy.staticproxy;

/**
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/21 10:52 AM
 */
public class UserProxyImpl implements IUserService {

    private IUserService userService;

    public UserProxyImpl(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public String getName() {
        System.out.println("静态代理开始,获取名字");
        String name = userService.getName();
        System.out.println(name);
        System.out.println("静态代理结束了");
        return name;
    }

    @Override
    public String getSex() {
        System.out.println("静态代理开始,获取性别");
        String sex = userService.getSex();
        System.out.println(sex);
        System.out.println("静态代理结束了");
        return sex;
    }
}

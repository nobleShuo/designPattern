package pattern.structural.proxy.dynamic;

/**
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/21 11:01 AM
 */
public class UserServiceImpl implements IUserService {
    @Override
    public String save(String name) {
        System.out.println(name);
        return name;
    }
}

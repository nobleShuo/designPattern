package pattern.structural.proxy.staticproxy;

/**
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/21 10:51 AM
 */
public class UserServiceImpl implements IUserService {
    @Override
    public String getName() {
        return "小明";
    }

    @Override
    public String getSex() {
        return "男";
    }
}

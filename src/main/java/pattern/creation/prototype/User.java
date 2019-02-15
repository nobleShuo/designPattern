package pattern.creation.prototype;


/**
 * 原子模式,实现Cloneable接口,继承clone方法
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/15 11:07 AM
 */

public class User implements Cloneable{
    private String userName;
    private String password;
    private String nickName;
    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String userName, String password, String nickName, int age) {
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
        this.age = age;
    }
    public User() {
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                '}';
    }
}

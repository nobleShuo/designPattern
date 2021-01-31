package pattern.creation.builder;

import lombok.Data;

/**
 * 建造者模式链式调用
 *
 * @author QiShuo
 * @version 1.0
 * @create 2019/2/15 10:37 AM
 */
@Data
public class User {
    private String userName;
    private String password;
    private String nickName;
    private int age;

    private User(String userName, String password, String nickName, int age) {
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
        this.age = age;
    }

    public User() {
    }

    public static UserBuilder builder() {
        return new UserBuilder();
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

    public static class UserBuilder {
        private final User user = new User();

        public UserBuilder userName(String userName) {
            user.setUserName(userName);
            return this;
        }

        public UserBuilder password(String password) {
            user.setPassword(password);
            return this;
        }

        public UserBuilder nickName(String nickName) {
            user.setNickName(nickName);
            return this;
        }

        public UserBuilder age(int age) {
            user.setAge(age);
            return this;
        }

        public User build() {
            return user;
        }
    }

}

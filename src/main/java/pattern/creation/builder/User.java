package pattern.creation.builder;

import lombok.Data;

/**
 * 建造者模式链式调用
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
        private String userName;
        private String password;
        private String nickName;
        private int age;

        private UserBuilder() {
        }

        public UserBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder nickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            if (this.userName == null || this.password == null) {
                throw new RuntimeException("用户名或密码必填");
            }
            if (this.age <= 0 || this.age >= 150) {
                throw new RuntimeException("年龄不合法");
            }
            // 还可以做赋予”默认值“的功能
            if (this.nickName == null) {
                this.nickName = this.userName;
            }
            return new User(userName, password, nickName, age);
        }
    }
}

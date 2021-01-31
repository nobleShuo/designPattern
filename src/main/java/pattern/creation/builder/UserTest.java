package pattern.creation.builder;

/**
 * @author qishuo
 * @date 2021/1/31 4:47 下午
 */
public class UserTest {
    public static void main(String[] args) {
        User build = User.builder()
                .age(1)
                .userName("qis")
                .nickName("qis")
                .password("123")
                .build();
        System.out.println(build);
    }
}

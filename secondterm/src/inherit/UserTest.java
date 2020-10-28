package inherit;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("小林", "1234567");
        System.out.println(user1.toString());
        User user2 = new User("小林", "1234567");
        System.out.println(user2.toString());
        if (user1.equals(user2)) {
            System.out.println("经过后台检测，这是同一用户");
        } else {
            System.out.println("经过后台检测，这不是同一用户");
        }

    }

}

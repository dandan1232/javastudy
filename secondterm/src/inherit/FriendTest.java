package inherit;

public class FriendTest {
    public static void main(String[] args) {
        Friend china=new chinaFriend("中国","阿伟");
        Friend foreign=new foreigneFriend("美国","Shelly");
        Host host=new Host("小林");
        host.Serving(china);
        host.Serving(foreign);
    }

}

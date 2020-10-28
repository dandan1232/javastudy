package inherit;

public class chinaFriend extends Friend {

    public chinaFriend(String nationality, String name) {
        super(nationality, name);
    }

    public chinaFriend() {
    }

    @Override
    public void sayHello() {
        System.out.println("主人回复:你好呀我的朋友"+"/"+this.getName());
    }
    public void shadowboxing(){
        System.out.println("练太极拳！");
    }
}

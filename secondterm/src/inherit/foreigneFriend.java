package inherit;

public class foreigneFriend extends Friend {

    public foreigneFriend(String nationality, String name) {
        super(nationality, name);
    }

    public foreigneFriend() {
    }

    @Override
    public void sayHello() {
        System.out.println("主人回复:Hello my friend"+"/"+this.getName());
    }
    public void hitFootball(){
        System.out.println("踢足球！");
    }
}

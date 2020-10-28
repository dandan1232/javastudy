package inherit;

public class Host {//主人类
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Host(String name) {
        this.name = name;
    }

    public Host() {

    }

    public void Serving(Friend fri) {
        System.out.println(this.getName()+"陪"+fri.getName()+":");
        fri.sayHello();
        if (fri instanceof chinaFriend) {
            chinaFriend china = (chinaFriend) fri;
           china.eat("四川菜");
         china.shadowboxing();
        } else if (fri instanceof foreigneFriend) {
            foreigneFriend forgien = (foreigneFriend) fri;
          forgien.eat("披萨");
          forgien.hitFootball();
        }
    }

}

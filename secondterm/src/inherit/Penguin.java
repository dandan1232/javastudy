package inherit;

public class Penguin extends Pet {

    private String sex;

    public String getsex() {
        return sex;
    }

    public void setsex(String sex) {
        this.sex = sex;
    }

    public Penguin() {

    }

    public Penguin(String name, int health, int love, String sex) {

        super(name, health, love);
        this.sex = sex;
    }

    @Override
    public void eat() {
    }

    public void Swim() {
        if (this.getHealth() > 10) {
            System.out.println(this.getName() + "和主人高兴的玩着游泳游戏");
            this.setHealth(this.getHealth() - 10);
            this.setLove(this.getLove() + 5);
        } else {
            System.out.println("不想玩了，想吃");
        }
    }
}

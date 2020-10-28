package inherit;

public class Cat extends Pet {
    private String strain;

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public Cat(String name, int health, String strain, int love) {
        super(name, health, love);
        this.strain = strain;
        System.out.println("小猫的品种为：" + this.strain);
    }

    public Cat() {
    }


    @Override
    public void eat() {
        if (getHealth() >= 100) {
            System.out.println(this.getName() + "吃饱了，不需要喂食了！");
        } else {
            this.setHealth(this.getHealth() + 4);
            System.out.println(this.getName() + "吃饱啦！健康值增加4。");
        }
        System.out.println("现在" + this.getName() + "健康值为：" + this.getHealth());
    }

    public void playWithStick() {
        if (this.getHealth() > 60) {
            System.out.println(this.getName() + "和主人高兴的玩着逗猫棒");
            this.setHealth(this.getHealth() - 3);
            this.setLove(this.getLove() + 2);
        } else {
            System.out.println(this.getName() + "在懒洋洋的睡觉");
        }
    }


}

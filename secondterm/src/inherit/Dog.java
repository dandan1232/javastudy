package inherit;

public class Dog extends Pet{
    private String strain;

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public Dog(){


    }

    @Override
    public void eat() {

    }

    public Dog(String name,int health,int love, String strain){

        super(name,health,love);
        this.strain=strain;
    }
    public void catchingFlyDisc() {
        if(this.getHealth()>10) {
            System.out.println(this.getName()+"和主人高兴的玩着飞盘游戏");
            this.setHealth(this.getHealth()-10);
            this.setLove(this.getLove()+5);
        }else{
            System.out.println("不想玩了，想吃骨头");
        }

    }
}

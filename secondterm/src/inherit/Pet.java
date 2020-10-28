package inherit;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class Pet {
    private String name;
    private int health;
    private int love;

    public Pet(String name, int health, int love) {
        this.name=name;
        this.health=health;
        this.love=love;
        System.out.println("小猫的姓名为："+this.name);
        System.out.println("小猫原有健康值为："+this.health);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }



    public  Pet(){
    }

    public abstract void eat();

}

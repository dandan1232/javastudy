package inherit;

public class Master {
    private String name;

    public void getPet(String typeld) {
        if ("狗".equals(typeld)) {
            System.out.println("领养狗");
        }else if("猫".equals(typeld)){
            System.out.println("领养猫");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master(String name) {
        this.name = name;
        System.out.println("主人姓名为：" + this.name);
    }

    public Master() {

    }

    public static void feed(Pet pet) {
        pet.eat();
    }

    public void playWith(Pet pet) {
            Cat cat=(Cat) pet;
            cat.playWithStick();
        }
    }

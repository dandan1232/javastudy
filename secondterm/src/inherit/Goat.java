package inherit;

public class Goat extends Animal{

    public Goat() {
    }

    public Goat(String name) {
        super(name);
    }

    @Override
    public void Run() {
        System.out.println(super.getName()+"在草原上跑。");
    }

    @Override
    public void Eat() {
        System.out.println(this.getName()+"在草原上吃草。");
    }
}

package inherit;

public class Wolf extends Animal{

    public Wolf(String name) {
        super(name);
    }

    public Wolf() {
    }

    @Override
    public void Run() {
        System.out.println(this.getName()+"在草原上跑。");
    }

    @Override
    public void Eat() {
        System.out.println(this.getName()+"在草原上捕猎。");
    }


}

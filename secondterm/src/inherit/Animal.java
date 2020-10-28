package inherit;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(){

    }

    public Animal(String name) {
        this.name = name;
    }


    public void Animal(){
        System.out.println("-------------------------");
        System.out.println("动物名称："+this.name);
    }
    public abstract void Run();
    public abstract void Eat();
}

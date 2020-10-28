package inherit;

public abstract class Friend {
    private String nationality;
    private String name;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Friend(String nationality, String name) {
        this.nationality = nationality;
        this.name = name;
    }
    public Friend(){

    }
    public abstract void sayHello();

    public void eat(String food){
        System.out.println("吃"+food+"。");
    }
}

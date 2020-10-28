package generice;

class IdCard {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public IdCard(String name) {
        Name = name;
    }

    public IdCard() {

    }

    @Override
    public String toString() {
        return this.Name;
    }
}

class StudentCard {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public StudentCard(String name) {
        Name = name;
    }

    public StudentCard() {

    }

    @Override
    public String toString() {
        return this.Name;
    }
}

class RiceCard {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public RiceCard(String name) {
        Name = name;
    }

    public RiceCard() {

    }

    @Override
    public String toString() {
        return this.Name;
    }
}


public class Student<I, M> {
    private I id;
    private M munber;

    public I getId() {
        return id;
    }

    public void setId(I id) {
        this.id = id;
    }

    public M getMunber() {
        return munber;
    }

    public void setMunber(M munber) {
        this.munber = munber;
    }

    public Student(I id, M munber) {
        this.id = id;
        this.munber = munber;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "该用户拥有" + this.id + "，卡号为：" + this.munber;
    }
}

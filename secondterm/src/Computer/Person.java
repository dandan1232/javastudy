package Computer;

public class Person {
    private String name;
    private  char sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(){

    }
    public Person(String s){

    }

    @Override
    public String toString() {
        return "姓名"+this.getName()+"\t性别"+this.getSex()+"\t年龄"+this.getAge();
    }
}

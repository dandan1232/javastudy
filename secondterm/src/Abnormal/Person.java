package Abnormal;
public class Person {
    private int age;

    public Person() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)  throws AgelnputException{
            if (age < 1 || age > 100) {
                throw new AgelnputException();
            } else {
                this.age = age;
                System.out.println("年龄：" + this.age + "岁。");
            }
        }

    public Person(int age) {
        this.age = age;
    }
    public Person(String s){

    }
}




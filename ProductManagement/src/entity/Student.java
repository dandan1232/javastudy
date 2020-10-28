package entity;

public class Student {
    private int id;
    private String grade;
    private String  name;
    private int number;
    private int age;

    public Student(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "该学生序号："+this.id+",姓名："+this.name+",班级:"+
                this.grade+",学号："+this.number+",年龄："+this.age;
    }
}

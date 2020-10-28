package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentHashcode {
    private String bj;
    private String num;
    private String name;
    private String age;

    public String getBj() {
        return bj;
    }

    public void setBj(String bj) {
        this.bj = bj;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public StudentHashcode() {
    }
    public StudentHashcode(String name, String bj,String num,String age) {
        this.name = name;
        this.bj=bj;
        this.num=num;
        this.age=age;
    }

    @Override
    public String toString() {
        return "学生姓名：" + this.getName() + "\t班级：" + this.getBj()+"\t学号："+this.getNum()+"\t年龄"+this.getAge();
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 17;
        result = result * prime + (this.name!= null ? this.name.hashCode() : 0);
        result = result * prime + (this.bj!=null?this.bj.hashCode():0);
        result = result * prime + (this.num!=null?this.num.hashCode():0);
        result = result * prime + (this.age!=null?this.age.hashCode():0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StudentHashcode) {
            StudentHashcode stghc = (StudentHashcode) obj;
            if (this.name.equals(stghc.getName()) && this.bj.equals(stghc.getBj())
                    &&this.num.equals(stghc.getNum())&&this.age.equals(stghc.getAge())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Set<StudentHashcode> set = new HashSet<StudentHashcode>();
        StudentHashcode stghc = new StudentHashcode("wang", "软件1921","1","12");
        set.add(stghc);
        set.add(new StudentHashcode("旺旺", "软件1913","2","13"));
        set.add(new StudentHashcode("春花", "软件1923","3","12"));
        set.add(new StudentHashcode("我", "软件1923","4","14"));
        Iterator<StudentHashcode> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


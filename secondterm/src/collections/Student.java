package collections;
/*      定义一个学生类Student，封装id和name属性，提供一个全参构造器，并覆写toSting方法。
        定义Map<String，List<Student>>类型，创建两个Map的对象，用来存放学校中两种不同类型的班级“普通班”和“强化班”的学生信息。
        自定义一组学生信息，将其放入不同班级，并对两种不同类型的班级学生信息遍历输出。*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Student {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "[学生id：" + id + "\t学生姓名：" + name+"]";
    }

    public static void main(String[] args) {
        Map<String, List<Student>> map = new HashMap<String, List<Student>>();
        List<Student> commonClass = new ArrayList<Student>();
        List<Student> strengthenClass = new ArrayList<Student>();
        map.put("普通班", commonClass);
        map.put("强化班", strengthenClass);

        commonClass.add(new Student("1", "张三"));
        commonClass.add(new Student("2", "李四"));
        commonClass.add(new Student("3", "王五"));

        strengthenClass.add(new Student("1", "蛋宝"));
        strengthenClass.add(new Student("2", "绅狗"));
        strengthenClass.add(new Student("3", "阿伟"));

        Set<Map.Entry<String, List<Student>>> entries = map.entrySet();
        Iterator<Map.Entry<String, List<Student>>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<Student>> entry = iterator.next();
            System.out.println("key班级名称：" + entry.getKey() + "\nvalue学生信息:" + entry.getValue());
            System.out.println();
        }

    }
}
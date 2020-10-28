package collections;
/*      1. 使用HashMap存储学号-学生的映射信息；
        2. 根据学号查找对应学生：如果找到，显示学生相关信息(map.get)；否则给出错误提示 ；
        3. 使用HashMap存储多个学号-学生信息（映射），然后使用Iterator（比如Iterator<Map.Entry<K,V>>）将存储的信息遍历打印出来。*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapStudent {

    private String name;
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public MapStudent(String number, String name) {
        this.name = name;
        this.number = number;
    }

    public MapStudent() {

    }

    @Override
    public String toString() {
        return "学生姓名：" + name + "\t学生学号：" + number;
    }

    public static void main(String[] args) {
        Map<String, MapStudent> map = new HashMap<>();
        map.put("1", new MapStudent("190102", "蛋宝"));
        map.put("2", new MapStudent("190304", "绅狗"));
        map.put("3", new MapStudent("190205", "翠花"));
        map.put("4", new MapStudent("190603", "阿伟"));
        System.out.println("现已经添加" + map.size() + "个学生");

        MapStudent t1 = map.get("1");
        if (t1 == null) {
            System.out.println("无该学生信息");
        } else {
            System.out.println(map.get("1"));
        }

        MapStudent t2 = map.get("5");
        if (t2 == null) {
            System.out.println("无该学生信息");
        } else {
            System.out.println(map.get("5"));
        }

        Set<Map.Entry<String, MapStudent>> entries = map.entrySet();
        Iterator<Map.Entry<String, MapStudent>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, MapStudent> entry = iterator.next();
            System.out.println("[key:" + entry.getKey() + "],value=[" + entry.getValue() + "]");
        }
    }
}

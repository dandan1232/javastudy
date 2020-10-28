package collections;

import java.util.HashMap;
import java.util.Map;

public class MapHashMapSimpleDemo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>(); //key不能重复，value可以  map.put("key","value");
        map.put("CN","中华人民共和国");
        map.put("US","美利坚合众国");
        map.put("UK","大不列颠及北爱尔兰联合王国");
        map.put("FR","法兰西共和国");
        System.out.println(map.size());//返回元素个数

        System.out.println(map.get("UK"));//获取指定元素，若不存在指定的键，返回null

        map.remove("FR");
        System.out.println("FR还存在吗？"+map.containsKey("FR"));

        System.out.println(map.keySet());//返回键的集合
        System.out.println(map.values());//返回值的集合
        System.out.println(map);
    }
}

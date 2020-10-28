package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapHashMapDemo {
    public static void main(String[] args) {
        Map<Dog, String> map = new HashMap<Dog, String>();
        map.put(new Dog("zhangsan", 4, "金毛"), "zhangahuang");
        map.put(new Dog("lisi", 4, "拉布拉多"), "liabu");
        map.put(new Dog("wanger", 4, "京巴"), "wangjinba");
/*        System.out.println(map);

        System.out.println(map.size());*/
        //hashmap的key对象相等的原则同hashset一样
        map.put(new Dog("wanger", 5, "土狗"), "wangtugou");
/*        System.out.println(map.size());
        System.out.println(map);*/

        /*
        第一种遍历，使用entry条目set来遍历，同时使用iterator
         */
        System.out.println("------------第一种遍历方法----------------------------------");
        Set<Map.Entry<Dog, String>> entries = map.entrySet();
        Iterator<Map.Entry<Dog, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Dog, String> entry = iterator.next();
            System.out.println("[key:" + entry.getKey() + "],value=[" + entry.getValue() + "]");
        }

        /*
        第二种遍历方法
         */
        System.out.println("------------第二种遍历方法，是第一种的延伸-----------------------");
        for (Map.Entry<Dog, String> entry : entries) {
            System.out.println("[key:" + entry.getKey() + "],value=[" + entry.getValue() + "]");
        }


         /*
        第三种遍历方法
         */
        System.out.println("--------------第三种遍历方法,使用增强for循环，遍历keySet读取key，然后联合Map读取value-----------");
        Set<Dog> dogset = map.keySet();
        for (Dog dog : dogset) {
            System.out.println("[key:" + dog + "],value=[" + map.get(dog) + "]");
        }

         /*
        第四种遍历方法
         */
        System.out.println("------------第四种遍历方法,使用iterator遍历keySet读取key，然后联合Map读取value----------------");
        Iterator<Dog> iterator2 = dogset.iterator();
        while (iterator2.hasNext()) {
            Dog dog2 = iterator2.next();
            System.out.println("[key:" + dog2 + "],value=[" + map.get(dog2) + "]");
        }
    }

}

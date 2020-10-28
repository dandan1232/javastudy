package collections;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class SetTreesetNaturalSeqDemo { //自然排序
    public static void main(String[] args) {
        Set<Dog> set = new TreeSet<Dog>();
        set.add(new Dog("麻六", 4, "金毛"));
        Dog dog = new Dog("张三", 5, "金毛");
        set.add(dog);
        //因为Dog中的compareable实现是仅根据年龄是否一样来判断是否是同一对象
        //所以下面出现了另一个age为5的对象，咱不能加到treeset中;
        set.add(new Dog("李四", 4, "金毛"));
        set.add(new Dog("张三", 8, "金毛"));
        //set.add(dog);
        Iterator<Dog> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}


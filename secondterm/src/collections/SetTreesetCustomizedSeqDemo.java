package collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTreesetCustomizedSeqDemo { //自定义排序
    public static void main(String[] args) {
/*        Comparator<Dog> comparator=new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Set<Dog> set1= new TreeSet<Dog>(comparator);*/
        Set<Dog> set= new TreeSet<Dog>(new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        set.add(new Dog("zhaoliu", 4, "金毛"));
        Dog dog = new Dog("zhangsan", 5, "金毛");
        set.add(dog);
        //因为Dog中的compareable实现是仅根据年龄是否一样来判断是否是同一对象
        //所以下面出现了另一个age为5的对象，咱不能加到treeset中;
        set.add(new Dog("lisi", 4, "金毛"));
        set.add(new Dog("wanger", 8, "金毛"));
        //set.add(dog);
        Iterator<Dog> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}


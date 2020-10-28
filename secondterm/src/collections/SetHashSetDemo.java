package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetHashSetDemo {
    public static void main(String[] args) {
        Set<Dog> set=new HashSet<Dog>();
        Dog dog=new Dog("张三",5,"金毛");
        set.add(dog);
        set.add(new Dog("李四",4,"金毛"));
        set.add(new Dog("张三",8,"金毛"));
        //set.add(dog);
        Iterator<Dog>  iterator=set.iterator();
        while( iterator.hasNext()){
            System.out.println( iterator.next());
        }

    }
}

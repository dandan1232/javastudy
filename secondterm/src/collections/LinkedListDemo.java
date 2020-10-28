package collections;


import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Dog> doglist = new LinkedList<>();
        Dog dog1 = new Dog("ww", 5, "京巴");
        Dog dog2 = new Dog("ah", 7, "金毛");
        Dog dogfeifei = new Dog("feifei", 2, "拉布拉多");

        doglist.add(dog1);
        doglist.add(dog2);
        doglist.add(dogfeifei);

        for (int i = 0; i < doglist.size(); i++) {
            System.out.println(doglist.get(i));
        }

        if (doglist.contains(dogfeifei)) {
            doglist.remove(dogfeifei);
            System.out.println("feifei狗已经在list中了，我已经将其删掉");
        } else {
            System.out.println("feifei狗已经不在list中了");
        }
        LinkedList<Dog> lindoglist = (LinkedList<Dog>) doglist; //强制类型转换
        //lindoglist.removeFirst();
        //lindoglist.removeLast();
        System.out.println(doglist.size());
        for (int i = 0; i < doglist.size(); i++) {
            System.out.println(doglist.get(i));
        }

        System.out.println(lindoglist.getLast());
    }
}

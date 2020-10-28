package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listlterator {
    public static void main(String[] args) {

        List <Dog> dogList = new ArrayList<>();
        Dog dog1=new Dog("ww",5,"京巴");
        Dog dog2=new Dog("ah",7,"金毛");
        Dog dogfeifei=new Dog("feifei",2,"拉布拉多");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dogfeifei);
        dogList.add(new Dog("石二狗",5,"柯基"));
        //遍历的第二种方式,推荐，适用于所有collection的实现集合类
        System.out.println("-----Iterator遍历collection---------");
        Iterator <Dog> iterator=dogList.iterator();
        while(iterator.hasNext()){//移动游标
            Dog dogtemp=iterator.next();
            System.out.println(dogtemp);
        }

        //遍历的第三种方式
        System.out.println("--------增强for循环遍历list-----------");
        for(Dog dog:dogList){
            System.out.println(dog);
        }
    }
}

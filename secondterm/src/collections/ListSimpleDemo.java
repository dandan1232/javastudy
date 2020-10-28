package collections;

import java.util.ArrayList;
import java.util.List;

public class ListSimpleDemo {
    public static void main(String[] args) {
/*        List<String> strlist=new ArrayList<String>();

        String abc=new String("abc");
        strlist.add(abc);
        strlist.add("def");
        strlist.add(1,"uvw"); //2为在第三个位置
        strlist.add("xyz");

        for(int i=0;i<strlist.size();i++){
            System.out.println(strlist.get(i));
        }

      //  strlist.remove(1);
        strlist.remove(abc); //清除abc
        // strlist.clear();//全部清除
        System.out.println("---------------------------");
        for(int i=0;i<strlist.size();i++){
            System.out.println(strlist.get(i));
        }*/

        List<Dog> dogList = new ArrayList<>();
        Dog dog1=new Dog("ww",5,"京巴");
        Dog dog2=new Dog("ah",7,"金毛");
        Dog dogfeifei=new Dog("feifei",2,"拉布拉多");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dogfeifei);
        dogList.add(dog1);
        for(int i=0;i<dogList.size();i++){
            System.out.println(dogList.get(i));
        }

        if (dogList.contains(dogfeifei)){
            dogList.remove(dogfeifei);
            System.out.println("feifei狗狗已经在list中了，我已经将它删掉。");
        }else{
            System.out.println("feifei狗不在list中，你傻逼。");

        }

        dogList.remove(0); //删除第一个或者指定的狗狗
        System.out.println(dogList.size()); //返回此列表中的元素数
        for (int i=0;i<dogList.size();i++){
            System.out.println(dogList.get(i));
        }


    }
}
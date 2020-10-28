package collections;

import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> list = new LinkedList<T>();

    public void In(T t) {
        this.list.addLast(t);
    }

    public T Out() {
        return this.list.removeFirst();
    }

    public boolean isEmpty() {
        if (list.size() == 0) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        String str="";
        System.out.println("当前队列为：");
        for(T t:list){
            str+="名字："+t.toString()+"\n"; //t是list里的一个元素
        }
        return str;
    }

    public static void main(String[] args) {
        Queue<Dog> dogque = new Queue<>();
        dogque.In(new Dog("阿绅", 2, "京巴"));
        dogque.In(new Dog("阿珍", 1, "金毛"));

        System.out.println(dogque);
        System.out.println("队首为："+dogque.Out()+"\n已被服务完，从队列中删除了。");
        System.out.println("-----------------Out一个后-------------------------");
        System.out.println(dogque);

        dogque.In(new Dog("阿强", 3, "柯基"));
        System.out.println("-----------------In一个以后-------------------------");
        System.out.println(dogque);


    }
}

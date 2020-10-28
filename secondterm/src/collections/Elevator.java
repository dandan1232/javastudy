package collections;

import java.util.LinkedList;

public class Elevator<T> {
   private LinkedList<T> list=new LinkedList<T>();

   public void In(T t){
       this.list.addLast(t);
   }
   public T Out(){
       return this.list.removeLast();
   }

   public boolean isEmpty(){
       if(list.size()!=0){
           return true;
       }else {
           return false;
       }
   }

    @Override
    public String toString() {
       String str="";
        System.out.println("当前电梯中从后到前的排队次序为：");
        for(T t:list){
            str+="名字："+t.toString()+"\n";
        }
        return str;
    }

    public static void main(String[] args) {
       Elevator<Person> perele=new Elevator<>();
       perele.In(new Person("阿珍"));
        perele.In(new Person("阿强"));
        perele.In(new Person("花花"));
        System.out.println(perele);


        perele.In(new Person("蛋宝"));
        System.out.println("电梯上行，在8层停下，有人进来了");
        System.out.println(perele);


        System.out.println("电梯上行，已到达23层，"+perele.Out()+"已经到站，已走出电梯。");
        System.out.println(perele);



    }
}

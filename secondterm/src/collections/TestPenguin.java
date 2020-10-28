package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestPenguin {
    public TestPenguin() {
    }

    public static void main(String[] args) {
        List<Penguin> penguinList=new ArrayList<>();
        Penguin penguin=new Penguin("欣欣",3,"Q仔");
        Penguin penguin1=new Penguin("丫丫",2,"Q妹");
        Penguin penguin2=new Penguin("菲菲",4,"Q妹");
        Penguin penguin3=new Penguin("美美",1,"Q妹");

        penguinList.add(penguin);
        penguinList.add(penguin1);
        penguinList.add(penguin2);
        penguinList.add(penguin3);

        System.out.println("共计有"+penguinList.size()+"只企鹅。\n分别是:");
        Iterator<Penguin> iterator=penguinList.iterator();
        while(iterator.hasNext())
        {
            Penguin pentemp=iterator.next();
            System.out.println(pentemp);
        }

        System.out.println();
        System.out.println("—————养不起了，现在进行删除处理—————");
        penguinList.remove(penguin2);
        penguinList.remove(penguin3);
        System.out.println("删除后还剩"+penguinList.size()+"只企鹅。\n分别是：");
        for (int i=0;i<penguinList.size();i++){
            System.out.println(penguinList.get(i));
        }

        if (penguinList.contains(penguin3)){
           penguinList.remove(penguin3);
            System.out.println("美美在list中了，我已经将它删掉。");
        }else{
            System.out.println();
            System.out.println("集合中不包含美美的信息。");

        }
    }
}

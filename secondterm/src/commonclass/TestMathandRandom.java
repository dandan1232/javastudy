package commonclass;

import java.util.Random;

public class TestMathandRandom {
    public static void main(String[] args) {
        System.out.println(Math.ceil(20.56));//往上取
        System.out.println(Math.floor(20.56));//向下取

        System.out.println(Math.sqrt(4));//开根
        System.out.println(Math.pow(2,12)); //2的12次方

        Random random=new Random(100);//种子,随机生成100个
        for(int i=0;i<10;i++){
          //  System.out.println(random.nextInt(1000));
            System.out.println(50*random.nextDouble());
        }
    }
}


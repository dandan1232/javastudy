package commonclass;

import java.util.Random;

public class TestEnumGendor {
    public static void main(String[] args) {
        Random rand=new Random();
        Gendor gd=null;
        for(int i=0;i<100;i++){
            int temp=rand.nextInt(100);
            if (temp%2==0){
                gd=Gendor.WOMEN;
            }else{
                gd=Gendor.MEN;
            }
            switch(gd){
                case WOMEN:
                    System.out.println("女士");
                case MEN:
                    System.out.println("先生");
            }
        }
    }
}

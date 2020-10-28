package generice;

import java.util.Date;

public class GenericsMethodClass {

    public  <E> E getExactOne(E[] arr, int index){//普通类里的泛型方法，//静态static可加可不加
return arr[index];
    }

    public static void main(String[] args) {
        Date[] datearr=new Date[5];
        datearr[0]=new Date(97,7,7);
        datearr[1]=new Date(32,6,27);
        datearr[2]=new java.util.Date();
        datearr[3]=new Date(99,3,23);
        datearr[4]=new Date(110,2,5);

        GenericsMethodClass gmc=new GenericsMethodClass();

        Date datetemp=gmc.getExactOne(datearr,2);
        System.out.println(datetemp);


        Integer[] intarr=new Integer[]{1,2,3,4,5};
        int inttemp=gmc.getExactOne(intarr,2);
        System.out.println(inttemp);

        Double[] douarr=new Double[]{1.23,2.34,3.56,10000.07};
        Double doutemp=gmc.getExactOne(douarr,2);
        System.out.println(doutemp);
    }
}

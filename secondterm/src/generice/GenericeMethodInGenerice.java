package generice;

import java.util.Date;
//泛型类里的泛型方法

public class GenericeMethodInGenerice <T>{
    public <E> E getExactOne(E[] arr, int index, T temp){
        System.out.println(temp);
        return arr[index];
    }

    public static void main(String[] args) {
        Date[] datearr=new Date[5];
        datearr[0]=new Date(97,7,7);
        datearr[1]=new Date(32,6,27);
        datearr[2]=new java.util.Date();
        datearr[3]=new Date(99,3,23);
        datearr[4]=new Date(110,2,5);

        GenericeMethodInGenerice<String> gmc=new GenericeMethodInGenerice<String>();

        Date datetemp=gmc.getExactOne(datearr,3,"泛型类的指定泛型，String");
        System.out.println(datetemp);


        Integer[] intarr=new Integer[]{1,2,3,4,5};
        int inttemp=gmc.getExactOne(intarr,2,"第二次数字调用，仍然只能是String");
        System.out.println(inttemp);

        Double[] douarr=new Double[]{1.23,2.34,3.56,10000.07};
        Double doutemp=gmc.getExactOne(douarr,2,"第三次浮点型调用，仍然只能是String");
        System.out.println(doutemp);
    }
}

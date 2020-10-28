package generice;

import java.util.Date;

public class RestrictedGenerics<T extends Number> {
    private T price;

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }

    public RestrictedGenerics(T price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.price.toString();
    }

    public void function1(GenericeMethodInGenerice<?> temp) { // ?为实参，通配

    }


    public static void main(String[] args) {
        RestrictedGenerics<Integer> rg = new RestrictedGenerics<Integer>(12);
        System.out.println(rg);

        RestrictedGenerics<Double> rg2 = new RestrictedGenerics<Double>(12.56);
        System.out.println(rg2);

       /* RestrictedGenerics<Date> rg3=new RestrictedGenerics<Date>(new Date());
        System.out.println(rg2);*/

        RestrictedGenerics<Number> rg4 = new RestrictedGenerics<Number>(12);

        //泛型的通配引用可以指向任意的泛型类型
        RestrictedGenerics<?> rg8 = null; //RestrictedGenerics<? extends Number> rg8 = null;
        rg8 = rg;
        rg8 = rg2;
        rg8 = rg4;
        //父类作为泛型参数生成的泛型类应用，不能指向子类作为泛型参数生成的泛型类实例，他们之间没有父子关系
        // RestrictedGenerics<Number> rg5=new RestrictedGenerics<Integer>(12);

        rg4.function1(new GenericeMethodInGenerice<String>());
        rg4.function1(new GenericeMethodInGenerice<Date>());

/*        public void function1(GenericeMethodInGenerice<? extends Number>temp){ //有限制的通配符，只能执行下两个
        }*/
        rg4.function1(new GenericeMethodInGenerice<Integer>());
        rg4.function1(new GenericeMethodInGenerice<Byte>());


    }
}

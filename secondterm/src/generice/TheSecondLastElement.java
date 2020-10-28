package generice;

/*	 编写一个普通类（非泛型类），该类中有一个泛型方法getTheSecondLastElement，
     该方法的入参就是泛型类对应的数组对象，
     功能是获取数组的倒数第二个元素作为返回值返回。请在测试类中实现调用该方法。*/
public class TheSecondLastElement {
    public <E> E getTheSecondLastElement(E[] arr) {
        return arr[arr.length - 2];
    }

    public static void main(String[] args) {
        TheSecondLastElement tsl = new TheSecondLastElement();
        Integer[] intarr = new Integer[]{1, 2, 3, 4, 5};
        int inttemp = tsl.getTheSecondLastElement(intarr);
        System.out.println(inttemp);

    }
}

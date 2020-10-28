package InternalClass;

public class TestInternalClass {
    public static void main(String[] args) {
   //成员内部测试
        External.Internal interna2=new External().new Internal();
        //External.Internal internal=exter.new Internal();
       // internal.print();
        interna2.print();

        //局部内部类测试
        External exter=new External();
        exter.show();

        //静态内部类测试
        External.StaticInternalClass sic=new External.StaticInternalClass();
        sic.print();
    }
}

package InternalClass;

public class External {
    private String name;

    //成员内部类定义示例
    public  class Internal{
        public void print(){
            System.out.println("来自External内部定义的成员内部类的打印" );
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public External(String name) {
        this.name = name;
    }
    public  External(){

    }
    public void show(){
        //局部内部类定义示例
        class LocalInternalClass{
            public void localprint(){
                System.out.println("来自方法内部的局部内部类的打印");
            }
        }
        LocalInternalClass lic=new LocalInternalClass();
        lic.localprint();
    }
    public void method2(){
        //LocalInternalClassd的定义只在show里面有效，外面看不到，和方法中的局部变量的作用域是一样的
 /*       LocalInternalClass lic=new LocalInternalClass();
        lic.localprint();*/
    }
    public static class StaticInternalClass{
        public void print(){
            System.out.println("来自External的内部定义的静态内部类的打印");
        }
    }
}

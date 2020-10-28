package Abnormal;
public class test5 {
    public void run(){
        System.out.println("this is DemoThread's run()");
    }
    public static void main(String args[]) {
        Thread t=new Thread((Runnable) new test5());
        t.start();
    }
}



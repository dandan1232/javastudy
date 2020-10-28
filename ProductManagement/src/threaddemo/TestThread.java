package threaddemo;

class ThreadTest extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 2; i <=100; i += 2) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
class ThreadTset2 extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=100;i+=2){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
ThreadTest tt1=new ThreadTest();
ThreadTset2 tt2=new ThreadTset2();
tt1.setName("偶数线程：");
tt1.start();
tt2.setName("奇数线程：");
tt2.start();
    }
}

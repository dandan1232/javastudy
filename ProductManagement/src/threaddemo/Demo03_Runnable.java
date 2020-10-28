package threaddemo;

/*
第二种创建线程的方法（Runable）：
1.定义一个类，实现Runnable接口，将你让线程执行的代码写到run方法中，
2.生成如上类的实例
3.生成一个Thread的实例，使用的构造方法的第一个参数是runnable接口的引用
4.启动这个Thread实例
 */

//第一步
class SelfRun implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<50;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":第"+i+"行");
        }
    }
}


public class Demo03_Runnable {
    public static void main(String[] args) {
        //第二步
        SelfRun srl=new SelfRun();
        //第三步
        Thread th1=new Thread(srl);
        th1.setName("第一线程");
        //第四步
        th1.start();

        Thread th2=new Thread(srl,"SecongdThread");
        th2.start();
    }
}

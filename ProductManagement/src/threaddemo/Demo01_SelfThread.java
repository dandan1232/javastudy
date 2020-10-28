package threaddemo;


import java.util.Random;

/*java的线程生成方法1：
 * 1.生成一个Thread的子类，并重写run方法，将你要执行的代码放到run里面。
 * 2.在生成一个thread的实例。
 * 3.调用该实例的start方法，启动该线程，运行run中的方法。
 */

//第一步
class SelfThread extends Thread {
    @Override
    public void run() {
        super.run();
        Random random = new Random();
        for (int i = 0; i < 1200; i++) {
            System.out.println("自定义线程第："+i+"次生成的随机数为："+ random.nextDouble());
            if(i==50){ //让出去，均匀分配
                Thread.yield();
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public SelfThread() {
    }

    public SelfThread(String name) {
        super(name);
    }
}

public class Demo01_SelfThread {
    public static void main(String[] args) {
        //第二步
        SelfThread st = new SelfThread();
        //第三步
        st.start();

        //主线程自己的任务
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程：第" + i + "次生成的随机数为：" + random.nextInt(100));
/*        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
            if (i == 8) {
                try {
                    st.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

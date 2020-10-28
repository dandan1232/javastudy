package threaddemo;

import javax.swing.*;
import java.awt.*;

class MovingFrame extends JFrame implements Runnable {
    JLabel jl = new JLabel("就是我在移动");
    JTextField jtf = new JTextField("请在这里输入", 20);

    public MovingFrame(String title) {
        super(title);
        Container container = this.getContentPane();
        container.setLayout(null);

        jl.setBounds(20, 50, 100, 30);
        container.add(jl);

        jtf.setBounds(20, 200, 150, 30);
        container.add(jtf);

        this.setSize(420, 300);
        this.setLocation(200, 200);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void run() {
        int i=0;
        boolean bDirection=true;

        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            jl.setBounds(10+i*15,50,100,30);

            if(i>20){
                bDirection=false;
            }
            if(i<0){
                bDirection=true;
            }
            if(bDirection){
                i++;
            }else {
                i--;
            }
        }
    }
}

public class Demo04_MovingFrameTest {
    public static void main(String[] args) {
        MovingFrame mf = new MovingFrame("移动窗口");
        //Runable实例来实现线程的字幕飘动功能
        Thread th = new Thread(mf, "线程");
        th.start();
    }
}

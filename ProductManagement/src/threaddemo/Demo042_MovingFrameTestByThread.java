package threaddemo;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
class MovingFrame2 extends JFrame{
    JLabel jl=new JLabel("就是我在移动！");
    JTextField jtf=new JTextField("请在这里输入", 20);

    public MovingFrame2(String title){
        super(title);
        Container container=this.getContentPane();
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
}

class MovingThread extends Thread{
    MovingFrame2 frame=null;
    public MovingThread(MovingFrame2 frame) {
        // TODO Auto-generated constructor stub
        this.frame=frame;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        int i=0;
        boolean bDirection=true;

        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            frame.jl.setBounds(10+i*15, 50, 100, 30);

            if(i>20){
                bDirection=false;
            }

            if(i<0){
                bDirection=true;
            }

            if(bDirection){
                i++;
            }else{
                i--;
            }
        }
    }
}
public class Demo042_MovingFrameTestByThread {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MovingFrame2 mf=new MovingFrame2("移动窗口");

        MovingThread mThread=new MovingThread(mf);
        mThread.start();
    }
}

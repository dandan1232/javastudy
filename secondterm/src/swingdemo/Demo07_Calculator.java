package swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//第一步，当前类实现ActionListener接口
public class Demo07_Calculator extends JFrame implements ActionListener {
    JTextField jtf = null;


    public Demo07_Calculator() throws HeadlessException {
    }

    public Demo07_Calculator(String title) throws HeadlessException {
        super(title);

        //主面板获取
        Container jp = this.getContentPane();
        jp.setLayout(new BorderLayout());

        jtf = new JTextField("");
        jp.add(jtf, BorderLayout.NORTH);

        //生成一个子面板，作为数字键等
        JPanel keys = new JPanel();
        keys.setLayout(new GridLayout(5, 3, 5, 5));
        for (int i = 0; i < 10; i++) {
            JButton jbtemp = new JButton("" + i);
            keys.add(jbtemp);

            //第三步：关联组件和事件监听器，因为本类已经实现了ActionListener接口，
            // 所以this可以作为一个ActionListener接口的
            // 实现类使用多态传递给此接口引用可以传递。
            jbtemp.addActionListener(this);
        }
        JButton jbdot = new JButton(".");
        keys.add(jbdot);
        jbdot.addActionListener(this);

        keys.add(new JButton("="));
        keys.add(new JButton("清空"));
        keys.add(new JButton("退格"));
        //将子面板加入到主面板
        jp.add(keys, BorderLayout.CENTER);

        //生成另一个子面板，作为符号键
        JPanel symbols = new JPanel();
        symbols.setLayout(new GridLayout(4, 1, 5, 5));
        symbols.add(new JButton("  +  "));
        symbols.add(new JButton("  -  "));
        symbols.add(new JButton("  *  "));
        symbols.add(new JButton("  /  "));
        //将第二个子面板加入到主面板的东边
        jp.add(symbols, BorderLayout.EAST);

        this.setSize(400, 400);
        this.setLocation(200, 100);
        this.setVisible(true);

    }

    //第二步：在重写接口对应的方法中，增加对应的事件处理代码
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String command=e.getActionCommand();
        if(command.equals("1")){
            jtf.setText("你敲了1");
        }else if(command.equals("2")){
            jtf.setText("你敲了2");
        }else if(command.equals("3")){
            jtf.setText("你敲了3");
        }else if(command.equals(".")){
            jtf.setText("你敲了.");
        }
    }

    public static void main(String[] args) {
        new Demo07_Calculator("计算机界面");
    }


}

package swingdemo;

import javax.swing.*;
import java.awt.*;

public class Demo05_NullLayout extends JFrame {
    JTextField jtf=null;
    JTextArea jta=null;
    JButton jbgo=null;

    public Demo05_NullLayout() throws HeadlessException {
        super();
        // TODO Auto-generated constructor stub
    }

    public Demo05_NullLayout(String title) throws HeadlessException {
        super(title);
        // TODO Auto-generated constructor stub
        jtf = new JTextField(20);
        jtf.setText("上面的输入框");
        jta = new JTextArea(20, 30);
        jta.setText("中间的输入框，可以多行输入");
        jbgo = new JButton("第一个按钮");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container jp = this.getContentPane();
        jp.setLayout(null);//如果不显示设置null布局，那么缺省的是BroderLayout

        jp.add(jtf);
        jtf.setBounds(50,20,200,50);
        jp.add(jta);
        jta.setBounds(50,100,200,180);
        jp.add(jbgo);
        jbgo.setBounds(50,300,200,180);


        this.setSize(400,300);
        this.setLocation(200,100);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new Demo05_NullLayout("网格布局");
    }
}

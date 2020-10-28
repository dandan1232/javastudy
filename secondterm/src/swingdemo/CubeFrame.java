package swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CubeFrame extends JFrame implements ActionListener {
    private JLabel jl1 = null;
    private JTextField jtf1 = null;

    private JLabel jl2 = null;
    private JButton jb1 = null;


    public CubeFrame() throws HeadlessException {
        super();
    }

    public CubeFrame(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new FlowLayout());

        jl1 = new JLabel("请输入任意一个数：");
        jtf1 = new JTextField(7);
        jb1 = new JButton("计算");
        jl2 = new JLabel("输入数值即可得到其三次方数");
        jb1.addActionListener(this);

        container.add(jl1);
        container.add(jtf1);
        container.add(jb1);
        container.add(jl2);

        this.setSize(300, 200);
        this.setLocation(200, 200);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Double num = Double.parseDouble(jtf1.getText());
        double value = num * num * num;
        jl2.setText(num + "的3次方=" + value);
    }

    public static void main(String[] args) {
        new CubeFrame("立方计算器");
    }
}

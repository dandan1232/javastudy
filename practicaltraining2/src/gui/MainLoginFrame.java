package gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ProductLoginFrame extends JFrame implements ActionListener {
    JLabel Name = new JLabel("登录系统");

    JLabel jName = new JLabel("用        户       ID：");
    JLabel jPassword = new JLabel("密                  码：");
    JLabel jIdentity = new JLabel("请选择身份登入：");
    String[] listData = {"管理员", "员工"};
    JComboBox jcb1;


    JTextField jtfName = new JTextField("", 40);
    JTextField jtfPassword = new JPasswordField("", 40);

    JButton jButtonInsert = new JButton("用户注册");
    JButton jButtonDelete = new JButton("修改密码");
    JButton jButtonSearch = new JButton("用户登录");

    public ProductLoginFrame(String title) {
        super(title);
        Container container = this.getContentPane();

        container.setLayout(null);

        Name.setBounds(180, 30, 110, 30);

        jName.setBounds(110, 90, 110, 30);
        jtfName.setBounds(250, 90, 100, 30);

        jPassword.setBounds(110, 130, 110, 30);
        jtfPassword.setBounds(250, 130, 100, 30);

        jIdentity.setBounds(110, 170, 110, 30);
        jcb1 = new JComboBox(listData);
        jcb1.setBounds(250, 170, 100, 30);


        jButtonInsert.setBounds(70, 220, 100, 40);
        jButtonDelete.setBounds(180, 220, 100, 40);
        jButtonSearch.setBounds(290, 220, 100, 40);

        container.add(Name);
        Name.setFont(new Font("粗体", Font.BOLD, 20));
        Name.setForeground(Color.pink);

        container.add(jName);
        container.add(jtfName);

        container.add(jPassword);
        container.add(jtfPassword);

        container.add(jIdentity);
        container.add(jcb1);


        container.add(jButtonInsert);
        container.add(jButtonDelete);
        container.add(jButtonSearch);
        jButtonInsert.addActionListener(this);
        jButtonDelete.addActionListener(this);
        jButtonSearch.addActionListener(this);

        this.setBounds(300,200,500,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.out.println("系统" + e.getActionCommand() + "中......");
        if ("用户注册".equals(e.getActionCommand())) {
            new Register();
            this.setVisible(false);
        }else if("修改密码".equals(e.getActionCommand())){
            new ChangePassword();
            this.setVisible(false);
        }

    }
}


public class MainLoginFrame {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new ProductLoginFrame("林蛋蛋公司管理");
    }

}

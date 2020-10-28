package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePassword extends JFrame implements ActionListener {
    JLabel Name = new JLabel("修改密码");

    JLabel jid = new JLabel("请 输 入 用 户 ID:");
    JLabel jmm = new JLabel("请输入原始密码:");
    JLabel jnewmm = new JLabel("请重新输入密码：");
    JLabel jnewmm_copy = new JLabel("再次输入新密码：");

    JTextField jtfid = new JTextField("", 40);
    JTextField jtfmm = new JTextField("", 40);
    JTextField jtfnewmm = new JTextField("", 40);
    JTextField jtfnewmm_copy = new JTextField("", 40);
    JButton jButtonchange = new JButton("确认修改");

    JLabel jmy = new JLabel("若为管理员，请输入密钥：");
    JTextField jtfmy = new JTextField("", 60);


    private void ChangePassword() {
        Container container = this.getContentPane();
        container.setLayout(null);

        Name.setBounds(150, 20, 150, 30);

        jid.setBounds(100, 60, 120, 30);
        jtfid.setBounds(250, 60, 110, 30);

        jmm.setBounds(100, 100, 120, 30);
        jtfmm.setBounds(250, 100, 110, 30);

        jnewmm.setBounds(100, 140, 120, 30);
        jtfnewmm.setBounds(250, 140, 110, 30);

        jnewmm_copy.setBounds(100, 180, 120, 30);
        jtfnewmm_copy.setBounds(250, 180, 110, 30);

        jButtonchange.setBounds(150, 240, 150, 40);

        container.add(Name);
        Name.setFont(new Font("粗体", Font.BOLD, 20));
        Name.setForeground(Color.BLUE);

        container.add(jid);
        container.add(jtfid);

        container.add(jmm);
        container.add(jtfmm);

        container.add(jnewmm);
        container.add(jtfnewmm);

        container.add(jnewmm_copy);
        container.add(jtfnewmm_copy);

        container.add(jButtonchange);

        jButtonchange.addActionListener(this);

        this.setBounds(300, 200, 500, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ChangePasswordResults CP = new ChangePasswordResults();
        boolean a = CP.ChangePasswordResults(jtfid.getText());
        if ("确认修改".equals(e.getActionCommand())) {
            if (jtfid.getText().equals("") || jtfmm.getText().equals("") || jtfnewmm.getText().equals("")
                    || jtfnewmm_copy.getText().equals("") ) {
                JOptionPane.showMessageDialog(null, "请将信息填写完整！", "消息提示", JOptionPane.INFORMATION_MESSAGE);
            }else if(jtfnewmm.getText()!=jtfnewmm_copy.getText()) {
                JOptionPane.showMessageDialog(null, "两次输入密码不同，请重新输入！", "消息提示", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                if (a) {
                    System.out.println("修改成功");
                    JOptionPane.showMessageDialog(null, "恭喜您！修改密码成功！", "消息提示", JOptionPane.INFORMATION_MESSAGE);
                    new ProductLoginFrame("林蛋蛋公司管理");
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "您输入的信息有误，无法修改密码！", "消息提示", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

    }

    public static void main(String[] args) {
        new ChangePassword();
    }

}

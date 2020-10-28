package gui;


import dao.UserDao;
import dapimpl.UserDaoImpl;
import entity.User;

import javax.naming.Name;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Register extends JFrame implements ActionListener {
    JLabel Name = new JLabel("用户注册");

    JLabel jid = new JLabel("用户ID:");
    JLabel jgh = new JLabel("工号:");
    JLabel jyhm = new JLabel("用户名:");
    JLabel jmm = new JLabel("密码:");
    JLabel jsf = new JLabel("身份:");
    String[] listData = {"管理员", "员工"};
    JComboBox jcdata;
    JLabel jsex = new JLabel("性别:");
    String[] listSex = {"男", "女"};
    JComboBox jcsex;
    JLabel jage = new JLabel("年龄:");
    JLabel jphone = new JLabel("手机号");

    JTextField jtfid = new JTextField("", 40);
    JTextField jtfgh = new JTextField("", 40);
    JTextField jtfyhm = new JTextField("", 40);
    JTextField jtfmm = new JTextField("", 40);
    JTextField jtfage = new JTextField("", 40);
    JTextField jtfphone = new JTextField("", 40);

    JButton jButtonadd = new JButton("确认注册");

    JLabel jmy=new JLabel("若选择管理员注册，请输入密钥：");
    JTextField jtfmy=new JTextField("",60);


    public Register() {
        Container container = this.getContentPane();
        container.setLayout(null);

        Name.setBounds(150, 20, 150, 30);

        jid.setBounds(120, 60, 100, 30);
        jtfid.setBounds(200, 60, 100, 30);

        jgh.setBounds(120, 100, 100, 30);
        jtfgh.setBounds(200, 100, 100, 30);

        jyhm.setBounds(120, 140, 100, 30);
        jtfyhm.setBounds(200, 140, 100, 30);

        jmm.setBounds(120, 180, 100, 30);
        jtfmm.setBounds(200, 180, 100, 30);

        jsf.setBounds(120, 220, 100, 30);
        jcdata = new JComboBox(listData);
        jcdata.setBounds(200, 220, 100, 30);

        jsex.setBounds(120, 260, 100, 30);
        jcsex = new JComboBox(listSex);
        jcsex.setBounds(200, 260, 100, 30);


        jage.setBounds(120, 300, 100, 30);
        jtfage.setBounds(200, 300, 100, 30);

        jphone.setBounds(120, 340, 100, 30);
        jtfphone.setBounds(200, 340, 100, 30);

        jButtonadd.setBounds(130, 400, 150, 40);

        jmy.setBounds(120,450,300,40);
        jtfmy.setBounds(110,490,200,30);

        container.add(Name);
        Name.setFont(new Font("粗体", Font.BOLD, 20));
        Name.setForeground(Color.BLUE);

        container.add(jid);
        container.add(jtfid);

        container.add(jgh);
        container.add(jtfgh);

        container.add(jyhm);
        container.add(jtfyhm);

        container.add(jmm);
        container.add(jtfyhm);

        container.add(jmm);
        container.add(jtfmm);

        container.add(jsf);
        container.add(jcdata);

        container.add(jsex);
        container.add(jcsex);

        container.add(jage);
        container.add(jtfage);

        container.add(jphone);
        container.add(jtfphone);

        container.add(jButtonadd);

        container.add(jmy);
        container.add(jtfmy);
        jButtonadd.addActionListener(this);

        this.setBounds(300,50,450,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("注册成功，请返回登录");
        if ("确认注册".equals(e.getActionCommand())) {
            if (jtfid.getText().equals("") || jtfgh.getText().equals("") || jtfyhm.getText().equals("")
                    || jtfmm.getText().equals("") || jtfage.getText().equals("")|| jtfphone.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "请将信息填写完整！", "消息提示", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if ("员工".equals((String) jcdata.getSelectedItem())) {

                    User user = new User();
                    user.setId(jtfid.getText());
                    user.setGh(jtfgh.getText());
                    user.setYhm(jtfyhm.getText());
                    user.setMm(jtfmm.getText());
                    user.setSf((String) jcdata.getSelectedItem());
                    user.setSex((String)jcsex.getSelectedItem());
                    user.setAge(jtfage.getText());
                    user.setPhone(jtfphone.getText());
                    UserDao dao=new UserDaoImpl();
                    dao.add(user);

                    JOptionPane.showMessageDialog(null, "恭喜你成功注册为员工！", "消息提示", JOptionPane.INFORMATION_MESSAGE);
                    new ProductLoginFrame("林蛋蛋公司管理");
                    this.setVisible(false);
                } else if ("管理员".equals((String) jcdata.getSelectedItem())
                        && "666666".equals(jtfmy.getText())) {
                    User user = new User();
                    user.setId(jtfid.getText());
                    user.setGh(jtfgh.getText());
                    user.setYhm(jtfyhm.getText());
                    user.setMm(jtfmm.getText());
                    user.setSf((String) jcdata.getSelectedItem());
                    user.setSex((String)jcsex.getSelectedItem());
                    user.setAge(jtfage.getText());
                    user.setPhone(jtfphone.getText());
                    UserDao dao=new UserDaoImpl();
                    dao.add(user);

                    JOptionPane.showMessageDialog(null, "恭喜你成功注册为管理员！", "消息提示", JOptionPane.INFORMATION_MESSAGE);
                    new ProductLoginFrame("林蛋蛋公司管理");
                    this.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(null, "管理员秘钥输入错误，注册失败！", "消息提示", JOptionPane.INFORMATION_MESSAGE);

                }

            }

        }
    }
}

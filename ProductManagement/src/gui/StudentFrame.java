package gui;

import dao.DBUtils;
import dao.StudentDao;
import daoimpl.StudentDaoImpl;
import entity.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class StudentFrame extends JFrame implements ActionListener {
    JLabel jId = new JLabel("序号：");
    JLabel jGrade = new JLabel("班级：");
    JLabel jName = new JLabel("名字：");
    JLabel jNum = new JLabel("学号:");
    JLabel jAge = new JLabel("年龄：");

    JTextField jtfId = new JTextField("", 40);
    JTextField jtfGrade = new JTextField("专业摸鱼", 40);
    JTextField jtfName = new JTextField("", 40);
    JTextField jtfNum = new JTextField("", 40);
    JTextField jtfAge = new JTextField("", 40);

    JButton jButtonInsert = new JButton("新增信息");
    JButton jButtonDelete = new JButton("删除信息");
    JButton jButtonUpdate = new JButton("修改信息");
    JButton jButtonSearch = new JButton("查询类型");

    public StudentFrame(String title) {
        super(title);
        Container container = this.getContentPane();

        container.setLayout(null);
        jId.setBounds(10, 20, 40, 30);
        jtfId.setBounds(60, 20, 100, 30);

        jGrade.setBounds(10, 60, 40, 30);
        jtfGrade.setBounds(60, 60, 100, 30);

        jName.setBounds(10, 100, 40, 30);
        jtfName.setBounds(60, 100, 100, 30);

        jNum.setBounds(10, 140, 40, 30);
        jtfNum.setBounds(60, 140, 100, 30);

        jAge.setBounds(10, 180, 40, 30);
        jtfAge.setBounds(60, 180, 100, 30);

        jButtonInsert.setBounds(10, 230, 100, 30);
        jButtonDelete.setBounds(120, 230, 100, 30);
        jButtonUpdate.setBounds(10, 270, 100, 30);
        jButtonSearch.setBounds(120, 270, 100, 30);

        container.add(jId);
        container.add(jtfId);

        container.add(jGrade);
        container.add(jtfGrade);

        container.add(jName);
        container.add(jtfName);

        container.add(jNum);
        container.add(jtfNum);

        container.add(jAge);
        container.add(jtfAge);

        container.add(jButtonInsert);
        container.add(jButtonDelete);
        container.add(jButtonUpdate);
        container.add(jButtonSearch);
        jButtonInsert.addActionListener(this);
        jButtonDelete.addActionListener(this);
        jButtonUpdate.addActionListener(this);
        jButtonSearch.addActionListener(this);

        this.setSize(300, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        StudentDao dao = new StudentDaoImpl();
        System.out.println("系统" + e.getActionCommand() + "中......");
        if ("新增信息".equals(e.getActionCommand())) {
            Student student = new Student();
            student.setId(Integer.parseInt(jtfId.getText()));
            student.setGrade(jtfGrade.getText());
            student.setName(jtfName.getText());
            student.setNumber(Integer.parseInt(jtfNum.getText()));
            student.setAge(Integer.parseInt(jtfAge.getText()));

            int code = dao.add(student);
            System.out.println("成功将姓名为：" + student.getName() + "的学生信息添加到数据库中");
            System.out.println("----------------------------------------------");
        } else if ("删除信息".equals(e.getActionCommand())) {
            Student student = new Student();
            student.setId(Integer.parseInt(jtfId.getText()));
            int code = dao.delete(student);
            System.out.println("成功将序号为" +student.getId()+"的学生信息从数据库中删除");
            System.out.println("----------------------------------------------");
        } else if ("修改信息".equals(e.getActionCommand())) {

            String sql = "update student set name='薛之谦' where id=4";
            Integer id = Integer.parseInt(jtfId.getText());

            int code = DBUtils.update(sql);
            System.out.println("成功将序号为4的学生姓名更改为：薛之谦");
            System.out.println("----------------------------------------------");
        } else if ("查询类型".equals(e.getActionCommand())) {
            List<Student>studentlist=null;
            studentlist=dao.getByID(jtfGrade.getText());

            new StudentTableFrame(studentlist);

            System.out.println(studentlist);
        }
    }

    public static void main(String[] args) {
        new StudentFrame("学生信息");
    }

}

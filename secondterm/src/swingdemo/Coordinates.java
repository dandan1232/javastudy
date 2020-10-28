package swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Coordinates extends JFrame implements FocusListener, MouseListener {
    JTextField jtf = null;
    JTextArea jta=null;
    JButton jb = null;

    public Coordinates() throws HeadlessException {
    }

    public Coordinates(String title) throws HeadlessException {
        super(title);
        jtf = new JTextField(10);
        jtf.setText("请移动鼠标至文本框内获得其坐标值");
        jb = new JButton("按钮");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container jp = this.getContentPane();
        jp.setLayout(null);

        jp.add(jtf);
        jtf.setBounds(10, 5, 200, 81);


        jp.add(jb);
       jb.setBounds(213,28,60,30);


        jtf.addFocusListener(this);
        jtf.addMouseListener(this);

        this.setSize(400, 300);
        this.setLocation(300, 100);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Coordinates("鼠标移动");
    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {
        jtf.setText("JTextField对象 失去焦点");
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jtf.setText("\n鼠标移动：x=" + e.getX() + ",y=" + e.getY());
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

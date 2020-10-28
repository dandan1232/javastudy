package swingdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class Demo12_FontSetMenu extends JFrame implements ActionListener {
    JTextArea textDemo = new JTextArea("里面的文字格式需要通过菜单设置", 10, 30);
    JMenuBar jmb = new JMenuBar();
    JMenu fontMenu = new JMenu("字体");
    JMenu helpMenu = new JMenu("帮助");

    JMenu styleMenu = new JMenu("样式");
    JMenu colorMenu = new JMenu("颜色");

    JMenuItem exitItem = new JMenuItem("退出");
    JMenuItem aboutItem = new JMenuItem("关于");

    JCheckBoxMenuItem boldItem = new JCheckBoxMenuItem("粗体");
    JCheckBoxMenuItem italicItem = new JCheckBoxMenuItem("斜体");

    JRadioButtonMenuItem redItem = new JRadioButtonMenuItem("红色");
    JRadioButtonMenuItem greenItem = new JRadioButtonMenuItem("绿色");
    JRadioButtonMenuItem blueItem = new JRadioButtonMenuItem("蓝色");

    public Demo12_FontSetMenu(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();

        container.add(new Label(""), BorderLayout.NORTH);

        container.add(textDemo, BorderLayout.CENTER);

        this.setJMenuBar(jmb);
        jmb.add(fontMenu);
        jmb.add(helpMenu);
        //加快捷键F，alt+F就可以打开字体菜单
        fontMenu.setMnemonic(KeyEvent.VK_F);

        fontMenu.add(styleMenu);
        fontMenu.add(colorMenu);

        fontMenu.addSeparator();

        fontMenu.add(exitItem);
        fontMenu.add(aboutItem);

        styleMenu.add(boldItem);
        styleMenu.add(italicItem);

        //加快捷键I，alt+I就可以勾选或去选斜体复选框
        italicItem.setMnemonic(KeyEvent.VK_I);

        colorMenu.add(redItem);
        colorMenu.add(greenItem);
        colorMenu.add(blueItem);

        ButtonGroup bg = new ButtonGroup();
        bg.add(redItem);
        bg.add(greenItem);
        bg.add(blueItem);

        exitItem.addActionListener(this);
        redItem.addActionListener(this);
        greenItem.addActionListener(this);
        blueItem.addActionListener(this);
        boldItem.addActionListener(this);
        italicItem.addActionListener(this);

        this.pack();
        this.setLocation(200, 200);
        //一定要设置成可见的
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int bold = Font.PLAIN, italic = Font.PLAIN;
        String command = e.getActionCommand();

        if ("退出".equals(command)) {
            System.exit(WindowConstants.EXIT_ON_CLOSE);
        } else if ("红色".equals(command)) {
            textDemo.setForeground(Color.red);
        } else if ("绿色".equals(command)) {
            textDemo.setForeground(Color.green);
        } else if ("蓝色".equals(command)) {
            textDemo.setForeground(Color.blue);
        } else if ("粗体".equals(command)) {
            bold = boldItem.isSelected() ? Font.BOLD : Font.PLAIN;
        } else if ("斜体".equals(command)) {
            italic = italicItem.isSelected() ? Font.ITALIC: Font.PLAIN;
        }
        textDemo.setFont(new Font("楷体",bold+italic,26));
    }

    public static void main(String[] args) {
        new Demo12_FontSetMenu("菜单练习");
    }

}

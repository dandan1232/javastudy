package swingdemo;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Exer03_FontConfig  extends JFrame implements ItemListener, ActionListener{

    JRadioButton jrbRed = new JRadioButton("红色",true);
    JRadioButton jrbGreen = new JRadioButton("绿色");
    JRadioButton jrbBlue = new JRadioButton("蓝色");
    private ButtonGroup bg = new ButtonGroup();

    JCheckBox jcb1 = new JCheckBox("加粗");
    JCheckBox jcb2 = new JCheckBox("倾斜");

    JComboBox listFont;
    JList listSize;
    JTextArea taDemo;
    JButton btnExit,btnEdit;

    public Exer03_FontConfig(){

        GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String fontName[] = g.getAvailableFontFamilyNames();

        Box boxV1 = Box.createVerticalBox();
        boxV1.add(new JLabel("请选择字体"));
        listFont = new JComboBox(fontName);
        boxV1.add(new JScrollPane(listFont)); //new JScrollPane 有滚动条的面板
        boxV1.add(Box.createVerticalStrut(155));

        Box boxV2 = Box.createVerticalBox(); //生成竖着的一个个框
        boxV2.add(new JLabel("请选择字号"));
        String strSize[] = new String[30];
        for(int i=0;i<30;i++){
            strSize[i] = ""+(i+16);
        }
        listSize = new JList(strSize);
        boxV2.add(new JScrollPane(listSize));

        Box boxV3 = Box.createVerticalBox();
        boxV3.add(new JLabel("请选择字形"));
        boxV3.add(jcb1);
        boxV3.add(jcb2);
        boxV3.add(Box.createVerticalGlue()); //createVerticalGlue生成空的元素加进去

        Box boxV4 = Box.createVerticalBox();
        boxV4.add(new JLabel("请选择字色"));
        boxV4.add(jrbRed);
        boxV4.add(jrbGreen);
        boxV4.add(jrbBlue);
        boxV4.add(Box.createVerticalGlue());

        bg.add(jrbRed);
        bg.add(jrbGreen);
        bg.add(jrbBlue);

        Box boxH1 = Box.createHorizontalBox(); //生成水平的box

        boxH1.add(boxV1);
        boxH1.add(Box.createHorizontalStrut(15));
        boxH1.add(boxV2);
        boxH1.add(Box.createHorizontalStrut(15));
        boxH1.add(boxV3);
        boxH1.add(Box.createHorizontalStrut(15));
        boxH1.add(boxV4);

        Box boxH2 = Box.createHorizontalBox();
        taDemo = new JTextArea("这是字体设置的测试文字",5,20);
        boxH2.add(taDemo);

        Box boxV5 = Box.createVerticalBox();

        btnExit = new JButton("退出");
        btnEdit = new JButton("编辑");
        boxV5.add(btnExit);
        boxV5.add(btnEdit);
        boxH2.add(boxV5);

        btnExit.addActionListener(this);
        btnEdit.addActionListener(this);

        Box baseBox = Box.createVerticalBox(); //生成一个最大的框，里面两个框是竖着排的
        baseBox.add(boxH1);
        baseBox.add(boxH2);

        this.setContentPane(baseBox);

        setTitle("字体设置器");
        setBounds(150,150,550,380);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent e){
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == btnExit) { //退出按钮，btnExit.addActionListener(this);
            dispose();
        }
        else if (e.getSource() == btnEdit){ //编辑
            int style = Font.PLAIN;
            if(jcb1.isSelected())
                style |= Font.BOLD;
            if(jcb2.isSelected())
                style |= Font.ITALIC;

            //根据单选按钮的选择，直接设置文本输入区的字体颜色
            if(jrbRed.isSelected())
                taDemo.setForeground(Color.RED);
            if(jrbGreen.isSelected())
                taDemo.setForeground(Color.GREEN);
            if(jrbBlue.isSelected())
                taDemo.setForeground(Color.BLUE);

            String strFont = (String)listFont.getSelectedItem();
            //根据组件的选择，得到构造字体的多个参数，然后构造字体
            Font ft = new Font(strFont,style,listSize.getSelectedIndex()+16);
            //strFont 字体,style 粗体斜体,listSize 字体大小
            //对文本输入区设置字体
            taDemo.setFont(ft);
        }
        //构造其他组件的事件处理过程，比如复选框，直接根据字体直接显示。（所点即所得）
    }

    public static void main(String[] args){
        Exer03_FontConfig vt = new Exer03_FontConfig();
    }
}
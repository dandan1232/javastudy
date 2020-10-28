package swingdemo;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;


public class UserLogin extends JFrame {
    JLabel jl = null;
    JTextField jtf = null;
    JLabel jl1 = null;

    public UserLogin() throws HeadlessException {
    }

    public UserLogin(String title) throws HeadlessException {
        super(title);
        Container jp = this.getContentPane();
        jp.setLayout(new BorderLayout());
        jl = new JLabel("会员登记录入", JLabel.CENTER);
        jl.setFont(new Font("Dialog", 1, 20));
        //dialog代表字体，1代表样式（1是粗体，0是平常的），20是字体大小
        jl.setForeground(Color.blue);
        jp.add(jl, BorderLayout.NORTH);


        Container keys = new JPanel();
        keys.setLayout(new GridLayout(3, 4, 5, 5));
        keys.add(new JLabel("姓         名"));
        keys.add(new JTextField("亦安、"));
        keys.add(new JLabel("性         别"));
        keys.add(new JTextField("女"));
        keys.add(new JLabel("联系电话"));
        keys.add(new JTextField("0512-12345678"));
        keys.add(new JLabel("类         型"));
        keys.add(new JTextField("超级会员"));
        keys.add(new JLabel("折         扣"));
        keys.add(new JTextField("0.5"));
        keys.add(new JLabel("是否挂失"));
        String[] listData = new String[]{"是", "否"};
        final JComboBox<String> comboBox = new JComboBox<String>(listData);
        comboBox.setSelectedIndex(1);
        keys.add(comboBox);
        jp.add(keys, BorderLayout.CENTER);

        JPanel company = new JPanel();
        company.setLayout(new BoxLayout(company, BoxLayout.X_AXIS));
        company.add(new JLabel("工作单位                  "));
        company.add(new JTextField("华为技术有限公司"));
        jp.add(company, BorderLayout.AFTER_LAST_LINE);


        this.setSize(430, 160);
        this.setLocation(200, 100);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new UserLogin("会员登记");
    }


}

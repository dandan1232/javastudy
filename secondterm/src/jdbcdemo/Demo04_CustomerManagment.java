package jdbcdemo;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

class CustomerFrame extends JFrame implements ActionListener{
    JLabel jId=new JLabel("标识：");
    JLabel jName=new JLabel("名字：");
    JLabel jBirthday=new JLabel("生日：");

    JTextField jtfId=new JTextField("2",20);
    JTextField jtfName=new JTextField("lisi",20);
    JTextField jtfBirthday=new JTextField("1956-7-8",20);

    JButton jButtonInsert=new JButton("Insert");
    JButton jButtonDelete=new JButton("Update");
    JButton jButtonSearch=new JButton("Search");

    public CustomerFrame(String title){
        super(title);
        Container container=this.getContentPane();

        container.setLayout(null);
        jId.setBounds(10, 20, 40, 30);
        jtfId.setBounds(60, 20, 100, 30);

        jName.setBounds(10, 60, 40, 30);
        jtfName.setBounds(60, 60, 100, 30);

        jBirthday.setBounds(10, 100, 40, 30);
        jtfBirthday.setBounds(60, 100, 100, 30);

        jButtonInsert.setBounds(10, 160, 80, 30);
        jButtonDelete.setBounds(100, 160, 80, 30);
        jButtonSearch.setBounds(190, 160, 80, 30);

        container.add(jId);
        container.add(jtfId);

        container.add(jName);
        container.add(jtfName);

        container.add(jBirthday);
        container.add(jtfBirthday);

        container.add(jButtonInsert);
        container.add(jButtonDelete);
        container.add(jButtonSearch);
        jButtonInsert.addActionListener(this);
        jButtonDelete.addActionListener(this);
        jButtonSearch.addActionListener(this);

        this.setSize(300, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.out.println(e.getActionCommand());
        if("Insert".equals(e.getActionCommand())){

            String sql="insert into customers (id,name,birthday) values(?,?,?)";
            Integer id=Integer.parseInt(jtfId.getText());
            String name=jtfName.getText();
            String date=jtfBirthday.getText();


            int code=DBUtils.update(sql, id,name,date);
            System.out.println(code);


        }else if("Search".equals(e.getActionCommand())){
            Connection connection=null;
            PreparedStatement statement=null;
            ResultSet rs=null;

            try {
                connection=DBUtils.getConnection();

                statement = connection.prepareStatement("select id,name,birthday from customers where id=?");
                System.out.println(Integer.parseInt(jtfId.getText()));
                statement.setInt(1, Integer.parseInt(jtfId.getText()));
                rs=statement.executeQuery();
                while(rs.next()){
                    System.out.println("-------------------------------------");
                    int id=rs.getInt(1);
                    System.out.println(id);
                    jtfName.setText(rs.getString(2));
                    jtfBirthday.setText(rs.getDate(3).toString());
                }
            }catch (ClassNotFoundException | SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }finally{
                DBUtils.closeResource(connection, statement, rs);
            }
        }else if("Update".equals(e.getActionCommand())){

            String sql="update customers set name='zhao' where id=4";
            Integer id=Integer.parseInt(jtfId.getText());

            int code=DBUtils.update(sql);
            System.out.println(code);
        }
    }
}


public class Demo04_CustomerManagment {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new CustomerFrame("客户管理");
    }

}

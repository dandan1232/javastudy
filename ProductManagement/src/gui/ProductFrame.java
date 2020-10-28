package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowStateListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import dao.DBUtils;
import dao.ProductDao;
import daoimpl.ProductDaoImpl;
import entity.Product;

public class ProductFrame extends JFrame implements ActionListener{
    JLabel jId=new JLabel("标识：");
    JLabel jName=new JLabel("名字：");
    JLabel jPrice=new JLabel("价格：");
    JLabel jNum=new JLabel("数量：");
    JLabel jType=new JLabel("类型：");

    JTextField jtfId=new JTextField("",40);
    JTextField jtfName=new JTextField("",40);
    JTextField jtfPrice=new JTextField("",40);
    JTextField jtfNum=new JTextField("",40);
    JTextField jtfType=new JTextField("1",40);


    JButton jButtonInsert=new JButton("新增商品");
    JButton jButtonDelete=new JButton("删除商品");
    JButton jButtonSearch=new JButton("查询类型");

    public ProductFrame(String title){
        super(title);
        Container container=this.getContentPane();

        container.setLayout(null);
        jId.setBounds(10, 20, 40, 30);
        jtfId.setBounds(60, 20, 100, 30);

        jName.setBounds(10, 60, 40, 30);
        jtfName.setBounds(60, 60, 100, 30);

        jPrice.setBounds(10, 100, 40, 30);
        jtfPrice.setBounds(60, 100, 100, 30);

        jNum.setBounds(10, 140, 40, 30);
        jtfNum.setBounds(60, 140, 100, 30);

        jType.setBounds(10, 180, 40, 30);
        jtfType.setBounds(60, 180, 100, 30);

        jButtonInsert.setBounds(10, 230, 100, 30);
        jButtonDelete.setBounds(120, 230,100, 30);
        jButtonSearch.setBounds(230, 230, 100, 30);

        container.add(jId);
        container.add(jtfId);

        container.add(jName);
        container.add(jtfName);

        container.add(jPrice);
        container.add(jtfPrice);

        container.add(jNum);
        container.add(jtfNum);

        container.add(jType);
        container.add(jtfType);

        container.add(jButtonInsert);
        container.add(jButtonDelete);
        container.add(jButtonSearch);
        jButtonInsert.addActionListener(this);
        jButtonDelete.addActionListener(this);
        jButtonSearch.addActionListener(this);

        this.setSize(400, 360);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ProductDao dao=new ProductDaoImpl();
        // TODO Auto-generated method stub
        System.out.println(e.getActionCommand());
        if("新增商品".equals(e.getActionCommand())){
            Product product=new Product();
            product.setId(Integer.parseInt(jtfId.getText()));
            product.setName(jtfName.getText());
            product.setPrice(Double.parseDouble(jtfPrice.getText()));;
            product.setNum(Integer.parseInt(jtfNum.getText()));
            product.setType(Integer.parseInt(jtfType.getText()));

            int code=dao.add(product);
            System.out.println(code);
        }else if("删除商品".equals(e.getActionCommand())){
            Product product=new Product();
            product.setId(Integer.parseInt(jtfId.getText()));
            int code=dao.delete(product);
            System.out.println(code);
        }
        else if("查询类型".equals(e.getActionCommand())){
            List<Product> productlist=null;
            productlist=dao.getById(Integer.parseInt(jtfType.getText()));

            new ProductTableFrame(productlist);

            System.out.println(productlist);
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new ProductFrame("商品管理");
    }
}
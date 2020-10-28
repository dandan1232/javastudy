package gui;

import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

import entity.Product;

public class ProductTableFrame extends JFrame {

    public ProductTableFrame(List<Product> list) {

        //如何由list来生成数据和表头
        Vector<Vector<Object>> vectordata=new Vector<>();

        for(Product product:list){
            Vector<Object> objs=new Vector<>();
            objs.add(new Integer(product.getId()));
            objs.add(product.getName());
            objs.add((Double)product.getPrice());
            objs.add(new Integer(product.getNum()));
            objs.add(new Integer(product.getType()));
            vectordata.add(objs);//objs是一条纪录对应的多个字段的vector列表
        }

        String[] labels={"标识","名称","价格","数量","类型"};

        Vector<String> columnNames=new Vector<>();
        for(String label:labels){
            columnNames.add(label);
        }

        /*
         * 当Jtable使用vector作为入参时，需要明确第一个参数，
         * 要是一个嵌套了Vector<Object>（里面的每个元素对应一条数据记录的每个字段值）的一个Vector
         */
        JTable table=new JTable(vectordata, columnNames);
        //JTable table = new JTable(rowData, columnNames);


        JScrollPane scrollPane = new JScrollPane(table);


        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        // 创建内容面板
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(new TitledBorder(null, "总面板", TitledBorder.LEADING,
                TitledBorder.TOP, null, null));

        this.getContentPane().add(panel);

        panel.add(scrollPane);
        scrollPane.setBounds(15, 15, 300, 200);
        scrollPane.setBorder(new TitledBorder(null, "分数面板",
                TitledBorder.LEADING, TitledBorder.TOP, null, null));
        this.setSize(420, 300);

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

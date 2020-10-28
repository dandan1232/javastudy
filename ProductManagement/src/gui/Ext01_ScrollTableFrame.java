package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

public class Ext01_ScrollTableFrame {

    public static void main(String[] args) {
        // 表头（列名）
        String[] columnNames = {"序号", "姓名", "语文", "数学", "英语", "总分"};

        // 表格所有行数据
        Object[][] rowData = {
                {1, "张三", 80, 80, 80, 240},
                {2, "John", 70, 80, 90, 240},
                {3, "Sue", 70, 70, 70, 210},
                {4, "Jane", 80, 70, 60, 210},
                {5, "Joe_05", 80, 70, 60, 210},
                {6, "Joe_06", 80, 70, 60, 210},
                {7, "Joe_07", 80, 70, 60, 210},
                {8, "Joe_08", 80, 70, 60, 210},
                {9, "Joe_09", 80, 70, 60, 210},
                {10, "Joe_10", 80, 70, 60, 210},
                {11, "Joe_11", 80, 70, 60, 210},
                {12, "Joe_12", 80, 70, 60, 210},
                {13, "Joe_13", 80, 70, 60, 210},
                {14, "Joe_14", 80, 70, 60, 210},
                {15, "Joe_15", 80, 70, 60, 210},
                {16, "Joe_16", 80, 70, 60, 210},
                {17, "Joe_17", 80, 70, 60, 210},
                {18, "Joe_18", 80, 70, 60, 210},
                {19, "Joe_19", 80, 70, 60, 210},
                {20, "Joe_20", 80, 70, 60, 210}
        };

        JFrame jf = new JFrame("测试窗口");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 创建内容面板
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBorder(
                new TitledBorder(null,         /*设置边框用*/
                        "总面板",
                        TitledBorder.LEADING,
                        TitledBorder.TOP,
                        null,
                        null));

        jf.getContentPane().add(panel);

        /*
         * 根据数据和表头，创建表格
         */
        JTable table = new JTable(rowData, columnNames);

        /*
         * 以表格为参数，创建一个带滚动条的面板，这个时候表格就在面板里面显示
         */
        JScrollPane scrollPane = new JScrollPane(table);
        /*
         * 和上面一句等价，先常见一个空的滚动条面板，对该面板指定表格为其view
         */
  /*	 JScrollPane scrollPane = new JScrollPane();
		 scrollPane.setViewportView(table);*/

        panel.add(scrollPane);
        scrollPane.setBounds(15, 15, 300, 200);
        scrollPane.setBorder(
                new TitledBorder(null,
                        "分数面板",
                        TitledBorder.LEADING,
                        TitledBorder.TOP,
                        null,
                        null));
        jf.setSize(420,300);

        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}

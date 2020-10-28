package jdbcdemo;

import org.junit.Test;

import java.sql.*;

public class Demo03_TestResultSet {

    @Test
    public void TestResultSet() {

        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet rs=null;

        try {
            connection=DBUtils.getConnection();

            statement = connection.prepareStatement("select id,name,birthday from customers where id=?");
            statement.setInt(1, 3);
            rs=statement.executeQuery();

            while(rs.next()){
                System.out.println("-------------------------------------");
                int id=rs.getInt(1);
                System.out.println(id);
                System.out.println(rs.getString(2));
                System.out.println(rs.getDate(3));
            }
        }catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        }finally{
            DBUtils.closeResource(connection, statement, rs);
        }
    }


    /*
     * ResultSetMetaData是关于ResultSet的元数据，也就是读出来的字段信息：
     * 比如读出几个字段，字段的名字是什么，该字段可不可以为null。
     * 直接可以通过rs.getMetaData()得到。可以后面用于DAO的内容
     */


    @Test
    public void TestResultSetMetData() {

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            connection = DBUtils.getConnection();

            statement = connection.prepareStatement("select id ID,name,birthday Birth from customers where id=?");
            statement.setInt(1, 3);
            rs = statement.executeQuery();

            ResultSetMetaData rsmd=rs.getMetaData();

            for (int i=0;i<rsmd.getColumnCount();i++){
                System.out.println(rsmd.getColumnLabel(i+1));
            }

/*            while (rs.next()) {
                System.out.println("-------------------------------------");
                int id = rs.getInt(1);
                System.out.println(id);
                System.out.println(rs.getString(2));
                System.out.println(rs.getDate(3));
            }*/
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        } finally {
            DBUtils.closeResource(connection, statement, rs);
        }
    }
}
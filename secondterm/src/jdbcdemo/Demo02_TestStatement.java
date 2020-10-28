package jdbcdemo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class Demo02_TestStatement {
    /*
     * 1.先使用connectiong.creatstatement获得一个statement；
     * 2.调用statement.execute(sql)直接执行；
     * 3.关闭statement。
     */
    @Test
    public void TestStatement() {

        Connection connection = null;
        try {
            connection = DBUtils.getConnection();
            System.out.println(connection);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        Statement statement = null;
        //String sql="insert into customers(id,name,birthday) values ('3','wanger','1984-3-12')";
        String sql = "delete  from customers where id='2'";
        if (connection != null) {
            try {
                statement = connection.createStatement();
                System.out.println(statement.execute(sql));

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBUtils.closeResource(connection, statement);

    }


    /*
     * 1.先使用connection.prepareStatement（一个带占位符？的sql语句）获得一个PreparedStatement实例statement。
     * 2.使用statement.setXXX(index,具体的值)设置占位符的值。
     * 3.调用statement.executeUpdate()直接执行；
     * 4.关闭statement。
     */

    @Test
    public void TestPreparedStatement() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://127.0.0.1:3306/myjavadb?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection(url, "root", "ldd123789dd.0");
            System.out.println(connection);


        } catch (SQLException e) {
            e.printStackTrace();
        }
        //String sql="insert into customers(id,name,birthday) values ('3','wanger','1984-3-12')";
        //String sql="delete  from customers where id='2'";
        if (connection != null) {
            try {
              /*  statement=connection.prepareStatement("insert into customers(id,name,birthday) values (?,?,?)");
               statement.setInt(1,2);
               statement.setString(2,"lisi");
               statement.setString(3,"1990-11-12");*/

                statement = connection.prepareStatement("delete  from customers where id=?");
                statement.setInt(1, 2);
                statement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void TestUpdateOperation() {


/*        String sql="delete from customers where id=?";  //删除
        DBUtils.update( sql, new Integer(3));*/

        String sql="insert into customers (id,name,birthday) values('8','er','1999-1-8')";
        DBUtils.update(sql);

    }

}
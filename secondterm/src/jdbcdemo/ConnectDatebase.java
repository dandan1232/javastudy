package jdbcdemo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectDatebase {
    @Test
    //使用com.mysql.jdbc.Drive方式连接mysql数据库。
    public void testDriver() {
        Driver driver = null;
        Connection connection = null;
        try {
            driver = new com.mysql.cj.jdbc.Driver();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://127.0.0.1:3306/myjavadb?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
        Properties pro = new Properties();
        pro.setProperty("user", "root");
        pro.setProperty("password", "ldd123789dd.0");
        try {
            connection = driver.connect(url, pro);
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
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
    //使用DriverManager方式连接mysql数据库。
    public void TestDriverManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/myjavadb?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, "root", "ldd123789dd.0");
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}

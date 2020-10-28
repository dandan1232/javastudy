package jdbcdemo;

import com.mysql.cj.jdbc.Driver;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Demo01_TestDriver {
    /* 最常见的一种数据库链接获取方式
     * 1.将数据库驱动程序加入项目
     * 2.调用Class.forName(驱动程序类名称)来加载对应数据库的驱动程序
     * 3.调用DriverManager.getConnection(url,username,password)来得到数据库连接
     * 4.关闭第三步获得的Connection（数据库连接）。
     */

    @Test
    public void testDriverManager() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://127.0.0.1:3306/myjavadb?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
        //String url="jdbc:mysql://localhost:3306/myjavadb";
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

    @Test
    public void testDriverManagerOptimized() {

        Connection connection = null;
        try {
            connection = DBUtils.getConnection();
            System.out.println(connection);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        DBUtils.closeResource(connection,null);
    }

    @Test
    /*
     * 直接使用数据库驱动程序的类实例来得到数据库链接，代码复用性不好，不建议使用
     * 1.直接通过数据库驱动中的实现类来得到Driver接口实例；
     * 2.通过Driver的connect方法得到数据库链接，
     *   参数为url和标示用户信息的properties实例（至少要包括user和password两个属性）;
     * 3.关闭第二步得到的数据库链接。
     */
    public void testDriver() {
        Driver driver = null;
        Connection connection = null;
        try {
            driver = new com.mysql.cj.jdbc.Driver();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://127.0.0.1:3306/myjavadb?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
        Properties prop = new Properties();
        prop.setProperty("user", "root");
        prop.setProperty("password", "ldd123789dd.0");
        try {
            connection = driver.connect(url, prop);
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

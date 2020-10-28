package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {

    public static Connection getConnection() throws ClassNotFoundException, SQLException{

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://127.0.0.1:3306/myjavadb?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";

        Connection connection=null;
        PreparedStatement statement=null;
        connection=DriverManager.getConnection(url, "root", "ldd123789dd.0");
        /*System.out.println(connection);*/

        return connection;
    }

    public static void closeResource(Connection connection,Statement statement){
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    public static void closeResource(Connection connection,Statement statement,ResultSet rs){
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
    public static int update(Connection connection,String sql,Object...objs){

        PreparedStatement statement = null;
        int code=0;
        try {
            statement = connection
                    .prepareStatement(sql);
            for(int i=0;i<objs.length;i++){
                statement.setObject(i+1, objs[i]);
            }
            code=statement.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        closeResource(null, statement);

        return code;

    }

    public static int update(String sql,Object...objs){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e2) {
            // TODO Auto-generated catch block
            e2.printStackTrace();
        }

        String url="jdbc:mysql://127.0.0.1:3306/myjavadb?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";

        Connection connection=null;

        try {
            connection=DriverManager.getConnection(url, "root", "ldd123789dd.0");
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        int code=0;
        PreparedStatement statement=null;
        try {
            statement = connection.prepareStatement(sql);
            for(int i=0;i<objs.length;i++){
                statement.setObject(i+1, objs[i]);
            }
            code=statement.executeUpdate();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        closeResource(connection, statement);

        return code;
    }
}

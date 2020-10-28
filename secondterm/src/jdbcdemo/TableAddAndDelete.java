package jdbcdemo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TableAddAndDelete {
    @Test
    public void TestStatement() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://127.0.0.1:3306/myjavadb?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(url, "root", "ldd123789dd.0");
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String sql1 = "insert into student_test(学号,姓名,出生日期,学期平均成绩) values ('19001','蛋宝','2000-11-08','90')";
        String sql2 = "insert into student_test(学号,姓名,出生日期,学期平均成绩) values ('19002','翠花','1998-05-12','89')";
        String sql3 = "insert into student_test(学号,姓名,出生日期,学期平均成绩) values ('19003','阿伟','1999-12-24','95')";
        String sql4 = "insert into student_test(学号,姓名,出生日期,学期平均成绩) values ('19004','阿绅','2000-04-17','93')";

        String sql5 = "delete from student where 学号='19002'";
        if (connection != null) {
            try {
                statement = connection.createStatement();
                System.out.println(statement.execute(sql1));
                System.out.println(statement.execute(sql2));
                System.out.println(statement.execute(sql3));
                System.out.println(statement.execute(sql4));
                System.out.println(statement.execute(sql5));
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
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void TestPreparedStatement() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/myjavadb?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT";
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection(url, "root", "ldd123789dd.0");
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (connection != null) {
            try {
                statement = connection.prepareStatement(
                        "insert into student_test(学号,姓名,出生日期,学期平均成绩)values(?,?,?,?)");
                statement.setInt(1, 19008);
                statement.setString(2, "婵妹");
                statement.setString(3, "1993-06-08");
                statement.setInt(4, 78);
                statement.executeUpdate();

/*                statement = connection.prepareStatement("delete from student where 学号=?");
                statement.setInt(1, 19003);
                statement.executeUpdate();*/
            } catch (SQLException e) {
                e.printStackTrace();
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
    }
}


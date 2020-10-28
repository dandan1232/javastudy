package jdbcdemo;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Check {
    @Test
    public void TestChenck(){
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet rs=null;
        try {
            connection=DBUtils.getConnection();
            statement=connection.prepareStatement("select 序号,标题名称,作者,创建时间 from music");
            rs=statement.executeQuery();

            while (rs.next()){
                System.out.println("---------------------");
                int 序号=rs.getInt(1);
                System.out.println(序号);
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getDate(4));
            }
        }catch (ClassNotFoundException| SQLException e){
            e.printStackTrace();
        }finally {
            DBUtils.closeResource(connection,statement,rs);
        }
    }
}

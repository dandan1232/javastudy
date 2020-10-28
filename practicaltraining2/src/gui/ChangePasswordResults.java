package gui;

import dao.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ChangePasswordResults {

	public boolean ChangePasswordResults(String chid) {
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		connection = DBUtils.getConnection();
		String sql = null;
		boolean a = false;
		try {
			statement = connection.createStatement();
			sql = "select id,gh,yhm,mm,sf,sex,age,phone from user";
			rs = statement.executeQuery(sql);
			int chid1 = Integer.parseInt(chid);
			for (int i = 0; rs.next(); i++) {
				int id = rs.getInt(1);
				String gh = rs.getString(2);
				String yhm = rs.getString(3);
				String mm = rs.getString(4);
				String sf = rs.getString(5);
				String sex = rs.getString(6);
				String age=rs.getString(7);
				String  phone=rs.getString(8);
				if (chid1 == id ) {
					a = true;
					break;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.closeResource(connection, statement, rs);
		}
		return a;
	}
}

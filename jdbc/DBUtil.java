package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException{
		String jdbcURL = "jdbc:mysql://localhost:3306/weekendbd";
		String id = "root";
		String password = "javahome";
		Connection con = DriverManager.getConnection(jdbcURL, id, password);
		return con;
	}
}

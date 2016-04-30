package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String jdbcURL = "jdbc:mysql://localhost:3306/weekendbd";
		String id = "root";
		String password = "javahome";
		Connection con = DriverManager.getConnection(jdbcURL, id, password);
		System.out.println(con.getClass());
	}
}

package jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) throws Exception {
		Connection con = DBUtil.getConnection();
		String createScript = "CREATE TABLE DEMO(id int(10), name varchar(20))";
		Statement stmt = con.createStatement();
		stmt.execute(createScript);
		System.out.println("Table created...");
	}
}

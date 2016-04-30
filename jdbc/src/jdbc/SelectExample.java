package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectExample {
	public static void main(String[] args) throws Exception {
		try (Connection con = DBUtil.getConnection()) {
			String insertSQL = "SELECT * FROM DEMO";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(insertSQL);
			while(rs.next()){
				System.out.println("ID "+rs.getInt("ID"));
				System.out.println("NAME "+rs.getString("NAME"));
			}
		}
	}
}
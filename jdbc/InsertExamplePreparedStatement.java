package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertExamplePreparedStatement {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);

		Connection con = DBUtil.getConnection();
		String insertSQL = "INSERT INTO DEMO(ID,NAME) VALUES(?,?)";
		PreparedStatement pstmt = con.prepareStatement(insertSQL);
		while (true) {
			System.out.println("Enter ID");
			int id = in.nextInt();
			System.out.println("Enter Name");
			String name = in.next();
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.executeUpdate();
			System.out.println("Record Inserted!!");
		}
	}
}

package jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteExample {
public static void main(String[] args) throws Exception {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter ID to delete");
	int id = in.nextInt();
	Connection con = DBUtil.getConnection();
	String insertSQL = "DELETE FROM DEMO WHERE ID="+id;
	Statement stmt = con.createStatement();
	stmt.executeUpdate(insertSQL);
	System.out.println("Record Deleted!!");
}
}

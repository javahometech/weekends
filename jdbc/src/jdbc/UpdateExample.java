package jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateExample {
public static void main(String[] args) throws Exception {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter ID to Update");
	int id = in.nextInt();
	System.out.println("Enter Name to Update");
	String name = in.next();
	try(Connection con = DBUtil.getConnection()){
		String insertSQL = "Update DEMO SET name ='"+name+"' WHERE ID="+id;
		Statement stmt = con.createStatement();
		stmt.executeUpdate(insertSQL);
	}
	System.out.println("Record Updated!!");
}
}

package jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class InsertExample {
public static void main(String[] args) throws Exception {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter ID");
	int id = in.nextInt();
	System.out.println("Enter Name");
	String name = in.next();
	Connection con = DBUtil.getConnection();
	String insertSQL = "INSERT INTO DEMO(ID,NAME) VALUES("+id+",'"+name+"')";
	Statement stmt = con.createStatement();
	stmt.executeUpdate(insertSQL);
	System.out.println("Record Inserted!!");
}
}

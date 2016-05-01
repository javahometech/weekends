package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertImage {
public static void main(String[] args) throws Exception {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Path of your image");
	String imgPath = in.next();
	System.out.println("Enter ID");
	int id = in.nextInt();
	FileInputStream fis = new FileInputStream(imgPath);
	Connection con = DBUtil.getConnection();
	String insertImg = "INSERT INTO MY_IMAGES(ID,MY_IMAGE) VALUES(?,?)";
	PreparedStatement pstmt = con.prepareStatement(insertImg);
	pstmt.setInt(1,id);
	pstmt.setBinaryStream(2, fis, fis.available());
	pstmt.executeUpdate();
	System.out.println("Image stored!");
}
}

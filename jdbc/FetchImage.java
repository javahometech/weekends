package jdbc;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class FetchImage {
public static void main(String[] args) throws Exception {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter ID");
	int id = in.nextInt();
	Connection con = DBUtil.getConnection();
	String fetchImg = "SELECT MY_IMAGE FROM MY_IMAGES WHERE ID=?";
	PreparedStatement pstmt = con.prepareStatement(fetchImg);
	pstmt.setInt(1,id);
	ResultSet rs = pstmt.executeQuery();
	rs.next();
	InputStream fis = rs.getBinaryStream(1);
	FileOutputStream fos = new FileOutputStream("C:/img_from_db.png");
	int data;
	while((data = fis.read()) != -1){
		fos.write(data);
	}
	fis.close();
	fos.close();
	System.out.println("Image Fetched!");
}
}

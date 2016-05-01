package jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class BatchUpdateImproved {
	public static void main(String[] args) throws Exception {
		// Get DB Connection
	    Connection con = DBUtil.getConnection();
	    String insertSQL = "INSERT INTO DEMO(ID,NAME) VALUES(?,?)";
		PreparedStatement pstmt = con.prepareStatement(insertSQL);
		FileReader fr = new FileReader("C:/records.txt");
	    BufferedReader br = new BufferedReader(fr);
	    int recordCount=0;
	    String record;
	    while((record = br.readLine()) != null){
	    	String[] array = record.split(",");
	    	
	    	pstmt.setInt(1, Integer.parseInt(array[0]));
			pstmt.setString(2, array[1]);
			pstmt.addBatch();
			recordCount++;
			if(recordCount %250 == 0){
				pstmt.executeBatch();
			}
	    }
		pstmt.executeBatch();
	}
}

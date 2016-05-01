package jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BatchUpdate {
	public static void main(String[] args) throws Exception {
		Map<Integer, String> records = new HashMap<>();
		FileReader fr = new FileReader("C:/records.txt");
	    BufferedReader br = new BufferedReader(fr);
	    String record;
	    while((record = br.readLine()) != null){
	    	String[] array = record.split(",");
	    	records.put(Integer.parseInt(array[0]), array[1]);
	    }
	    
	    // Get DB Connection
	    Connection con = DBUtil.getConnection();
	    String insertSQL = "INSERT INTO DEMO(ID,NAME) VALUES(?,?)";
		PreparedStatement pstmt = con.prepareStatement(insertSQL);
		
		Set<Integer> keys = records.keySet();
		int recordCount=0;
		for (Integer key : keys) {
			pstmt.setInt(1, key);
			pstmt.setString(2, records.get(key));
			pstmt.addBatch();
			recordCount++;
			if(recordCount %250 == 0){
				pstmt.executeBatch();
			}
		}
		pstmt.executeBatch();
	}
}

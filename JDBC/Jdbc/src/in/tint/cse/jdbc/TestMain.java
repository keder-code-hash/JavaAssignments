package in.tint.cse.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TreeMap;

public class TestMain {
	public static PreparedStatement createTable(String tableName,Connection con) {
		PreparedStatement prpStmt=null;
		try {
			prpStmt=con.prepareStatement("create table ?");
			prpStmt.setString(1, tableName);
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		finally {
			
		}
		return null;
		
	}
	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet rSet=null;
		
		try {  
			connection=GetConnection.getConnection(); 
			
//			createTable("user", connection).execute();
			preparedStatement=connection.prepareStatement("select * from city limit ?;");
			preparedStatement.setInt(1, 10);
			rSet=preparedStatement.executeQuery();
			
			while(rSet.next()) {
				System.out.println(rSet.getString("ID"));
				System.out.println(rSet.getString("Name")); 
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			try {
				preparedStatement.close();
			} catch (SQLException e) { 
				e.printStackTrace();
			}
			try {
				rSet.close();
			} catch (SQLException e) { 
				e.printStackTrace();
			}
		}  
	}
}

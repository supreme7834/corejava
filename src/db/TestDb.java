package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDb {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//getConnection(url, username, password)
		Connection dbObject = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb6am", "root", null);
		
		//======================== insert sql ===========================
//		String sql = "insert into user(username,password)values('hari','hari@123')";
//		
//		Statement stm = dbObject.createStatement();
//		stm.execute(sql);
//		
//		dbObject.close();
//		System.out.println("added success");
		
		//======================== select sql ===========================
//		// 1. write sql
////			String  sql = " select * from user ";
//			String  sql = " select * from user where username = 'admin' and password= 'admin' ";
//			
//		// 2. create statement
//			Statement stm = dbObject.createStatement();
//			
//		// 3. execute sql(for write sql)/ executeQuery sql(for read sql)
//			ResultSet rs = stm.executeQuery(sql);
//			
//			while(rs.next()) {
//				
//				System.out.println("Id = "+rs.getInt("id"));
//				System.out.println("UserName = "+rs.getString("username"));
//				System.out.println("Password = "+rs.getString("password"));
//				System.out.println("====================");
//				
//			}
//			
//		// 4. db close 
//			dbObject.close();
		
		
		//============================= search sql =============================
//				String sql = " select * from user where username like '%a%' order by username desc";
//				
//				Statement stm = dbObject.createStatement();
//				ResultSet rs = stm.executeQuery(sql);
//				
//				while(rs.next()) {
//					
//					System.out.println("Id = "+rs.getInt("id"));
//					System.out.println("UserName = "+rs.getString("username"));
//					System.out.println("Password = "+rs.getString("password"));
//					System.out.println("==================");
//					
//				}
//				
//				dbObject.close();
		
		
		//============================= count sql ==============================
		String sql = " select COUNT(id) as total_user from user where username like '%a%' ";
		
		Statement stm = dbObject.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		rs.next();
		
		System.out.println("Total User = "+rs.getInt("total_user"));
				
					 
		//============================= update sql =============================
////			String sql = "update user set password = 'YYY900' where id = 3 ";
//		
//			String newPsw = "TT@123";
//			int uid = 3;
//			
//			String sql = "update user set password ='"+newPsw+"' where id = '"+uid+"' ";
//					
//			Statement stm = dbObject.createStatement();
//			stm.execute(sql);
//			
//			dbObject.close();
//			System.out.println("update success");
		
		
		//============================= delete sql =============================
//			String sql = " delete from user where id = 2 ";
//			
//			Statement stm = dbObject.createStatement();
//			stm.execute(sql);
//			
//			dbObject.close();
//			System.out.println("delete success");
		
		
		
		
	}

}

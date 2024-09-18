package thong.dev;

import java.sql.DriverManager;

public class MainApp {
	
	static final String DB_URL = "jdbc:mysql://localhost/shop";
	static final String DB_USER  = "root";
	static final String DB_PASS  = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			System.out.println("Ket noi thanh cong");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

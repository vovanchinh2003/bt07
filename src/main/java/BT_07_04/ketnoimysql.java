package BT_07_04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ketnoimysql {
		 public static void main(String[] args) {
		        String url = "jdbc:mysql://localhost:3306/test";
		        String username = "root";
		        String password = "chinh2003";

		        try {
		            Connection conn = DriverManager.getConnection(url, username, password);
		            System.out.println("Ket noi thanh cong");

		            // Thực hiện các thao tác với cơ sở dữ liệu ở đây

		            conn.close();
		            System.out.println("Da dong");
		        } catch (SQLException e) {
		            System.out.println("ko the " + e.getMessage());
		        }
		    }
}
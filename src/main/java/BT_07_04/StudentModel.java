package BT_07_04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentModel {

	 public List<Student> getAllStudent() {
	        List<Student> students = new ArrayList<>();

	        try {
	            // Kết nối tới cơ sở dữ liệu MySQL
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "chinh2003");

	            // Truy vấn cơ sở dữ liệu để lấy danh sách sản phẩm
	            String query = "SELECT * FROM student";
	            Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery(query);

	            // Lặp qua kết quả và tạo các đối tượng Product
	            while (rs.next()) {
	            	Student student = new Student();
	            	student.setId(rs.getInt("id"));
	            	student.setHoten(rs.getString("hoten"));
	            	student.setNgaysinh(rs.getDate("ngaysinh"));
	            	student.setDienthoai(rs.getString("dienthoai"));
	            	student.setGioitinh(rs.getString("gioitinh"));
	            	students.add(student);
	            }
	            // Đóng kết nối và các tài nguyên
	            rs.close();
	            stmt.close();
	            conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return students;
	    }

}

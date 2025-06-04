// package sample;
import java.sql.*;

public class JDBCTest {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb", "root", "password");

			String insertSQL = "REPLACE INTO students (id, name) VALUES (?, ?)";
			PreparedStatement pstmt = con.prepareStatement(insertSQL);

			Object[][] students = {
					{1, "Alice"},
					{2, "Bob"},
					{3, "Charlie"},
					{4, "David"},
					{5, "Eve"},
					{6, "Fiona"} 
			};
			for(Object[] student : students) {
				pstmt.setInt(1, (int) student[0]);
				pstmt.setString(2, (String) student[1]); // Corrected index
				pstmt.executeUpdate();
			}

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM students");

			System.out.println("Student List: ");
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name"));
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
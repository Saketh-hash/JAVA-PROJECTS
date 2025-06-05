package saketh;

import java.sql.*;

public class SimpleJDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studentdb", "root", "password");

			String insertSQL = "REPLACE INTO students (id, name, marks) VALUES (?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(insertSQL);

			Object[][] students = {
					{1, "Alice", 99},
					{2, "Bob", 95},
					{3, "Charlie", 94},
					{4, "David", 90},
					{5, "Eve", 88},
					{6, "Fiona", 100} 
			};
			for(Object[] student : students) {
				pstmt.setInt(1, (int) student[0]);
				pstmt.setString(2, (String) student[1]); // Corrected index
				pstmt.setInt(3, (int) student[2]);
				pstmt.executeUpdate();
			}

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM students");

			System.out.println("Student List: ");
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getInt("marks"));
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

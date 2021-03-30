package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDB {
	public static Connection getJDBCConnection() {
		final String url = "jdbc:mysql://localhost:3306/strutsprojetc";
		final String user = "root";
		final String password = "";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				return DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

// in this example, this class contains variables URL, USERID, USERPASSWORD
// which are required to be authenticated with a database

public class jdbcStuff {
	private static final String URL = "jdbc:mysql://localhost:3306/dbname"; // db name!
	private static final String USERID = "dbadminuserid"; // database admin user id
	private static final String USERPASSWORD = "dbadminpassword";
	private static final String JDBCDRIVER = "com.mysql.jdbc.Driver";

	protected static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(JDBCDRIVER); 
			conn = (Connection) DriverManager.getConnection(URL, USERID, USERPASSWORD);
			return conn;
		} catch (SQLException e) {
			System.out.println("Exception Message: " + e.getMessage());
			System.out.println("Error Code: " + e.getErrorCode());
			return null;
		}
	}
}

/*
	This example code demonstrates how to connect to a MySQL database using the 
	JDBC API in Java. The ''ConnectMySqlWithJdbc'' class provides a method called 
	''getConnection().'' If your Java application needs to use another database other 
	than MySQL, your code should be a little different. */
	

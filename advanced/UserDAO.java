// UserDAO.java
import java.sql.*;
public class UserDAO {
	private static final String URL = "jdbc:mysql://localhost:3306/dbname"; // !!
	private static final String USERID = "dbadminid";
	private static final String PASSWORD = "dbadminpassword";

	public User getUser(String username, String password){
		User user = null;
		try (Connection connection = DriverManager.getConnection(URL, USERID, PASSWORD)){
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
			statement.setString(1,username);
			statement.setString(2,password);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				user= new User();
				user.setId(resultSet.getInt("id"));
				user.setUsername(resultSet.getString("username"));
				user.setPassword(resultSet.getString("password"));
			}
		} catch (SQLException e){
			e.printStackTrace();
		}
		return user;
	}
}

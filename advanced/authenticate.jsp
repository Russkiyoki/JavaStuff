<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Check Login</title>
    </head>
    <body>
        <%
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            Connection conn = null;
            PreparedStatement statement = null;
            ResultSet results = null;
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "dbadminid", "dbadminpassword");
                String query = "SELECT * FROM users WHERE username = ? AND password = ?";
                statement = conn.prepareStatement(query);
                statement.setString(1, username);
                statement.setString(2, password);
                results = statement.executeQuery();
                
                if(results.next()) {
                    out.println("Welcome " + username);
                } else {
                    out.println("Invalid credentials. Please try again.");
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (results != null)
                        results.close();
                    if (statement != null)
                        statement.close();
                    if (conn != null)
                        conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        %>
    </body>
</html>

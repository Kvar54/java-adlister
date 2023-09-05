import java.sql.*;

public class CreateDatabaseUsersAndAds {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/mysql"; // Connect to the MySQL system database
        String user = "root";
        String password = "codeup";


        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS adlister_db";
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(createDatabaseSQL);
            }

            String createUserSQL = "CREATE USER 'admin'@'localhost' IDENTIFIED BY 'password'";
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(createUserSQL);
            }


            String grantPermissionsSQL = "GRANT ALL PRIVILEGES ON adlister_db.* TO 'admin'@'localhost'";
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(grantPermissionsSQL);
            }
            System.out.println("Database and user created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
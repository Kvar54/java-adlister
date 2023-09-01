//  1. create a class called 'JDBCEmployees'
//  2. in this class, create a main method that prints the first 10 employee first name names from the employees DB
//  - a specific table from a given database can be queried directly with the syntax database_name.table_name
//  3. refactor the code to print out each name to instead store each of the 10 names in an array list



import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;


public class JDBCEmployees {
    public static void main(String[] args) throws SQLException {

        DriverManager.registerDriver(new Driver());

        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "codeup"
        );
//
//        Statement stmt = conn.createStatement();
//ResultSet rs = stmt.executeQuery("SELECT first_name")




    }
}

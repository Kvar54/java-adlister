package daos;

import com.mysql.cj.jdbc.Driver;
import models.Contact;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLContactsDao implements users {

    private Connection connection;

    public MySQLContactsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
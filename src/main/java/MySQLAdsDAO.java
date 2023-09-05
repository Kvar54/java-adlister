import daos.config;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDAO implements Ads{

    private Connection conection;

    public MySQLAdsDAO(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
        this.conection = DriverManager.getConnection (
                config.getUrl(),
                config.getUser(),
                config.getUser()
        );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        String query = " SELECT * FROM ads";
        try {
            Statement statement  = conection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                Ad ad = new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );

                ads.add(ad);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        Long lastInsertedId = 0L;
        try {
            Statement statement = conection.createStatement();
            String insertQuery = String.format("INSERT INTO ads (user_id, title, description VALUES (%d, '%s', '%s')",
            ad.getUserId(), ad.getTitle(), ad.getDescription());

statement.executeUpdate(insertQuery, statement.RETURN_GENERATED_KEYS);
ResultSet rs = statement.getGeneratedKeys();
rs.next();
lastInsertedId = rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lastInsertedId;
    }
}


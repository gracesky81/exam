package gracesky;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by gracesky on 2016. 5. 16..
 */
public class NUserDao extends UserDao {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection nConn = DriverManager.getConnection("jdbc:mysql://localhost/study", "study", "study");
        return nConn;
    }
}
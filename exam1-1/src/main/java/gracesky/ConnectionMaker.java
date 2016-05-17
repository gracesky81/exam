package gracesky;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by gracesky on 2016. 5. 17..
 */
public interface ConnectionMaker {
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException;
}

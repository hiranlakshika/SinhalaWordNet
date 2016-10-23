package WordNet.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hiran
 */
public class DBConnection {

    private static Connection connection;

    /**
     *
     * @return @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection == null) {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/WordNetModel?useUnicode=true&characterEncoding=UTF-8";
            connection = DriverManager.getConnection(url, "root", "");
        }
        return connection;
    }
}

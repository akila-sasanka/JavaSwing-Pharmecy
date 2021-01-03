package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static DBConnection dbconnection;
    private Connection connection;
    private DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost/pharmacy", "root", "akila1230");
        
    }
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        return (dbconnection==null)?(dbconnection=new DBConnection()):dbconnection;
    }
    public Connection getConnection(){
        return connection;
    }
}

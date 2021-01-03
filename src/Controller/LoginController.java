package Controller;

import DBConnection.DBConnection;
import Model.LoginModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {
    private Connection con;

    public LoginController() throws ClassNotFoundException, SQLException {
        con=DBConnection.getInstance().getConnection();
    }
    public ResultSet login(LoginModel m) throws SQLException{
        ResultSet st=con.createStatement().executeQuery("select * from login");
        return st;
    }
}

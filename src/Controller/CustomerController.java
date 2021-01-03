package Controller;

import DBConnection.DBConnection;
import Model.CustomerModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.ObservableList;

public class CustomerController {
    private Connection con;
    public CustomerController() throws ClassNotFoundException, SQLException {
        con=DBConnection.getInstance().getConnection();
    }
    public boolean savePation(CustomerModel m) throws SQLException{
        PreparedStatement st=con.prepareStatement("insert into pation values(?,?,?,?,?)");
        con.setAutoCommit(false);
        st.setString(1,m.getPationName());
        st.setString(2,m.getPationDob());
        st.setString(3,m.getPationId());
        st.setString(4,m.getPationAddress());
        st.setString(5,m.getPationTel());
        if(st.executeUpdate()>0) {
            con.commit();
            return true;
        }
        con.rollback();
        return false;
    }
    public ResultSet getCustomers() throws SQLException{
      
         ResultSet set= con.createStatement().executeQuery("select * from pation");
         return set;
    }
    public boolean deleteCustomer(String id) throws SQLException{
        return con.createStatement().executeUpdate("delete from pation where pation_id='"+id+"'")>0;
    }
   public boolean updateCustomer(CustomerModel m) throws SQLException{
       PreparedStatement st=con.prepareStatement("update pation set pation_name=?,pation_dob=?,pation_address=?,"
               + "pation_tel=? where pation_id=?");
        con.setAutoCommit(false);
       st.setString(1, m.getPationName());
       st.setString(2, m.getPationDob());
       st.setString(3, m.getPationAddress());
       st.setString(4, m.getPationTel());
       st.setString(5, m.getPationId());
        if(st.executeUpdate()>0) {
            con.commit();
            return true;
        }
        con.rollback();
        return false;
   }
}

package Controller;

import DBConnection.DBConnection;
import Model.SuplierModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SuplierController {

    public SuplierController(){
        try {
            con=DBConnection.getInstance().getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SuplierController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SuplierController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private Connection con;
    public boolean saveSuplier(SuplierModel s) throws SQLException{
        
        PreparedStatement st=con.prepareStatement("insert into suplier values(?,?,?,?,?)");
        con.setAutoCommit(false);
        st.setString(1, s.getSuplierName());
        st.setString(2, s.getSuplierId());
        st.setString(3, s.getSuplierAddress());
        st.setString(4, s.getSuplierTel());
        st.setString(5, s.getSuplierCompany());
         if(st.executeUpdate()>0) {
            con.commit();
            return true;
        }
        con.rollback();
        return false;
    }
    public ResultSet supliers() throws SQLException{
        ResultSet set=con.createStatement().executeQuery("select * from suplier");
        return set;
    }
    public boolean updateSuplier(SuplierModel m) throws SQLException{
        PreparedStatement st=con.prepareStatement("update suplier set suplier_name=?,suplier_address=?,"
                + "suplier_tel=?,suplier_company=? where suplier_id=?");
        con.setAutoCommit(false);
        st.setString(1, m.getSuplierName());
        st.setString(2, m.getSuplierAddress());
        st.setString(3, m.getSuplierTel());
        st.setString(4, m.getSuplierCompany());
        st.setString(5, m.getSuplierId());
         if(st.executeUpdate()>0) {
            con.commit();
            return true;
        }
        con.rollback();
        return false;
    }
     public boolean deleteSuplier(String id) throws SQLException{
        return con.createStatement().executeUpdate("delete from suplier where suplier_id='"+id+"'")>0;
    }
}

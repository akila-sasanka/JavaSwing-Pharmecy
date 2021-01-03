package Controller;

import DBConnection.DBConnection;
import Model.MedicinModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicinController {

    public MedicinController() throws ClassNotFoundException, SQLException {
        con=DBConnection.getInstance().getConnection();
    }
     private Connection con;
     public boolean saveMedicin(MedicinModel m) throws SQLException{
         PreparedStatement st=con.prepareStatement("insert into medicin values(?,?,?,?,?,?)");
         con.setAutoCommit(false);
         st.setString(1, m.getMedicinName());
         st.setString(2, m.getMedicinCategory());
         st.setString(3, m.getMedicinId());
         st.setString(4, m.getMedicinMadeBy());
         st.setString(5, String.valueOf(m.getMedicinPrice()));
         st.setString(6, m.getMadicinQuantityOnHand());
          if(st.executeUpdate()>0) {
            con.commit();
            return true;
        }
        con.rollback();
        return false;
     }
     public ResultSet getMedicins() throws SQLException{
         ResultSet set=con.createStatement().executeQuery("select * from medicin");
         return set;
     }
     public ResultSet searchMedicin(String id) throws SQLException{
         ResultSet set=con.createStatement().executeQuery("SELECT * FROM medicin WHERE medicin_name LIKE'%"+id+"%'");
         return set;
     }
     public double getPrice(String name) throws SQLException{
         ResultSet st=con.createStatement().executeQuery("select medicin_price from medicin "
                 + "where medicin_name='"+name+"'");
         while(st.next()){
             return st.getDouble(1);
         }
         return 0;
     }
     public ResultSet getMedicinDetails(String id) throws SQLException{
         ResultSet set=con.createStatement().executeQuery("SELECT * FROM medicin WHERE medicin_name='"+id+"'");
         return set;
     }
     public boolean updateMedicin(MedicinModel m) throws SQLException{
         PreparedStatement st=con.prepareStatement("update medicin set medicin_name=?,medicin_category=?,made_by=?,"
                 + "medicin_price=?,quantity_on_hand=? where medicin_id=?");
         con.setAutoCommit(false);
         st.setString(1, m.getMedicinName());
         st.setString(2, m.getMedicinCategory());
         st.setString(3, m.getMedicinMadeBy());
         st.setString(4, String.valueOf(m.getMedicinPrice()));
         st.setString(5, m.getMadicinQuantityOnHand());
         st.setString(6, m.getMedicinId());
          if(st.executeUpdate()>0) {
            con.commit();
            return true;
        }
        con.rollback();
        return false;
     }
      public boolean deleteMedicin(String id) throws SQLException{
        return con.createStatement().executeUpdate("delete from medicin where medicin_id='"+id+"'")>0;
    }
}

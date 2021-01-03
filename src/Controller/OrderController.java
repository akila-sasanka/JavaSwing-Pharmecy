package Controller;

import DBConnection.DBConnection;
import Model.OrderModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderController {
    private Connection con;

    public OrderController() throws ClassNotFoundException, SQLException {
        con=DBConnection.getInstance().getConnection();
    }
    public ResultSet getOrders() throws SQLException{
        ResultSet st=con.createStatement().executeQuery("select * from orders");
        return st;
    }
    public boolean saveOrder(OrderModel o) throws SQLException{
        PreparedStatement st=con.prepareStatement("insert into orders (order_id,suplier_id,medicin_id,quantity)"
                + " values(?,?,?,?)");
        con.setAutoCommit(false);
        st.setString(1,o.getOrderId());
        st.setString(2,o.getSuplierId());
        st.setString(3,o.getMedicinId());
        st.setString(4,o.getQuantity());
         if(st.executeUpdate()>0) {
            con.commit();
            return true;
        }
        con.rollback();
        return false;
    }
      public boolean deleteOrder(String id) throws SQLException{
        return con.createStatement().executeUpdate("delete from orders where order_id='"+id+"'")>0;
    }
}

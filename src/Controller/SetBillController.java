package Controller;

import DBConnection.DBConnection;
import Model.SetBillModel;
import static com.sun.javafx.css.SizeUnits.S;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SetBillController {
    private Connection con;

    public SetBillController() throws ClassNotFoundException, SQLException {
        con=DBConnection.getInstance().getConnection();
    }
   
    public boolean AddOrder(SetBillModel m) throws SQLException{
        PreparedStatement s=con.prepareStatement("insert into customerorder ( order_id, pation_id) values(?,?)");
        con.setAutoCommit(false);
        s.setString(1, m.getOrderId());
        s.setString(2, m.getPationId());
         if(s.executeUpdate()>0) {
            con.commit();
            return true;
        }
        con.rollback();
        return false;
    }
    
    public boolean AddOrderDetail(SetBillModel m) throws SQLException{
        PreparedStatement s=con.prepareStatement("insert into orderdetails  values(?,?,?)");
        con.setAutoCommit(false);
       int count=0;
        for (int i = 0; i < m.getMedicin().size(); i++) {
             s.setString(1, m.getOrderId());
             s.setString(2, m.getMedicin().get(i).getMedicinId());
             s.setString(3, m.getMedicin().get(i).getMadicinQuantityOnHand());
         if(s.executeUpdate()>0){
             count++;
             con.commit();
         }
        }
        con.rollback();
        return (count==m.getMedicin().size());
    }
    
    public boolean AddBill(SetBillModel m) throws SQLException{
    PreparedStatement s=con.prepareStatement("insert into sell (order_id,doctor_reg_no,amount,pay_amount, blance) values(?,?,?,?,?)");
    con.setAutoCommit(false);
     s.setString(1, m.getOrderId());
     s.setString(2, m.getDoctorRegNo());
     s.setDouble(3, m.getAmount());
     s.setDouble(4, m.getPayment());
     s.setDouble(5, m.getBlance());
      if(s.executeUpdate()>0) {
            con.commit();
            return true;
        }
        con.rollback();
        return false;
    }
    public ResultSet getSells() throws SQLException{
        ResultSet st=con.createStatement().executeQuery("select sell.sell_id,sell.order_id,sell.amount,customerorder.order_date,customerorder.pation_id "
                + "from customerorder LEFT JOIN sell on sell.order_id=customerorder.order_id");
        return st;
    }
}

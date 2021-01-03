package Model;

import java.util.ArrayList;

public class SetBillModel {
   String pationId;
   String orderId;
   String sellId;
   String doctorRegNo;
   String quantity;
   double amount;
   double payment;
   double blance;
  
   ArrayList<MedicinModel> medicin;

    public SetBillModel(String orderId, String doctorRegNo, double amount, double payment, double blance) {
        this.orderId = orderId;
        this.doctorRegNo = doctorRegNo;
        this.amount = amount;
        this.payment = payment;
        this.blance = blance;
    }



    public SetBillModel(String pationId, String orderId) {
        this.pationId = pationId;
        this.orderId = orderId;
    }
    
    public SetBillModel(String orderId, ArrayList<MedicinModel> medicin) {
        this.orderId = orderId;
        this.medicin = medicin;
    }

    public String getPationId() {
        return pationId;
    }

    public void setPationId(String pationId) {
        this.pationId = pationId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDoctorRegNo() {
        return doctorRegNo;
    }

    public void setDoctorRegNo(String doctorRegNo) {
        this.doctorRegNo = doctorRegNo;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getBlance() {
        return blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }

    public ArrayList<MedicinModel> getMedicin() {
        return medicin;
    }

    public void setMedicin(ArrayList<MedicinModel> medicin) {
        this.medicin = medicin;
    }

    public String getSellId() {
        return sellId;
    }

    public void setSellId(String sellId) {
        this.sellId = sellId;
    }
    
}

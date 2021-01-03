package Model;
public class OrderModel {
    String orderId;
    String suplierId;
    String medicinId;
    String quantity;

    public OrderModel(String orderId, String suplierId, String medicinId, String quantity) {
        this.orderId = orderId;
        this.suplierId = suplierId;
        this.medicinId = medicinId;
        this.quantity = quantity;
    }
   
    
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMedicinId() {
        return medicinId;
    }

    public void setMedicinId(String medicinId) {
        this.medicinId = medicinId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSuplierId() {
        return suplierId;
    }

    public void setSuplierId(String suplierId) {
        this.suplierId = suplierId;
    }
    
    
    
}

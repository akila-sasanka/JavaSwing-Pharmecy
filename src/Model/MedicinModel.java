/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Sasanka
 */
public class MedicinModel {
    String medicinName;
    String medicinCategory;
    String medicinId;
    String medicinMadeBy;
    double medicinPrice;
    String madicinQuantityOnHand;

    public MedicinModel(String medicinName, String medicinCategory, String medicinId, String medicinMadeBy, double medicinPrice, String madicinQuantityOnHand) {
        this.medicinName = medicinName;
        this.medicinCategory = medicinCategory;
        this.medicinId = medicinId;
        this.medicinMadeBy = medicinMadeBy;
        this.medicinPrice = medicinPrice;
        this.madicinQuantityOnHand = madicinQuantityOnHand;
    }

    public String getMedicinName() {
        return medicinName;
    }

    public void setMedicinName(String medicinName) {
        this.medicinName = medicinName;
    }

    public String getMedicinCategory() {
        return medicinCategory;
    }

    public void setMedicinCategory(String medicinCategory) {
        this.medicinCategory = medicinCategory;
    }

    public String getMedicinId() {
        return medicinId;
    }

    public void setMedicinId(String medicinId) {
        this.medicinId = medicinId;
    }

    public String getMedicinMadeBy() {
        return medicinMadeBy;
    }

    public void setMedicinMadeBy(String medicinMadeBy) {
        this.medicinMadeBy = medicinMadeBy;
    }

    public double getMedicinPrice() {
        return medicinPrice;
    }

    public void setMedicinPrice(double medicinPrice) {
        this.medicinPrice = medicinPrice;
    }

    public String getMadicinQuantityOnHand() {
        return madicinQuantityOnHand;
    }

    public void setMadicinQuantityOnHand(String madicinQuantityOnHand) {
        this.madicinQuantityOnHand = madicinQuantityOnHand;
    }

 
}

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
public class SuplierModel {
    String suplierName;
    String suplierId;
    String suplierAddress;
    String suplierTel;
    String suplierCompany;

    public SuplierModel(String suplierName, String suplierId, String suplierAddress, String suplierTel, String suplierCompany) {
        this.suplierName = suplierName;
        this.suplierId = suplierId;
        this.suplierAddress = suplierAddress;
        this.suplierTel = suplierTel;
        this.suplierCompany = suplierCompany;
    }

    public String getSuplierName() {
        return suplierName;
    }

    public void setSuplierName(String suplierName) {
        this.suplierName = suplierName;
    }

    public String getSuplierId() {
        return suplierId;
    }

    public void setSuplierId(String suplierId) {
        this.suplierId = suplierId;
    }

    public String getSuplierAddress() {
        return suplierAddress;
    }

    public void setSuplierAddress(String suplierAddress) {
        this.suplierAddress = suplierAddress;
    }

    public String getSuplierTel() {
        return suplierTel;
    }

    public void setSuplierTel(String suplierTel) {
        this.suplierTel = suplierTel;
    }

    public String getSuplierCompany() {
        return suplierCompany;
    }

    public void setSuplierCompany(String suplierCompany) {
        this.suplierCompany = suplierCompany;
    }
     
    
}

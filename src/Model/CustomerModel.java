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
public class CustomerModel {
    String pationName;
    String pationDob;
    String pationId;
    String pationAddress;
    String pationTel;

    public CustomerModel(String pationName, String pationDob, String pationId, String pationAddress, String pationTel) {
        this.pationName = pationName;
        this.pationDob = pationDob;
        this.pationId = pationId;
        this.pationAddress = pationAddress;
        this.pationTel = pationTel;
    }

    public String getPationName() {
        return pationName;
    }

    public void setPationName(String pationName) {
        this.pationName = pationName;
    }

    public String getPationDob() {
        return pationDob;
    }

    public void setPationDob(String pationDob) {
        this.pationDob = pationDob;
    }

    public String getPationId() {
        return pationId;
    }

    public void setPationId(String pationId) {
        this.pationId = pationId;
    }

    public String getPationAddress() {
        return pationAddress;
    }

    public void setPationAddress(String pationAddress) {
        this.pationAddress = pationAddress;
    }

    public String getPationTel() {
        return pationTel;
    }

    public void setPationTel(String pationTel) {
        this.pationTel = pationTel;
    }
       
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veiw;

import Controller.CustomerController;
import Model.CustomerModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sasanka
 */
public class AddCustomer extends javax.swing.JFrame {
    boolean isEdite=false;
    /**
     * Creates new form CustomerVeiw
     */
    public AddCustomer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPationName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPationDob = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPationId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPationAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPationTel = new javax.swing.JTextField();
        btnClearCustomer = new javax.swing.JButton();
        btnSaveCustomer = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 720, -1));

        jPanel3.setBackground(new java.awt.Color(46, 65, 80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 130, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 70));

        txtPationName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPationNameActionPerformed(evt);
            }
        });
        txtPationName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPationNameKeyPressed(evt);
            }
        });
        jPanel1.add(txtPationName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 210, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Pation Dob");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, 20));

        txtPationDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPationDobActionPerformed(evt);
            }
        });
        jPanel1.add(txtPationDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Pation ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 20));

        txtPationId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPationIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtPationId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 210, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Pation Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 110, 20));

        txtPationAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPationAddressActionPerformed(evt);
            }
        });
        jPanel1.add(txtPationAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 210, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Pation Tel");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 100, 20));
        jPanel1.add(txtPationTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 210, -1));

        btnClearCustomer.setBackground(new java.awt.Color(37, 51, 224));
        btnClearCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClearCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnClearCustomer.setText("Clear");
        btnClearCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearCustomerActionPerformed(evt);
            }
        });
        jPanel1.add(btnClearCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 110, 30));

        btnSaveCustomer.setBackground(new java.awt.Color(37, 51, 224));
        btnSaveCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSaveCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveCustomer.setText("Save");
        btnSaveCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCustomerActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 110, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Pation Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearCustomerActionPerformed
        try {
            TblCustomer c=new TblCustomer();
            c.setVisible(true);
            this.setVisible(false);
            c.setDefaultCloseOperation(3);
            // TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnClearCustomerActionPerformed

    private void btnSaveCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCustomerActionPerformed
        try {
         
           CustomerModel cm=new CustomerModel(txtPationName.getText(), txtPationDob.getText(),
                    txtPationId.getText(), txtPationAddress.getText(), txtPationTel.getText());
            if (isNull()) {
                JOptionPane.showMessageDialog(null, "Fill the all feild");
                ClearTextcache();
                
                return;
            }else{
                try {
                    if(isEdite){
                        if(new CustomerController().updateCustomer(cm)){
                        JOptionPane.showMessageDialog(null,"Update Sucsess");
                        ClearTextcache();
                        TblCustomer c=new TblCustomer();
                        c.setVisible(true);
                        this.setVisible(false);
                        c.setDefaultCloseOperation(3);
                        return;
                        }
                    }
                    if (new CustomerController().savePation(cm)) {
                        JOptionPane.showMessageDialog(null, "Success");
                    }else{
                        JOptionPane.showMessageDialog(null, "Fail");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
                }
                ClearTextcache();
            }
            TblCustomer c=new TblCustomer();
            c.setVisible(true);
            this.setVisible(false);
            c.setDefaultCloseOperation(3);
            // TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveCustomerActionPerformed

    private void txtPationNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPationNameKeyPressed
       
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPationNameKeyPressed

    private void txtPationNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPationNameActionPerformed
        txtPationDob.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPationNameActionPerformed

    private void txtPationDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPationDobActionPerformed
        txtPationId.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPationDobActionPerformed

    private void txtPationIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPationIdActionPerformed
        txtPationAddress.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPationIdActionPerformed

    private void txtPationAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPationAddressActionPerformed
        txtPationTel.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPationAddressActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClearCustomer;
    private javax.swing.JButton btnSaveCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtPationAddress;
    private javax.swing.JTextField txtPationDob;
    private javax.swing.JTextField txtPationId;
    private javax.swing.JTextField txtPationName;
    private javax.swing.JTextField txtPationTel;
    // End of variables declaration//GEN-END:variables

    private boolean isNull() {
        return txtPationAddress.getText().equalsIgnoreCase("")||txtPationDob.getText().equalsIgnoreCase("")||
                txtPationId.getText().equalsIgnoreCase("")||txtPationName.getText().equalsIgnoreCase("")||
                txtPationTel.getText().equalsIgnoreCase("");
    }

    private void ClearTextcache() {
        txtPationAddress.setText(null);
        txtPationDob.setText(null);
        txtPationId.setText(null);
        txtPationName.setText(null);
        txtPationTel.setText(null);
    }
    public void init(CustomerModel m){
        txtPationAddress.setText(m.getPationAddress());
        txtPationDob.setText(m.getPationDob());
        txtPationId.setText(m.getPationId());
        txtPationName.setText(m.getPationName());
        txtPationTel.setText(m.getPationTel());
        txtPationId.setEditable(false);
        isEdite=true;
    }
}

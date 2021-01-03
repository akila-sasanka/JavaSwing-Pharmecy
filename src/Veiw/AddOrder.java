/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veiw;

import Controller.OrderController;
import Model.OrderModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sasanka
 */
public class AddOrder extends javax.swing.JFrame {

    /**
     * Creates new form AddOrder
     */
    public AddOrder() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMedicinId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtOrderQuntity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtSuplierId = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(764, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(46, 65, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Order");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 70, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Order Id");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 20));

        txtOrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 280, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Medicin Id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 20));

        txtMedicinId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicinIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtMedicinId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 280, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Quntity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 100, 20));
        jPanel1.add(txtOrderQuntity, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 280, -1));

        jButton1.setBackground(new java.awt.Color(37, 51, 224));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Suplier Id");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 100, 20));

        txtSuplierId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuplierIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtSuplierId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 280, -1));

        jButton2.setBackground(new java.awt.Color(37, 51, 224));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        OrderModel o=new OrderModel(txtOrderId.getText(), txtSuplierId.getText(), 
                txtMedicinId.getText(), txtOrderQuntity.getText());
         if(isNull()){
               TblOrder t=null;
        try {
            t = new TblOrder();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddOrder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
           JOptionPane.showMessageDialog(null, "Fill the all feild");
            t.setVisible(true);
            this.setVisible(false);
            t.setDefaultCloseOperation(3);
        return ;
         }else{
            try {
                if (new OrderController().saveOrder(o)) {
                    JOptionPane.showMessageDialog(null, "Success");
                    new TblOrder().updateTbl();
                }else{
                    JOptionPane.showMessageDialog(null, "Fail");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddOrder.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AddOrder.class.getName()).log(Level.SEVERE, null, ex);
            }
             ClearTextcache();
         }
           TblOrder t=null;
        try {
            t = new TblOrder();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddOrder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.setVisible(true);
        this.setVisible(false);
        t.setDefaultCloseOperation(3);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TblOrder o=null;
        try {
            o = new TblOrder();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddOrder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
        o.setVisible(true);
        this.setVisible(false);
        o.setDefaultCloseOperation(3);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderIdActionPerformed
        txtSuplierId.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderIdActionPerformed

    private void txtSuplierIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuplierIdActionPerformed
        txtMedicinId.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuplierIdActionPerformed

    private void txtMedicinIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicinIdActionPerformed
        txtOrderQuntity.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicinIdActionPerformed

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
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtMedicinId;
    private javax.swing.JTextField txtOrderId;
    private javax.swing.JTextField txtOrderQuntity;
    private javax.swing.JTextField txtSuplierId;
    // End of variables declaration//GEN-END:variables

    private boolean isNull() {
        return txtMedicinId.getText().equalsIgnoreCase("")||txtOrderId.getText().equalsIgnoreCase("")||
                txtOrderQuntity.getText().equalsIgnoreCase("");
    }

    private void ClearTextcache() {
        txtMedicinId.setText(null);
        txtOrderId.setText(null);
        txtOrderQuntity.setText(null);
        txtSuplierId.setText(null);
    }
}

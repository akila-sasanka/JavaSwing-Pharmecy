/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veiw;

import Controller.CustomerController;
import Controller.MedicinController;
import Model.CustomerModel;
import Model.MedicinModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sasanka
 */
public class AddMedicin extends javax.swing.JFrame {
        boolean isEdite=false;
    /**
     * Creates new form MediceenVeiw
     */
    public AddMedicin() {
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
        txtMedicenName = new javax.swing.JTextField();
        txtMedicenCategory = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMedicenId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TxtMedicenMadeBy = new javax.swing.JTextField();
        txtMedicenPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMedicenQuantityOnHand = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(46, 65, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Medicen");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 110, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Medicen Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 20));

        txtMedicenName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicenNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtMedicenName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 210, -1));

        txtMedicenCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicenCategoryActionPerformed(evt);
            }
        });
        jPanel1.add(txtMedicenCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 210, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Medicen Category ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        txtMedicenId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicenIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtMedicenId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Medicen ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 20));

        jButton1.setBackground(new java.awt.Color(37, 51, 224));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 100, 30));

        jButton2.setBackground(new java.awt.Color(37, 51, 224));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Made By");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 110, 20));

        TxtMedicenMadeBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMedicenMadeByActionPerformed(evt);
            }
        });
        jPanel1.add(TxtMedicenMadeBy, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 210, -1));

        txtMedicenPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicenPriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtMedicenPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 210, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Medicen Price");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 110, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Quantity On Hand");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 140, 20));
        jPanel1.add(txtMedicenQuantityOnHand, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMedicenNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicenNameActionPerformed
        txtMedicenCategory.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicenNameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        MedicinModel m=new MedicinModel(txtMedicenName.getText(), txtMedicenCategory.getText(),
                txtMedicenId.getText(), TxtMedicenMadeBy.getText(), Double.parseDouble(txtMedicenPrice.getText()),
                txtMedicenQuantityOnHand.getText());
        if (isNull()) {
           
              TblMedicin tm=null;
        try {
            tm = new TblMedicin();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddMedicin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddMedicin.class.getName()).log(Level.SEVERE, null, ex);
        }
            JOptionPane.showMessageDialog(null, "Fill the all feild");
            tm.setVisible(true);
            this.setVisible(false);
            tm.setDefaultCloseOperation(3);
            return;
        }else{
            try {
                if(isEdite){
                    try {
                        if(new MedicinController().updateMedicin(m)){
                            JOptionPane.showMessageDialog(null,"Update Sucsess");
                            ClearTextcache();
                            TblMedicin c=new TblMedicin();
                            c.setVisible(true);
                            this.setVisible(false);
                            c.setDefaultCloseOperation(3);
                            return;
                        }
                    
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(AddMedicin.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(AddMedicin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (new MedicinController().saveMedicin(m)) {
                    JOptionPane.showMessageDialog(null, "Success");
                    new TblMedicin().updateTable();
                }else{
                    JOptionPane.showMessageDialog(null, "Fail");
                }
           
           ClearTextcache();
        }   catch (ClassNotFoundException ex) {
                Logger.getLogger(AddMedicin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AddMedicin.class.getName()).log(Level.SEVERE, null, ex);
            }
          TblMedicin tm=null;
        try {
            tm = new TblMedicin();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddMedicin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddMedicin.class.getName()).log(Level.SEVERE, null, ex);
        }
        tm.setVisible(true);
        this.setVisible(false);
        tm.setDefaultCloseOperation(3);
        // TODO add your handling code here:
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TblMedicin t=null;
        try {
            t = new TblMedicin();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddMedicin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddMedicin.class.getName()).log(Level.SEVERE, null, ex);
        }
        t.setVisible(true);
        this.setVisible(false);
        t.setDefaultCloseOperation(3);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtMedicenCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicenCategoryActionPerformed
        txtMedicenId.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicenCategoryActionPerformed

    private void txtMedicenIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicenIdActionPerformed
        TxtMedicenMadeBy.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicenIdActionPerformed

    private void TxtMedicenMadeByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMedicenMadeByActionPerformed
        txtMedicenPrice.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMedicenMadeByActionPerformed

    private void txtMedicenPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicenPriceActionPerformed
        txtMedicenQuantityOnHand.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicenPriceActionPerformed

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
            java.util.logging.Logger.getLogger(AddMedicin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMedicin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMedicin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMedicin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMedicin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtMedicenMadeBy;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtMedicenCategory;
    private javax.swing.JTextField txtMedicenId;
    private javax.swing.JTextField txtMedicenName;
    private javax.swing.JTextField txtMedicenPrice;
    private javax.swing.JTextField txtMedicenQuantityOnHand;
    // End of variables declaration//GEN-END:variables

    private boolean isNull() {
        return TxtMedicenMadeBy.getText().equalsIgnoreCase("")||txtMedicenCategory.getText().equalsIgnoreCase("")||
                txtMedicenId.getText().equalsIgnoreCase("")||txtMedicenName.getText().equalsIgnoreCase("")||
                txtMedicenPrice.getText().equalsIgnoreCase("")||txtMedicenQuantityOnHand.getText().equalsIgnoreCase("");
    }

    private void ClearTextcache() {
        TxtMedicenMadeBy.setText(null);
        txtMedicenCategory.setText(null);
        txtMedicenId.setText(null);
        txtMedicenName.setText(null);
        txtMedicenPrice.setText(null);
        txtMedicenQuantityOnHand.setText(null);
    }
    public void init(MedicinModel m){
        isEdite=true;
        txtMedicenCategory.setText(m.getMedicinCategory());
        TxtMedicenMadeBy.setText(m.getMedicinMadeBy());
        txtMedicenId.setText(m.getMedicinId());
        txtMedicenName.setText(m.getMedicinName());
        txtMedicenPrice.setText(String.valueOf(m.getMedicinPrice()));
        txtMedicenQuantityOnHand.setText(m.getMadicinQuantityOnHand());
        txtMedicenId.setEditable(false);
    }
}

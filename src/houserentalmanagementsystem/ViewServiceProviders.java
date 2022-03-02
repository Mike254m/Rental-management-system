/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houserentalmanagementsystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author MICHAEL
 */
public class ViewServiceProviders extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel model;
    private JFrame frame;

    /**
     * Creates new form RecordBudget
     */
    public ViewServiceProviders() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    //When Declaring parameters take Diifrent Values as Parameterized as shown in update Functionn;
    }

    //functions

    private void retreave() {

        try {
            String query = "SELECT * FROM service_providers";
            con = DriverManager.getConnection("jdbc:mysql://localhost/rentalmanagementsystem", "root", "");
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            model = (DefaultTableModel) providers.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String contacts = rs.getString(3);
                String type = rs.getString(4);
                String loc = rs.getString(5);
                model.addRow(new String[]{id, name, contacts, type});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

   

    private void filter(String query) {
        DefaultTableModel model9 = (DefaultTableModel) providers.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model9);
        providers.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(query));
    }

   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        providers = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "LOCAL SERVICE PROVIDERS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Elephant", 0, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        providers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Providers Id", "Company Name", "Contacts", "Service Type", "location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        providers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                providersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(providers);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 132, 794, 190));

        jButton7.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 102, 255));
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Search");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 85, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 86, 201, -1));

        jButton6.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jButton6.setText("Retreave");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jButton9.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(102, 0, 0));
        jButton9.setText("Exit");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 800, 400));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 0, 255));
        jButton8.setText("Update");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(872, 434, -1, 0));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
              this.dispose();
              Tenant_Dashboard td = new Tenant_Dashboard();
              td.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String query1 = jTextField1.getText();
        filter(query1);
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void providersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_providersMouseClicked
        
    }//GEN-LAST:event_providersMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         frame = new JFrame();
       
       if(JOptionPane.showConfirmDialog(null, "Confirm You Want to Exit", "View Service providers Module", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
           System.exit(0);
       }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       retreave();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String query1 = jTextField1.getText();
        filter(query1);
    }//GEN-LAST:event_jTextField1KeyReleased

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
            java.util.logging.Logger.getLogger(ViewServiceProviders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewServiceProviders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewServiceProviders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewServiceProviders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewServiceProviders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable providers;
    // End of variables declaration//GEN-END:variables
}

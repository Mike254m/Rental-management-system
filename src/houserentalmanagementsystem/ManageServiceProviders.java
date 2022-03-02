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
public class ManageServiceProviders extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel model;
    private JFrame frame;

    /**
     * Creates new form RecordBudget
     */
    public ManageServiceProviders() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    //When Declaring parameters take Diifrent Values as Parameterized as shown in update Functionn;
    }

    private void retreaveprovs() {
        try {
            String query = "SELECT * FROM service_providers";
            con = DriverManager.getConnection("jdbc:mysql://localhost/rentalmanagementsystem", "root", "");
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            model = (DefaultTableModel) tableprovider.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                String prov_id = rs.getString(1);
                String prov_name = rs.getString(2);
                String cont = rs.getString(3);
                String type = rs.getString(4);
                String loc = rs.getString(5);
                model.addRow(new String[]{prov_id, prov_name, cont, type, loc});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public Boolean deleteprovs(String serv_id) {
        String sql = "DELETE FROM service_providers WHERE id='" + serv_id + "'";
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/rentalmanagementsystem", "root", "");
            pst = con.prepareStatement(sql);
            pst.execute(sql);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    private void filterprovs(String query) {
        DefaultTableModel model9 = (DefaultTableModel) tableprovider.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model9);
        tableprovider.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }

    public Boolean updateprovs(String p_id, String pname, String pcon, String pserv, String pdress) {
        String query = "UPDATE service_providers SET company_name='" + pname + "',contacts='" + pcon + "', service_type='" + pserv + "', Address='" + pdress + "' WHERE id= '" + p_id + "'";
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/rentalmanagementsystem", "root", "");
            pst = con.prepareStatement(query);
            pst.execute(query);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableprovider = new javax.swing.JTable();
        backbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loctxt = new javax.swing.JTextField();
        types = new javax.swing.JTextField();
        namec = new javax.swing.JTextField();
        ccon = new javax.swing.JTextField();
        Deletebtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        provsearch = new javax.swing.JTextField();
        updatebtn = new javax.swing.JButton();
        Retrievebtn = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "MANAGE SERVICE PROVIDERS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Elephant", 1, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableprovider.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Providers Id", "Company Name", "Contacts", "Service Type", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableprovider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableproviderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableprovider);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 132, 700, 190));

        backbutton.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        backbutton.setForeground(new java.awt.Color(0, 102, 255));
        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 375, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Contacts:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Company Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Service type:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Location:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, -1, -1));

        loctxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(loctxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, 176, -1));

        types.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(types, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, 176, -1));

        namec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(namec, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, 176, -1));

        ccon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(ccon, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 176, -1));

        Deletebtn.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        Deletebtn.setForeground(new java.awt.Color(255, 0, 255));
        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });
        jPanel1.add(Deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 375, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Search");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 85, -1, -1));

        provsearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        provsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provsearchActionPerformed(evt);
            }
        });
        provsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                provsearchKeyReleased(evt);
            }
        });
        jPanel1.add(provsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 86, 201, -1));

        updatebtn.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 375, -1, -1));

        Retrievebtn.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        Retrievebtn.setForeground(new java.awt.Color(153, 153, 0));
        Retrievebtn.setText("Retreave");
        Retrievebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetrievebtnActionPerformed(evt);
            }
        });
        jPanel1.add(Retrievebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 375, -1, -1));

        exitbutton.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        exitbutton.setForeground(new java.awt.Color(102, 0, 0));
        exitbutton.setText("Exit");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(exitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(848, 375, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 1070, 440));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 0, 255));
        jButton8.setText("Update");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(872, 434, -1, 0));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        try {
            if (ccon.getText().isEmpty() || types.getText().isEmpty() || loctxt.getText().isEmpty() || namec.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No row is selected..!!\nPlease select a row to update...");
            } else {
                int index = tableprovider.getSelectedRow();
                String id = tableprovider.getValueAt(index, 0).toString();
                if (updateprovs(id, namec.getText(), ccon.getText(), types.getText(), loctxt.getText())) {
                    JOptionPane.showMessageDialog(null, "Data updated successifully");
                    namec.setText("");
                    ccon.setText("");
                    types.setText("");
                    loctxt.setText("");
                    retreaveprovs();
                } else {
                    JOptionPane.showMessageDialog(null, "Not updated ");
                }
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        this.dispose();
        Admin_Dashboard dash = new Admin_Dashboard();
        dash.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
          try {
            String[] options = {"Yes", "No"};
            int answer = JOptionPane.showOptionDialog(null, " Are you Sure to delete ??", "Delete Options", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (answer == 0) {
                String project_id = tableprovider.getValueAt(tableprovider.getSelectedRow(), 0).toString();   
                if (deleteprovs(project_id)) {
                    JOptionPane.showMessageDialog(null, "Data deleted successifully");
                    namec.setText("");
                    ccon.setText("");
                    types.setText("");
                    loctxt.setText("");
                    retreaveprovs();
                } else {
                    JOptionPane.showMessageDialog(null, "Not deleted ");
                }
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void provsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provsearchActionPerformed
        String query1 = provsearch.getText();
        filterprovs(query1);
    }//GEN-LAST:event_provsearchActionPerformed

    private void tableproviderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableproviderMouseClicked
        // TODO add your handling code here:
        String pron = tableprovider.getValueAt(tableprovider.getSelectedRow(), 1).toString();
        String proc = tableprovider.getValueAt(tableprovider.getSelectedRow(), 2).toString();
        String prot = tableprovider.getValueAt(tableprovider.getSelectedRow(), 3).toString();
        String prol = tableprovider.getValueAt(tableprovider.getSelectedRow(), 4).toString();

        namec.setText(pron);
        ccon.setText(proc);
        types.setText(prot);
        loctxt.setText(prol);
    }//GEN-LAST:event_tableproviderMouseClicked

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
         frame = new JFrame();
       
       if(JOptionPane.showConfirmDialog(null, "Confirm You Want to Exit", "View Service Providers Module", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
           System.exit(0);
       }
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void RetrievebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetrievebtnActionPerformed
       retreaveprovs();
    }//GEN-LAST:event_RetrievebtnActionPerformed

    private void provsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_provsearchKeyReleased
        String query1 = provsearch.getText();
        filterprovs(query1);
    }//GEN-LAST:event_provsearchKeyReleased

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
            java.util.logging.Logger.getLogger(ManageServiceProviders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageServiceProviders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageServiceProviders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageServiceProviders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new ManageServiceProviders().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton Retrievebtn;
    private javax.swing.JButton backbutton;
    private javax.swing.JTextField ccon;
    private javax.swing.JButton exitbutton;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField loctxt;
    private javax.swing.JTextField namec;
    private javax.swing.JTextField provsearch;
    private javax.swing.JTable tableprovider;
    private javax.swing.JTextField types;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}

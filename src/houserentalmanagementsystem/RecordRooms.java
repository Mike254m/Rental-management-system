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

/**
 *
 * @author MICHAEL
 */
public class RecordRooms extends javax.swing.JFrame {
     private JFrame frame;
      Connection con =null;
      PreparedStatement pst = null;
       ResultSet rs = null;
    public RecordRooms() {
        initComponents();
         this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        octxt = new javax.swing.JTextField();
        recordbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        extbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        romtyp = new javax.swing.JComboBox();
        retrievebtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bltxt = new javax.swing.JTextField();
        stxt = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 3), "RECORDING  ROOMS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Elephant", 1, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Room Type:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 182, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Block Number:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 174, 37));

        octxt.setEditable(false);
        octxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(octxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 260, -1));

        recordbtn.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        recordbtn.setForeground(new java.awt.Color(102, 0, 102));
        recordbtn.setText("RECORD");
        recordbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordbtnActionPerformed(evt);
            }
        });
        jPanel1.add(recordbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        resetbtn.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        resetbtn.setForeground(new java.awt.Color(51, 51, 255));
        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        jPanel1.add(resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        backbtn.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        backbtn.setForeground(new java.awt.Color(153, 0, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        jPanel1.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        extbtn.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        extbtn.setForeground(new java.awt.Color(153, 153, 0));
        extbtn.setText("Exit");
        extbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extbtnActionPerformed(evt);
            }
        });
        jPanel1.add(extbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Status");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        romtyp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        romtyp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Room Type", "Single", "Self Contained" }));
        jPanel1.add(romtyp, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 258, -1));

        retrievebtn.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        retrievebtn.setText("Retrieve");
        retrievebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrievebtnActionPerformed(evt);
            }
        });
        jPanel1.add(retrievebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Occupant PhoneNumber:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        bltxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(bltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 270, -1));

        stxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        stxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Status", "Occupied", "Not Occupied", " " }));
        stxt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                stxtItemStateChanged(evt);
            }
        });
        stxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stxtActionPerformed(evt);
            }
        });
        jPanel1.add(stxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 260, -1));

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void extbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extbtnActionPerformed
         //You must declare the Jframe on the top
        frame = new JFrame();
         if (JOptionPane.showConfirmDialog(frame, "Cofirm if you want to exit", "Recording Rooms Form",
             JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
             System.exit(0);
         }
    }//GEN-LAST:event_extbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        this.dispose();
        Admin_Dashboard dash =  new Admin_Dashboard();
        dash.setVisible(true);
               
    }//GEN-LAST:event_backbtnActionPerformed

    private void recordbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordbtnActionPerformed
        try{
      
        String sql = " INSERT INTO room (room_type, block_number, status, phonenumber)  VALUES (?,?,?,?)";
        con = DriverManager.getConnection("jdbc:mysql://localhost/rentalmanagementsystem","root","");
        
        pst = con.prepareStatement(sql);
        pst.setString(1,romtyp.getSelectedItem().toString());
        pst.setString(2, bltxt.getText());
        pst.setString(3, stxt.getSelectedItem().toString());
        String phone;
        if(octxt.getText().isEmpty()&&octxt.getText().equals("")){
           phone = "Null";
        }else{
            phone = octxt.getText();
        }
        pst.setString(4, phone);
        
        
        
           
         if(romtyp.getSelectedIndex()==0 || bltxt.getText().equals("") || stxt.getSelectedIndex()==0 ){
             JOptionPane.showMessageDialog(null,"Some fields not filled in..!!\n Please Fill them to continue.","Warning",JOptionPane.WARNING_MESSAGE);
          }
               
       else {
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Recording Successful");
              romtyp.setSelectedIndex(0); 
              bltxt.setText(" ");
              octxt.setText(" ");
              stxt.setSelectedIndex(0);    
           
        }   
        } 
        
        catch(HeadlessException | SQLException ex){
        JOptionPane.showMessageDialog(null,ex);
        }
      
    }//GEN-LAST:event_recordbtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed

        romtyp.setSelectedIndex(0);
        bltxt.setText(" ");
        octxt.setText(" ");
        stxt.setSelectedIndex(0);

           
    }//GEN-LAST:event_resetbtnActionPerformed

    private void retrievebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrievebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retrievebtnActionPerformed

    private void stxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stxtActionPerformed

    private void stxtItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_stxtItemStateChanged
         // TODO add your handling code here:
         switch (stxt.getSelectedIndex()) {
             case 1:
                 octxt.setEditable(true);
                 break;
             case 2:
                 octxt.setEditable(false);
                 break;
             case 0:
                 octxt.setEditable(false);
                 break;
             default:
                 break;
         }
        
    }//GEN-LAST:event_stxtItemStateChanged

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
            java.util.logging.Logger.getLogger(RecordRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecordRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecordRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecordRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RecordRooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField bltxt;
    private javax.swing.JButton extbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField octxt;
    private javax.swing.JButton recordbtn;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton retrievebtn;
    private javax.swing.JComboBox romtyp;
    private javax.swing.JComboBox<String> stxt;
    // End of variables declaration//GEN-END:variables
}

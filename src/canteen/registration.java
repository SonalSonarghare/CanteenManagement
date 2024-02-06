/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package canteen;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * 
 *
 * @author Sonal R Sonarghare
 */
public class registration extends javax.swing.JFrame {

    /**
     * Creates new form registration
     */
    public registration() {
        initComponents();
      init();
    }
     public void init(){
        setImage();
     }
    public void setImage(){
        ImageIcon iconl =new ImageIcon(getClass().getResource("/images/logo.png"));
        ImageIcon icon2=new ImageIcon(getClass().getResource("/images/R.png"));
        Image img1=iconl.getImage().getScaledInstance(logo.getWidth(),logo.getHeight(),Image.SCALE_SMOOTH);
        Image img2=icon2.getImage().getScaledInstance(Name.getWidth(),Name.getHeight(),Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(img1));
        Name.setIcon(new ImageIcon(img2));
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
        logo = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Text_Name = new javax.swing.JTextField();
        Text_Username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Text_password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        Text_Mob = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Text_Email = new javax.swing.JTextField();
        btn_sign = new javax.swing.JButton();
        edtFN = new javax.swing.JLabel();
        edtFN1 = new javax.swing.JLabel();
        edtFN2 = new javax.swing.JLabel();
        edtFN3 = new javax.swing.JLabel();
        edtFN4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRATION");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Name:");

        Text_Name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Text_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_NameActionPerformed(evt);
            }
        });
        Text_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Text_NameKeyReleased(evt);
            }
        });

        Text_Username.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Text_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_UsernameActionPerformed(evt);
            }
        });
        Text_Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Text_UsernameKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Email Id:");

        Text_password.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Text_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_passwordActionPerformed(evt);
            }
        });
        Text_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Text_passwordKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password:");

        Text_Mob.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Text_Mob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_MobActionPerformed(evt);
            }
        });
        Text_Mob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Text_MobKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Mobile No:");

        Text_Email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Text_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_EmailActionPerformed(evt);
            }
        });
        Text_Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Text_EmailKeyReleased(evt);
            }
        });

        btn_sign.setBackground(new java.awt.Color(0, 0, 0));
        btn_sign.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_sign.setForeground(new java.awt.Color(255, 255, 255));
        btn_sign.setText("SIGN UP");
        btn_sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signActionPerformed(evt);
            }
        });

        edtFN.setForeground(new java.awt.Color(255, 0, 0));

        edtFN1.setForeground(new java.awt.Color(255, 0, 0));

        edtFN2.setForeground(new java.awt.Color(255, 0, 0));

        edtFN3.setForeground(new java.awt.Color(255, 0, 0));

        edtFN4.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                            .addComponent(Text_password, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(Text_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(edtFN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Text_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
                                    .addComponent(edtFN1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edtFN2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Text_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(edtFN3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(edtFN4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Text_Mob, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))))))
                        .addGap(0, 90, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(btn_sign, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtFN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtFN1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(edtFN2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtFN3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Mob, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtFN4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btn_sign, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Text_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_NameActionPerformed
        // TODO add your handling code here   
    }//GEN-LAST:event_Text_NameActionPerformed

    private void Text_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_UsernameActionPerformed
        // TODO add your handling code here:
        Pattern p=Pattern.compile("^[a-zA-Z0-9]{0,30}[@._#*$]{0,30}[a-zA-Z0-9]{0,30}$");
       Matcher m=p.matcher(Text_Username.getText());
       if(!m.matches())
       {
          edtFN1.setText("Invalid USERNAME");
       }
       else{
           edtFN1.setText(null);
       }
    }//GEN-LAST:event_Text_UsernameActionPerformed

    private void Text_MobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_MobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_MobActionPerformed

    private void Text_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_EmailActionPerformed

    private void btn_signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signActionPerformed
        // TODO add your handling code here:
        if(Text_Name.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Name is Mandatory!");
        
        else if(Text_Username.getText().equals(""))
             JOptionPane.showMessageDialog(null, "Username is Mandatory!");
        else if(Text_password.getText().equals(""))
             JOptionPane.showMessageDialog(null, "Password is Mandatory!");   
        else if(Text_Mob.getText().equals(""))
             JOptionPane.showMessageDialog(null, "Mobile_No is Mandatory!");   
        else if(Text_Email.getText().equals(""))
             JOptionPane.showMessageDialog(null, "Email_Address is Mandatory!");
        else
           {  
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            try (
                Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost/canteen","root","")) 
            {
                String sql="insert into Register() values (?,?,?,?,?,?)";
                java.sql.PreparedStatement pst=con.prepareStatement(sql);
                 pst.setString(1, null);
                pst.setString(2, Text_Name.getText());
                pst.setString(3, Text_Username.getText());
                pst.setString(4, Text_password.getText());
                pst.setString(5, Text_Mob.getText());
                pst.setString(6, Text_Email.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registered Successfully");
                dispose();
                login lg =new login();
                lg.show();
            }
            
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e.getMessage());
        }
        }
    }//GEN-LAST:event_btn_signActionPerformed

    private void Text_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_passwordActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Text_passwordActionPerformed

    private void Text_NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Text_NameKeyReleased
        // TODO add your handling code here:
        Pattern p=Pattern.compile("^[a-zA-Z]{0,30}$");
       Matcher m=p.matcher(Text_Name.getText());
       if(!m.matches())
       {
           edtFN.setText("Invalid Name");
       }
       else{
           edtFN.setText(null);
       }
    }//GEN-LAST:event_Text_NameKeyReleased

    private void Text_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Text_passwordKeyReleased
        // TODO add your handling code here:
         Pattern p=Pattern.compile("^[a-zA-Z0-9]{0,30}[@,.,_,$,#]{0,30}[a-zA-Z0-9]{0,30}$");
       Matcher m=p.matcher(Text_password.getText());
       if(!m.matches())
       {
           edtFN2.setText("Invalid Password");
       }
       else{
           edtFN2.setText(null);
       }
    }//GEN-LAST:event_Text_passwordKeyReleased

    private void Text_EmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Text_EmailKeyReleased
        // TODO add your handling code here:
        Pattern p=Pattern.compile("^[a-zA-Z0-9]{0,30}[@][gmail]{0,30}[.][com]{0,30}$");
       Matcher m=p.matcher(Text_Email.getText());
       if(!m.matches())
       {
           edtFN4.setText("Invalid Email_Address");
       }
       else{
           edtFN4.setText(null);
       }
    }//GEN-LAST:event_Text_EmailKeyReleased

    private void Text_MobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Text_MobKeyReleased
        // TODO add your handling code here:
         Pattern p=Pattern.compile("^[7-9][0-9]{9}$");
       Matcher m=p.matcher(Text_Mob.getText());
       if(!m.matches())
       {
           edtFN3.setText("Invalid Mobile no.");
       }
       else{
           edtFN3.setText(null);
       }
    }//GEN-LAST:event_Text_MobKeyReleased

    private void Text_UsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Text_UsernameKeyReleased
        // TODO add your handling code here:
        Pattern p=Pattern.compile("^[a-zA-Z0-9]{0,30}[@._#*$]{0,30}[a-zA-Z0-9]{0,30}$");
       Matcher m=p.matcher(Text_Username.getText());
       if(!m.matches())
       {
          edtFN1.setText("Invalid USERNAME");
       }
       else{
           edtFN1.setText(null);
       }
    }//GEN-LAST:event_Text_UsernameKeyReleased

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
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JTextField Text_Email;
    private javax.swing.JTextField Text_Mob;
    private javax.swing.JTextField Text_Name;
    private javax.swing.JTextField Text_Username;
    private javax.swing.JPasswordField Text_password;
    private javax.swing.JButton btn_sign;
    private javax.swing.JLabel edtFN;
    private javax.swing.JLabel edtFN1;
    private javax.swing.JLabel edtFN2;
    private javax.swing.JLabel edtFN3;
    private javax.swing.JLabel edtFN4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
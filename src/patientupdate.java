
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author OM SAI RAM
 */
public class patientupdate extends javax.swing.JFrame {

    /**
     * Creates new form patientupdate
     */
    public patientupdate() {
        super("ADMISSION MANAGEMENT SYSTEM");
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        titleframe = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        titlename = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        t9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        t10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        t11 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        t3 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        t12 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        t13 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1370, 750));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jLabel16, org.jdesktop.beansbinding.ELProperty.create("${background}"), this, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        titleframe.setBackground(new java.awt.Color(0, 153, 153));
        titleframe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        titleframe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital-building-clipart-vector_csp45854550.jpg"))); // NOI18N
        logo.setText("jLabel1");
        logo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        titlename.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titlename.setForeground(new java.awt.Color(255, 255, 255));
        titlename.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlename.setText("HOSPITAL MANAGEMENT SYSTEM");
        titlename.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titlename.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titlename.setPreferredSize(new java.awt.Dimension(450, 28));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        javax.swing.GroupLayout titleframeLayout = new javax.swing.GroupLayout(titleframe);
        titleframe.setLayout(titleframeLayout);
        titleframeLayout.setHorizontalGroup(
            titleframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleframeLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221)
                .addComponent(titlename, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );
        titleframeLayout.setVerticalGroup(
            titleframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleframeLayout.createSequentialGroup()
                .addGroup(titleframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(titleframeLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(titleframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titlename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(855, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Id No:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 109, -1));
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 321, 31));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 109, -1));
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 321, 31));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Gender");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 109, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Hospital Preference");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 321, 31));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Physician's Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 321, -1));
        jPanel1.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 321, 31));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Phone Number");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 321, -1));
        jPanel1.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 321, 31));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 15, 109, -1));
        jPanel1.add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 51, 260, 50));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("City");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 106, 109, -1));
        jPanel1.add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 134, 256, 39));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("State");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 179, 109, -1));
        jPanel1.add(t9, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 206, 256, 34));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Country");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 251, 109, -1));
        jPanel1.add(t10, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 278, 256, 31));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Problum");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 315, 109, -1));
        jPanel1.add(t11, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 346, 256, 50));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, -1, 32));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("Update");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, 32));

        t3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        t3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 321, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Email");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 280, -1));
        jPanel1.add(t12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 321, 31));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("First Name");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 109, -1));
        jPanel1.add(t13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 321, 31));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("<html>\n<body>\n<footer >\n    <table>\n  <tr>\n    \n    <th  style=\"  color: white\">About us      <hr></th>\n     \n    <th style=\"color: white\">Address Info <hr></th>\n        \n    <th style=\"color: white\">Contact us\n          <hr>\n</th>\n  </tr>\n    \n  <tr>\n    <td rowspan=\"3\"  style=\"color: white\">Hospital management systeml, an initiative of <br> \"Health sectorl Plateform\", was founded with the idea of providing holistic value-based health that would help each patient to face lives challenges.</td> <td rowspan=\"2\"  style=\"color: white\">vivek hospital management system Kunda,<br> Locality: Pratapgarh (Reg.739)  state: uttarpradesh Landmark: 5kms sangramgarh polic station.</td>     <td rowspan=\"3\"  style=\"color: white\">Web site: www.healthmanagementsystem Phone: xxxxxxxxxx<br> Email:vivekpandey.nielit.gov.in For admisssions  Admissions Head Contact:- +91 xxxxxxxxx, +91 xxxxxxxxxx</td>   </tr>   </table>             <hr>     <h5 TEXT ALIGN=\"CENTER\"  style=\"color: white\"> Copyright @Hospial management system.</h5>    <hr>     </footer> </body> </html> ");
        jLabel16.setPreferredSize(new java.awt.Dimension(920, 131));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Home");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleframe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleframe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        clear();
    }
        private void clear(){
        t1.setText(null);
         t2.setText(null);
         // t3.setText(null);
           t4.setText(null);
            t5.setText(null);
             t6.setText(null);
              t7.setText(null);
               t8.setText(null);
                t9.setText(null);
                 t10.setText(null);
                  t11.setText(null);
                  t12.setText(null);
                  t13.setText(null);

                  

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        try {
            thequery("update appointment set fname ='"+t13.getText()+"' ,lname  ='"+t2.getText()+"' ,gender ='"+t3.getSelectedItem().toString()+"' ,hospital ='"+t4.getText()+"' ,physician ='"+t5.getText()+"' ,mob ='"+t6.getText()+"' ,email ='"+t7.getText()+"' ,address ='"+t8.getText()+"' ,city ='"+t9.getText()+"' ,state ='"+t10.getText()+"' ,country ='"+t11.getText()+"' ,problum ='"+t12.getText()+"' where id = "+t1.getText()+"");

        }
        catch(Exception ex){

        }

        }

        public void thequery(String query){
            Connection con = null;
            Statement st = null;
            try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
                st = con.createStatement();
                st.executeUpdate(query);
                String fname = t13.getText();
                JOptionPane.showMessageDialog(null, "Mr "+fname+"  Welcome to hospital management system your updation has been request is suceessfull");
               Admin regFace =new Admin();
                    regFace.setVisible(true);
                this.dispose();
                // this.dispose();
            }catch(SQLException  ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        Admin regFace =new Admin();
        regFace.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(patientupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patientupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patientupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patientupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patientupdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    public javax.swing.JTextField t1;
    public javax.swing.JTextField t10;
    public javax.swing.JTextField t11;
    public javax.swing.JTextField t12;
    public javax.swing.JTextField t13;
    public javax.swing.JTextField t2;
    public javax.swing.JComboBox t3;
    public javax.swing.JTextField t4;
    public javax.swing.JTextField t5;
    public javax.swing.JTextField t6;
    public javax.swing.JTextField t7;
    public javax.swing.JTextField t8;
    public javax.swing.JTextField t9;
    private javax.swing.JPanel titleframe;
    private javax.swing.JLabel titlename;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

   
}

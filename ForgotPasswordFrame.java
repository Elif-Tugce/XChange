/**
 *
 * @author mehme
 */
public class ForgotPasswordFrame extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPasswordFrame
     */
    public ForgotPasswordFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LogoPlace = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        InfoPlace = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Forgot Password");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        LogoPlace.setBackground(new java.awt.Color(25, 167, 206));
        LogoPlace.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/21.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setMaximumSize(new java.awt.Dimension(1541, 1500));

        javax.swing.GroupLayout LogoPlaceLayout = new javax.swing.GroupLayout(LogoPlace);
        LogoPlace.setLayout(LogoPlaceLayout);
        LogoPlaceLayout.setHorizontalGroup(
            LogoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 400, Short.MAX_VALUE)
        );
        LogoPlaceLayout.setVerticalGroup(
            LogoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        jPanel1.add(LogoPlace);
        LogoPlace.setBounds(0, 0, 400, 500);

        InfoPlace.setBackground(new java.awt.Color(255, 255, 255));
        InfoPlace.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(179, 179, 179));
        jLabel1.setText("FORGOT PASSWORD?");

        jTextField2.setPreferredSize(new java.awt.Dimension(64, 24));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jPasswordField1.setPreferredSize(new java.awt.Dimension(64, 24));

        jLabel3.setText("Enter new password");

        jLabel4.setText("Enter username");

        jButton1.setBackground(new java.awt.Color(255, 178, 30));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(24, 24));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lock.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/secure.png"))); // NOI18N

        jLabel9.setText("Enter your mother's name");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/secure.png"))); // NOI18N

        jLabel12.setText("Enter your favourite color");

        jTextField1.setPreferredSize(new java.awt.Dimension(64, 24));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField3.setPreferredSize(new java.awt.Dimension(64, 24));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jPasswordField2.setPreferredSize(new java.awt.Dimension(64, 24));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lock.png"))); // NOI18N

        jLabel8.setText("Enter new password again");

        javax.swing.GroupLayout InfoPlaceLayout = new javax.swing.GroupLayout(InfoPlace);
        InfoPlace.setLayout(InfoPlaceLayout);
        InfoPlaceLayout.setHorizontalGroup(
            InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPlaceLayout.createSequentialGroup()
                .addGroup(InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoPlaceLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jButton1))
                    .addGroup(InfoPlaceLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addGroup(InfoPlaceLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addGroup(InfoPlaceLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12)
                                    .addGroup(InfoPlaceLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3)
                                            .addGroup(InfoPlaceLayout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(InfoPlaceLayout.createSequentialGroup()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel8)
                                            .addGroup(InfoPlaceLayout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(InfoPlaceLayout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        InfoPlaceLayout.setVerticalGroup(
            InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPlaceLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.add(InfoPlace);
        InfoPlace.setBounds(400, 0, 400, 500);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setResizable(false);
        this.dispose();         // TODO add your handling code here:
    }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

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
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPasswordFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel InfoPlace;
    private javax.swing.JPanel LogoPlace;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration                   
}

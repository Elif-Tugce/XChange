/**
 *
 * @author mehme
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
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
        notAMemberText = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        SignUpButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setPreferredSize(new java.awt.Dimension(800, 500));

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
        jLabel1.setText("SIGN IN TO KNOW YOUR MONEY!");

        jTextField2.setPreferredSize(new java.awt.Dimension(64, 24));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jPasswordField1.setPreferredSize(new java.awt.Dimension(64, 24));

        jLabel3.setText("ENTER PASSWORD");

        jLabel4.setText("ENTER USERNAME");

        jButton1.setBackground(new java.awt.Color(255, 178, 30));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton1.setText("SIGN IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        notAMemberText.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        notAMemberText.setText("NOT A MEMBER?");

        jButton2.setBackground(new java.awt.Color(255, 178, 30));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton2.setText("Forgot Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        SignUpButton.setBackground(new java.awt.Color(255, 178, 30));
        SignUpButton.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        SignUpButton.setText("SIGN UP NOW");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(24, 24));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lock.png"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(24, 24));

        javax.swing.GroupLayout InfoPlaceLayout = new javax.swing.GroupLayout(InfoPlace);
        InfoPlace.setLayout(InfoPlaceLayout);
        InfoPlaceLayout.setHorizontalGroup(
            InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPlaceLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addGroup(InfoPlaceLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(InfoPlaceLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(InfoPlaceLayout.createSequentialGroup()
                                .addGroup(InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(InfoPlaceLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(notAMemberText))
                                    .addComponent(SignUpButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoPlaceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );
        InfoPlaceLayout.setVerticalGroup(
            InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoPlaceLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(notAMemberText)
                .addGap(11, 11, 11)
                .addGroup(InfoPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignUpButton)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(85, Short.MAX_VALUE))
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
        ConvertCurrencyFrame convertCurrencyFrame = new ConvertCurrencyFrame();
        convertCurrencyFrame.setVisible(true);
        convertCurrencyFrame.setLocationRelativeTo(null);
        this.dispose();        // TODO add your handling code here:
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        ForgotPasswordFrame forgotPasswordFrame = new ForgotPasswordFrame();
        forgotPasswordFrame.setVisible(true);
        forgotPasswordFrame.pack();
        forgotPasswordFrame.setLocationRelativeTo(null);
        forgotPasswordFrame.setResizable(false);
        this.dispose();        // TODO add your handling code here:
    }                                        

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        SignUpFrame signUpFrame = new SignUpFrame();
        signUpFrame.setVisible(true);
        signUpFrame.pack();
        signUpFrame.setLocationRelativeTo(null);
        signUpFrame.setResizable(false);
        this.dispose();
        
    }                                            

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify                     
    private javax.swing.JPanel InfoPlace;
    private javax.swing.JPanel LogoPlace;
    private javax.swing.JButton SignUpButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel notAMemberText;
    // End of variables declaration                   
}

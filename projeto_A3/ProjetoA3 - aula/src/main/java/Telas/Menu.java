package Telas;

import JavaClass.UserSession;


public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        System.out.println(isAdmin());
        BT_AdmUsers.setVisible(false);
       if (isAdmin()){
            BT_AdmUsers.setVisible(true);
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_MinhasAtividades = new javax.swing.JButton();
        BT_Atividades = new javax.swing.JButton();
        BT_MeuPerfil = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BT_Exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BT_AdmUsers = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        BT_MinhasAtividades.setBackground(new java.awt.Color(204, 204, 204));
        BT_MinhasAtividades.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BT_MinhasAtividades.setForeground(new java.awt.Color(22, 22, 22));
        BT_MinhasAtividades.setText("MINHAS ATIVIDADES");
        BT_MinhasAtividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_MinhasAtividadesActionPerformed(evt);
            }
        });

        BT_Atividades.setBackground(new java.awt.Color(204, 204, 204));
        BT_Atividades.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BT_Atividades.setForeground(new java.awt.Color(22, 22, 22));
        BT_Atividades.setText("ADICIONAR ATIVIDADES");
        BT_Atividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AtividadesActionPerformed(evt);
            }
        });

        BT_MeuPerfil.setBackground(new java.awt.Color(204, 204, 204));
        BT_MeuPerfil.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BT_MeuPerfil.setForeground(new java.awt.Color(22, 22, 22));
        BT_MeuPerfil.setText("MEU PERFIL");
        BT_MeuPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_MeuPerfilActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(33, 152, 207));
        jPanel1.setPreferredSize(new java.awt.Dimension(167, 65));

        BT_Exit.setBackground(new java.awt.Color(33, 152, 207));
        BT_Exit.setForeground(java.awt.Color.white);
        BT_Exit.setText("SAIR");
        BT_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BT_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BT_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(33, 152, 207));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 50)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("BEM VINDO");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 50)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("LIFE TO LIVE");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 50)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("AO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(jLabel2))
        );

        BT_AdmUsers.setBackground(new java.awt.Color(204, 204, 204));
        BT_AdmUsers.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BT_AdmUsers.setForeground(new java.awt.Color(22, 22, 22));
        BT_AdmUsers.setText("VERIFICAR USUÁRIOS");
        BT_AdmUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_AdmUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AdmUsersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BT_AdmUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_Atividades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BT_MeuPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(BT_MinhasAtividades)))
                .addGap(75, 75, 75))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(676, 676, 676)
                    .addComponent(jLabel5)
                    .addContainerGap(370, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BT_MinhasAtividades, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_MeuPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BT_Atividades, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BT_AdmUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(333, 333, 333)
                    .addComponent(jLabel5)
                    .addContainerGap(363, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void postInitComponents(){
        
    }
    
    
    
    private void BT_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BT_ExitActionPerformed

    private void BT_MinhasAtividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_MinhasAtividadesActionPerformed
        MinhasAtividades MinhasAtividades = new MinhasAtividades();
        MinhasAtividades.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_MinhasAtividadesActionPerformed

    private void BT_AtividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AtividadesActionPerformed
        AtividadesTela Atividades = new AtividadesTela();
        Atividades.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_AtividadesActionPerformed

    private void BT_MeuPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_MeuPerfilActionPerformed
        MeuPerfil MeuPerfil = new MeuPerfil();
        MeuPerfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_MeuPerfilActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);

        
    }//GEN-LAST:event_formWindowActivated

    private void BT_AdmUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AdmUsersActionPerformed
       ADM_Users ADM_Users = new ADM_Users();
        ADM_Users.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_AdmUsersActionPerformed

    public boolean isAdmin(){
       String nomeUsuario = UserSession.getInstance().email();
       System.out.println(nomeUsuario);
       if (nomeUsuario.toLowerCase().equals("admin")){
            return true;
        }
       else{
           return false;
       }
       
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_AdmUsers;
    private javax.swing.JButton BT_Atividades;
    private javax.swing.JButton BT_Exit;
    private javax.swing.JButton BT_MeuPerfil;
    private javax.swing.JButton BT_MinhasAtividades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

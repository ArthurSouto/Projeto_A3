package Telas;


import JavaClass.Usuario;
import java.awt.TextField;
import Telas.DAO;

public class Cadastro extends javax.swing.JFrame {
    
    public Cadastro() {
        initComponents();
    }
    private void DefaultTXT() {
        setDefaultText(TX_User, "Digite seu nome");
        setDefaultText(TX_Email, "Digite seu e-mail");
        setDefaultText(TX_Peso, "Peso");
        setDefaultText(TX_Idade, "Idade");
        setDefaultText(TX_Altura, "Altura");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_AskSenha = new javax.swing.JLabel();
        TX_Email = new java.awt.TextField();
        TX_Peso = new java.awt.TextField();
        TX_Idade = new java.awt.TextField();
        TX_Altura = new java.awt.TextField();
        BT_Concluir = new java.awt.Button();
        BT_Cancelar = new java.awt.Button();
        CreatePasswrd = new javax.swing.JPasswordField();
        CB_Termos = new java.awt.Checkbox();
        TX_User = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criação de conta");
        setBackground(new java.awt.Color(135, 206, 235));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        LB_AskSenha.setText("Digite sua senha:");

        TX_Email.setBackground(new java.awt.Color(220, 220, 220));
        TX_Email.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TX_Email.setText("Digite seu e-mail");
        TX_Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TX_EmailMouseClicked(evt);
            }
        });
        TX_Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TX_EmailFocusLost(evt);
            }
        });
        TX_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TX_EmailActionPerformed(evt);
            }
        });

        TX_Peso.setBackground(new java.awt.Color(220, 220, 220));
        TX_Peso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TX_Peso.setText("Peso");
        TX_Peso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TX_PesoMouseClicked(evt);
            }
        });
        TX_Peso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TX_PesoFocusLost(evt);
            }
        });
        TX_Peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TX_PesoActionPerformed(evt);
            }
        });

        TX_Idade.setBackground(new java.awt.Color(220, 220, 220));
        TX_Idade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TX_Idade.setText("Idade");
        TX_Idade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TX_IdadeMouseClicked(evt);
            }
        });
        TX_Idade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TX_IdadeFocusLost(evt);
            }
        });
        TX_Idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TX_IdadeActionPerformed(evt);
            }
        });

        TX_Altura.setBackground(new java.awt.Color(220, 220, 220));
        TX_Altura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TX_Altura.setText("Altura");
        TX_Altura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TX_AlturaMouseClicked(evt);
            }
        });
        TX_Altura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TX_AlturaFocusLost(evt);
            }
        });
        TX_Altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TX_AlturaActionPerformed(evt);
            }
        });

        BT_Concluir.setActionCommand("Entrar");
        BT_Concluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Concluir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BT_Concluir.setLabel("Criar conta");
        BT_Concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_ConcluirActionPerformed(evt);
            }
        });

        BT_Cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Cancelar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BT_Cancelar.setLabel("Cancelar");
        BT_Cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_CancelarMouseClicked(evt);
            }
        });
        BT_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CancelarActionPerformed(evt);
            }
        });

        CreatePasswrd.setBackground(new java.awt.Color(220, 220, 220));
        CreatePasswrd.setToolTipText("Digite sua senha");
        CreatePasswrd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        CB_Termos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CB_Termos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        CB_Termos.setLabel("Concordo com os Termos de aceite.");

        TX_User.setBackground(new java.awt.Color(220, 220, 220));
        TX_User.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TX_User.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TX_User.setText("Digite seu nome");
        TX_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TX_UserMouseClicked(evt);
            }
        });
        TX_User.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TX_UserFocusLost(evt);
            }
        });
        TX_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TX_UserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LB_AskSenha)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(TX_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(TX_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TX_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(CB_Termos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CreatePasswrd, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(BT_Concluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                            .addComponent(BT_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(TX_Email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TX_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(TX_User, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(TX_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TX_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TX_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TX_Idade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(LB_AskSenha)
                .addGap(3, 3, 3)
                .addComponent(CreatePasswrd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(CB_Termos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BT_Concluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Cancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TX_EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TX_EmailFocusLost
        if (TX_Email.getText().isEmpty()) {
            TX_Email.setText("Digite seu e-mail");
        }
    }//GEN-LAST:event_TX_EmailFocusLost

    private void TX_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TX_EmailActionPerformed
        if (!TX_Email.isFocusOwner() && TX_Email.getText().length() == 0) {
            TX_Email.setText("Digite seu e-mail");
        }
    }//GEN-LAST:event_TX_EmailActionPerformed

    private void TX_PesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TX_PesoFocusLost
        if (TX_Peso.getText().isEmpty()) {
            TX_Peso.setText("Peso");
        }
    }//GEN-LAST:event_TX_PesoFocusLost

    private void TX_PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TX_PesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TX_PesoActionPerformed

    private void TX_IdadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TX_IdadeFocusLost
        if (TX_Idade.getText().isEmpty()) {
            TX_Idade.setText("Idade");
        }
    }//GEN-LAST:event_TX_IdadeFocusLost

    private void TX_IdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TX_IdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TX_IdadeActionPerformed

    private void TX_AlturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TX_AlturaFocusLost
        if (TX_Altura.getText().isEmpty()) {
            TX_Altura.setText("Altura");
        }
    }//GEN-LAST:event_TX_AlturaFocusLost

    private void TX_AlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TX_AlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TX_AlturaActionPerformed

    private void BT_ConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_ConcluirActionPerformed
        String nome = TX_User.getText();
        String email = TX_Email.getText();
        String peso = TX_Peso.getText();
        String altura = TX_Altura.getText();
        String idade = TX_Idade.getText();
        String senha = CreatePasswrd.getText();
        boolean termos = CB_Termos.getState();

        Usuario usuario = new Usuario(email, nome, peso, altura, idade, senha);

        DAO dao = new DAO();
        dao.InserirUsuario(usuario);
        
        
        Login Login = new Login();
        Login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_ConcluirActionPerformed

    private void BT_CancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CancelarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_CancelarMouseClicked

    private void BT_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CancelarActionPerformed
        Login Login = new Login();
        Login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_CancelarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowActivated

    private void TX_EmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TX_EmailMouseClicked
        if (TX_Email.getText().equals("Digite seu e-mail")) {
        TX_Email.setText("");
        }
    }//GEN-LAST:event_TX_EmailMouseClicked

    private void TX_PesoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TX_PesoMouseClicked
        if (TX_Peso.getText().equals("Peso")) {
        TX_Peso.setText("");
        }
    }//GEN-LAST:event_TX_PesoMouseClicked

    private void TX_AlturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TX_AlturaMouseClicked
        if (TX_Altura.getText().equals("Altura")) {
        TX_Altura.setText("");
        }
    }//GEN-LAST:event_TX_AlturaMouseClicked

    private void TX_IdadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TX_IdadeMouseClicked
        if (TX_Idade.getText().equals("Idade")) {
        TX_Idade.setText("");
        }
    }//GEN-LAST:event_TX_IdadeMouseClicked

    private void TX_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TX_UserActionPerformed

    }//GEN-LAST:event_TX_UserActionPerformed

    private void TX_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TX_UserMouseClicked
        if (TX_User.getText().equals("Digite seu nome")) {
        TX_User.setText("");
        }
    }//GEN-LAST:event_TX_UserMouseClicked

    private void TX_UserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TX_UserFocusLost
        if (TX_User.getText().isEmpty()) {
            TX_User.setText("Digite seu nome");
        }
    }//GEN-LAST:event_TX_UserFocusLost

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BT_Cancelar;
    private java.awt.Button BT_Concluir;
    private java.awt.Checkbox CB_Termos;
    private javax.swing.JPasswordField CreatePasswrd;
    private javax.swing.JLabel LB_AskSenha;
    private java.awt.TextField TX_Altura;
    private java.awt.TextField TX_Email;
    private java.awt.TextField TX_Idade;
    private java.awt.TextField TX_Peso;
    private java.awt.TextField TX_User;
    // End of variables declaration//GEN-END:variables

    private void setDefaultText(TextField TX_User, String digite_seu_nome) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

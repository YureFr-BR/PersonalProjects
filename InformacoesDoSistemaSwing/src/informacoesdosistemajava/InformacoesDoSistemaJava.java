/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informacoesdosistemajava;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;



/**
 *
 * @author YureFr-BR
 */

public class InformacoesDoSistemaJava extends javax.swing.JFrame {

    /**
     * Creates new form InformacoesDoSistemaJava
     */
    public InformacoesDoSistemaJava() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMensagem1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblMensagem2 = new javax.swing.JLabel();
        btnInformacoesClick = new javax.swing.JButton();
        lblDataHora = new javax.swing.JLabel();
        lblMensagemSistema = new javax.swing.JLabel();
        lblSoName = new javax.swing.JLabel();
        lblMensagemArq = new javax.swing.JLabel();
        lblSoArch = new javax.swing.JLabel();
        lblMensagemIdioma = new javax.swing.JLabel();
        lblSoLanguage = new javax.swing.JLabel();
        lblMensagemResolucao = new javax.swing.JLabel();
        lblSoResolution = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informações do Sistema");

        lblMensagem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMensagem1.setText("Bem vindo de volta!");

        lblUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUsername.setText("jLabel2");
        lblUsername.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblUsernamePropertyChange(evt);
            }
        });

        lblMensagem2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMensagem2.setText("Acesso realizado em:");

        btnInformacoesClick.setText("Verificar demais informações");
        btnInformacoesClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacoesClickActionPerformed(evt);
            }
        });

        lblDataHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataHora.setText("jLabel4");
        lblDataHora.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblDataHoraPropertyChange(evt);
            }
        });

        lblMensagemSistema.setText("Sistema Operacional:");

        lblSoName.setText("lblSoName");
        lblSoName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblSoNamePropertyChange(evt);
            }
        });

        lblMensagemArq.setText("Arquitetura:");

        lblSoArch.setText("lblSoArch");

        lblMensagemIdioma.setText("Idioma do Sistema:");

        lblSoLanguage.setText("lblSoLanguage");

        lblMensagemResolucao.setText("Resolução da Tela:");

        lblSoResolution.setText("lblSoResolution");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblMensagemSistema)
                                .addComponent(lblMensagemArq)
                                .addComponent(lblMensagemIdioma)
                                .addComponent(lblMensagemResolucao))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSoResolution)
                                .addComponent(lblSoName)
                                .addComponent(lblSoArch)
                                .addComponent(lblSoLanguage)))
                        .addComponent(btnInformacoesClick))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMensagem1)
                            .addComponent(lblMensagem2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataHora)
                            .addComponent(lblUsername))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensagem1)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensagem2)
                    .addComponent(lblDataHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInformacoesClick)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensagemSistema)
                    .addComponent(lblSoName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensagemArq)
                    .addComponent(lblSoArch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensagemIdioma)
                    .addComponent(lblSoLanguage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMensagemResolucao)
                    .addComponent(lblSoResolution))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

                                          
    private void btnInformacoesClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacoesClickActionPerformed
       // TODO add your handling code here:
        String osName = System.getProperty("os.name");
        lblSoName.setText(osName);
        
        String archName = System.getProperty("os.arch");
        lblSoArch.setText(archName);
        
        Locale soLanguage = Locale.getDefault();
        lblSoLanguage.setText(soLanguage.getDisplayLanguage());
        
        Toolkit soResolution = Toolkit.getDefaultToolkit();
        Dimension D = soResolution.getScreenSize();
        lblSoResolution.setText(D.width + "x" + D.height);
        
        
    }//GEN-LAST:event_btnInformacoesClickActionPerformed

    private void lblUsernamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblUsernamePropertyChange
        // TODO add your handling code here:
        Properties userName = System.getProperties();
        lblUsername.setText( System.getProperty("user.name"));
        
        // Deixa em null os lbl do projeto
        lblSoName.setText("");
        lblSoArch.setText("");
        lblSoLanguage.setText("");
        lblSoResolution.setText("");
        
    }//GEN-LAST:event_lblUsernamePropertyChange

    private void lblDataHoraPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblDataHoraPropertyChange
        // TODO add your handling code here:
        Date relogio = new Date();
        lblDataHora.setText(relogio.toString());
        
    }//GEN-LAST:event_lblDataHoraPropertyChange

    private void lblSoNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblSoNamePropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_lblSoNamePropertyChange

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InformacoesDoSistemaJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacoesDoSistemaJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacoesDoSistemaJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacoesDoSistemaJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacoesDoSistemaJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInformacoesClick;
    private javax.swing.JLabel lblDataHora;
    private javax.swing.JLabel lblMensagem1;
    private javax.swing.JLabel lblMensagem2;
    private javax.swing.JLabel lblMensagemArq;
    private javax.swing.JLabel lblMensagemIdioma;
    private javax.swing.JLabel lblMensagemResolucao;
    private javax.swing.JLabel lblMensagemSistema;
    private javax.swing.JLabel lblSoArch;
    private javax.swing.JLabel lblSoLanguage;
    private javax.swing.JLabel lblSoName;
    private javax.swing.JLabel lblSoResolution;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}

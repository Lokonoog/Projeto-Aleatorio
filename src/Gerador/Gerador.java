package Gerador;

import Visao.TelaPrincipal;
import javax.swing.JOptionPane;

public class Gerador extends javax.swing.JFrame {

    public Gerador() {
        initComponents();
    }
    
int mat = 0,bol=0,grade=0,trans=0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBmatricula = new javax.swing.JButton();
        jBboleto = new javax.swing.JButton();
        jBgrade = new javax.swing.JButton();
        jBtransferencia = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        jBzerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jBmatricula.setText("Matricula");
        jBmatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmatriculaActionPerformed(evt);
            }
        });

        jBboleto.setText("Boleto");
        jBboleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBboletoActionPerformed(evt);
            }
        });

        jBgrade.setText("Grade");
        jBgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgradeActionPerformed(evt);
            }
        });

        jBtransferencia.setText("Tranferencia");
        jBtransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtransferenciaActionPerformed(evt);
            }
        });

        jBsair.setText("Sair");
        jBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsairActionPerformed(evt);
            }
        });

        jBzerar.setText("Zerar");
        jBzerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBzerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBzerar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBsair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBgrade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtransferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBboleto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBmatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBboleto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBzerar)
                    .addComponent(jBsair))
                .addGap(58, 58, 58))
        );

        setSize(new java.awt.Dimension(326, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBboletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBboletoActionPerformed
    bol ++;
       JOptionPane.showMessageDialog(null,bol + "º senha boleto");
    }//GEN-LAST:event_jBboletoActionPerformed

    private void jBmatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmatriculaActionPerformed
    mat ++;
        JOptionPane.showMessageDialog(null,mat + "º senha matricula ");
    }//GEN-LAST:event_jBmatriculaActionPerformed

    private void jBgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgradeActionPerformed
    grade ++;
        JOptionPane.showMessageDialog(null,grade + "º senha grade");
    }//GEN-LAST:event_jBgradeActionPerformed

    private void jBtransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtransferenciaActionPerformed
    trans ++;
        JOptionPane.showMessageDialog(null,trans + "º senha transferencia");
    }//GEN-LAST:event_jBtransferenciaActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
    dispose();
    }//GEN-LAST:event_jBsairActionPerformed

    private void jBzerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBzerarActionPerformed
    int code;
        code = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a senha"));
        if (code == 123){
        mat = 0;
        grade = 0;
        bol = 0;
        trans = 0;
      JOptionPane.showMessageDialog(null,"Zerado com sucesso.");
        }else JOptionPane.showMessageDialog(null,"Tente denovo, senha incorreta.");
    }//GEN-LAST:event_jBzerarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Gerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gerador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gerador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBboleto;
    private javax.swing.JButton jBgrade;
    private javax.swing.JButton jBmatricula;
    private javax.swing.JButton jBsair;
    private javax.swing.JButton jBtransferencia;
    private javax.swing.JButton jBzerar;
    // End of variables declaration//GEN-END:variables
}

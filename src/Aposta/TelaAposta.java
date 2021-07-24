/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aposta;

import Visao.TelaPrincipal;

/**
 *
 * @author aluno
 */
public class TelaAposta extends javax.swing.JFrame {

    /**
     * Creates new form TelaAposta
     */
    public TelaAposta() {
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

        jBsena = new javax.swing.JButton();
        jBfacil = new javax.swing.JButton();
        jBquina = new javax.swing.JButton();
        jBmania = new javax.swing.JButton();
        jBdupla = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jBsena.setBackground(new java.awt.Color(0, 153, 0));
        jBsena.setForeground(new java.awt.Color(255, 255, 255));
        jBsena.setText("Mega Sena");
        jBsena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsenaActionPerformed(evt);
            }
        });

        jBfacil.setBackground(new java.awt.Color(153, 0, 153));
        jBfacil.setForeground(new java.awt.Color(255, 255, 255));
        jBfacil.setText("Loto Facil");
        jBfacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfacilActionPerformed(evt);
            }
        });

        jBquina.setBackground(new java.awt.Color(0, 102, 255));
        jBquina.setForeground(new java.awt.Color(255, 255, 255));
        jBquina.setText("Quina");
        jBquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBquinaActionPerformed(evt);
            }
        });

        jBmania.setBackground(new java.awt.Color(255, 153, 0));
        jBmania.setForeground(new java.awt.Color(255, 255, 255));
        jBmania.setText("Loto Mania");
        jBmania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmaniaActionPerformed(evt);
            }
        });

        jBdupla.setText("Dupla Sena");

        jBsair.setText("Sair");
        jBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jBsena)
                .addGap(61, 61, 61)
                .addComponent(jBfacil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jBquina)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBmania)
                .addGap(47, 47, 47)
                .addComponent(jBdupla)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBsair)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsena)
                    .addComponent(jBfacil)
                    .addComponent(jBquina))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBmania)
                    .addComponent(jBdupla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jBsair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsenaActionPerformed
        MegaSena tela =  new MegaSena();
        tela.setVisible(true);
        
    }//GEN-LAST:event_jBsenaActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        dispose();
    }//GEN-LAST:event_jBsairActionPerformed

    private void jBfacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfacilActionPerformed
        LotoFacil tela =  new LotoFacil();
        tela.setVisible(true);
        
    }//GEN-LAST:event_jBfacilActionPerformed

    private void jBquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBquinaActionPerformed
        Quina tela =  new Quina();
        tela.setVisible(true);
        
    }//GEN-LAST:event_jBquinaActionPerformed

    private void jBmaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmaniaActionPerformed
        LotoMania tela = new LotoMania();
        tela.setVisible(true);
        
    }//GEN-LAST:event_jBmaniaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        
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
            java.util.logging.Logger.getLogger(TelaAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAposta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAposta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBdupla;
    private javax.swing.JButton jBfacil;
    private javax.swing.JButton jBmania;
    private javax.swing.JButton jBquina;
    private javax.swing.JButton jBsair;
    private javax.swing.JButton jBsena;
    // End of variables declaration//GEN-END:variables
}

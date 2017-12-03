/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shah
 */
public class MainMenu extends javax.swing.JFrame {

    Data da=new Data();
    
    public MainMenu() {
        initComponents(); 
        da.musicPlay();
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
        ShipInfo = new javax.swing.JButton();
        ShipGraphic = new javax.swing.JButton();
        ShipShuffle = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Trading Ship Puzzle");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 10, 155, 22);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 320, 60, 30);

        ShipInfo.setText("Ship Information");
        ShipInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShipInfoActionPerformed(evt);
            }
        });
        jPanel1.add(ShipInfo);
        ShipInfo.setBounds(60, 100, 160, 23);

        ShipGraphic.setText("See The Ship");
        ShipGraphic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShipGraphicActionPerformed(evt);
            }
        });
        jPanel1.add(ShipGraphic);
        ShipGraphic.setBounds(60, 160, 160, 23);

        ShipShuffle.setText("Shuffle The Ship");
        ShipShuffle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShipShuffleActionPerformed(evt);
            }
        });
        jPanel1.add(ShipShuffle);
        ShipShuffle.setBounds(60, 230, 160, 23);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soundon.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(240, 410, 40, 40);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Credit.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(0, 410, 40, 41);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ocean.gif"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-10, 0, 290, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShipInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShipInfoActionPerformed
        new Qna().setVisible(true);
        dispose();
    }//GEN-LAST:event_ShipInfoActionPerformed

    private void ShipGraphicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShipGraphicActionPerformed
        new GraphicalShip().setVisible(true);
    }//GEN-LAST:event_ShipGraphicActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       new Credit().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ShipShuffleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShipShuffleActionPerformed
        new Position().setVisible(true);
        dispose();
    }//GEN-LAST:event_ShipShuffleActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ShipGraphic;
    private javax.swing.JButton ShipInfo;
    private javax.swing.JButton ShipShuffle;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

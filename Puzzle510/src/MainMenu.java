/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shah
 */
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class MainMenu extends javax.swing.JFrame {

    static int sound=2;
    static InputStream inputStream;
    static AudioStream audioStream;
    private ImageIcon imageOn = new ImageIcon(getClass().getResource("/soundOn.png"));
    private ImageIcon imageOff = new ImageIcon(getClass().getResource("/soundOff.png"));
    int j=0;
    
    public MainMenu() {
        initComponents();
        icon();
    }

    public void musicPlay()
    {
        try
        {               
            if(sound == 2)
            {
                inputStream = new FileInputStream("GameSong.wav");
                audioStream = new AudioStream(inputStream);
            }            
            if(sound == 1)
            {
                AudioPlayer.player.stop(audioStream);  
                sound = 2;
                return;
            }    
            if(sound == 0 || sound == 2)
            {
                AudioPlayer.player.start(audioStream);
                sound = 1;
            }
             
            
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        SoundButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trading Ship Puzzle");

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Trading Ship Puzzle");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 20, 180, 50);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 360, 60, 40);

        jButton3.setText("Ship Information");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(90, 110, 180, 23);

        jButton4.setText("See The Ship");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(90, 180, 180, 23);

        jButton5.setText("Shuffle The Ship");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(90, 250, 180, 23);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Credit.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 410, 40, 40);

        SoundButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soundon.png"))); // NOI18N
        SoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoundButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SoundButton);
        SoundButton.setBounds(310, 410, 40, 40);

        jButton2.setText("Table Information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(90, 320, 180, 23);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ocean.gif"))); // NOI18N
        Background.setText("Ocean");
        jPanel1.add(Background);
        Background.setBounds(0, 0, 360, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Credit().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoundButtonActionPerformed
        if(sound == 1)
        {
            musicPlay();
            SoundButton.setIcon(imageOn);             
            return;
        }
        if(sound == 0 || sound == 2)
        {
            musicPlay();            
            SoundButton.setIcon(imageOff); 
        }
    }//GEN-LAST:event_SoundButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Position().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new GraphicalShip(j).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void icon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Ship.png")));
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Qna(j).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Table().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JLabel Background;
    private javax.swing.JButton SoundButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

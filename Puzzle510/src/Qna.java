
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shah & Ikhwan
 */
public class Qna extends javax.swing.JFrame {
    
    private Data[] q = new Data[5];
    private Position po=new Position();
    private ImageIcon[] imagelist=new ImageIcon[5];
    private int i,k;
    private static int j=0;
    
    public Qna() {
        initComponents();
        InfoPanel.setVisible(false);
        PicInfo.setVisible(false);
        setInfo();
        jLabel3.setText(q[1].Ship);
    }
    
    public Qna(int b){
        j=b;
        setInfo();
        jLabel3.setText(q[1].Ship);
    }
    
    public void setInfo(){
        for(int l=0;l<q.length;l++){
            if(j == 0)
                q[l]=po.d[l]; 
            else if(j == 1)
                q[l]=po.p[l];
        }
        return;  
    }
    
   
    public void Process(){
        ShipName.setText(q[i].Ship);
        ShipName1.setText(q[i].Ship);
        ShipName2.setText(q[i].Ship);
    }
    
    public void Select(){
        InfoPanel.setVisible(true);
        ContentButton.setSelected(false);
        ShipButton.setSelected(false);
        RightButton.setSelected(false);
        LeftButton.setSelected(false);
        ContainedButton.setSelected(false);
        HeadedButton.setSelected(false);
        PicInfo.setVisible(false);
        ShipInfo.setVisible(false);
        ContentInfo.setVisible(false);
        ArriveInfo.setVisible(false);
        DestinationInfo.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FrenchButton = new javax.swing.JRadioButton();
        GreekButton = new javax.swing.JRadioButton();
        BrazilianButton = new javax.swing.JRadioButton();
        EnglishButton = new javax.swing.JRadioButton();
        SpanishButton = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        InfoPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ShipInfo = new javax.swing.JLabel();
        ContentInfo = new javax.swing.JLabel();
        DestinationInfo = new javax.swing.JLabel();
        ArriveInfo = new javax.swing.JLabel();
        PicInfo = new javax.swing.JLabel();
        ContentButton = new javax.swing.JRadioButton();
        ShipName = new javax.swing.JLabel();
        ShipButton = new javax.swing.JRadioButton();
        RightButton = new javax.swing.JRadioButton();
        ShipName1 = new javax.swing.JLabel();
        LeftButton = new javax.swing.JRadioButton();
        ShipName2 = new javax.swing.JLabel();
        ContainedButton = new javax.swing.JRadioButton();
        HeadedButton = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ship Information");

        jLabel2.setText("Select a ship you wish to acquire information");

        FrenchButton.setText("French Ship");
        FrenchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrenchButtonActionPerformed(evt);
            }
        });

        GreekButton.setText("Greek Ship");
        GreekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreekButtonActionPerformed(evt);
            }
        });

        BrazilianButton.setText("Brazilian Ship");
        BrazilianButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrazilianButtonActionPerformed(evt);
            }
        });

        EnglishButton.setText("English Ship");
        EnglishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnglishButtonActionPerformed(evt);
            }
        });

        SpanishButton.setText("Spanish Ship");
        SpanishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpanishButtonActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainMenu.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        InfoPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PicInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BrazilianShip.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PicInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(ShipInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ContentInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DestinationInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ArriveInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PicInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShipInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ContentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ArriveInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DestinationInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ContentButton.setText("The info of");
        ContentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContentButtonActionPerformed(evt);
            }
        });

        ShipButton.setText("The ship");
        ShipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShipButtonActionPerformed(evt);
            }
        });

        RightButton.setText("To the right of");
        RightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RightButtonActionPerformed(evt);
            }
        });

        LeftButton.setText("To the left of");
        LeftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeftButtonActionPerformed(evt);
            }
        });

        ContainedButton.setText("Contained");
        ContainedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContainedButtonActionPerformed(evt);
            }
        });

        HeadedButton.setText("Headed to");
        HeadedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeadedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InfoPanelLayout = new javax.swing.GroupLayout(InfoPanel);
        InfoPanel.setLayout(InfoPanelLayout);
        InfoPanelLayout.setHorizontalGroup(
            InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoPanelLayout.createSequentialGroup()
                        .addComponent(ContentButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ShipName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(InfoPanelLayout.createSequentialGroup()
                        .addComponent(ShipButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(InfoPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InfoPanelLayout.createSequentialGroup()
                                .addComponent(LeftButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShipName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(InfoPanelLayout.createSequentialGroup()
                                .addComponent(RightButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShipName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(InfoPanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HeadedButton)
                                    .addComponent(ContainedButton))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        InfoPanelLayout.setVerticalGroup(
            InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(InfoPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContentButton)
                    .addComponent(ShipName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ShipButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RightButton)
                    .addComponent(ShipName1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LeftButton)
                    .addComponent(ShipName2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ContainedButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HeadedButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("Show Me The Ship");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FrenchButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BrazilianButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpanishButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GreekButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EnglishButton)
                                .addGap(0, 39, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(133, 133, 133)
                                        .addComponent(jLabel1)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FrenchButton)
                    .addComponent(BrazilianButton)
                    .addComponent(EnglishButton)
                    .addComponent(SpanishButton)
                    .addComponent(GreekButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FrenchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrenchButtonActionPerformed
        FrenchButton.setSelected(true);
        GreekButton.setSelected(false);
        BrazilianButton.setSelected(false);
        EnglishButton.setSelected(false);
        SpanishButton.setSelected(false);
        i=0;
        Select();       
        Process();
    }//GEN-LAST:event_FrenchButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new MainMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void GreekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreekButtonActionPerformed
        FrenchButton.setSelected(false);
        GreekButton.setSelected(true);
        BrazilianButton.setSelected(false);
        EnglishButton.setSelected(false);
        SpanishButton.setSelected(false);
        i=1;
        Select();
        Process();
    }//GEN-LAST:event_GreekButtonActionPerformed

    private void BrazilianButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrazilianButtonActionPerformed
        FrenchButton.setSelected(false);
        GreekButton.setSelected(false);
        BrazilianButton.setSelected(true);
        EnglishButton.setSelected(false);
        SpanishButton.setSelected(false);
        i=2;
        Select();
        Process();
    }//GEN-LAST:event_BrazilianButtonActionPerformed

    private void EnglishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnglishButtonActionPerformed
        FrenchButton.setSelected(false);
        GreekButton.setSelected(false);
        BrazilianButton.setSelected(false);
        EnglishButton.setSelected(true);
        SpanishButton.setSelected(false);
        i=3;
        Select();
        Process();
    }//GEN-LAST:event_EnglishButtonActionPerformed

    private void SpanishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpanishButtonActionPerformed
        FrenchButton.setSelected(false);
        GreekButton.setSelected(false);
        BrazilianButton.setSelected(false);
        EnglishButton.setSelected(false);
        SpanishButton.setSelected(true);
        i=4;
        Select();
        Process();
    }//GEN-LAST:event_SpanishButtonActionPerformed

    private void ShipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShipButtonActionPerformed
        ContentButton.setSelected(false);
        if(i==0)
            LeftButton.setEnabled(false);
        if(i==4)
            RightButton.setEnabled(false);
        if(i!=0 && i!=4){
            LeftButton.setEnabled(true);
            RightButton.setEnabled(true);
        }
    }//GEN-LAST:event_ShipButtonActionPerformed

    private void ContentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContentButtonActionPerformed
        ShipButton.setSelected(false);
        RightButton.setSelected(false);
        LeftButton.setSelected(false);
        ContainedButton.setSelected(false);
        HeadedButton.setSelected(false);
        imagelist[i]=new ImageIcon(getClass().getResource("/"+q[i].Picture));
        PicInfo.setIcon(imagelist[i]);
        PicInfo.setVisible(true);
        ShipInfo.setVisible(true);
        ContentInfo.setVisible(true);
        ArriveInfo.setVisible(true);
        DestinationInfo.setVisible(true);
        ShipInfo.setText("Ship's name: "+q[i].Ship+" with "+q[i].Chimney+" chimney");
        ContentInfo.setText("Content: "+q[i].Content);
        ArriveInfo.setText("Departing Time: "+q[i].Arrival);
        DestinationInfo.setText("Destination: "+q[i].Destination);
      
    }//GEN-LAST:event_ContentButtonActionPerformed

    private void RightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RightButtonActionPerformed
        LeftButton.setSelected(false);
        ContainedButton.setSelected(false);
        HeadedButton.setSelected(false);
        if(i==4)
            k=4;
        else
            k=i+1;
        imagelist[k]=new ImageIcon(getClass().getResource("/"+q[k].Picture));
        PicInfo.setIcon(imagelist[k]);
        PicInfo.setVisible(true);
        ShipInfo.setText("Ship's Name: "+q[k].Ship+" with "+q[k].Chimney+" chimney");
        ContentInfo.setVisible(false);
        ArriveInfo.setVisible(false);
        DestinationInfo.setVisible(false);
    }//GEN-LAST:event_RightButtonActionPerformed

    private void LeftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeftButtonActionPerformed
        RightButton.setSelected(false);
        ContainedButton.setSelected(false);
        HeadedButton.setSelected(false);
        if(i==0)
            k=0;
        else
            k=i-1;
        imagelist[k]=new ImageIcon(getClass().getResource("/"+q[k].Picture));
        PicInfo.setIcon(imagelist[k]);
        ShipInfo.setText("Ship's Name: "+q[k].Ship+" with "+q[k].Chimney+" chimney");
        ContentInfo.setVisible(false);
        ArriveInfo.setVisible(false);
        DestinationInfo.setVisible(false);
    }//GEN-LAST:event_LeftButtonActionPerformed

    private void ContainedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContainedButtonActionPerformed
        ContentInfo.setVisible(true);
        ContentInfo.setText(q[k].Content);
    }//GEN-LAST:event_ContainedButtonActionPerformed

    private void HeadedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeadedButtonActionPerformed
        DestinationInfo.setVisible(true);
        DestinationInfo.setText(q[k].Destination);
    }//GEN-LAST:event_HeadedButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new GraphicalShip().setVisible(true);
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
            java.util.logging.Logger.getLogger(Qna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Qna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Qna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Qna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Qna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ArriveInfo;
    private javax.swing.JRadioButton BrazilianButton;
    private javax.swing.JRadioButton ContainedButton;
    private javax.swing.JRadioButton ContentButton;
    private javax.swing.JLabel ContentInfo;
    private javax.swing.JLabel DestinationInfo;
    private javax.swing.JRadioButton EnglishButton;
    private javax.swing.JRadioButton FrenchButton;
    private javax.swing.JRadioButton GreekButton;
    private javax.swing.JRadioButton HeadedButton;
    private javax.swing.JPanel InfoPanel;
    private javax.swing.JRadioButton LeftButton;
    private javax.swing.JLabel PicInfo;
    private javax.swing.JRadioButton RightButton;
    private javax.swing.JRadioButton ShipButton;
    private javax.swing.JLabel ShipInfo;
    private javax.swing.JLabel ShipName;
    private javax.swing.JLabel ShipName1;
    private javax.swing.JLabel ShipName2;
    private javax.swing.JRadioButton SpanishButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursdenemesi;

/**
 *
 * @author tanrverdi
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public admin() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnÖgrenciBilgi = new javax.swing.JButton();
        btnÖgrenciPansiyon = new javax.swing.JButton();
        btnÖgrenciEgitim = new javax.swing.JButton();
        btnÖgreticiBilgileri = new javax.swing.JButton();
        btnÖgrenciUlasım = new javax.swing.JButton();
        btnKullanıcıEkle = new javax.swing.JButton();
        btnKursBilgileri = new javax.swing.JButton();
        btnGeri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMİN PANELİ ");

        jPanel1.setBackground(new java.awt.Color(110, 157, 237));

        jPanel2.setBackground(new java.awt.Color(128, 143, 240));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ımage/Admin-icon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 36)); // NOI18N
        jLabel2.setText("ADMİN PANELİ ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnÖgrenciBilgi.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btnÖgrenciBilgi.setText("ÖGRENCİ BİLGİLERİ (EKLE SİL VS)");
        btnÖgrenciBilgi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÖgrenciBilgiActionPerformed(evt);
            }
        });

        btnÖgrenciPansiyon.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btnÖgrenciPansiyon.setText("ÖGRENCİ PANSİYON BİLGİLERİ");
        btnÖgrenciPansiyon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÖgrenciPansiyonActionPerformed(evt);
            }
        });

        btnÖgrenciEgitim.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btnÖgrenciEgitim.setText("EĞİTİM BİLGİLERİ ");
        btnÖgrenciEgitim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÖgrenciEgitimActionPerformed(evt);
            }
        });

        btnÖgreticiBilgileri.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btnÖgreticiBilgileri.setText("KURS ÖĞRETİCİ BİLGİLERİ");
        btnÖgreticiBilgileri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÖgreticiBilgileriActionPerformed(evt);
            }
        });

        btnÖgrenciUlasım.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btnÖgrenciUlasım.setText("ULAŞIM VE AİLE BİLGİLERİ");
        btnÖgrenciUlasım.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÖgrenciUlasımActionPerformed(evt);
            }
        });

        btnKullanıcıEkle.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btnKullanıcıEkle.setText("KULLANICI EKLE ");
        btnKullanıcıEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKullanıcıEkleActionPerformed(evt);
            }
        });

        btnKursBilgileri.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btnKursBilgileri.setText("KURS BİLGİLERİ");
        btnKursBilgileri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKursBilgileriActionPerformed(evt);
            }
        });

        btnGeri.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btnGeri.setText("GERİ");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnÖgrenciBilgi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnÖgrenciPansiyon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnÖgrenciEgitim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnÖgreticiBilgileri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKullanıcıEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnÖgrenciUlasım, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKursBilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnÖgrenciBilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnÖgrenciPansiyon, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnÖgrenciEgitim, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnÖgreticiBilgileri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnÖgrenciUlasım, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnKullanıcıEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKursBilgileri, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnÖgrenciBilgiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÖgrenciBilgiActionPerformed
        this.setVisible(false);
        ögrenci geri=new ögrenci();
        geri.setVisible(true);
    }//GEN-LAST:event_btnÖgrenciBilgiActionPerformed

    private void btnÖgrenciPansiyonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÖgrenciPansiyonActionPerformed
        this.setVisible(false);
        pansiyon git=new pansiyon();
        git.setVisible(true);
    }//GEN-LAST:event_btnÖgrenciPansiyonActionPerformed

    private void btnÖgrenciEgitimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÖgrenciEgitimActionPerformed
        this.setVisible(false);
        egitim git=new egitim();
        git.setVisible(true);
    }//GEN-LAST:event_btnÖgrenciEgitimActionPerformed

    private void btnÖgreticiBilgileriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÖgreticiBilgileriActionPerformed
        this.setVisible(false);
        ögreticiBilgisi ögr=new ögreticiBilgisi();
        ögr.setVisible(true);
    }//GEN-LAST:event_btnÖgreticiBilgileriActionPerformed

    private void btnÖgrenciUlasımActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÖgrenciUlasımActionPerformed
        this.setVisible(false);
        aileBilgisi aile=new aileBilgisi();
        aile.setVisible(true);
    }//GEN-LAST:event_btnÖgrenciUlasımActionPerformed

    private void btnKullanıcıEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKullanıcıEkleActionPerformed

        this.setVisible(false);
        kullanıcıEkle kEkle=new kullanıcıEkle();
        kEkle.setVisible(true);
    }//GEN-LAST:event_btnKullanıcıEkleActionPerformed

    private void btnKursBilgileriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKursBilgileriActionPerformed

        this.setVisible(false);
        kursBilgisi kbilgisi=new kursBilgisi();
        kbilgisi.setVisible(true);
    }//GEN-LAST:event_btnKursBilgileriActionPerformed

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        this.setVisible(false);
        login geri=new login();
        geri.setVisible(true);
    }//GEN-LAST:event_btnGeriActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnKullanıcıEkle;
    private javax.swing.JButton btnKursBilgileri;
    private javax.swing.JButton btnÖgrenciBilgi;
    private javax.swing.JButton btnÖgrenciEgitim;
    private javax.swing.JButton btnÖgrenciPansiyon;
    private javax.swing.JButton btnÖgrenciUlasım;
    private javax.swing.JButton btnÖgreticiBilgileri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

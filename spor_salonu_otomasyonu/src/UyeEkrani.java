
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class UyeEkrani extends javax.swing.JDialog {

     DefaultTableModel model;
     UyeIslemleri islemler= new UyeIslemleri();
    /**
     * Creates new form UyeEkrani
     */
    public UyeEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model=(DefaultTableModel) uye_tablosu.getModel();
        uyeleriGoruntule();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        uye_tablosu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ad_alani = new javax.swing.JTextField();
        soyad_alani = new javax.swing.JTextField();
        boy_alani = new javax.swing.JTextField();
        kilo_alani = new javax.swing.JTextField();
        yas_alani = new javax.swing.JTextField();
        paket_alani = new javax.swing.JTextField();
        fiyat_alani = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        uye_ekle = new javax.swing.JButton();
        guncelle = new javax.swing.JButton();
        sil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));

        uye_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sıra", "Ad", "Soyad", "Boy", "Kilo", "Yas", "Paket", "Fiyat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        uye_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uye_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(uye_tablosu);
        if (uye_tablosu.getColumnModel().getColumnCount() > 0) {
            uye_tablosu.getColumnModel().getColumn(0).setResizable(false);
            uye_tablosu.getColumnModel().getColumn(1).setResizable(false);
            uye_tablosu.getColumnModel().getColumn(2).setResizable(false);
            uye_tablosu.getColumnModel().getColumn(3).setResizable(false);
            uye_tablosu.getColumnModel().getColumn(4).setResizable(false);
            uye_tablosu.getColumnModel().getColumn(5).setResizable(false);
            uye_tablosu.getColumnModel().getColumn(6).setResizable(false);
            uye_tablosu.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel1.setText("Yeni Üyenin Adı:");

        jLabel2.setText("Soyadı:");

        jLabel3.setText("Boyu:");

        jLabel4.setText("Kilosu:");

        jLabel5.setText("Yaşı:");

        jLabel6.setText("Aldığı Paket:");

        jLabel7.setText("Fiyatı:");

        mesaj_yazisi.setForeground(new java.awt.Color(51, 0, 204));

        uye_ekle.setText("Yeni Üye Ekle");
        uye_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uye_ekleActionPerformed(evt);
            }
        });

        guncelle.setText("Üye Bilgilerini Güncelle");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });

        sil.setText("Üyeliği Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ad_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(soyad_alani)
                            .addComponent(boy_alani)
                            .addComponent(kilo_alani)
                            .addComponent(yas_alani)
                            .addComponent(paket_alani)
                            .addComponent(fiyat_alani))
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uye_ekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uye_ekle))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boy_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(guncelle)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kilo_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yas_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(sil)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paket_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiyat_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(mesaj_yazisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uye_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uye_ekleActionPerformed
        
        mesaj_yazisi.setText("");
        String ad=ad_alani.getText();
        String soyad=soyad_alani.getText();
        String boy=boy_alani.getText();
        String kilo=kilo_alani.getText();
        String yas=yas_alani.getText();
        String paket=paket_alani.getText();
        String fiyat=fiyat_alani.getText();
        
        islemler.uyeEkle(ad,soyad,boy,kilo,yas,paket,fiyat);
        uyeleriGoruntule();
        mesaj_yazisi.setText("Yeni Üye Başarıyla Eklendi...");
    }//GEN-LAST:event_uye_ekleActionPerformed

    private void uye_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uye_tablosuMouseClicked
        
        int selected_row = uye_tablosu.getSelectedRow();
        ad_alani.setText(model.getValueAt(selected_row, 1).toString());
        soyad_alani.setText(model.getValueAt(selected_row, 2).toString());
        boy_alani.setText(model.getValueAt(selected_row, 3).toString());
        kilo_alani.setText(model.getValueAt(selected_row, 4).toString());
        yas_alani.setText(model.getValueAt(selected_row, 5).toString());
        paket_alani.setText(model.getValueAt(selected_row, 6).toString());
        fiyat_alani.setText(model.getValueAt(selected_row, 7).toString());
        
        
        
    }//GEN-LAST:event_uye_tablosuMouseClicked

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
        String ad = ad_alani.getText();
        String soyad = soyad_alani.getText();
        String boy = boy_alani.getText();
        String kilo = kilo_alani.getText();
        String yas = yas_alani.getText();
        String paket = paket_alani.getText();
        String fiyat = fiyat_alani.getText();
        
         int selectedrow = uye_tablosu.getSelectedRow();
        
        if(selectedrow == -1){
            
            if(model.getRowCount() == 0){
               mesaj_yazisi.setText("Üye tablosu şuanda boş");
            }else{
                mesaj_yazisi.setText("Lütfen güncellenecek bir alan seçiniz");
            }
        }else{
            
            int sıra = (int) model.getValueAt(selectedrow, 0);
            
            islemler.uyeGuncelle(sıra,ad,soyad,boy,kilo,yas,paket,fiyat);
            
            uyeleriGoruntule();
            
            mesaj_yazisi.setText("Üye bilgileri başarıyla güncellendi");
        }
        
    }//GEN-LAST:event_guncelleActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        mesaj_yazisi.setText("");
        
        int selectedrow = uye_tablosu.getSelectedRow();
        
        if(selectedrow == -1){
            
            if(model.getRowCount() == 0){
               mesaj_yazisi.setText("Üyeler tablosu şuanda boş");
            }else{
                mesaj_yazisi.setText("Lütfen silinecek bir üye seçiniz");
            }
        }else{
            
            int sıra = (int) model.getValueAt(selectedrow, 0);
            
            islemler.uyeSil(sıra);
            
            uyeleriGoruntule();
            
            mesaj_yazisi.setText("Üye başarıyla silindi");
        }
        
    }//GEN-LAST:event_silActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void uyeleriGoruntule(){
        
        model.setRowCount(0);
        ArrayList<Uye> uyeler=new ArrayList<Uye>();
        uyeler=islemler.uyeleriGetir();
        
        if (uyeler!= null) {
            
            for (Uye uye :uyeler) {
                Object[] eklenecek ={uye.getSıra(), uye.getAd(), uye.getSoyad(), uye.getBoy(), uye.getKilo(), uye.getYas(), uye.getPaket(), uye.getFiyat()};
                model.addRow(eklenecek);
            }
        }
        
    }
    
    
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
            java.util.logging.Logger.getLogger(UyeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UyeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UyeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UyeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UyeEkrani dialog = new UyeEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_alani;
    private javax.swing.JTextField boy_alani;
    private javax.swing.JTextField fiyat_alani;
    private javax.swing.JButton guncelle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kilo_alani;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JTextField paket_alani;
    private javax.swing.JButton sil;
    private javax.swing.JTextField soyad_alani;
    private javax.swing.JButton uye_ekle;
    private javax.swing.JTable uye_tablosu;
    private javax.swing.JTextField yas_alani;
    // End of variables declaration//GEN-END:variables
}

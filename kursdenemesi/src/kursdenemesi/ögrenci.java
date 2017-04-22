
package kursdenemesi;

import static com.sun.corba.se.impl.presentation.rmi.StubConnectImpl.connect;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.connect;
import static com.sun.jmx.remote.internal.IIOPHelper.connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static javax.management.remote.JMXConnectorFactory.connect;
import static javax.management.remote.JMXConnectorFactory.connect;
import static javax.rmi.PortableRemoteObject.connect;
import javax.swing.JOptionPane;


public class ögrenci extends javax.swing.JFrame {

    
    public ögrenci() {
        initComponents();
        for (int i =1900; i <2025; i++) {
                    
            cmbYil.addItem(Integer.toString(i));
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        projePUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("projePU").createEntityManager();
        ogrenciQuery2 = java.beans.Beans.isDesignTime() ? null : projePUEntityManager.createQuery("SELECT o FROM Ogrenci o");
        ogrenciList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : ogrenciQuery2.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        TextTcno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TextEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbGün = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbay = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbYil = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbCinsiyet = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BTNEKLE = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        TextTelefon = new javax.swing.JTextField();
        BTNSİL = new javax.swing.JButton();
        BTNGÜNCELLE = new javax.swing.JButton();
        btnToplam = new javax.swing.JButton();
        TextAdi = new javax.swing.JTextField();
        textToplam = new javax.swing.JTextField();
        cmbMemleket = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        TextSoyadi = new javax.swing.JTextField();
        btnGeri = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ÖGRENCİ PANELİ");

        jPanel1.setBackground(new java.awt.Color(116, 138, 233));

        jPanel2.setBackground(new java.awt.Color(143, 201, 229));

        table.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, ogrenciList2, table);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${adi}"));
        columnBinding.setColumnName("Adi");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${soyadi}"));
        columnBinding.setColumnName("Soyadi");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tcno}"));
        columnBinding.setColumnName("Tcno");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cinsiyet}"));
        columnBinding.setColumnName("Cinsiyet");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dogumgunu}"));
        columnBinding.setColumnName("Dogumgunu");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dogumayi}"));
        columnBinding.setColumnName("Dogumayi");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dogumyili}"));
        columnBinding.setColumnName("Dogumyili");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${telefon}"));
        columnBinding.setColumnName("Telefon");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${memleket}"));
        columnBinding.setColumnName("Memleket");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(table);

        TextTcno.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, table, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.tcno}"), TextTcno, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel1.setText("ADI :");

        TextEmail.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, table, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.email}"), TextEmail, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel2.setText("SOYADI :");

        cmbGün.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cmbGün.setMaximumRowCount(6);
        cmbGün.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbGün.setToolTipText("");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, table, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dogumgunu}"), cmbGün, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel3.setText("TC NO : ");

        cmbay.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cmbay.setMaximumRowCount(6);
        cmbay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, table, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dogumayi}"), cmbay, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel4.setText("DOĞUMTARİHİ :");

        cmbYil.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cmbYil.setMaximumRowCount(20);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, table, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dogumyili}"), cmbYil, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        cmbYil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYilActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel7.setText("CİNSİYET : ");

        cmbCinsiyet.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cmbCinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BAY ", "BAYAN" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, table, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cinsiyet}"), cmbCinsiyet, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel9.setText("E-MAİL : ");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel8.setText("MEMLEKET : ");

        BTNEKLE.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        BTNEKLE.setText("ÖĞRENCİ EKLE");
        BTNEKLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEKLEActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel10.setText("TELEFON : ");

        TextTelefon.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, table, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.telefon}"), TextTelefon, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        BTNSİL.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        BTNSİL.setText("ÖGRENCİ SİL");
        BTNSİL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSİLActionPerformed(evt);
            }
        });

        BTNGÜNCELLE.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        BTNGÜNCELLE.setText("ÖĞRENCİ GÜNCELLE");
        BTNGÜNCELLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGÜNCELLEActionPerformed(evt);
            }
        });

        btnToplam.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btnToplam.setText("TOPLAM KAYIT SAYISI");
        btnToplam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToplamActionPerformed(evt);
            }
        });

        TextAdi.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, table, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.adi}"), TextAdi, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        TextAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAdiActionPerformed(evt);
            }
        });

        textToplam.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N

        cmbMemleket.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cmbMemleket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01 Adana", "02 Adıyaman", "03 Afyon ", "04 Ağrı ", "05 Amasya", "06 Ankara", "07 Antalya", "08 Artvin", "09 Aydın", "10 Balıkesir", "11 Bilecik", "12 Bingöl", "13 Bitlis", "14 Bolu", "15 Burdur", "16 Bursa", "17 Çanakkale", "18 Çankırı", "19 Çorum", "20 Denizli", "21 Diyarbakır", "22 Edirne", "23 Elazığ", "24 Erzincan", "25 Erzurum", "26 Eskişehir", "27 Gaziantep", "28 Giresun", "29 Gümüşhane", "30 Hakkari", "31 Hatay", "32 Isparta", "33 İçel (Mersin)", "34 İstanbul", "35 İzmir", "36 Kars", "37 Kastamonu", "38 Kayseri", "39 Kırklareli", "40 Kırşehir", "41 Kocaeli", "42 Konya", "43 Kütahya", "44 Malatya", "45 Manisa", "46 K.maraş", "47 Mardin", "48 Muğla", "49 Muş", "50 Nevşehir", "51 Niğde", "52 Ordu", "53 Rize", "54 Sakarya", "55 Samsun", "56 Siirt", "57 Sinop", "58 Sivas", "59 Tekirdağ", "60 Tokat", "61 Trabzon", "62 Tunceli", "63 Şanlıurfa", "64 Uşak", "65 Van", "66 Yozgat", "67 Zonguldak", "68 Aksaray", "69 Bayburt", "70 Karaman", "71 Kırıkkale", "72 Batman", "73 Şırnak", "74 Bartın", "75 Ardahan", "76 Iğdır", "77 Yalova", "78 Karabük", "79 Kilis", "80 Osmaniye", "81 Düzce" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, table, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.memleket}"), cmbMemleket, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 3, 14)); // NOI18N
        jLabel6.setText("KAYIT SAYISI");

        TextSoyadi.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, table, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.soyadi}"), TextSoyadi, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        TextSoyadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSoyadiActionPerformed(evt);
            }
        });

        btnGeri.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btnGeri.setText("GERİ");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel5.setText("ID : ");

        TextId.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, table, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.id}"), TextId, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BTNEKLE, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(BTNSİL, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(BTNGÜNCELLE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbMemleket, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(cmbGün, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)
                                            .addComponent(cmbay, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(29, 29, 29)
                                            .addComponent(cmbYil, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(TextTcno, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextSoyadi, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                                        .addComponent(TextAdi)
                                        .addComponent(TextEmail)
                                        .addComponent(TextTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap(763, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(28, 28, 28)
                            .addComponent(textToplam, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(74, 74, 74))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(btnToplam)
                            .addGap(163, 163, 163)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextTcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbGün, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbYil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbCinsiyet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbMemleket, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TextTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNEKLE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNSİL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNGÜNCELLE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap(257, Short.MAX_VALUE)
                    .addComponent(btnToplam)
                    .addGap(45, 45, 45)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textToplam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGap(246, 246, 246)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbYilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbYilActionPerformed

    private void BTNEKLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEKLEActionPerformed
        Ogrenci ögr=new Ogrenci();
        ögr.setId(Integer.parseInt(TextId.getText()));
        ögr.setAdi(TextAdi.getText());
        ögr.setSoyadi(TextSoyadi.getText());
        ögr.setTcno(TextTcno.getText());
        ögr.setDogumgunu((String) cmbGün.getSelectedItem());
        ögr.setDogumayi((String) cmbay.getSelectedItem());
        ögr.setDogumyili((String) cmbYil.getSelectedItem());
        ögr.setCinsiyet((String) cmbCinsiyet.getSelectedItem());
        ögr.setMemleket((String) cmbMemleket.getSelectedItem());
        ögr.setEmail(TextEmail.getText());
        ögr.setTelefon(TextTelefon.getText());

        projePUEntityManager.getTransaction().begin();
        projePUEntityManager.persist(ögr);
        projePUEntityManager.getTransaction().commit();

        ogrenciList2.clear();
        ogrenciList2.addAll(ogrenciQuery2.getResultList());

        JOptionPane.showMessageDialog(null,"EKLEME BAŞARILI !!!");
        ogrenciList2.addAll(ogrenciQuery2.getResultList());


    }//GEN-LAST:event_BTNEKLEActionPerformed

    private void BTNSİLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSİLActionPerformed
        try{
            int idStr=Integer.parseInt(JOptionPane.showInputDialog("ID NUMARASI GİRİNİZ!!!"));
            Ogrenci ögr=projePUEntityManager.find(Ogrenci.class, idStr);
            projePUEntityManager.getTransaction().begin();
            projePUEntityManager.remove(ögr);
            projePUEntityManager.getTransaction().commit();
            projePUEntityManager.clear();

            ogrenciList2.addAll(ogrenciQuery2.getResultList());
            ogrenciList2.clear();

            ogrenciList2.addAll(ogrenciQuery2.getResultList());
            JOptionPane.showMessageDialog(null,"SİLME BAŞARILI !!!");

        }
        catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_BTNSİLActionPerformed

    private void BTNGÜNCELLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGÜNCELLEActionPerformed
        Ogrenci ögr=new Ogrenci();
        ögr.setId(Integer.parseInt(TextId.getText()));
        ögr.setAdi(TextAdi.getText());
        ögr.setSoyadi(TextSoyadi.getText());
        ögr.setTcno(TextTcno.getText());
        ögr.setDogumgunu((String) cmbGün.getSelectedItem());
        ögr.setDogumayi((String) cmbay.getSelectedItem());
        ögr.setDogumyili((String) cmbYil.getSelectedItem());
        ögr.setCinsiyet((String) cmbCinsiyet.getSelectedItem());
        ögr.setMemleket((String) cmbMemleket.getSelectedItem());
        ögr.setEmail(TextEmail.getText());
        ögr.setTelefon(TextTelefon.getText());

        projePUEntityManager.getTransaction().begin();
        projePUEntityManager.getTransaction().commit();
        projePUEntityManager.clear();

        ogrenciList2.clear();
        ogrenciList2.addAll(ogrenciQuery2.getResultList());

        JOptionPane.showMessageDialog(null,"GÜNCELLEME BAŞARILI !!!");
        ogrenciList2.addAll(ogrenciQuery2.getResultList());


        
    }//GEN-LAST:event_BTNGÜNCELLEActionPerformed

    private void btnToplamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToplamActionPerformed
        
    }//GEN-LAST:event_btnToplamActionPerformed

    private void TextAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextAdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAdiActionPerformed

    private void TextSoyadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSoyadiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSoyadiActionPerformed

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        this.setVisible(false);
        admin geri=new admin();
        geri.setVisible(true);
    }//GEN-LAST:event_btnGeriActionPerformed

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
            java.util.logging.Logger.getLogger(ögrenci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ögrenci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ögrenci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ögrenci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ögrenci().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNEKLE;
    private javax.swing.JButton BTNGÜNCELLE;
    private javax.swing.JButton BTNSİL;
    private javax.swing.JTextField TextAdi;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextField TextSoyadi;
    private javax.swing.JTextField TextTcno;
    private javax.swing.JTextField TextTelefon;
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnToplam;
    private javax.swing.JComboBox<String> cmbCinsiyet;
    private javax.swing.JComboBox<String> cmbGün;
    private javax.swing.JComboBox<String> cmbMemleket;
    private javax.swing.JComboBox<String> cmbYil;
    private javax.swing.JComboBox<String> cmbay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.util.List<kursdenemesi.Ogrenci> ogrenciList2;
    private javax.persistence.Query ogrenciQuery2;
    private javax.persistence.EntityManager projePUEntityManager;
    private javax.swing.JTable table;
    private javax.swing.JTextField textToplam;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

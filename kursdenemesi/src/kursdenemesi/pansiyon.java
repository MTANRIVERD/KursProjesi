/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursdenemesi;

import javax.swing.JOptionPane;

/**
 *
 * @author tanrverdi
 */
public class pansiyon extends javax.swing.JFrame {

    /**
     * Creates new form pansiyon
     */
    public pansiyon() {
        initComponents();
        for (int i =1900; i <2025; i++) {
                    
            cmbkayıtyılı.addItem(Integer.toString(i));
            
        }
        for (int i =1900; i <2025; i++) {
                    
            cmbayrılısyılı.addItem(Integer.toString(i));
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        projePUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("projePU").createEntityManager();
        pansiyonQuery = java.beans.Beans.isDesignTime() ? null : projePUEntityManager.createQuery("SELECT p FROM Pansiyon p");
        pansiyonList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : pansiyonQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        btnGeri = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textpanNo = new javax.swing.JTextField();
        textSicilNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textOdaNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textYatakNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textDolapNO = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textNöbetTürü = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textTemizlikYeri = new javax.swing.JTextField();
        buttonKayıt = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cmbayrılısgunu = new javax.swing.JComboBox<>();
        cmbayrılısayı = new javax.swing.JComboBox<>();
        cmbayrılısyılı = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cmbkayıtyılı = new javax.swing.JComboBox<>();
        cmbkayıtayı = new javax.swing.JComboBox<>();
        cmbkayıtgunu = new javax.swing.JComboBox<>();
        btnGüncelle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        cmbTürü = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PANSİYON PANELİ ");

        jPanel1.setBackground(new java.awt.Color(112, 134, 217));
        jPanel1.setName("PANSİYON PANELİ"); // NOI18N

        btnGeri.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btnGeri.setText("GERİ");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel1.setText("ÖGRPANNO:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel3.setText("ÖGRSİCİLNO: ");

        textpanNo.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.id}"), textpanNo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        textSicilNo.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.sicilno}"), textSicilNo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        textSicilNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSicilNoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel7.setText("ODA NO:");

        textOdaNo.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.odano}"), textOdaNo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel10.setText("YATAK NO: ");

        textYatakNo.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.yatakno}"), textYatakNo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel9.setText("DOLAP NO:");

        textDolapNO.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dolapno}"), textDolapNO, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel6.setText("ÖGR TÜRÜ : ");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel5.setText("NÖBETYERİ:");

        textNöbetTürü.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nobetyeri}"), textNöbetTürü, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel8.setText("TEMİZLİKYERİ:");

        textTemizlikYeri.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.temizlikyeri}"), textTemizlikYeri, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        buttonKayıt.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        buttonKayıt.setText("KAYIT YAP ");
        buttonKayıt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKayıtActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel11.setText("KAYIT TARİHİ: ");

        cmbayrılısgunu.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cmbayrılısgunu.setMaximumRowCount(6);
        cmbayrılısgunu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbayrılısgunu.setToolTipText("");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.ayrilisgunu}"), cmbayrılısgunu, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        cmbayrılısayı.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cmbayrılısayı.setMaximumRowCount(6);
        cmbayrılısayı.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.ayrilisayi}"), cmbayrılısayı, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        cmbayrılısyılı.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cmbayrılısyılı.setMaximumRowCount(20);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.ayrilisyili}"), cmbayrılısyılı, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        cmbayrılısyılı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbayrılısyılıActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel12.setText("AYRILIŞ TARİHİ: ");

        cmbkayıtyılı.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cmbkayıtyılı.setMaximumRowCount(20);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.kayityili}"), cmbkayıtyılı, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        cmbkayıtyılı.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbkayıtyılıActionPerformed(evt);
            }
        });

        cmbkayıtayı.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cmbkayıtayı.setMaximumRowCount(6);
        cmbkayıtayı.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.kayitayi}"), cmbkayıtayı, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        cmbkayıtgunu.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cmbkayıtgunu.setMaximumRowCount(6);
        cmbkayıtgunu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbkayıtgunu.setToolTipText("");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.kayitgunu}"), cmbkayıtgunu, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        btnGüncelle.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btnGüncelle.setText("GÜNCELLE");
        btnGüncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGüncelleActionPerformed(evt);
            }
        });

        btnSil.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btnSil.setText("SİL ");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        cmbTürü.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        cmbTürü.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HAFIZ", "YÜZÜNE" }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.turu}"), cmbTürü, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jTable1.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, pansiyonList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sicilno}"));
        columnBinding.setColumnName("Sicilno");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kayitgunu}"));
        columnBinding.setColumnName("Kayitgunu");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kayitayi}"));
        columnBinding.setColumnName("Kayitayi");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kayityili}"));
        columnBinding.setColumnName("Kayityili");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${odano}"));
        columnBinding.setColumnName("Odano");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${yatakno}"));
        columnBinding.setColumnName("Yatakno");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dolapno}"));
        columnBinding.setColumnName("Dolapno");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ayrilisgunu}"));
        columnBinding.setColumnName("Ayrilisgunu");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ayrilisayi}"));
        columnBinding.setColumnName("Ayrilisayi");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ayrilisyili}"));
        columnBinding.setColumnName("Ayrilisyili");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${turu}"));
        columnBinding.setColumnName("Turu");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nobetyeri}"));
        columnBinding.setColumnName("Nobetyeri");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${temizlikyeri}"));
        columnBinding.setColumnName("Temizlikyeri");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonKayıt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9))
                            .addComponent(jLabel7))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNöbetTürü)
                            .addComponent(textTemizlikYeri)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(btnGüncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cmbTürü, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbayrılısgunu, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbayrılısayı, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(cmbayrılısyılı, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbkayıtgunu, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbkayıtayı, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(cmbkayıtyılı, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textSicilNo)
                            .addComponent(textpanNo)
                            .addComponent(textOdaNo)
                            .addComponent(textYatakNo)
                            .addComponent(textDolapNO))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 658, Short.MAX_VALUE)
                .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGeri, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textpanNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(textSicilNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbkayıtgunu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbkayıtayı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbkayıtyılı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(textOdaNo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textYatakNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDolapNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbayrılısgunu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbayrılısayı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbayrılısyılı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(cmbTürü))
                        .addGap(12, 12, 12)
                        .addComponent(textNöbetTürü, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(textTemizlikYeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(54, 54, 54)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonKayıt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGüncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        this.setVisible(false);
        admin bilgi=new admin();
        bilgi.setVisible(true);
    }//GEN-LAST:event_btnGeriActionPerformed

    private void textSicilNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSicilNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSicilNoActionPerformed

    private void buttonKayıtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKayıtActionPerformed

        Pansiyon pns=new Pansiyon();
        pns.setId(Integer.parseInt(textpanNo.getText()));
        pns.setSicilno(textSicilNo.getText());
        pns.setKayitgunu((String) cmbkayıtgunu.getSelectedItem());
        pns.setKayitayi((String) cmbkayıtayı.getSelectedItem());
        pns.setKayityili((String) cmbkayıtyılı.getSelectedItem());
        pns.setOdano(textOdaNo.getText());
        pns.setYatakno(textYatakNo.getText());
        pns.setDolapno(textDolapNO.getText());
        pns.setAyrilisgunu((String) cmbayrılısgunu.getSelectedItem());
        pns.setAyrilisayi((String) cmbayrılısayı.getSelectedItem());
        pns.setAyrilisyili((String) cmbayrılısyılı.getSelectedItem());
        pns.setTuru((String) cmbTürü.getSelectedItem());
        pns.setNobetyeri(textNöbetTürü.getText());
        pns.setTemizlikyeri(textTemizlikYeri.getText());
        projePUEntityManager.getTransaction().begin();
        projePUEntityManager.persist(pns);
        projePUEntityManager.getTransaction().commit();

        pansiyonList.clear();
        pansiyonList.addAll(pansiyonQuery.getResultList());

        JOptionPane.showMessageDialog(null,"EKLEME BAŞARILI !!!");
        pansiyonList.addAll(pansiyonQuery.getResultList());
    }//GEN-LAST:event_buttonKayıtActionPerformed

    private void cmbayrılısyılıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbayrılısyılıActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbayrılısyılıActionPerformed

    private void cmbkayıtyılıActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbkayıtyılıActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbkayıtyılıActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        try{
            int idStr=Integer.parseInt(JOptionPane.showInputDialog("ID NUMARASI GİRİNİZ!!!"));
            Pansiyon pns=projePUEntityManager.find(Pansiyon.class, idStr);
            projePUEntityManager.getTransaction().begin();
            projePUEntityManager.remove(pns);
            projePUEntityManager.getTransaction().commit();
            projePUEntityManager.clear();

            pansiyonList.addAll(pansiyonQuery.getResultList());
            pansiyonList.clear();

            pansiyonList.addAll(pansiyonQuery.getResultList());
            JOptionPane.showMessageDialog(null,"SİLME BAŞARILI !!!");

        }
        catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnGüncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGüncelleActionPerformed
        
        Pansiyon pns=new Pansiyon();
        pns.setId(Integer.parseInt(textpanNo.getText()));
        pns.setSicilno(textSicilNo.getText());
        pns.setKayitgunu((String) cmbkayıtgunu.getSelectedItem());
        pns.setKayitayi((String) cmbkayıtayı.getSelectedItem());
        pns.setKayityili((String) cmbkayıtyılı.getSelectedItem());
        pns.setOdano(textOdaNo.getText());
        pns.setYatakno(textYatakNo.getText());
        pns.setDolapno(textDolapNO.getText());
        pns.setAyrilisgunu((String) cmbayrılısgunu.getSelectedItem());
        pns.setAyrilisayi((String) cmbayrılısayı.getSelectedItem());
        pns.setAyrilisyili((String) cmbayrılısyılı.getSelectedItem());
        pns.setTuru((String) cmbTürü.getSelectedItem());
        pns.setNobetyeri(textNöbetTürü.getText());
        pns.setTemizlikyeri(textTemizlikYeri.getText());
        projePUEntityManager.getTransaction().begin();
        projePUEntityManager.getTransaction().commit();
        projePUEntityManager.clear();

        pansiyonList.clear();
        pansiyonList.addAll(pansiyonQuery.getResultList());

        JOptionPane.showMessageDialog(null,"GÜNCELLEME BAŞARILI!!!");
        pansiyonList.addAll(pansiyonQuery.getResultList());
    }//GEN-LAST:event_btnGüncelleActionPerformed

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
            java.util.logging.Logger.getLogger(pansiyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pansiyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pansiyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pansiyon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pansiyon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnGüncelle;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton buttonKayıt;
    private javax.swing.JComboBox<String> cmbTürü;
    private javax.swing.JComboBox<String> cmbayrılısayı;
    private javax.swing.JComboBox<String> cmbayrılısgunu;
    private javax.swing.JComboBox<String> cmbayrılısyılı;
    private javax.swing.JComboBox<String> cmbkayıtayı;
    private javax.swing.JComboBox<String> cmbkayıtgunu;
    private javax.swing.JComboBox<String> cmbkayıtyılı;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.util.List<kursdenemesi.Pansiyon> pansiyonList;
    private javax.persistence.Query pansiyonQuery;
    private javax.persistence.EntityManager projePUEntityManager;
    private javax.swing.JTextField textDolapNO;
    private javax.swing.JTextField textNöbetTürü;
    private javax.swing.JTextField textOdaNo;
    private javax.swing.JTextField textSicilNo;
    private javax.swing.JTextField textTemizlikYeri;
    private javax.swing.JTextField textYatakNo;
    private javax.swing.JTextField textpanNo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

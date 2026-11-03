/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Cinta Ola Hernanda
 */
public class FormPendaftaranKursus extends javax.swing.JFrame {
    // Deklarasikan ButtonGroup di sini
    private javax.swing.ButtonGroup groupJenis = new javax.swing.ButtonGroup();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormPendaftaranKursus.class.getName());

    /**
     * Creates new form FormPendaftaranKursus
     */
    public FormPendaftaranKursus() {
        initComponents();
        // Mengelompokkan Radio Button agar hanya bisa dipilih salah satu
        groupJenis.add(rbMahasiswa);
        groupJenis.add(rbUmum);
        
        // Pengaturan tambahan form
        txtRingkasan.setEditable(false);
        setLocationRelativeTo(null);
    }

    // 1. Method mengambil jenis peserta
    private String getJenisPeserta() {
        if (rbMahasiswa.isSelected()) {
            return "Mahasiswa";
        }
        if (rbUmum.isSelected()) {
            return "Umum";
        }
        return "";
    }

// 2. Method menentukan biaya dasar dengan switch versi lama
    private double hitungBiayaDasar(String kursus) {
        double biaya = 0;
        switch (kursus) {
            case "Java Desktop":
                biaya = 500_000;
                break;
            case "Data Science":
                biaya = 650_000;
                break;
            case "Web Programming":
                biaya = 450_000;
                break;
            case "UI/UX Design":
                biaya = 400_000;
                break;
            default:
                biaya = 0;
                break;
        }
        return biaya;
    }

    // 3. Method menghitung biaya checkbox fasilitas[cite: 7]
    private double hitungBiayaFasilitas() {
        double total = 0;
        if (cbModul.isSelected()) {
            total += 50_000;
        }
        if (cbSertifikat.isSelected()) {
            total += 75_000;
        }
        if (cbRekaman.isSelected()) {
            total += 40_000;
        }
        return total;
    }

    // 4. Method array + loop fasilitas[cite: 10]
    private String buatRingkasanFasilitas() {
        String[] fasilitasDipilih = new String[3];
        int jumlah = 0;
        
        if (cbModul.isSelected()) {
            fasilitasDipilih[jumlah] = "Modul Cetak";
            jumlah++;
        }
        if (cbSertifikat.isSelected()) {
            fasilitasDipilih[jumlah] = "Sertifikat";
            jumlah++;
        }
        if (cbRekaman.isSelected()) {
            fasilitasDipilih[jumlah] = "Akses Rekaman";
            jumlah++;
        }
        
        if (jumlah == 0) {
            return "Tidak ada fasilitas tambahan";
        }
        
        StringBuilder hasil = new StringBuilder();
        for (int i = 0; i < jumlah; i++) {
            hasil.append("- ").append(fasilitasDipilih[i]).append("\n");
        }
        return hasil.toString();
    }

    // 5. Method validasi input[cite: 11]
    private boolean validasiInput() {
        String nama = txtNama.getText().trim();
        String kode = new String(txtKodeAkses.getText());
        
        if (nama.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Nama peserta wajib diisi.",
                "Validasi",
                javax.swing.JOptionPane.WARNING_MESSAGE);
            txtNama.requestFocus();
            return false;
        }
        
        if (!kode.equals("PB02026")) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Kode akses demo salah.",
                "Validasi",
                javax.swing.JOptionPane.WARNING_MESSAGE);
            txtKodeAkses.requestFocus();
            return false;
        }
        
        if (!rbMahasiswa.isSelected() && !rbUmum.isSelected()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Pilih jenis peserta.",
                "Validasi",
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if (cmbKursus.getSelectedIndex() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Pilih kursus terlebih dahulu.",
                "Validasi",
                javax.swing.JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        return true;
    }

    // 6. Method reset form
    private void resetForm() {
        txtNama.setText("");
        txtKodeAkses.setText("");
        groupJenis.clearSelection();
        cmbKursus.setSelectedIndex(0);
        cbModul.setSelected(false);
        cbSertifikat.setSelected(false);
        cbRekaman.setSelected(false);
        txtRingkasan.setText("");
        txtNama.requestFocus();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNama = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnProses = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtKodeAkses = new javax.swing.JTextPane();
        rbMahasiswa = new javax.swing.JRadioButton();
        rbUmum = new javax.swing.JRadioButton();
        cmbKursus = new javax.swing.JComboBox<>();
        cbModul = new javax.swing.JCheckBox();
        cbSertifikat = new javax.swing.JCheckBox();
        cbRekaman = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRingkasan = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 102, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Form Pendaftaran Kursus");
        jLabel1.setAlignmentY(0.6F);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nama Peserta");

        jScrollPane1.setViewportView(txtNama);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Kode Akses");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Jenis Peserta");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Kursus");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Fasilitas");

        btnProses.setBackground(new java.awt.Color(153, 255, 51));
        btnProses.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnProses.setText("Proses");
        btnProses.addActionListener(this::btnProsesActionPerformed);

        btnReset.setBackground(new java.awt.Color(255, 102, 102));
        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setActionCommand("Reset");
        btnReset.addActionListener(this::btnResetActionPerformed);

        jScrollPane4.setViewportView(txtKodeAkses);

        rbMahasiswa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbMahasiswa.setLabel("Mahasiswa");
        rbMahasiswa.addActionListener(this::rbMahasiswaActionPerformed);

        rbUmum.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbUmum.setText("Umum");
        rbUmum.addActionListener(this::rbUmumActionPerformed);

        cmbKursus.setBackground(new java.awt.Color(204, 204, 204));
        cmbKursus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cmbKursus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kursus--", "Java Desktop", "Data Science", "Web Programing", "UI/UX Design" }));

        cbModul.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbModul.setText("Modul");

        cbSertifikat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbSertifikat.setText("Sertifikat");
        cbSertifikat.addActionListener(this::cbSertifikatActionPerformed);

        cbRekaman.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbRekaman.setText("Akses Rekaman");
        cbRekaman.addActionListener(this::cbRekamanActionPerformed);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Ringkasan");

        txtRingkasan.setColumns(20);
        txtRingkasan.setRows(5);
        jScrollPane2.setViewportView(txtRingkasan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane4)
                    .addComponent(cmbKursus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnProses)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbMahasiswa)
                        .addGap(18, 18, 18)
                        .addComponent(rbUmum))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbModul, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSertifikat, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbRekaman))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbMahasiswa)
                        .addComponent(rbUmum)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cmbKursus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbModul)
                        .addComponent(cbSertifikat)
                        .addComponent(cbRekaman)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 156, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProses)
                    .addComponent(btnReset))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
if (!validasiInput()) {
            return;
        }
        
        String nama = txtNama.getText().trim();
        String jenis = getJenisPeserta();
        String kursus = cmbKursus.getSelectedItem().toString();
        
        double biayaDasar = hitungBiayaDasar(kursus);
        // Peserta Mahasiswa mendapat diskon 10%[cite: 6]
        double diskon = jenis.equals("Mahasiswa") ? biayaDasar * 0.10 : 0;
        double biayaFasilitas = hitungBiayaFasilitas();
        double total = (biayaDasar - diskon) + biayaFasilitas;
        
        String fasilitas = buatRingkasanFasilitas();
        
        String ringkasan = 
            "PENDAFTARAN KURSUS\n" +
            "=====================\n" +
            "Nama          : " + nama + "\n" +
            "Jenis Peserta : " + jenis + "\n" +
            "Kursus        : " + kursus + "\n" +
            "Biaya Dasar   : Rp" + String.format("%,.0f", biayaDasar) + "\n" +
            "Diskon        : Rp" + String.format("%,.0f", diskon) + "\n" +
            "=====================\n" +
            "Fasilitas:\n" + fasilitas +
            "Biaya Fasilitas: Rp" + String.format("%,.0f", biayaFasilitas) + "\n" +
            "TOTAL         : Rp" + String.format("%,.0f", total);
            
        txtRingkasan.setText(ringkasan);
        
        javax.swing.JOptionPane.showMessageDialog(this,
            "Pendaftaran berhasil diproses.",
            "Berhasil",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
    
    }//GEN-LAST:event_btnProsesActionPerformed

    private void rbMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMahasiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMahasiswaActionPerformed

    private void cbRekamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRekamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRekamanActionPerformed

    private void cbSertifikatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSertifikatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSertifikatActionPerformed

    private void rbUmumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUmumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbUmumActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        int jawab = javax.swing.JOptionPane.showConfirmDialog(
                this,
                "Kosongkan seluruh input?",
                "Konfirmasi Reset",
                javax.swing.JOptionPane.YES_NO_OPTION);

        if (jawab == javax.swing.JOptionPane.YES_OPTION) {
            resetForm();
}    }//GEN-LAST:event_btnResetActionPerformed

/**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormPendaftaranKursus().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProses;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox cbModul;
    private javax.swing.JCheckBox cbRekaman;
    private javax.swing.JCheckBox cbSertifikat;
    private javax.swing.JComboBox<String> cmbKursus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton rbMahasiswa;
    private javax.swing.JRadioButton rbUmum;
    private javax.swing.JTextPane txtKodeAkses;
    private javax.swing.JTextPane txtNama;
    private javax.swing.JTextArea txtRingkasan;
    // End of variables declaration//GEN-END:variables
}

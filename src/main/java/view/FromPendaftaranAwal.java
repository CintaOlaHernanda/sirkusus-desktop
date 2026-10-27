/*
 * SIKURSUS Desktop - Form Pendaftaran Kursus
 * Lanjutan Praktikum PBO Pertemuan 4.
 * Layout responsif untuk Apache NetBeans 8.2 / Java Swing.
 */
package view;

import javax.swing.JOptionPane;
import model.Kursus;

public class FromPendaftaranAwal extends javax.swing.JFrame {
private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormPendaftaranAwal.class.getName());

public FromPendaftaranAwal() {
        initComponents();
        getRootPane().setDefaultButton(btnProses);
        
        // Batas minimum menjaga form tetap nyaman saat window diperkecil.
        setMinimumSize(new java.awt.Dimension(700, 520));
        
        // Ukuran awal yang nyaman. Saat di-maximize, GroupLayout akan menyesuaikan.
        setSize(new java.awt.Dimension(900, 560));
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBiaya = new javax.swing.JTextField();
        txtKodeKursus = new javax.swing.JTextField();
        txtDiskon = new javax.swing.JTextField();
        cmbKursus = new javax.swing.JComboBox<>();
        cmbLevel = new javax.swing.JComboBox<>();
        btnProses = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Form Pendaftaran Kursus");

        jLabel2.setText("Kode Kursus");

        jLabel3.setText("Nama Kursus");

        jLabel4.setText("Level");

        jLabel5.setText("Biaya Kursus");

        jLabel6.setText("Diskon (%)");

        txtBiaya.addActionListener(this::txtBiayaActionPerformed);

        txtKodeKursus.addActionListener(this::txtKodeKursusActionPerformed);

        cmbKursus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java", "UI/UX", "Data Science" }));

        cmbLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INTERMEDIATE", "BASIC" }));

        btnProses.setText("Proses");
        btnProses.addActionListener(this::btnProsesActionPerformed);

        btnReset.setText("Reset");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtKodeKursus, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDiskon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBiaya, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbKursus, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbLevel, 0, 235, Short.MAX_VALUE))
                        .addGap(66, 66, 66))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnProses)
                .addGap(121, 121, 121)
                .addComponent(btnReset)
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKodeKursus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbKursus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnProses))
                .addGap(155, 155, 155))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKodeKursusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeKursusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeKursusActionPerformed

    private void txtBiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBiayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBiayaActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
String kode = txtKodeKursus.getText().trim();
        String nama = cmbKursus.getSelectedItem().toString();
        String level = cmbLevel.getSelectedItem().toString();
        String strBiaya = txtBiaya.getText().trim();
        String strDiskon = txtDiskon.getText().trim();

        if (kode.isEmpty() || strBiaya.isEmpty() || strDiskon.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Kode kursus, biaya, dan diskon wajib diisi.",
                    "Validasi Input",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            double biaya = Double.parseDouble(strBiaya);
            double diskon = Double.parseDouble(strDiskon);

            if (biaya < 0) {
                JOptionPane.showMessageDialog(this,
                        "Biaya tidak boleh bernilai negatif.",
                        "Validasi Input",
                        JOptionPane.WARNING_MESSAGE);
                txtBiaya.requestFocus();
                return;
            }

            if (diskon < 0 || diskon > 100) {
                JOptionPane.showMessageDialog(this,
                        "Diskon harus berada pada rentang 0 sampai 100.",
                        "Validasi Input",
                        JOptionPane.WARNING_MESSAGE);
                txtDiskon.requestFocus();
                return;
            }

            Kursus kursus = new Kursus(kode, nama, level, biaya);
            double total = kursus.hitungBiayaSetelahDiskon(diskon);

            String pesan = "Kursus: " + nama
                    + "\nKode: " + kode
                    + "\nLevel: " + level
                    + "\nBiaya awal: Rp" + String.format("%,.0f", biaya)
                    + "\nDiskon: " + diskon + "%"
                    + "\nBiaya akhir: Rp" + String.format("%,.0f", total);

            JOptionPane.showMessageDialog(this,
                    pesan,
                    "Hasil Pendaftaran Kursus",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Biaya dan diskon harus berupa angka.\nContoh biaya: 500000 | diskon: 10",
                    "Input Tidak Valid",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnProsesActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtKodeKursus.setText("");
        cmbKursus.setSelectedIndex(0);
        cmbLevel.setSelectedIndex(0);
        txtBiaya.setText("");
        txtDiskon.setText("");
        txtKodeKursus.requestFocus();
                                                                                        
    }                                         

    /**
     * @param args the command line arguments
     */
 public static void main(String args[]) {
          try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPendaftaranAwal.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPendaftaranAwal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProses;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cmbKursus;
    private javax.swing.JComboBox<String> cmbLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBiaya;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtKodeKursus;
    // End of variables declaration//GEN-END:variables
}

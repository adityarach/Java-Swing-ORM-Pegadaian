/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BrgGadaiController;
import dao.BrgGadaiDAO;
import entities.BrgGadai;
import javax.swing.JOptionPane;

/**
 *
 * @author TAMU
 */
public class ViewBarangGadai extends javax.swing.JInternalFrame {
    
      private String header[] = {"NO" , "ID Barang", "ID Jenis", "Nama Barang", "Berat","Kualitas"};
      private String headerTable[] = {"idBarang", "idJns", "nmBarang", "berat", "kualitas"};
      public BrgGadaiController bg;
    /**
     * Creates new form ViewBarangGadai
     */
    public ViewBarangGadai() {
        initComponents();
        bg = new BrgGadaiController();
        bg.bindingAll(TblBrgGadai, header);
        bg.loadJenis(cmbIdJns);
        reset();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TblBrgGadai = new javax.swing.JTable();
        btnCari = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        cmbKategori = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdBrg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNmBrg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBerat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        cmbIdJns = new javax.swing.JComboBox<>();
        cmbKualitas = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Barang Gadai");

        TblBrgGadai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TblBrgGadai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblBrgGadaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblBrgGadai);

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID Barang", "Nama Jenis", "Nama Barang", "Berat", "Kualitas" }));

        jLabel1.setText("Id Barang");

        txtIdBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBrgActionPerformed(evt);
            }
        });
        txtIdBrg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdBrgKeyPressed(evt);
            }
        });

        jLabel2.setText("Id Jenis");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Berat");

        jLabel5.setText("Kualitas");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        cmbKualitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtBerat, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNmBrg)
                    .addComponent(txtIdBrg, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbIdJns, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbKualitas, 0, 129, Short.MAX_VALUE))
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(1, 1, 1)
                        .addComponent(btnSimpan)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmbIdJns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus)
                    .addComponent(txtNmBrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBerat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbKualitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCari))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCari)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        bg.bindingSearch(TblBrgGadai, header, 
                headerTable[cmbKategori.getSelectedIndex()], 
                txtCari.getText());

//        String kolom = "";
//        switch (cmbKategori.getSelectedIndex()) {
//            case 0:
//                kolom = "idBarang";
//                break;
//            case 1:
//                kolom = "idJns";
//                break;
//            case 2:
//                kolom = "nmBarang";
//                break;
//            case 3:
//                kolom = "berat";
//                break;
//            case 4:
//                kolom = "kualitas";
//                break;    
//            default:
//                throw new AssertionError();
//        }
//        bg.bindingSearch(TblBrgGadai, header, kolom, txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtIdBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBrgActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
            boolean hasil = false;
        hasil = bg.save(txtIdBrg.getText(), cmbIdJns.getSelectedItem().toString(), 
                txtNmBrg.getText(), txtBerat.getText(),cmbKualitas.getSelectedItem().toString(),txtIdBrg.isEnabled());
        String pesan = "Gagal menyimpan data";
        if (hasil) {
            pesan = "Berhasil menyimpan data";
        }
        JOptionPane.showMessageDialog(this, pesan);
        bg.bindingAll(TblBrgGadai, header);
        reset();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void TblBrgGadaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblBrgGadaiMouseClicked
         // TODO add your handling code here:
        txtIdBrg.setText(TblBrgGadai.getValueAt(TblBrgGadai.getSelectedRow(), 1) + "");
        txtNmBrg.setText(TblBrgGadai.getValueAt(TblBrgGadai.getSelectedRow(), 3) + "");
        txtBerat.setText(TblBrgGadai.getValueAt(TblBrgGadai.getSelectedRow(), 4) + "");
       // cmbIdJns.setText(tblLocation.getValueAt(tblLocation.getSelectedRow(), 2) + "");
        
     //   cmbKualitas.set(TblBrgGadai.getValueAt(TblBrgGadai.getSelectedRow(), 5) + "");
   //     cmbCountry.setSelectedIndex(tblLocation.getValueAt(tblLocation.getSelectedRow(), 5) + "");
        
      //  txtIdBrg.setEnabled(false);
        btnSimpan.setEnabled(true);
        btnHapus.setEnabled(true);       
    }//GEN-LAST:event_TblBrgGadaiMouseClicked

    private void txtIdBrgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdBrgKeyPressed
        // TODO add your handling code here:
        btnSimpan.setEnabled(true);
        btnHapus.setEnabled(true);
    }//GEN-LAST:event_txtIdBrgKeyPressed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
         int i = JOptionPane.showConfirmDialog(this, "Apakah anda yakin akan menghapus data ini?");
//        System.out.println(i);
         if (i == 0) {
            String pesan = "Gagal Hapus";
            boolean hasil = bg.delete(txtIdBrg.getText());
            if (hasil) {
                pesan = "Berhasil Hapus";
            }
            JOptionPane.showMessageDialog(this, pesan);
            bg.bindingAll(TblBrgGadai, header);

        }
        reset();             
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblBrgGadai;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmbIdJns;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JComboBox<String> cmbKualitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBerat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdBrg;
    private javax.swing.JTextField txtNmBrg;
    // End of variables declaration//GEN-END:variables
 public void reset(){
        txtIdBrg.setText("");
        cmbIdJns.setSelectedIndex(0);
        txtNmBrg.setText("");
        txtBerat.setText("");
        cmbKualitas.setSelectedIndex(0);
        txtIdBrg.setEnabled(true);
        btnSimpan.setEnabled(false);
        btnHapus.setEnabled(false);
    }
}

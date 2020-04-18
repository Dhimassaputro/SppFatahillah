/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sppfatahillah;
import java.sql.Connection;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.awt.Toolkit;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dhimas
 */
public class DataSpp extends javax.swing.JFrame {

    private Connection con;
    private Statement st;
    private ResultSet RsSpp;
    private String sql="";
    private String kelas, biaya;

    /**
     * Creates new form Siswa
     */
    public DataSpp() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_kelas = new javax.swing.JTextField();
        txt_biaya = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Gridspp = new javax.swing.JTable();
        btn_tambah = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        btn_kembali = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Kelas");

        jLabel2.setText("Biaya SPP ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(txt_kelas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_biaya)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        Gridspp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Gridspp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GridsppMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Gridspp);

        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        btn_simpan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_simpanKeyPressed(evt);
            }
        });

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        btn_hapus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_hapusKeyPressed(evt);
            }
        });

        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        btn_kembali.setText("Kembali");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });

        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        btn_keluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_keluarKeyPressed(evt);
            }
        });

        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_tambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_simpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_hapus)
                                .addGap(10, 10, 10)
                                .addComponent(btn_batal))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_refresh)
                                .addGap(10, 10, 10)
                                .addComponent(btn_kembali))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah)
                    .addComponent(btn_simpan)
                    .addComponent(btn_hapus)
                    .addComponent(btn_batal)
                    .addComponent(btn_kembali)
                    .addComponent(btn_refresh))
                .addGap(56, 56, 56)
                .addComponent(btn_keluar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GridsppMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GridsppMousePressed
        // TODO add your handling code here:
        JTable table = (JTable)evt.getSource();
        int row = table.getSelectedRow();
        String user = txt_kelas.getText();
        txt_kelas.setText((String)table.getValueAt(row, 0));
        txt_biaya.setText((String)table.getValueAt(row, 1));
        user = txt_kelas.getText();
        enableData();
    }//GEN-LAST:event_GridsppMousePressed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here
        enableData();
        clearData();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        refreshTable();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        simpanData();
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_simpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_simpanKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            simpanData();
        }
    }//GEN-LAST:event_btn_simpanKeyPressed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        deleteData();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_hapusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_hapusKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            deleteData();
        }
    }//GEN-LAST:event_btn_hapusKeyPressed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        // TODO add your handling code here:
        form_clear();
        btn_tambah.setEnabled(true);
        btn_simpan.setEnabled(true);
        txt_kelas.requestFocus();
        btn_hapus.setEnabled(true);
        txt_kelas.setEnabled(true);
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        // TODO add your handling code here:
        MasterUtama mu = new MasterUtama();

        mu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_kembaliActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_keluarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_keluarKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            dispose();
        }
    }//GEN-LAST:event_btn_keluarKeyPressed

    private void tampilData(String sql){
        DefaultTableModel datalist = new DefaultTableModel();
        datalist.addColumn("No");
        datalist.addColumn("Kelas");
        datalist.addColumn("Biaya SPP");
        try {
            int i = 1;
            st=con.createStatement();
            RsSpp=st.executeQuery("SELECT * FROM spp");
            while (RsSpp.next()){
                datalist.addRow(new Object[]{
                    (""+i++),RsSpp.getString(1), RsSpp.getString(2),
                });
                Gridspp.setModel(datalist);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GAGAL TAMPIL \n"+e.getMessage());
        }
    }
    
    private void form_awal(){
        form_disable();
        form_clear(); 
        btn_simpan.setText("Simpan");
        btn_tambah.requestFocus(true);
        btn_tambah.setEnabled(true);
        btn_simpan.setEnabled(false);
        btn_batal.setEnabled(false);
        btn_hapus.setEnabled(false);
    }
    
    private void form_disable(){
        txt_kelas.setEnabled(false);
        txt_biaya.setEnabled(false);
    }
    
    private void form_clear(){
        txt_kelas.setText("");
        txt_biaya.setText("");
    }
    
    public void disableData(){
        txt_kelas.setEnabled(false);
        txt_biaya.setEnabled(false);
        btn_tambah.setEnabled(true);
        btn_kembali.setEnabled(false);
        btn_simpan.setEnabled(false);
        btn_hapus.setEnabled(false);
        btn_batal.setEnabled(false);
        btn_keluar.setEnabled(false);
        btn_tambah.requestFocus();
    }
    
    public void enableData(){
        txt_kelas.setEnabled(true);
        txt_biaya.setEnabled(true);
        btn_tambah.setEnabled(false);
        btn_kembali.setEnabled(true);
        btn_simpan.setEnabled(true);
        btn_hapus.setEnabled(true);
        btn_batal.setEnabled(true);
        btn_keluar.setEnabled(true);
    }
    
    public void clearData(){
        txt_kelas.setText("");
        txt_biaya.setText("");
        txt_kelas.requestFocus();
    }
    
    public void refreshTable(){
    try{
        Koneksi konek = new  Koneksi();
        konek.config();
        Statement stmtTable = konek.con.createStatement();
        String sqlTabel = "select * from spp order by kelas";
        ResultSet rs = stmtTable.executeQuery(sqlTabel);
        ResultSetMetaData meta = rs.getMetaData();
        String Header[] = {"Kelas","Biaya SPP"};
        int col = meta.getColumnCount();
        int brs = 0;
        while (rs.next()){
            brs = rs.getRow();
        }
        Object dataTable[][] = new Object[brs][col];
        int x = 0;
        rs.beforeFirst();
        while(rs.next()){
            dataTable[x][0]=rs.getString("kelas");
            dataTable[x][1]=rs.getString("biaya");
            x++;  
        }
        Gridspp.setModel(new DefaultTableModel(dataTable,Header));
        stmtTable.close();
    }catch(Exception ert) {
        System.out.println(ert.getMessage());
    }
}
    
    public void simpanData(){
        try{
            Koneksi konek = new Koneksi();
            konek.config();
            Statement stmt = konek.con.createStatement();
            Statement stmt1 = konek.con.createStatement();
            String user = txt_kelas.getText();
            String sql2 = "delete from spp where kelas='" + user + "'";
            stmt1.executeUpdate(sql2);
            stmt1.close();
            String sql1 = "insert into spp(kelas,biaya)"
                    + "values('"
                    +txt_kelas.getText()+"','"+txt_biaya.getText()+"')";
            stmt.executeUpdate(sql1);
            stmt.close();
            JOptionPane.showMessageDialog(null, "Input/Update User Sukses.");
            clearData();
            refreshTable();
            disableData();
        }catch (Exception e){
            System.out.println(e);
    }
}

    public void deleteData(){
        try{
            Koneksi konek = new Koneksi();
            konek.config();
            String user = txt_kelas.getText();
            Statement stmt = konek.con.createStatement();
            String sql = "delete from spp where kelas='" + user + "'";
            stmt.executeUpdate(sql);
            stmt.close();
            JOptionPane.showMessageDialog(null, "Delete User Sukses");
            clearData();
            refreshTable();
            disableData();
        }catch (Exception e){
             System.out.println(e);
    }
}

    
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
            java.util.logging.Logger.getLogger(DataSpp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataSpp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataSpp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataSpp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataSpp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Gridspp;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_biaya;
    private javax.swing.JTextField txt_kelas;
    // End of variables declaration//GEN-END:variables
}
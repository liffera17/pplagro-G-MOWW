/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Muhammad Fahmy
 */
public class v_CRUDJENIS extends javax.swing.JFrame {

    /**
     * Creates new form v_CRUDJENIS
     */
    public v_CRUDJENIS() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenisSapi = new javax.swing.JTextField();
        lNamaPakan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sapi = new javax.swing.JTable();
        btnKembali = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jenisSapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 350, 50));

        lNamaPakan.setText("JENIS SAPI");
        getContentPane().add(lNamaPakan, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 90, 30));

        sapi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(sapi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 1010, 290));

        btnKembali.setText("KEMBALI");
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 650, 80, 60));

        btnDelete.setText("HAPUS");
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 640, 80, 60));

        btnTambah.setText("TAMBAH");
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 640, 80, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(v_CRUDJENIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_CRUDJENIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_CRUDJENIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_CRUDJENIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_CRUDJENIS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jenisSapi;
    private javax.swing.JLabel lNamaPakan;
    private javax.swing.JTable sapi;
    // End of variables declaration//GEN-END:variables

    public void btnHapus(ActionListener a) {
        this.btnDelete.addActionListener(a);
    }

    public void btnKembali(ActionListener a) {
        this.btnKembali.addActionListener(a);
    }

    public void btnTambah(ActionListener a) {
        this.btnTambah.addActionListener(a);
    }

  
    public JTextField getJenisSapi() {
        return jenisSapi;
    }

    public JTable getSapi() {
        return sapi;
    }
    
}

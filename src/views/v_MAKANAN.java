/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Muhammad Fahmy
 */
public class v_MAKANAN extends javax.swing.JFrame {

    /**
     * Creates new form v_MAKANAN
     */
    public v_MAKANAN() {
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

        cbJjenisMakanan = new javax.swing.JComboBox<>();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMakanan = new javax.swing.JTable();
        cbMakanan = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbJjenisMakanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cbJjenisMakanan.setBorder(null);
        getContentPane().add(cbJjenisMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 380, 70));

        btnTambah.setBorder(null);
        btnTambah.setBorderPainted(false);
        btnTambah.setContentAreaFilled(false);
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 680, 160, 50));

        btnHapus.setBorder(null);
        btnHapus.setBorderPainted(false);
        btnHapus.setContentAreaFilled(false);
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 680, 150, 50));

        btnKembali.setBorder(null);
        btnKembali.setBorderPainted(false);
        btnKembali.setContentAreaFilled(false);
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 680, 160, 50));

        tableMakanan.setModel(new javax.swing.table.DefaultTableModel(
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
        tableMakanan.setGridColor(new java.awt.Color(255, 255, 255));
        tableMakanan.setOpaque(false);
        jScrollPane1.setViewportView(tableMakanan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 980, 300));

        cbMakanan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cbMakanan.setBorder(null);
        getContentPane().add(cbMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 380, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uiimages/admin sapi2.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 250, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uiimages/b.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 560, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uiimages/admin pakan.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, 240, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uiimages/b.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 880, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uiimages/admin pakan.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 100, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uiimages/a.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 250, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uiimages/admin-makanan.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

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
            java.util.logging.Logger.getLogger(v_MAKANAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_MAKANAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_MAKANAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_MAKANAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_MAKANAN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cbJjenisMakanan;
    private javax.swing.JComboBox<String> cbMakanan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMakanan;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getCbJjenisMakanan() {
        return cbJjenisMakanan;
    }

    public JComboBox<String> getCbMakanan() {
        return cbMakanan;
    }

    public JTable getTableMakanan() {
        return tableMakanan;
    }

    public void getBtnTambah(ActionListener a) {
        btnTambah.addActionListener(a);
    }

    public void getBtnHapus(ActionListener a) {
        btnHapus.addActionListener(a);
    }

    public void getBtnKembali(ActionListener a) {
        btnKembali.addActionListener(a);
    }

    public void setComboAngkatan(String[] comboAngkatan) {
        for (String a : comboAngkatan) {
            this.cbJjenisMakanan.addItem(a);
        }
    }

    public void setComboNama(String[] comboAngkatan) {
        for (String a : comboAngkatan) {
            this.cbMakanan.addItem(a);
        }
    }
}

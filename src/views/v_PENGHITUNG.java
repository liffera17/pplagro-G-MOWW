/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Muhammad Fahmy
 */
public class v_PENGHITUNG extends javax.swing.JFrame {

    /**
     * Creates new form v_penghitung
     */
    public v_PENGHITUNG() {
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

        hasilHitungan = new javax.swing.JTextField();
        kg1 = new javax.swing.JLabel();
        kg = new javax.swing.JLabel();
        lingkarDada = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        nomorSapi = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSapi = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hasilHitungan.setBorder(null);
        hasilHitungan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        hasilHitungan.setEnabled(false);
        hasilHitungan.setOpaque(false);
        getContentPane().add(hasilHitungan, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 170, 30));

        kg1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kg1.setText("KG");
        getContentPane().add(kg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 30, 50));

        kg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kg.setText("CM");
        getContentPane().add(kg, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 30, 50));

        lingkarDada.setBorder(null);
        lingkarDada.setInheritsPopupMenu(true);
        lingkarDada.setOpaque(false);
        getContentPane().add(lingkarDada, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 170, 30));

        btnUpdate.setBorder(null);
        btnUpdate.setBorderPainted(false);
        btnUpdate.setContentAreaFilled(false);
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 442, 90, 30));

        btnKembali.setBorder(null);
        btnKembali.setBorderPainted(false);
        btnKembali.setContentAreaFilled(false);
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 100, 30));

        nomorSapi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        getContentPane().add(nomorSapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 220, 30));

        tableSapi.setModel(new javax.swing.table.DefaultTableModel(
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
        tableSapi.setEnabled(false);
        tableSapi.setGridColor(new java.awt.Color(255, 255, 255));
        tableSapi.setOpaque(false);
        jScrollPane1.setViewportView(tableSapi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 590, 200));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/peternak_ngukur berat.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 500));

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
            java.util.logging.Logger.getLogger(v_PENGHITUNG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_PENGHITUNG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_PENGHITUNG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_PENGHITUNG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_PENGHITUNG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField hasilHitungan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kg;
    private javax.swing.JLabel kg1;
    private javax.swing.JTextField lingkarDada;
    private javax.swing.JComboBox<String> nomorSapi;
    private javax.swing.JTable tableSapi;
    // End of variables declaration//GEN-END:variables

    public void getHasil(KeyListener a) {
        lingkarDada.addKeyListener(a);
    }

    public void btnUpdate(ActionListener a) {
        btnUpdate.addActionListener(a);
    }

    public void btnKembali(ActionListener a) {
        btnKembali.addActionListener(a);
    }

    public JTextField getHasilHitungan() {
        return hasilHitungan;
    }

    public JTable getTableSapi() {
        return tableSapi;
    }

    public JTextField getLingkarDada() {
        return lingkarDada;
    }

    public void setNomorSapi(String[] comboAngkatan) {
        for (String a : comboAngkatan) {
            this.nomorSapi.addItem(a);
        }
    }

    public JComboBox<String> getNomorSapi() {
        return nomorSapi;
    }
    
}

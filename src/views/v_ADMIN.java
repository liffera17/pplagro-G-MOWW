/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.c_admin;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Muhammad Fahmy
 */
public class v_ADMIN extends javax.swing.JFrame {

    /**
     * Creates new form v_ADMIN
     */
    public v_ADMIN() {
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

        admin = new javax.swing.JLabel();
        btnMakanan = new javax.swing.JButton();
        btnKandang = new javax.swing.JButton();
        btnLaporan = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnSapi = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        gambar = new javax.swing.JLabel();

        admin.setFont(new java.awt.Font("Tall & Lean", 0, 36)); // NOI18N
        admin.setForeground(new java.awt.Color(204, 204, 204));
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setText("ADMIN");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMakanan.setBorder(null);
        btnMakanan.setBorderPainted(false);
        btnMakanan.setContentAreaFilled(false);
        getContentPane().add(btnMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 70, 90));

        btnKandang.setBorder(null);
        btnKandang.setBorderPainted(false);
        btnKandang.setContentAreaFilled(false);
        getContentPane().add(btnKandang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, 80));

        btnLaporan.setBorder(null);
        btnLaporan.setBorderPainted(false);
        btnLaporan.setContentAreaFilled(false);
        getContentPane().add(btnLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 110, 80));

        btnLogout.setBorder(null);
        btnLogout.setContentAreaFilled(false);
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 50, 40));

        btnSapi.setBorder(null);
        btnSapi.setBorderPainted(false);
        btnSapi.setContentAreaFilled(false);
        getContentPane().add(btnSapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 70, 80));

        btnProfile.setBorder(null);
        btnProfile.setBorderPainted(false);
        btnProfile.setContentAreaFilled(false);
        getContentPane().add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 70, 70));

        gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin_tampilan awal.png"))); // NOI18N
        getContentPane().add(gambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

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
            java.util.logging.Logger.getLogger(v_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_ADMIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JButton btnKandang;
    private javax.swing.JButton btnLaporan;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMakanan;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnSapi;
    private javax.swing.JLabel gambar;
    // End of variables declaration//GEN-END:variables

    public void getBtnKandang(ActionListener a) {
        btnKandang.addActionListener(a);
    }

    public void getBtnMakanan(ActionListener a) {
        btnMakanan.addActionListener(a);
    }

    public void getBtnLogout(ActionListener a) {
        btnLogout.addActionListener(a);
    }

    public void getBtnValidasi(ActionListener a) {
        btnLaporan.addActionListener(a);
    }
    
    public void getBtnSapi(ActionListener a) {
        btnSapi.addActionListener(a);
    }
    
    public void getBtnProfile(ActionListener a) {
        btnProfile.addActionListener(a);
    }

}

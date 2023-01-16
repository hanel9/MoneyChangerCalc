/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.aangsutatang.main;

import java.io.IOException;
import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;
import okhttp3.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import com.aangsutatang.main.assets.Client;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Nicolas Airel V S
 */
public class staffDashboardPageUI extends javax.swing.JFrame {
    
    /**
     * Creates new form mainPageUI
     */
    public staffDashboardPageUI() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        container = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        imgAppIcon = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        containerSideMenu = new com.aangsutatang.main.PanelRound();
        menuConvert = new javax.swing.JLabel();
        menuBooking = new javax.swing.JLabel();
        menuAccount = new javax.swing.JLabel();
        menuAbout = new javax.swing.JLabel();
        containerContent = new com.aangsutatang.main.PanelRound();
        containerCurr1 = new com.aangsutatang.main.PanelRound();
        containerCurr2 = new com.aangsutatang.main.PanelRound();
        containerReg1 = new com.aangsutatang.main.PanelRound();
        containerReg2 = new com.aangsutatang.main.PanelRound();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        container.setBackground(new java.awt.Color(0, 0, 0));
        container.setFocusable(false);

        btnClose.setIcon(new javax.swing.ImageIcon("D:\\BUNIS\\Semester 3\\Object Oriented Programming\\Sandbox\\Project Akhir\\Sandbox Java LoginPage\\Main\\src\\main\\java\\com\\aangsutatang\\main\\assets\\media\\btn_close.png")); // NOI18N
        btnClose.setToolTipText("Close app");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        imgAppIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aangsutatang/main/images/app_icon.png"))); // NOI18N
        imgAppIcon.setPreferredSize(new java.awt.Dimension(128, 52));

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 200, 251));
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblWelcome.setText("Welcome!");

        containerSideMenu.setBackground(new java.awt.Color(0, 0, 0));
        containerSideMenu.setMinimumSize(new java.awt.Dimension(0, 0));
        containerSideMenu.setPreferredSize(new java.awt.Dimension(70, 234));
        containerSideMenu.setRoundBottomLeft(20);
        containerSideMenu.setRoundBottomRight(20);
        containerSideMenu.setRoundTopLeft(20);
        containerSideMenu.setRoundTopRight(20);

        menuConvert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aangsutatang/main/images/menu_exchange_selected.png"))); // NOI18N
        menuConvert.setPreferredSize(new java.awt.Dimension(27, 27));

        menuBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aangsutatang/main/images/menu_booking.png"))); // NOI18N
        menuBooking.setPreferredSize(new java.awt.Dimension(27, 27));
        menuBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBookingMouseClicked(evt);
            }
        });

        menuAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aangsutatang/main/images/menu_account.png"))); // NOI18N
        menuAccount.setPreferredSize(new java.awt.Dimension(27, 27));
        menuAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAccountMouseClicked(evt);
            }
        });

        menuAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aangsutatang/main/images/menu_about.png"))); // NOI18N

        javax.swing.GroupLayout containerSideMenuLayout = new javax.swing.GroupLayout(containerSideMenu);
        containerSideMenu.setLayout(containerSideMenuLayout);
        containerSideMenuLayout.setHorizontalGroup(
            containerSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerSideMenuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(containerSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuAbout)
                    .addComponent(menuAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuConvert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        containerSideMenuLayout.setVerticalGroup(
            containerSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerSideMenuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(menuConvert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(menuBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(menuAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(menuAbout)
                .addGap(21, 21, 21))
        );

        containerContent.setBackground(new java.awt.Color(255, 200, 251));
        containerContent.setPreferredSize(new java.awt.Dimension(662, 234));
        containerContent.setRoundBottomLeft(20);
        containerContent.setRoundBottomRight(20);
        containerContent.setRoundTopLeft(20);
        containerContent.setRoundTopRight(20);

        containerCurr1.setBackground(new java.awt.Color(255, 157, 205));
        containerCurr1.setFocusable(false);
        containerCurr1.setPreferredSize(new java.awt.Dimension(158, 55));
        containerCurr1.setRoundBottomLeft(20);
        containerCurr1.setRoundBottomRight(20);
        containerCurr1.setRoundTopLeft(20);
        containerCurr1.setRoundTopRight(20);

        javax.swing.GroupLayout containerCurr1Layout = new javax.swing.GroupLayout(containerCurr1);
        containerCurr1.setLayout(containerCurr1Layout);
        containerCurr1Layout.setHorizontalGroup(
            containerCurr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        containerCurr1Layout.setVerticalGroup(
            containerCurr1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        containerCurr2.setBackground(new java.awt.Color(255, 157, 205));
        containerCurr2.setFocusable(false);
        containerCurr2.setPreferredSize(new java.awt.Dimension(158, 55));
        containerCurr2.setRoundBottomLeft(20);
        containerCurr2.setRoundBottomRight(20);
        containerCurr2.setRoundTopLeft(20);
        containerCurr2.setRoundTopRight(20);

        javax.swing.GroupLayout containerCurr2Layout = new javax.swing.GroupLayout(containerCurr2);
        containerCurr2.setLayout(containerCurr2Layout);
        containerCurr2Layout.setHorizontalGroup(
            containerCurr2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        containerCurr2Layout.setVerticalGroup(
            containerCurr2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        containerReg1.setBackground(new java.awt.Color(255, 157, 205));
        containerReg1.setFocusable(false);
        containerReg1.setPreferredSize(new java.awt.Dimension(158, 55));
        containerReg1.setRoundBottomLeft(20);
        containerReg1.setRoundBottomRight(20);
        containerReg1.setRoundTopLeft(20);
        containerReg1.setRoundTopRight(20);

        javax.swing.GroupLayout containerReg1Layout = new javax.swing.GroupLayout(containerReg1);
        containerReg1.setLayout(containerReg1Layout);
        containerReg1Layout.setHorizontalGroup(
            containerReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        containerReg1Layout.setVerticalGroup(
            containerReg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        containerReg2.setBackground(new java.awt.Color(255, 157, 205));
        containerReg2.setFocusable(false);
        containerReg2.setPreferredSize(new java.awt.Dimension(158, 55));
        containerReg2.setRoundBottomLeft(20);
        containerReg2.setRoundBottomRight(20);
        containerReg2.setRoundTopLeft(20);
        containerReg2.setRoundTopRight(20);

        javax.swing.GroupLayout containerReg2Layout = new javax.swing.GroupLayout(containerReg2);
        containerReg2.setLayout(containerReg2Layout);
        containerReg2Layout.setHorizontalGroup(
            containerReg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        containerReg2Layout.setVerticalGroup(
            containerReg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 200, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(185, 185));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aangsutatang/main/images/wallet-downscaled.gif"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 185, 185));

        javax.swing.GroupLayout containerContentLayout = new javax.swing.GroupLayout(containerContent);
        containerContent.setLayout(containerContentLayout);
        containerContentLayout.setHorizontalGroup(
            containerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerContentLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(containerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(containerCurr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(containerReg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(containerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(containerReg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(containerCurr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        containerContentLayout.setVerticalGroup(
            containerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerContentLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(containerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(containerContentLayout.createSequentialGroup()
                        .addGroup(containerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(containerCurr2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(containerCurr1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(containerContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(containerReg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(containerReg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(containerSideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(containerContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(imgAppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClose)
                .addGap(19, 19, 19))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnClose)
                .addGap(14, 14, 14)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imgAppIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWelcome))
                .addGap(14, 14, 14)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(containerContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(containerSideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        dispose();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void menuAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAccountMouseClicked
        clientAccountPageUI ap = new clientAccountPageUI();
        ap.show();
        this.dispose();
    }//GEN-LAST:event_menuAccountMouseClicked

    private void menuBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBookingMouseClicked
        clientBookingPageUI bp = new clientBookingPageUI();
        bp.show();
        this.dispose();
    }//GEN-LAST:event_menuBookingMouseClicked

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
            java.util.logging.Logger.getLogger(staffDashboardPageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staffDashboardPageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staffDashboardPageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staffDashboardPageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staffDashboardPageUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JPanel container;
    private com.aangsutatang.main.PanelRound containerContent;
    private com.aangsutatang.main.PanelRound containerCurr1;
    private com.aangsutatang.main.PanelRound containerCurr2;
    private com.aangsutatang.main.PanelRound containerReg1;
    private com.aangsutatang.main.PanelRound containerReg2;
    private com.aangsutatang.main.PanelRound containerSideMenu;
    private javax.swing.JLabel imgAppIcon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel menuAbout;
    private javax.swing.JLabel menuAccount;
    private javax.swing.JLabel menuBooking;
    private javax.swing.JLabel menuConvert;
    // End of variables declaration//GEN-END:variables
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("LOGIN");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButton1)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

package com.mycompany.rizaps;

import javax.swing.JOptionPane;
import org.hibernate.Session;

import com.mycompany.rizaps.HibernateUtil;
import com.mycoampany.rizaps.UserEntity;

public class LoginForm extends javax.swing.JFrame {

    // ==============================
    // CONSTRUCTOR
    // ==============================
    public LoginForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // ==============================
    // KOMPONEN FORM LOGIN
    // ==============================
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;

    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txtPassword;

    private javax.swing.JButton jButton1;

    // ==============================
    // MEMBUAT TAMPILAN FORM
    // ==============================
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Login");

        jLabel1.setText("LOGIN");
        jLabel2.setText("Username");
        jLabel3.setText("Password");

        jButton1.setText("SUBMIT");

        // EVENT TOMBOL LOGIN
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        // LAYOUT FORM
        javax.swing.GroupLayout layout =
                new javax.swing.GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(
                javax.swing.GroupLayout.Alignment.LEADING
            )
            .addGroup(layout.createSequentialGroup()
                .addGap(40)
                .addGroup(layout.createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING
                )
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(
                            javax.swing.GroupLayout.Alignment.LEADING
                        )
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(30)
                        .addGroup(layout.createParallelGroup(
                            javax.swing.GroupLayout.Alignment.LEADING
                        )
                            .addComponent(txtUsername, 150, 150, 150)
                            .addComponent(txtPassword, 150, 150, 150)))
                    .addComponent(jButton1))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGap(30)
                .addComponent(jLabel1)
                .addGap(25)
                .addGroup(layout.createParallelGroup(
                    javax.swing.GroupLayout.Alignment.BASELINE
                )
                    .addComponent(jLabel2)
                    .addComponent(txtUsername,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20)
                .addGroup(layout.createParallelGroup(
                    javax.swing.GroupLayout.Alignment.BASELINE
                )
                    .addComponent(jLabel3)
                    .addComponent(txtPassword,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30)
                .addComponent(jButton1)
                .addGap(30)
        );

        pack();
    }

    // ==============================
    // PROSES LOGIN HIBERNATE
    // ==============================
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        String username = txtUsername.getText().trim();
        String password = new String(
            txtPassword.getPassword()
        ).trim();

        // VALIDASI INPUT
        if (username.isEmpty() || password.isEmpty()) {

            JOptionPane.showMessageDialog(
                this,
                "Username dan password wajib diisi!",
                "Peringatan",
                JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        // PROSES LOGIN
        try (Session session = HibernateUtil
                .getSessionFactory()
                .openSession()) {

            String hql =
                "FROM UserEntity WHERE username = :uname AND password = :pass";

            org.hibernate.query.Query<UserEntity> query =
                session.createQuery(hql, UserEntity.class);

            query.setParameter("uname", username);
            query.setParameter("pass", password);

            UserEntity user = query.uniqueResult();

            if (user != null) {

                JOptionPane.showMessageDialog(
                    this,
                    "Login berhasil! Selamat datang, " + user.getUsername(),
                    "Login Berhasil",
                    JOptionPane.INFORMATION_MESSAGE
                );

                // TUTUP FORM LOGIN
                this.dispose();

                // BUKA FORM UTAMA JIKA SUDAH ADA
                // new MainForm().setVisible(true);

            } else {

                JOptionPane.showMessageDialog(
                    this,
                    "Username atau password salah!",
                    "Login Gagal",
                    JOptionPane.ERROR_MESSAGE
                );
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                this,
                "Terjadi kesalahan pada database:\n" + e.getMessage(),
                "Database Error",
                JOptionPane.ERROR_MESSAGE
            );

            e.printStackTrace();
        }
    }

    // ==============================
    // MAIN METHOD
    // ==============================
    public static void main(String args[]) {

        try {

            for (javax.swing.UIManager.LookAndFeelInfo info :
                    javax.swing.UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {

                    javax.swing.UIManager.setLookAndFeel(
                        info.getClassName()
                    );

                    break;
                }
            }

        } catch (Exception ex) {

            java.util.logging.Logger.getLogger(LoginForm.class.getName())
                .log(
                    java.util.logging.Level.SEVERE,
                    null,
                    ex
                );
        }

        java.awt.EventQueue.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
    }
}

    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables


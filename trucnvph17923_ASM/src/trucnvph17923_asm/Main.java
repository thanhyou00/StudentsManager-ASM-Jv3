package trucnvph17923_asm;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Nguyen Truc
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        // setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jToolBar1 = new javax.swing.JToolBar();
        btndiem = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnsinhvien = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnthoat = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblpic = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        mnudangnhap = new javax.swing.JMenuItem();
        mnudangxuat = new javax.swing.JMenuItem();
        mnuthoat = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        mnupicture = new javax.swing.JMenuItem();
        menu3 = new javax.swing.JMenu();
        mnutv = new javax.swing.JMenuItem();
        mnueng = new javax.swing.JMenuItem();
        menu4 = new javax.swing.JMenu();
        mnucall = new javax.swing.JMenuItem();
        mnuemail = new javax.swing.JMenuItem();

        jButton3.setText("jButton3");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton4.setText("jButton4");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Giao diện chính");

        jToolBar1.setBackground(new java.awt.Color(45, 152, 218));
        jToolBar1.setRollover(true);
        jToolBar1.setEnabled(false);

        btndiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Numbered list.png"))); // NOI18N
        btndiem.setText("Quản lý điểm");
        btndiem.setFocusable(false);
        btndiem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndiem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btndiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndiemActionPerformed(evt);
            }
        });
        jToolBar1.add(btndiem);
        jToolBar1.add(jSeparator1);

        btnsinhvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User group.png"))); // NOI18N
        btnsinhvien.setText("Quản lý sinh viên");
        btnsinhvien.setFocusable(false);
        btnsinhvien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsinhvien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnsinhvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsinhvienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnsinhvien);
        jToolBar1.add(jSeparator4);

        btnthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit button.png"))); // NOI18N
        btnthoat.setText("Thoát");
        btnthoat.setFocusable(false);
        btnthoat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnthoat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnthoat);

        jPanel1.setBackground(new java.awt.Color(45, 152, 218));

        lblpic.setBackground(new java.awt.Color(0, 153, 153));
        lblpic.setForeground(new java.awt.Color(0, 204, 204));
        lblpic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pic1.png"))); // NOI18N
        lblpic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblpic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1522, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblpic, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        menu1.setForeground(new java.awt.Color(0, 204, 204));
        menu1.setText("Tài khoản");
        menu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mnudangnhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mnudangnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Login.png"))); // NOI18N
        mnudangnhap.setText("Đăng nhập");
        mnudangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnudangnhapActionPerformed(evt);
            }
        });
        menu1.add(mnudangnhap);

        mnudangxuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        mnudangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit.png"))); // NOI18N
        mnudangxuat.setText("Đăng xuất");
        mnudangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnudangxuatActionPerformed(evt);
            }
        });
        menu1.add(mnudangxuat);

        mnuthoat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mnuthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit button.png"))); // NOI18N
        mnuthoat.setText("Thoát");
        mnuthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuthoatActionPerformed(evt);
            }
        });
        menu1.add(mnuthoat);

        jMenuBar1.add(menu1);

        menu2.setForeground(new java.awt.Color(0, 204, 204));
        menu2.setText("Thay đổi ảnh");
        menu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2ActionPerformed(evt);
            }
        });

        mnupicture.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        mnupicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Desktop.png"))); // NOI18N
        mnupicture.setText("Đổi ảnh");
        mnupicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnupictureActionPerformed(evt);
            }
        });
        menu2.add(mnupicture);

        jMenuBar1.add(menu2);

        menu3.setForeground(new java.awt.Color(0, 204, 204));
        menu3.setText("Ngôn ngữ");
        menu3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mnutv.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        mnutv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/vit.gif"))); // NOI18N
        mnutv.setText("Tiếng Việt");
        mnutv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnutvActionPerformed(evt);
            }
        });
        menu3.add(mnutv);

        mnueng.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        mnueng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eng.gif"))); // NOI18N
        mnueng.setText("English");
        mnueng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuengActionPerformed(evt);
            }
        });
        menu3.add(mnueng);

        jMenuBar1.add(menu3);

        menu4.setForeground(new java.awt.Color(0, 204, 204));
        menu4.setText("Hỗ trợ");
        menu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mnucall.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnucall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Call.png"))); // NOI18N
        mnucall.setText("Liên hệ");
        mnucall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucallActionPerformed(evt);
            }
        });
        menu4.add(mnucall);

        mnuemail.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        mnuemail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Mail.png"))); // NOI18N
        mnuemail.setText("Góp ý");
        mnuemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuemailActionPerformed(evt);
            }
        });
        menu4.add(mnuemail);

        jMenuBar1.add(menu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnthoatActionPerformed

    private void mnuthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuthoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuthoatActionPerformed

    private void mnudangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnudangnhapActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_mnudangnhapActionPerformed

    private void btndiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndiemActionPerformed
        ImageIcon icon = new ImageIcon("src\\Icons\\Problem.png");
        JOptionPane.showMessageDialog(this, "Bạn chưa đăng nhập !", "Thông báo ", 0, icon);
        return;
    }//GEN-LAST:event_btndiemActionPerformed

    private void btnsinhvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsinhvienActionPerformed
        ImageIcon icon = new ImageIcon("src\\Icons\\Problem.png");
        JOptionPane.showMessageDialog(this, "Bạn chưa đăng nhập !", "Thông báo ", 0, icon);
        return;
    }//GEN-LAST:event_btnsinhvienActionPerformed

    private void mnudangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnudangxuatActionPerformed
        ImageIcon icon = new ImageIcon("src\\Icons\\Log out.png");
        JOptionPane.showMessageDialog(this, "Bạn đã đăng xuất !", "Thông báo ", 0, icon);
        return;
    }//GEN-LAST:event_mnudangxuatActionPerformed

    private void menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2ActionPerformed

    }//GEN-LAST:event_menu2ActionPerformed

    private void mnupictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnupictureActionPerformed
        JFileChooser jf = new JFileChooser();
        int rs = jf.showOpenDialog(this);
        if (rs == JFileChooser.APPROVE_OPTION) {
            String filename = jf.getSelectedFile().getAbsolutePath();
            try {
                ImageIcon icon = new ImageIcon(filename);
                lblpic.setIcon(icon);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_mnupictureActionPerformed

    private void mnuengActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuengActionPerformed
        menu1.setText("Account");
        menu2.setText("Change Pictures");
        menu3.setText("Language");
        menu4.setText("Support");
        mnudangnhap.setText("Log in");
        mnudangxuat.setText("Log out");
        mnuthoat.setText("Exit");
        mnupicture.setText("Change picture");
        btnsinhvien.setText("Student management");
        btndiem.setText("Point management");
        btnthoat.setText("Exit");
        mnucall.setText("Hotline");
        mnuemail.setText("Email");
    }//GEN-LAST:event_mnuengActionPerformed

    private void mnutvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnutvActionPerformed
        menu1.setText("Tài khoản");
        menu2.setText("Thay đổi ảnh");
        menu3.setText("Ngôn ngữ");
        menu4.setText("Hỗ trợ");
        mnudangnhap.setText("Đăng nhập");
        mnudangxuat.setText("Đăng xuất");
        mnuthoat.setText("Thoát");
        mnupicture.setText("Đổi ảnh");
        btnsinhvien.setText("Quản lý sinh viên");
        btndiem.setText("Quản lý điểm");
        btnthoat.setText("Thoát");
        mnucall.setText("Liên hệ");
        mnuemail.setText("Góp ý");
    }//GEN-LAST:event_mnutvActionPerformed

    private void mnucallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucallActionPerformed
        ImageIcon icon = new ImageIcon("src\\Icons\\Call.png");
        JOptionPane.showMessageDialog(this, "Hotline : 0326360127 ", "Liên hệ ", 0, icon);
    }//GEN-LAST:event_mnucallActionPerformed

    private void mnuemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuemailActionPerformed
        ImageIcon icon = new ImageIcon("src\\Icons\\Mail.png");
        JOptionPane.showMessageDialog(this, "Email : truc06082000@gmail.com ", "Góp ý ", 0, icon);
    }//GEN-LAST:event_mnuemailActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndiem;
    private javax.swing.JButton btnsinhvien;
    private javax.swing.JButton btnthoat;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblpic;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenu menu3;
    private javax.swing.JMenu menu4;
    private javax.swing.JMenuItem mnucall;
    private javax.swing.JMenuItem mnudangnhap;
    private javax.swing.JMenuItem mnudangxuat;
    private javax.swing.JMenuItem mnuemail;
    private javax.swing.JMenuItem mnueng;
    private javax.swing.JMenuItem mnupicture;
    private javax.swing.JMenuItem mnuthoat;
    private javax.swing.JMenuItem mnutv;
    // End of variables declaration//GEN-END:variables
}

package trucnvph17923_asm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Truc
 */
public class Diem extends javax.swing.JFrame {

    private String urlDB = "jdbc:sqlserver://localhost:1433;databaseName=FPT_DAOTAO";
    private DefaultTableModel _model = new DefaultTableModel();
    private static String usersName = "sa";
    private static String password = "vip123456789";
    private int _index = 0, _iden = 1;
    private Connection conn;

    public Diem() {
        initComponents();
        _model = (DefaultTableModel) tbldiem.getModel();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        loadDatatoTable();
        showDetails();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        cbomasv = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txttanh = new javax.swing.JTextField();
        txtthoc = new javax.swing.JTextField();
        txtgdtc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lbldiemtb = new javax.swing.JLabel();
        txtnamesv = new javax.swing.JTextField();
        txtmasv = new javax.swing.JTextField();
        btnbegin = new javax.swing.JButton();
        btnend = new javax.swing.JButton();
        btnright = new javax.swing.JButton();
        btnleft = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldiem = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 204));
        jLabel10.setText("3 Sinh viên có điểm cao nhất");

        lblname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblname.setForeground(new java.awt.Color(0, 153, 153));
        lblname.setText("Nguyễn Văn Trức");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ ĐIỂM SINH VIÊN");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("QUẢN LÝ ĐIỂM SINH VIÊN");

        jPanel1.setBackground(new java.awt.Color(45, 152, 218));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã sinh viên");

        btnsearch.setBackground(new java.awt.Color(255, 255, 255));
        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\SOF203\\Icons\\search.png")); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(111, 111, 111)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(45, 152, 218));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Họ tên sinh viên ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mã sinh viên");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tiếng Anh");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tin học");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Giáo dục TC");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Điểm TB  ");

        lbldiemtb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldiemtb.setForeground(new java.awt.Color(255, 0, 51));
        lbldiemtb.setText("9.2");

        txtnamesv.setEditable(false);
        txtnamesv.setBackground(new java.awt.Color(255, 255, 255));

        txtmasv.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttanh)
                    .addComponent(txtthoc)
                    .addComponent(txtgdtc)
                    .addComponent(lbldiemtb, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(txtnamesv, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtmasv))
                .addGap(0, 134, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnamesv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtthoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtgdtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lbldiemtb))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnbegin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\SOF203\\Icons\\start.png")); // NOI18N
        btnbegin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbeginActionPerformed(evt);
            }
        });

        btnend.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\SOF203\\Icons\\end.png")); // NOI18N
        btnend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnendActionPerformed(evt);
            }
        });

        btnright.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\SOF203\\Icons\\left.png")); // NOI18N
        btnright.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrightActionPerformed(evt);
            }
        });

        btnleft.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Desktop\\SOF203\\Icons\\right.png")); // NOI18N
        btnleft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnleftActionPerformed(evt);
            }
        });

        tbldiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã sinh viên", "Họ Tên", "Tiếng Anh", "Tin Học", "GDTC", "Điểm TB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbldiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbldiem);

        jPanel3.setLayout(new java.awt.GridLayout(4, 4, 3, 35));

        btnnew.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add.png"))); // NOI18N
        btnnew.setText("New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jPanel3.add(btnnew);

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Save as.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnsave);

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Trash.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btndelete);

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Refresh.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnupdate);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 153, 153));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("   3 Sinh viên có điểm TB cao nhất");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnbegin, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(59, 59, 59)
                                    .addComponent(btnright, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(72, 72, 72)
                                    .addComponent(btnleft, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61)
                                    .addComponent(btnend, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(73, 73, 73))
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(392, 392, 392))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnbegin, btnend, btnleft, btnright});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbegin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnend)
                    .addComponent(btnleft)
                    .addComponent(btnright))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnbegin, btnend, btnleft, btnright});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        try {
            conn = DriverManager.getConnection(urlDB, usersName, password);
            ResultSet rs;
            String sql = "  SELECT HOTEN,STUDENTS.MASV,TIENGANH,TINHOC,GDTC FROM GRADE INNER JOIN STUDENTS ON GRADE.MASV = STUDENTS.MASV WHERE STUDENTS.MASV = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txtsearch.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                ImageIcon icon = new ImageIcon("src\\Icons\\Tick.png");
                JOptionPane.showMessageDialog(this, "Mã sinh viên trùng khớp !", "Thông báo ", 0, icon);
                txtnamesv.setText(rs.getString("HOTEN"));
                txtmasv.setText(rs.getString("MASV"));
                txttanh.setText(rs.getString("TIENGANH"));
                txtthoc.setText(rs.getString("TINHOC"));
                txtgdtc.setText(rs.getString("GDTC"));
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Mã sinh viên không tồn tại !");
            }
            ps.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi search!");
            return;
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void tbldiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldiemMouseClicked
        try {
            _index = tbldiem.getSelectedRow();
            if (_index < 0) {
                return;
            }
            showDetails();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi click table");
            return;
        }
    }//GEN-LAST:event_tbldiemMouseClicked

    private void btnbeginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbeginActionPerformed
        _index = 0;
        showDetails();
        JOptionPane.showMessageDialog(this, "Đang ở vị trí đầu !");
        return;
    }//GEN-LAST:event_btnbeginActionPerformed

    private void btnrightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrightActionPerformed
        try {
            _index--;
            showDetails();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đang ở vị trí đầu !");
            return;
        }
    }//GEN-LAST:event_btnrightActionPerformed

    private void btnleftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnleftActionPerformed
        try {
            _index++;
            showDetails();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đang ở vị trí cuối !");
            return;
        }
    }//GEN-LAST:event_btnleftActionPerformed

    private void btnendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnendActionPerformed
        try {
            _index = 2;
            showDetails();
            JOptionPane.showMessageDialog(this, "Đang ở vị trí cuối !");
            return;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đang ở vị trí cuối !");
            return;
        }
    }//GEN-LAST:event_btnendActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        txtnamesv.setText("");
        lbldiemtb.setText("0.00");
        txtmasv.setText("");
        txttanh.setText("");
        txtthoc.setText("");
        txtgdtc.setText("");
        txtsearch.setText("");
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try {
            //check null
            if (txtmasv.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Mã sinh viên không được trống !");
                txtmasv.requestFocus();
                return;
            }
            if (txttanh.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Điểm Tiếng Anh không được trống !");
                txttanh.requestFocus();
                return;
            }
            if (txtthoc.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Điểm Tin Học không được trống !");
                txtthoc.requestFocus();
                return;
            }
            if (txtgdtc.getText().length() == 0) {
                JOptionPane.showMessageDialog(this, "Điểm Giáo Dục TC không được trống !");
                txtgdtc.requestFocus();
                return;
            }
            //check float
            float tienganh, tinhoc, gdtc;
            try {
                tienganh = Float.parseFloat(txttanh.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Điểm Tiếnh Anh phải là số !");
                txttanh.requestFocus();
                return;
            }
            try {
                tinhoc = Float.parseFloat(txtthoc.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Điểm Tin Học phải là số !");
                txtthoc.requestFocus();
                return;
            }
            try {
                gdtc = Float.parseFloat(txtgdtc.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Điểm Giáo Dục TC phải là số !");
                txtgdtc.requestFocus();
                return;
            }
            conn = DriverManager.getConnection(urlDB, usersName, password);
            String sql = " INSERT INTO GRADE(ID,MASV,TIENGANH,TINHOC,GDTC) VALUES(?,?,?,?,?) ";
            PreparedStatement ps = conn.prepareStatement(sql);
            String masv = txtmasv.getText();
            //check masv
            String sql1 = " SELECT MASV FROM GRADE  ";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql1);
            while (rs.next()) {
                if (txtmasv.getText().equals(rs.getString("MASV"))) {
                    JOptionPane.showMessageDialog(this, "Mã sinh viên đã tồn tại !");
                    return;
                }
            }
            //
            _iden++;
            ps.setInt(1, _iden);
            ps.setString(2, masv);
            ps.setFloat(3, Float.parseFloat(txttanh.getText()));
            ps.setFloat(4, Float.parseFloat(txtthoc.getText()));
            ps.setFloat(5, Float.parseFloat(txtgdtc.getText()));
            int x = ps.executeUpdate();
            if (x > 0) {
                ImageIcon icon = new ImageIcon("src\\Icons\\Tick.png");
                JOptionPane.showMessageDialog(this, "Thêm điểm thành công !", "Thông báo ", 0, icon);
                showDetails();
                loadDatatoTable();
                return;
            }
            ps.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi Save !");
            return;
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa điểm sinh viên " + txtmasv.getText() + "?");
            if (choice != JOptionPane.YES_OPTION) {
                return;
            }
            conn = DriverManager.getConnection(urlDB, usersName, password);
            String sql = " DELETE FROM GRADE WHERE MASV = ? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            String masv = txtmasv.getText();;
            ps.setString(1, masv);
            int x = ps.executeUpdate();
            if (x > 0) {
                ImageIcon icon = new ImageIcon("src\\Icons\\Tick.png");
                JOptionPane.showMessageDialog(this, "Xóa điểm thành công !", "Thông báo ", 0, icon);
                btnnewActionPerformed(evt);
                loadDatatoTable();
                return;
            }
            ps.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi Xóa !");
            return;
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            conn = DriverManager.getConnection(urlDB, usersName, password);
            String sql = " UPDATE GRADE SET  TIENGANH = ? , TINHOC = ? , GDTC = ? WHERE MASV = ?  ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setFloat(1, Float.parseFloat(txttanh.getText()));
            ps.setFloat(2, Float.parseFloat(txtthoc.getText()));
            ps.setFloat(3, Float.parseFloat(txtgdtc.getText()));
            ps.setString(4, txtmasv.getText());
            int x = ps.executeUpdate();
            if (x > 0) {
                ImageIcon icon = new ImageIcon("src\\Icons\\Tick.png");
                JOptionPane.showMessageDialog(this, "Cập nhật điểm thành công !", "Thông báo ", 0, icon);
                loadDatatoTable();
                showDetails();
                return;
            }
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi Update !");
            return;
        }
    }//GEN-LAST:event_btnupdateActionPerformed

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
            java.util.logging.Logger.getLogger(Diem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbegin;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnend;
    private javax.swing.JButton btnleft;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnright;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cbomasv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbldiemtb;
    private javax.swing.JLabel lblname;
    private javax.swing.JTable tbldiem;
    private javax.swing.JTextField txtgdtc;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmasv;
    private javax.swing.JTextField txtnamesv;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txttanh;
    private javax.swing.JTextField txtthoc;
    // End of variables declaration//GEN-END:variables

    private void loadDatatoTable() {
        try {
            Connection conn = DriverManager.getConnection(urlDB, usersName, password);
            String sql = "SELECT TOP 3 STUDENTS.MASV , HOTEN ,TIENGANH, TINHOC ,GDTC, (TIENGANH + TINHOC + GDTC )/3 AS DIEMTB\n"
                    + "FROM GRADE, STUDENTS WHERE GRADE.MASV = STUDENTS.MASV\n"
                    + "ORDER BY DIEMTB DESC ";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            _model.setRowCount(0);
            while (rs.next()) {
                Vector sv = new Vector();
                sv.add(rs.getString("MASV"));
                sv.add(rs.getString("HOTEN"));
                sv.add(rs.getString("TIENGANH"));
                sv.add(rs.getString("TINHOC"));
                sv.add(rs.getString("GDTC"));
                sv.add(rs.getFloat("DIEMTB"));

                _model.addRow(sv);
            }
            tbldiem.setModel(_model);
            conn.close();
            st.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showDetails() {
        txtmasv.setText(tbldiem.getValueAt(_index, 0).toString());
        txtnamesv.setText(tbldiem.getValueAt(_index, 1).toString());
        txttanh.setText(tbldiem.getValueAt(_index, 2).toString());
        txtthoc.setText(tbldiem.getValueAt(_index, 3).toString());
        txtgdtc.setText(tbldiem.getValueAt(_index, 4).toString());
        lbldiemtb.setText(tbldiem.getValueAt(_index, 5).toString());
    }
}

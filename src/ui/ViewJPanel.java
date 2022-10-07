/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.CreateProfile;
import model.CreateProfileHistory;

/**
 *
 * @author Yagnesh
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    CreateProfileHistory history;
            
    /**
     *
     * @param history
     */
    public ViewJPanel(CreateProfileHistory history) {
        initComponents();
        
        this.history = history;
        
        populateTable();
    }

    
    public void Search(String str){
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tblView.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblEmployeeID = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblStartDate = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        lblTeamInfo = new javax.swing.JLabel();
        txtTeamInfo = new javax.swing.JTextField();
        lblPositionTitle = new javax.swing.JLabel();
        txtPositionTitle = new javax.swing.JTextField();
        lblContactInfo = new javax.swing.JLabel();
        lblCellNumber = new javax.swing.JLabel();
        txtCellNumber = new javax.swing.JTextField();
        lblEmailID = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        lblTitle.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Employee Profiles");

        tblView.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "EmployeeID", "Position Title", "Cell Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblView);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblEmployeeID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmployeeID.setText("Employee ID");

        txtEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIDActionPerformed(evt);
            }
        });

        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge.setText("Age");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender");

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        lblStartDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStartDate.setText("Start Date");

        txtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartDateActionPerformed(evt);
            }
        });

        lblLevel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLevel.setText("Level");

        txtLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevelActionPerformed(evt);
            }
        });

        lblTeamInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTeamInfo.setText("Team Info");

        txtTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamInfoActionPerformed(evt);
            }
        });

        lblPositionTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPositionTitle.setText("Position Title");

        txtPositionTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionTitleActionPerformed(evt);
            }
        });

        lblContactInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContactInfo.setText("Contact Info :");

        lblCellNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCellNumber.setText("Cell Number");

        txtCellNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellNumberActionPerformed(evt);
            }
        });

        lblEmailID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmailID.setText("Email ID");

        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });

        lblPhoto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoto.setText("Photo");

        jLabel1.setText("jLabel1");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel2.setText("Search");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPositionTitle)
                                .addGap(18, 18, 18)
                                .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmployeeID)
                                    .addComponent(lblAge)
                                    .addComponent(lblGender)
                                    .addComponent(lblStartDate)
                                    .addComponent(lblLevel)
                                    .addComponent(lblTeamInfo))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtLevel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStartDate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGender, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblContactInfo)
                                .addGap(18, 18, 18)
                                .addComponent(lblCellNumber)
                                .addGap(18, 18, 18)
                                .addComponent(txtCellNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnView)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEmailID)
                                        .addComponent(lblPhoto)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(btnUpdate)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContactInfo)
                    .addComponent(lblCellNumber)
                    .addComponent(txtCellNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployeeID)
                    .addComponent(lblEmailID)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender)
                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStartDate)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPhoto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLevel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnView)
                        .addComponent(btnUpdate)
                        .addComponent(btnDelete)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTeamInfo)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPositionTitle)
                    .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(195, 195, 195))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIDActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateActionPerformed

    private void txtLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevelActionPerformed

    private void txtTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamInfoActionPerformed

    private void txtPositionTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionTitleActionPerformed

    private void txtCellNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellNumberActionPerformed

    private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIDActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblView.getSelectedRow();
        
        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to View.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        CreateProfile selectedProfile = (CreateProfile) model.getValueAt(selectedRowIndex,0);
        
        txtName.setText(selectedProfile.getName());
        txtEmployeeID.setText(String.valueOf(selectedProfile.getEmployeeID()));
        txtAge.setText(String.valueOf(selectedProfile.getAge()));
        txtGender.setText(selectedProfile.getGender());
        txtStartDate.setText(selectedProfile.getStartDate());
        txtLevel.setText(selectedProfile.getLevel());
        txtTeamInfo.setText(selectedProfile.getTeamInfo());
        txtPositionTitle.setText(selectedProfile.getPositionTitle());
        txtCellNumber.setText(String.valueOf(selectedProfile.getCellNumber()));
        txtEmailID.setText(selectedProfile.getEmailID());
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void tblViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblViewMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        if(tblView.getSelectedRowCount() == 1){
            
            String Name = txtName.getText();
            int EmployeeID = Integer.parseInt(txtEmployeeID.getText());
            int Age = Integer.parseInt(txtAge.getText());
            String Gender = txtGender.getText();
            String StartDate = txtStartDate.getText();
            String Level = txtLevel.getText();
            String TeamInfo = txtTeamInfo.getText();
            String PositionTitle = txtPositionTitle.getText();
            int CellNumber = Integer.parseInt(txtCellNumber.getText());
            String EmailID = txtEmailID.getText();
            
            tblView.setValueAt(Name, tblView.getSelectedRow(),0);
            tblView.setValueAt(EmployeeID, tblView.getSelectedRow(),1);
            //tblView.setValueAt(Age, tblView.getSelectedRow(),2);
           // tblView.setValueAt(Gender, tblView.getSelectedRow(),3);
           // tblView.setValueAt(StartDate, tblView.getSelectedRow(),4);
            //tblView.setValueAt(Level, tblView.getSelectedRow(),5);
           // tblView.setValueAt(TeamInfo, tblView.getSelectedRow(),6);
            tblView.setValueAt(PositionTitle, tblView.getSelectedRow(),2);
            tblView.setValueAt(CellNumber, tblView.getSelectedRow(),3);
            //tblView.setValueAt(EmailID, tblView.getSelectedRow(),9);
            
            JOptionPane.showMessageDialog(this,"Selected Profile Updated Succefully.");
        }else {
            if(tblView.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is Empty.");
            }else{
                JOptionPane.showMessageDialog(this,"Please select single row for update.");
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        int selectedRowIndex = tblView.getSelectedRow();

        if (selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        CreateProfile selectedProfile = (CreateProfile) model.getValueAt(selectedRowIndex,0);

        history.deleteProfile(selectedProfile);

        JOptionPane.showMessageDialog(this,"Employee Profile deleted.");

        populateTable();

    }//GEN-LAST:event_btnDeleteMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        String SearchString= txtSearch.getText();
        Search(SearchString);
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellNumber;
    private javax.swing.JLabel lblContactInfo;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellNumber;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
    
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        model.setRowCount(0);
        
        for (CreateProfile cp : history.getHistory()){
            
            Object[] row = new Object[4];
            row[0] = cp;
            row[1] = cp.getEmployeeID();
            //row[2] = cp.getAge();
           // row[3] = cp.getGender();
            //row[4] = cp.getStartDate();
            //row[5] = cp.getLevel();
            //row[6] = cp.getTeamInfo();
            row[2] = cp.getPositionTitle();
            row[3] = cp.getCellNumber();
            //row[9] = cp.getEmailID();
            
            model.addRow(row);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.Date;
import javax.swing.JOptionPane;
import model.Profile;

/**
 *
 * @author hemin
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    Profile profile;
    
    public ViewJPanel(Profile p) {
        initComponents();
        
        profile = p;
        displayProfile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblAddL2 = new javax.swing.JLabel();
        txtFaxNum = new javax.swing.JTextField();
        lblZip = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblTeleNum = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblSolana = new javax.swing.JLabel();
        txtDLNum = new javax.swing.JTextField();
        txtAddL2 = new javax.swing.JTextField();
        lblLName = new javax.swing.JLabel();
        lblDLState = new javax.swing.JLabel();
        rbtnFemale = new javax.swing.JRadioButton();
        txtCity = new javax.swing.JTextField();
        lblAddL1 = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        txtAddL1 = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblNationality = new javax.swing.JLabel();
        txtSolana = new javax.swing.JTextField();
        txtNationality = new javax.swing.JTextField();
        lblFaxNum = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        txtTeleNum = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rbtnMale = new javax.swing.JRadioButton();
        lblFName = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtAnnualInc = new javax.swing.JTextField();
        lblAnnualInc = new javax.swing.JLabel();
        lblOcc = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        lblDLNum = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        txtFName = new javax.swing.JTextField();
        dtDOB = new com.toedter.calendar.JDateChooser();
        txtOcc = new javax.swing.JTextField();
        lblMid = new javax.swing.JLabel();
        lblTop = new javax.swing.JLabel();
        lblBott = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        txtdlState = new javax.swing.JTextField();

        lblAddL2.setText("Address Line 2");

        txtFaxNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaxNumActionPerformed(evt);
            }
        });

        lblZip.setText("Zip Code");

        lblCity.setText("City");

        lblTeleNum.setText("Telephone Number");

        lblDOB.setText("Date of Birth");

        lblSolana.setText("Solana Wallet Address");

        txtDLNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDLNumActionPerformed(evt);
            }
        });

        txtAddL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddL2ActionPerformed(evt);
            }
        });

        lblLName.setText("Last Name");

        lblDLState.setText("Drivers Licence State");

        rbtnFemale.setText("Female");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        lblAddL1.setText("Address Line 1");

        lblPhone.setText("Phone");

        txtAddL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddL1ActionPerformed(evt);
            }
        });

        lblGender.setText("Gender");

        lblNationality.setText("Nationality");

        txtSolana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSolanaActionPerformed(evt);
            }
        });

        txtNationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNationalityActionPerformed(evt);
            }
        });

        lblFaxNum.setText("Fax Number");

        lblState.setText("State");

        txtTeleNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeleNumActionPerformed(evt);
            }
        });

        lblEmail.setText("Email");

        txtLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLNameActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        rbtnMale.setText("Male");
        rbtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMaleActionPerformed(evt);
            }
        });

        lblFName.setText("First Name");

        lblSSN.setText("Social Security Number");

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        txtAnnualInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnnualIncActionPerformed(evt);
            }
        });

        lblAnnualInc.setText("Annual Income");

        lblOcc.setText("Occupation");

        txtSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNActionPerformed(evt);
            }
        });

        lblDLNum.setText("Drivers Licence Number");

        txtZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipActionPerformed(evt);
            }
        });

        txtFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNameActionPerformed(evt);
            }
        });

        txtOcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOccActionPerformed(evt);
            }
        });

        lblMid.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblMid.setText("Contact Information");

        lblTop.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTop.setText("Personal Details");

        lblBott.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblBott.setText("Identification Details");

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 25)); // NOI18N
        lblTitle.setText("View Profile");

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });

        txtdlState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdlStateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTop)
                            .addComponent(lblMid))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFName)
                            .addComponent(lblLName)
                            .addComponent(lblGender)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDOB, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNationality))
                            .addComponent(lblFaxNum)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOcc)
                                    .addComponent(lblAnnualInc)
                                    .addComponent(lblEmail))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(rbtnMale)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rbtnFemale))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtFName, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtLName, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(dtDOB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtNationality, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtOcc, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtAnnualInc)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSSN)
                                    .addComponent(lblSolana))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSolana, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTeleNum)
                                    .addComponent(lblPhone)
                                    .addComponent(lblAddL1)
                                    .addComponent(lblState)
                                    .addComponent(lblCity)
                                    .addComponent(lblAddL2)
                                    .addComponent(lblDLNum)
                                    .addComponent(lblDLState)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblBott, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblZip)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtZip)
                                    .addComponent(txtTeleNum)
                                    .addComponent(txtFaxNum)
                                    .addComponent(txtAddL2)
                                    .addComponent(txtAddL1)
                                    .addComponent(txtCity)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDLNum, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtdlState, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPhone))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(32, 32, 32))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(243, 243, 243))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(26, 26, 26)
                .addComponent(lblTop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLName)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDOB)
                    .addComponent(dtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(rbtnMale)
                    .addComponent(rbtnFemale))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNationality))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOcc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnnualInc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnnualInc))
                .addGap(3, 3, 3)
                .addComponent(lblMid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTeleNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTeleNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFaxNum)
                    .addComponent(txtFaxNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddL1)
                    .addComponent(txtAddL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddL2)
                    .addComponent(txtAddL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZip)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBott)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDLNum)
                    .addComponent(txtDLNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDLState)
                    .addComponent(txtdlState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSSN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSolana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSolana))
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFaxNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaxNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaxNumActionPerformed

    private void txtDLNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDLNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDLNumActionPerformed

    private void txtAddL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddL2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddL2ActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtAddL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddL1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddL1ActionPerformed

    private void txtSolanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSolanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSolanaActionPerformed

    private void txtNationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNationalityActionPerformed

    private void txtTeleNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeleNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeleNumActionPerformed

    private void txtLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void rbtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnMaleActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtAnnualIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnnualIncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnnualIncActionPerformed

    private void txtSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNActionPerformed

    private void txtZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipActionPerformed

    private void txtFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNameActionPerformed

    private void txtOccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOccActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtdlStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdlStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdlStateActionPerformed

    
    private void displayProfile() {
        
        
        txtFName.setText(profile.getfName());
        txtLName.setText(profile.getlName());
        dtDOB.setDate(profile.getBirthDate());
        
        // set Gender
        if ("male".equals(profile.getGender())) rbtnMale.setSelected(true);
        else if ("female".equals(profile.getGender())) rbtnFemale.setSelected(true);
        
        
        txtNationality.setText(profile.getNationality());
        txtOcc.setText(profile.getOccupation());
        txtAnnualInc.setText(profile.getAnnualInc());

     
        txtEmail.setText(profile.getEmail());
        txtPhone.setText(profile.getPhone());
        txtTeleNum.setText(profile.getTelephoneNum());
        txtFaxNum.setText(profile.getFaxNum());
        txtAddL1.setText(profile.getAddLine1());
        txtAddL2.setText(profile.getAddLine2());
        txtCity.setText(profile.getCity());
        txtState.setText(profile.getState());
        txtZip.setText(profile.getZip());

       
        txtDLNum.setText(profile.getDlNumber());
        txtdlState.setText(profile.getDlState());
        txtSSN.setText(profile.getSSN());
        txtSolana.setText(profile.getSolAddress());
} 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dtDOB;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddL1;
    private javax.swing.JLabel lblAddL2;
    private javax.swing.JLabel lblAnnualInc;
    private javax.swing.JLabel lblBott;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDLNum;
    private javax.swing.JLabel lblDLState;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblFaxNum;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblMid;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblOcc;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblSolana;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTeleNum;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTop;
    private javax.swing.JLabel lblZip;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JTextField txtAddL1;
    private javax.swing.JTextField txtAddL2;
    private javax.swing.JTextField txtAnnualInc;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDLNum;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtFaxNum;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtOcc;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtSolana;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtTeleNum;
    private javax.swing.JTextField txtZip;
    private javax.swing.JTextField txtdlState;
    // End of variables declaration//GEN-END:variables
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import model.Address;
import model.Person;
import model.PersonDirectory;
import ui.PersonManager.PersonMngWorkAreaJPanel;

/**
 *
 * @author hemin
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private PersonDirectory personDirectory;
    private Address addressDirectory;
    
    public MainJFrame() {
        initComponents();
        
        this.personDirectory = new PersonDirectory();
        this.addressDirectory = new Address();
        generateDemoData();
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
        splitPane = new javax.swing.JSplitPane();
        topPane = new javax.swing.JPanel();
        btnPersonMng = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topPane.setBackground(new java.awt.Color(217, 234, 247));

        btnPersonMng.setText("Open Person Management Work Area ");
        btnPersonMng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonMngActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPaneLayout = new javax.swing.GroupLayout(topPane);
        topPane.setLayout(topPaneLayout);
        topPaneLayout.setHorizontalGroup(
            topPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPaneLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(btnPersonMng, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(338, Short.MAX_VALUE))
        );
        topPaneLayout.setVerticalGroup(
            topPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPaneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnPersonMng)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        splitPane.setTopComponent(topPane);

        userProcessContainer.setBackground(new java.awt.Color(85, 188, 231));
        userProcessContainer.setMinimumSize(new java.awt.Dimension(0, 600));
        userProcessContainer.setSize(new java.awt.Dimension(0, 500));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPersonMngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonMngActionPerformed
        // TODO add your handling code here:
        PersonMngWorkAreaJPanel panel = new PersonMngWorkAreaJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("PersonMngWorkAreaJPanel" ,panel) ;
 
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPersonMngActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    
    private void generateDemoData() {
        
      
        Person person1 = personDirectory.addPerson();
        person1.setFirstName("Mike");
        person1.setLastName("Ross");
        person1.setSSN(123456789);
        person1.setAge((byte) 23);
        person1.setAnnualIncome(1212222);
        person1.setHomeAddress("123 Main St", "Boston", "MA", "02118", 6175551234L);
        person1.setWorkAddress("456 Work St", "Cambridge", "MA", "02139", 6175555678L);

        Person person2 = personDirectory.addPerson();
        person2.setFirstName("John");
        person2.setLastName("Smith");
        person2.setSSN(987654321); 
        person2.setAge((byte) 30); 
        person2.setAnnualIncome(12222);
        person2.setHomeAddress("789 Oak St", "Somerville", "MA", "02145", 6175559876L);
        person2.setWorkAddress("321 Elm St", "Boston", "MA", "02118", 6175556543L);


        Person person3 = personDirectory.addPerson();
        person3.setFirstName("Sara");
        person3.setLastName("Williams");
        person3.setSSN(112233445);
        person3.setAge((byte) 27);
        person3.setAnnualIncome(43222);
        person3.setHomeAddress("654 Pine St", "Medford", "MA", "02155", 6175557654L);
        person3.setWorkAddress("321 Work St", "Cambridge", "MA", "02139", 6175554321L);


        Person person4 = personDirectory.addPerson();
        person4.setFirstName("Jane");
        person4.setLastName("Brown");
        person4.setSSN(223344556);
        person4.setAge((byte) 35);
        person4.setAnnualIncome(1234562);
        person4.setHomeAddress("456 Maple St", "Quincy", "MA", "02170", 6175553456L);
        person4.setWorkAddress("987 Work St", "Somerville", "MA", "02145", 6175556789L);

   
        Person person5 = personDirectory.addPerson();
        person5.setFirstName("Alex");
        person5.setLastName("Johnson");
        person5.setSSN(334455667);
        person5.setAge((byte) 40);
        person5.setAnnualIncome(12692);
        person5.setHomeAddress("987 Cedar St", "Cambridge", "MA", "02139", 6175552345L);
        person5.setWorkAddress("654 Elm St", "Boston", "MA", "02118", 6175559876L);

        
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPersonMng;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel topPane;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}

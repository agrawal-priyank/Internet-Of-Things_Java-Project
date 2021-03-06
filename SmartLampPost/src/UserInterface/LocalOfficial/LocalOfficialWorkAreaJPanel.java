/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LocalOfficial;

import Business.EcoSystem.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LocalOfficialOrganization;
import Business.Organization.Organization;
import Business.Sensor.SensorDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Priyank
 */
public class LocalOfficialWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private Organization organization;
    private LocalOfficialOrganization localOfficialOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private SensorDirectory sensorDirectory;

    /**
     * Creates new form LocalOfficialWorkAreaJPanel
     */
    public LocalOfficialWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, LocalOfficialOrganization localOfficialOrganization, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.localOfficialOrganization = localOfficialOrganization;
        this.enterprise = enterprise;
        this.sensorDirectory = userAccount.getStreetLocation().getSensorDirectory();
        this.userAccount = userAccount;

        officialJLabel.setText(userAccount.getEmployee().getEmployeeName());
        streetJLabel.setText(userAccount.getStreetLocation().getStreetName());
        cityJLabel.setText(enterprise.getName());
        stateJLabel.setText("MA, USA");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addSensorJButton = new javax.swing.JButton();
        manageSensorJButton = new javax.swing.JButton();
        manageWorkRequestJButton = new javax.swing.JButton();
        localOfficialJLabel = new javax.swing.JLabel();
        airIndexJButton = new javax.swing.JButton();
        researchRequestJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        officialJLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        streetJLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cityJLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        stateJLabel = new javax.swing.JLabel();

        addSensorJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addSensorJButton.setText("Add Sensor");
        addSensorJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSensorJButtonActionPerformed(evt);
            }
        });

        manageSensorJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        manageSensorJButton.setText("Locate Sensors");
        manageSensorJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageSensorJButtonActionPerformed(evt);
            }
        });

        manageWorkRequestJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        manageWorkRequestJButton.setText("Work Request");
        manageWorkRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageWorkRequestJButtonActionPerformed(evt);
            }
        });

        localOfficialJLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        localOfficialJLabel.setText("Street Official Work Area");

        airIndexJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        airIndexJButton.setText("Air Index");
        airIndexJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airIndexJButtonActionPerformed(evt);
            }
        });

        researchRequestJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        researchRequestJButton.setText("Research Request");
        researchRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                researchRequestJButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel4.setText("Welcome");

        officialJLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        officialJLabel.setText("value");

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel5.setText("Street");

        streetJLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        streetJLabel.setText("value");

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel6.setText("City");

        cityJLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        cityJLabel.setText("value");

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel7.setText("State");

        stateJLabel.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        stateJLabel.setText("value");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(streetJLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(officialJLabel)
                                .addGap(116, 116, 116)
                                .addComponent(localOfficialJLabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addSensorJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(researchRequestJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(manageSensorJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(manageWorkRequestJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(airIndexJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityJLabel)
                    .addComponent(stateJLabel))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(officialJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(localOfficialJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(streetJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(10, 10, 10)
                .addComponent(addSensorJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(airIndexJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageWorkRequestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageSensorJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(researchRequestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addSensorJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSensorJButtonActionPerformed
        AddSensorJPanel as = new AddSensorJPanel(userProcessContainer, userAccount, sensorDirectory, localOfficialOrganization, enterprise);
        userProcessContainer.add("Add Sensor", as);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addSensorJButtonActionPerformed

    private void manageSensorJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageSensorJButtonActionPerformed
        if (userAccount.getStreetLocation().getSensorDirectory().getSensorList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The street has no sensors installed currently.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            LocateSensorJPanel ms = new LocateSensorJPanel(userProcessContainer, userAccount, sensorDirectory, localOfficialOrganization, enterprise);
            userProcessContainer.add("Manage Sensor", ms);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_manageSensorJButtonActionPerformed

    private void manageWorkRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageWorkRequestJButtonActionPerformed
        if (userAccount.getStreetLocation().getSensorDirectory().getSensorList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The street has no sensors installed currently.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            ManageWorkRequestJPanel aqc = new ManageWorkRequestJPanel(userProcessContainer, userAccount, sensorDirectory, localOfficialOrganization, enterprise, ecoSystem);
            userProcessContainer.add("Manage w", aqc);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_manageWorkRequestJButtonActionPerformed

    private void airIndexJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airIndexJButtonActionPerformed
        if (userAccount.getStreetLocation().getSensorDirectory().getSensorList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The street has no sensors installed currently.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            AirIndexJPanel ar = new AirIndexJPanel(userProcessContainer, userAccount, sensorDirectory, localOfficialOrganization, enterprise, ecoSystem);
            userProcessContainer.add("Air Index", ar);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_airIndexJButtonActionPerformed

    private void researchRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_researchRequestJButtonActionPerformed
        ManageResearchRequestJPanel rr = new ManageResearchRequestJPanel(userProcessContainer, userAccount, sensorDirectory, localOfficialOrganization, enterprise, ecoSystem);
        userProcessContainer.add("ResearchRequest", rr);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_researchRequestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSensorJButton;
    private javax.swing.JButton airIndexJButton;
    private javax.swing.JLabel cityJLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel localOfficialJLabel;
    private javax.swing.JButton manageSensorJButton;
    private javax.swing.JButton manageWorkRequestJButton;
    private javax.swing.JLabel officialJLabel;
    private javax.swing.JButton researchRequestJButton;
    private javax.swing.JLabel stateJLabel;
    private javax.swing.JLabel streetJLabel;
    // End of variables declaration//GEN-END:variables
}

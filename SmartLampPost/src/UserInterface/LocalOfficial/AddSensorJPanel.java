/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LocalOfficial;

import Business.AirQuality.AirIndex;
import Business.Enterprise.Enterprise;
import Business.Organization.LocalOfficialOrganization;
import Business.Organization.Organization;
import Business.Sensor.Sensor;
import Business.Sensor.SensorDirectory;
import Business.Street.Street;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Priyank
 */
public class AddSensorJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SensorDirectory sensorDirectory;
    private Organization organization;
    private LocalOfficialOrganization localOfficialOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;

    /**
     * Creates new form AddSensor
     */
    public AddSensorJPanel(JPanel userProcessContainer, UserAccount userAccount, SensorDirectory sensorDirectory, LocalOfficialOrganization localOfficialOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.sensorDirectory = sensorDirectory;
        this.localOfficialOrganization = localOfficialOrganization;
        this.enterprise = enterprise;

        if (sensorDirectory == null) {
            sensorDirectory = new SensorDirectory();
        } else {
            this.sensorDirectory = sensorDirectory;
        }
        streetNameJTextField.setText(userAccount.getStreetLocation().toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        latitudeJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        addJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        longitudeJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        streetNameJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sensorNameJComboBox = new javax.swing.JComboBox();
        getCoOrdinatesJButton = new javax.swing.JButton();

        setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Sensor Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Sensor Latitude");

        latitudeJTextField.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel3.setText("Add Sensors");

        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Sensor Longitude");

        longitudeJTextField.setEnabled(false);

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        streetNameJTextField.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Street Name");

        sensorNameJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sensor 1", "Sensor 2", "Sensor 3", " " }));
        sensorNameJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sensorNameJComboBoxActionPerformed(evt);
            }
        });

        getCoOrdinatesJButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getCoOrdinatesJButton.setText("Get Co-Ordinates");
        getCoOrdinatesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getCoOrdinatesJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sensorNameJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(streetNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addComponent(latitudeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(backJButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addJButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(longitudeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))))
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(getCoOrdinatesJButton)
                .addGap(217, 217, 217))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sensorNameJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(latitudeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(getCoOrdinatesJButton)
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(longitudeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJButton)
                    .addComponent(backJButton))
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public float randomGenerator(float min, float max) {
        return (float) (min + Math.random() * (max - min));
    }

    String getResult(AirIndex airIndex) {
        String result = "N/A";
        if (airIndex.getAirIndex() >= 0 && airIndex.getAirIndex() <= 440) {
            result = "Good";
        } else if (airIndex.getAirIndex() >= 441 && airIndex.getAirIndex() <= 450) {
            result = "Moderate";
        } else if (airIndex.getAirIndex() >= 451 && airIndex.getAirIndex() <= 460) {
            result = "Unhealthy for Sensitive Groups";
        } else if (airIndex.getAirIndex() >= 461 && airIndex.getAirIndex() <= 470) {
            result = "Unhealthy";
        } else if (airIndex.getAirIndex() >= 471 && airIndex.getAirIndex() <= 480) {
            result = "Very Unhealthy";
        } else if (airIndex.getAirIndex() >= 481 && airIndex.getAirIndex() <= 490) {
            result = "Hazardous";
        } else if (airIndex.getAirIndex() >= 491 && airIndex.getAirIndex() <= 500) {
            result = "Very Hazardous";
        }
        return result;
    }

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        Street street = userAccount.getStreetLocation();
        String name = (String) sensorNameJComboBox.getSelectedItem();
        boolean flag = false;
        if (street.getSensorDirectory().getSensorList() != null) {
            for (Sensor sensor : street.getSensorDirectory().getSensorList()) {
                if (sensor.getSensorName().equalsIgnoreCase(sensorNameJComboBox.getSelectedItem().toString())) {
                    flag = true;
                }
            }
        } else {
            flag = false;
        }
//        if (street.getSensorDirectory().getSensorList() != null && street.getSensorDirectory().searchSensor(name) != null){
//            
//        }
        if (flag == false) {
            Sensor sensor = sensorDirectory.createSensor();
            sensor.setSensorName(sensorNameJComboBox.getSelectedItem().toString());
            double latitude = Double.parseDouble(latitudeJTextField.getText());
            sensor.setLatitude(latitude);
            double longitude = Double.parseDouble(longitudeJTextField.getText());
            sensor.setLongitude(longitude);

            //Street street = userAccount.getStreetLocation();
            street.setSensorDirectory(sensorDirectory);

            AirIndex airIndex = sensor.getAirIndexDirectory().addAirIndex();
            airIndex.setOzone(randomGenerator(0, 500));
            airIndex.setParticulateMatter(randomGenerator(0, 500));
            airIndex.setCarbonMonoxide(randomGenerator(0, 500));
            airIndex.setSulphurDioxide(randomGenerator(0, 500));
            airIndex.setNitrogenDioxide(randomGenerator(0, 500));
            Date date = new Date();
            airIndex.setTimeStamp(date);

            sensor.getAirIndexDirectory();

            float maxValue = Math.max(airIndex.getCarbonMonoxide(), Math.max(airIndex.getNitrogenDioxide(), Math.max(airIndex.getOzone(), Math.max(airIndex.getParticulateMatter(), airIndex.getSulphurDioxide()))));
            airIndex.setAirIndex((int) maxValue);
            airIndex.setResult(getResult(airIndex));

            JOptionPane.showMessageDialog(null, "Sensor added successfully.", "Congratulations", JOptionPane.INFORMATION_MESSAGE);

            latitudeJTextField.setText("");
            longitudeJTextField.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Sensor already present.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

//    public void populateLatitudeLongitude(){
//        if(userAccount.getStreetLocation().toString() == ){
//            
//        }
//    }
    private void sensorNameJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sensorNameJComboBoxActionPerformed
    }//GEN-LAST:event_sensorNameJComboBoxActionPerformed

    private void getCoOrdinatesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCoOrdinatesJButtonActionPerformed
        if (streetNameJTextField.getText().equalsIgnoreCase("Allston")) {
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 1")) {
                latitudeJTextField.setText("42.353904");
                longitudeJTextField.setText("-71.133711");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 2")) {
                latitudeJTextField.setText("42.354661");
                longitudeJTextField.setText("-71.134697");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 3")) {
                latitudeJTextField.setText("42.354538");
                longitudeJTextField.setText("-71.132685");
            }
        } else if (streetNameJTextField.getText().equalsIgnoreCase("Brighton")) {
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 1")) {
                latitudeJTextField.setText("42.346350");
                longitudeJTextField.setText("-71.162676");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 2")) {
                latitudeJTextField.setText("42.346034");
                longitudeJTextField.setText("-71.160950");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 3")) {
                latitudeJTextField.setText("42.347380");
                longitudeJTextField.setText("-71.161423");
            }
        } else if (streetNameJTextField.getText().equalsIgnoreCase("Back-Bay")) {
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 1")) {
                latitudeJTextField.setText("42.350265");
                longitudeJTextField.setText("-71.080976");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 2")) {
                latitudeJTextField.setText("42.349978");
                longitudeJTextField.setText("-71.080831");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 3")) {
                latitudeJTextField.setText("42.349213");
                longitudeJTextField.setText("-71.080576");
            }
        } else if (streetNameJTextField.getText().equalsIgnoreCase("Cambridge")) {
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 1")) {
                latitudeJTextField.setText("42.373616");
                longitudeJTextField.setText("-71.109734");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 2")) {
                latitudeJTextField.setText("42.372993");
                longitudeJTextField.setText("-71.110475");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 3")) {
                latitudeJTextField.setText("42.374611");
                longitudeJTextField.setText("-71.107413");
            }
        } else if (streetNameJTextField.getText().equalsIgnoreCase("Chinatown")) {
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 1")) {
                latitudeJTextField.setText("42.350064");
                longitudeJTextField.setText("-71.062405");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 2")) {
                latitudeJTextField.setText("42.350952");
                longitudeJTextField.setText("-71.061854");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 3")) {
                latitudeJTextField.setText("42.350710");
                longitudeJTextField.setText("-71.063260");
            }
        } else if (streetNameJTextField.getText().equalsIgnoreCase("Downtown")) {
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 1")) {
                latitudeJTextField.setText("42.360083");
                longitudeJTextField.setText("-71.059434");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 2")) {
                latitudeJTextField.setText("42.355955");
                longitudeJTextField.setText("-71.062560");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 3")) {
                latitudeJTextField.setText("42.353122");
                longitudeJTextField.setText("-71.060604");
            }
        } else if (streetNameJTextField.getText().equalsIgnoreCase("East-Boston")) {
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 1")) {
                latitudeJTextField.setText("42.370214");
                longitudeJTextField.setText("-71.038860");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 2")) {
                latitudeJTextField.setText("42.369935");
                longitudeJTextField.setText("-71.037525");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 3")) {
                latitudeJTextField.setText("42.369455");
                longitudeJTextField.setText("-71.036703");
            }
        } else if (streetNameJTextField.getText().equalsIgnoreCase("Fenway")) {
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 1")) {
                latitudeJTextField.setText("42.342865");
                longitudeJTextField.setText("-71.100288");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 2")) {
                latitudeJTextField.setText("42.342106");
                longitudeJTextField.setText("-71.099667");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 3")) {
                latitudeJTextField.setText("42.343348");
                longitudeJTextField.setText("-71.100508");
            }
        } else if (streetNameJTextField.getText().equalsIgnoreCase("Roxbury")) {
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 1")) {
                latitudeJTextField.setText("42.315198");
                longitudeJTextField.setText("-71.091375");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 2")) {
                latitudeJTextField.setText("42.314492");
                longitudeJTextField.setText("-71.092150");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 3")) {
                latitudeJTextField.setText("42.316249");
                longitudeJTextField.setText("-71.091347");
            }
        } else if (streetNameJTextField.getText().equalsIgnoreCase("South-Boston")) {
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 1")) {
                latitudeJTextField.setText("42.338144");
                longitudeJTextField.setText("-71.047577");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 2")) {
                latitudeJTextField.setText("42.337265");
                longitudeJTextField.setText("-71.048483");
            }
            if (sensorNameJComboBox.getSelectedItem().toString().equalsIgnoreCase("Sensor 3")) {
                latitudeJTextField.setText("42.338966");
                longitudeJTextField.setText("-71.046719");
            }
        }
    }//GEN-LAST:event_getCoOrdinatesJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton getCoOrdinatesJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField latitudeJTextField;
    private javax.swing.JTextField longitudeJTextField;
    private javax.swing.JComboBox sensorNameJComboBox;
    private javax.swing.JTextField streetNameJTextField;
    // End of variables declaration//GEN-END:variables
}

package view;

import dao.AppointmentDAO;
import dao.PatientDAO;
import javax.swing.JOptionPane;
import model.Appointment;
import org.bson.Document;
import utilities.*;

public class Dates_Register extends javax.swing.JFrame {
    private AppointmentDAO app = new AppointmentDAO();
    
    public Dates_Register() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        jPanel1.setLocation(MAXIMIZED_HORIZ/2, MAXIMIZED_VERT/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new PanelImage();
        jPanel1 = new PanelRound();
        jLabel9 = new javax.swing.JLabel();
        typeDocumentField = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        documentField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dayField = new javax.swing.JTextField();
        doctorField = new javax.swing.JTextField();
        hoursField = new javax.swing.JTextField();
        consultoryField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        minutesField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        amField = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        monthField = new javax.swing.JTextField();
        yearField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setText("Tipo de Documento:");

        typeDocumentField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un documento", "Tarjeta de Identidad", "Cédula de Ciudadanía", "Cédula de Extranjería" }));
        typeDocumentField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setText("Nro. Documento:");

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setText("Hora: (HH:MM)");

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel12.setText("Consultorio:");

        documentField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        documentField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                documentFieldKeyPressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setText("Médico:");

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setText("Fecha: (DD/MM/AAAA)");

        backButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        backButton.setText("←");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("Agendar Citas");

        dayField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        dayField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dayField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dayFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dayFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dayFieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dayFieldMousePressed(evt);
            }
        });
        dayField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayFieldActionPerformed(evt);
            }
        });
        dayField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dayFieldKeyPressed(evt);
            }
        });

        doctorField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        hoursField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        hoursField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hoursField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hoursFieldMouseEntered(evt);
            }
        });
        hoursField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoursFieldActionPerformed(evt);
            }
        });
        hoursField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hoursFieldKeyPressed(evt);
            }
        });

        consultoryField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        consultoryField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consultoryFieldKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jButton1.setText("Agendar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        minutesField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        minutesField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minutesField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minutesFieldMouseEntered(evt);
            }
        });
        minutesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutesFieldActionPerformed(evt);
            }
        });
        minutesField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                minutesFieldKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(":");

        amField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a.m.", "p.m." }));
        amField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("|");

        monthField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        monthField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monthField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monthFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                monthFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                monthFieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                monthFieldMousePressed(evt);
            }
        });
        monthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthFieldActionPerformed(evt);
            }
        });
        monthField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                monthFieldKeyPressed(evt);
            }
        });

        yearField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        yearField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yearField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yearFieldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yearFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                yearFieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                yearFieldMousePressed(evt);
            }
        });
        yearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearFieldActionPerformed(evt);
            }
        });
        yearField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yearFieldKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("|");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(doctorField)
                            .addComponent(consultoryField)
                            .addComponent(typeDocumentField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(documentField)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(hoursField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(minutesField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(amField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(100, 100, 100))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(typeDocumentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(documentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(hoursField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minutesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(consultoryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(doctorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Appointment_Functions app = new Appointment_Functions();
        app.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(typeDocumentField.getSelectedIndex() == 0 || documentField.getText().isEmpty() || dayField.getText().isEmpty() || 
                monthField.getText().isEmpty() || yearField.getText().isEmpty() || hoursField.getText().isEmpty() || 
                minutesField.getText().isEmpty() || consultoryField.getText().isEmpty() || doctorField.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(this, "Faltan campos por diligenciar", "Advertencia", 2);
            
        }else{
            String Fecha = dayField.getText()+"/"+monthField.getText()+"/"+yearField.getText();
            String Hour = hoursField.getText()+":"+minutesField.getText()+" "+amField.getSelectedItem().toString();

            Appointment App = new Appointment(typeDocumentField.getSelectedItem().toString(), documentField.getText(), Fecha, Hour, Integer.parseInt(consultoryField.getText()), 
                    doctorField.getText());

            PatientDAO pat = new PatientDAO();

            Document doc = pat.Find(typeDocumentField.getSelectedItem().toString(), documentField.getText());

            if(doc != null){
                app.SaveApoinment(App);
                JOptionPane.showMessageDialog(this, "Cita Agenda", "Operación Exitosa", 1);
            }else{
                JOptionPane.showMessageDialog(this, "El documento ingresado no pertenece a ningún paciente", "Error", 0);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hoursFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoursFieldActionPerformed
        
    }//GEN-LAST:event_hoursFieldActionPerformed

    private void minutesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutesFieldActionPerformed
        
    }//GEN-LAST:event_minutesFieldActionPerformed

    private void dayFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayFieldActionPerformed
        
    }//GEN-LAST:event_dayFieldActionPerformed

    private void monthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthFieldActionPerformed
        
    }//GEN-LAST:event_monthFieldActionPerformed

    private void yearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearFieldActionPerformed
        
    }//GEN-LAST:event_yearFieldActionPerformed

    private void dayFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayFieldMouseClicked
    }//GEN-LAST:event_dayFieldMouseClicked

    private void dayFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayFieldMouseEntered
    }//GEN-LAST:event_dayFieldMouseEntered

    private void dayFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayFieldMouseExited
        
    }//GEN-LAST:event_dayFieldMouseExited

    private void monthFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthFieldMouseClicked
    }//GEN-LAST:event_monthFieldMouseClicked

    private void monthFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthFieldMouseEntered
    }//GEN-LAST:event_monthFieldMouseEntered

    private void monthFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthFieldMouseExited
        
    }//GEN-LAST:event_monthFieldMouseExited

    private void yearFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearFieldMouseClicked
    }//GEN-LAST:event_yearFieldMouseClicked

    private void yearFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearFieldMouseEntered
    }//GEN-LAST:event_yearFieldMouseEntered

    private void yearFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearFieldMouseExited
    }//GEN-LAST:event_yearFieldMouseExited

    private void dayFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayFieldMousePressed
    }//GEN-LAST:event_dayFieldMousePressed

    private void monthFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthFieldMousePressed
    }//GEN-LAST:event_monthFieldMousePressed

    private void yearFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yearFieldMousePressed
    }//GEN-LAST:event_yearFieldMousePressed

    private void hoursFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoursFieldMouseEntered
    }//GEN-LAST:event_hoursFieldMouseEntered

    private void minutesFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minutesFieldMouseEntered
    }//GEN-LAST:event_minutesFieldMouseEntered

    private void documentFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documentFieldKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            documentField.setEditable(false);
        }else{
            documentField.setEditable(true);
            if(documentField.getText().length() == 10){
                documentField.setEditable(false);
            }
        }
        
        if(evt.getKeyCode() == 8){
            documentField.setEditable(true);
        }
    }//GEN-LAST:event_documentFieldKeyPressed

    private void dayFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dayFieldKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            dayField.setEditable(false);
        }else{
            dayField.setEditable(true);
            if(dayField.getText().length() == 2){
                dayField.setEditable(false);
            }
        }
        
        if(evt.getKeyCode() == 8){
            dayField.setEditable(true);
        }
    }//GEN-LAST:event_dayFieldKeyPressed

    private void monthFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monthFieldKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            monthField.setEditable(false);
        }else{
            monthField.setEditable(true);
            if(monthField.getText().length() == 2){
                monthField.setEditable(false);
            }
        }
        
        if(evt.getKeyCode() == 8){
            monthField.setEditable(true);
        }
    }//GEN-LAST:event_monthFieldKeyPressed

    private void yearFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearFieldKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            yearField.setEditable(false);
        }else{
            yearField.setEditable(true);
            if(yearField.getText().length() == 4){
                yearField.setEditable(false);
            }
        }
        
        if(evt.getKeyCode() == 8){
            yearField.setEditable(true);
        }
    }//GEN-LAST:event_yearFieldKeyPressed

    private void hoursFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hoursFieldKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            hoursField.setEditable(false);
        }else{
            hoursField.setEditable(true);
            if(hoursField.getText().length() == 2){
                hoursField.setEditable(false);
            }
        }
        
        if(evt.getKeyCode() == 8){
            hoursField.setEditable(true);
        }
    }//GEN-LAST:event_hoursFieldKeyPressed

    private void minutesFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minutesFieldKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            minutesField.setEditable(false);
        }else{
            minutesField.setEditable(true);
            if(minutesField.getText().length() == 2){
                minutesField.setEditable(false);
            }
        }
        
        if(evt.getKeyCode() == 8){
            minutesField.setEditable(true);
        }
    }//GEN-LAST:event_minutesFieldKeyPressed

    private void consultoryFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultoryFieldKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            consultoryField.setEditable(false);
        }else{
            consultoryField.setEditable(true);
            if(consultoryField.getText().length() == 3){
                consultoryField.setEditable(false);
            }
        }
        
        if(evt.getKeyCode() == 8){
            consultoryField.setEditable(true);
        }
    }//GEN-LAST:event_consultoryFieldKeyPressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dates_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dates_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dates_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dates_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dates_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> amField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField consultoryField;
    private javax.swing.JTextField dayField;
    private javax.swing.JTextField doctorField;
    private javax.swing.JTextField documentField;
    private javax.swing.JTextField hoursField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField minutesField;
    private javax.swing.JTextField monthField;
    private javax.swing.JComboBox<String> typeDocumentField;
    private javax.swing.JTextField yearField;
    // End of variables declaration//GEN-END:variables
}

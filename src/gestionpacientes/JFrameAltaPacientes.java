/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpacientes;

import clinicadental.*;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lucky
 */
public class JFrameAltaPacientes extends javax.swing.JFrame {

    /**
     * Creates new form LoginJframe
     */
    public JFrameAltaPacientes() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelContenido = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelError = new javax.swing.JLabel();
        jPanelAltaPacienteForm = new javax.swing.JPanel();
        jLabelNombrePaciente = new javax.swing.JLabel();
        jLabelApe1 = new javax.swing.JLabel();
        jLabelApe2 = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jLabelFechaNac = new javax.swing.JLabel();
        jLabelTlf = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelAlergias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAlergias = new javax.swing.JTextArea();
        jTextFieldApe1 = new javax.swing.JTextField();
        jTextFieldApe2 = new javax.swing.JTextField();
        jTextFieldDni = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jDateChooserFechaNac = new com.toedter.calendar.JDateChooser();
        jLabelDatosPaciente = new javax.swing.JLabel();
        jButtonCancelarAlta = new javax.swing.JButton();
        jButtonGuardarPaciente = new javax.swing.JButton();
        jLabelImgFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanelContenido.setOpaque(false);
        jPanelContenido.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Alta de Pacientes");

        jLabelError.setForeground(new java.awt.Color(204, 0, 0));

        jPanelAltaPacienteForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 135, 135)));
        jPanelAltaPacienteForm.setOpaque(false);

        jLabelNombrePaciente.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jLabelNombrePaciente.setText("Nombre:");

        jLabelApe1.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jLabelApe1.setText("Primer Apellido:");

        jLabelApe2.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jLabelApe2.setText("Segundo Apellido:");

        jLabelDni.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jLabelDni.setText("DNI:");

        jLabelFechaNac.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jLabelFechaNac.setText("Fecha de Nacimiento:");

        jLabelTlf.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jLabelTlf.setText("Telefono:");

        jLabelEmail.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jLabelEmail.setText("e-mail:");

        jTextFieldNombre.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N

        jLabelAlergias.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jLabelAlergias.setText("Alergias conocidas:");

        jTextAreaAlergias.setColumns(15);
        jTextAreaAlergias.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jTextAreaAlergias.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAlergias);

        jTextFieldApe1.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N

        jTextFieldApe2.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N

        jTextFieldDni.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jTextFieldDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldDniFocusLost(evt);
            }
        });

        jTextFieldEmail.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N

        jTextFieldTelefono.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jTextFieldTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldTelefonoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanelAltaPacienteFormLayout = new javax.swing.GroupLayout(jPanelAltaPacienteForm);
        jPanelAltaPacienteForm.setLayout(jPanelAltaPacienteFormLayout);
        jPanelAltaPacienteFormLayout.setHorizontalGroup(
            jPanelAltaPacienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltaPacienteFormLayout.createSequentialGroup()
                .addGroup(jPanelAltaPacienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAltaPacienteFormLayout.createSequentialGroup()
                        .addContainerGap(80, Short.MAX_VALUE)
                        .addGroup(jPanelAltaPacienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelAltaPacienteFormLayout.createSequentialGroup()
                                .addComponent(jLabelEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAltaPacienteFormLayout.createSequentialGroup()
                                .addComponent(jLabelTlf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanelAltaPacienteFormLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanelAltaPacienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelAltaPacienteFormLayout.createSequentialGroup()
                                .addComponent(jLabelFechaNac)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooserFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAltaPacienteFormLayout.createSequentialGroup()
                                .addComponent(jLabelDni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAltaPacienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAltaPacienteFormLayout.createSequentialGroup()
                                    .addComponent(jLabelApe2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldApe2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAltaPacienteFormLayout.createSequentialGroup()
                                    .addComponent(jLabelApe1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldApe1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelAltaPacienteFormLayout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(jLabelNombrePaciente)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(jPanelAltaPacienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAlergias)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelAltaPacienteFormLayout.setVerticalGroup(
            jPanelAltaPacienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltaPacienteFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAltaPacienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombrePaciente)
                    .addComponent(jLabelAlergias)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAltaPacienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAltaPacienteFormLayout.createSequentialGroup()
                        .addGroup(jPanelAltaPacienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelApe1)
                            .addComponent(jTextFieldApe1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAltaPacienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelApe2)
                            .addComponent(jTextFieldApe2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAltaPacienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDni)
                            .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAltaPacienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFechaNac)
                            .addComponent(jDateChooserFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanelAltaPacienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTlf)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAltaPacienteFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelDatosPaciente.setForeground(new java.awt.Color(135, 135, 135));
        jLabelDatosPaciente.setText("Datos del paciente:");

        jButtonCancelarAlta.setBackground(new java.awt.Color(0, 128, 192));
        jButtonCancelarAlta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarAlta.setText("Cancelar");
        jButtonCancelarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarAltaActionPerformed(evt);
            }
        });

        jButtonGuardarPaciente.setBackground(new java.awt.Color(0, 128, 192));
        jButtonGuardarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardarPaciente.setText("Guardar");
        jButtonGuardarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addComponent(jButtonGuardarPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelarAlta))
                    .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelDatosPaciente)
                        .addComponent(jPanelAltaPacienteForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTitulo)
                .addGap(90, 90, 90)
                .addComponent(jLabelDatosPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAltaPacienteForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarAlta)
                    .addComponent(jButtonGuardarPaciente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanelContenido, gridBagConstraints);

        jLabelImgFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jLabelImgFondo.setMaximumSize(new java.awt.Dimension(800, 600));
        jLabelImgFondo.setMinimumSize(new java.awt.Dimension(800, 600));
        jLabelImgFondo.setPreferredSize(new java.awt.Dimension(800, 600));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabelImgFondo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jButtonGuardarPaciente.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButtonCancelarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarAltaActionPerformed
        JFramePacientes pacientes = new JFramePacientes();
        pacientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarAltaActionPerformed

    private void jButtonGuardarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarPacienteActionPerformed
        anadirPaciente();
        JFramePacientes pacientes = new JFramePacientes();
        pacientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonGuardarPacienteActionPerformed

    private void jTextFieldDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDniFocusLost
        if (esNumero(jTextFieldDni.getText())){
            jTextFieldDni.setBackground(Color.green);
            jLabelError.setText("");
            activaGuardar();
        }else{
            jTextFieldDni.setBackground(Color.red);
            jLabelError.setText("\"DNI\" debe ser un campo numerico");
            jButtonGuardarPaciente.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldDniFocusLost

    private void jTextFieldTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoFocusLost
        if (esNumero(jTextFieldTelefono.getText())){
            jTextFieldTelefono.setBackground(Color.green);
            jLabelError.setText("");
            activaGuardar();
            }else{
            jTextFieldTelefono.setBackground(Color.red);
            jLabelError.setText("\"Telefono\" debe ser un campo numerico");
            jButtonGuardarPaciente.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldTelefonoFocusLost
    
    private void activaGuardar(){
        if(!jTextFieldDni.getText().equals("") || !jTextFieldTelefono.getText().equals(""))
            if(esNumero(jTextFieldTelefono.getText()) && esNumero(jTextFieldTelefono.getText()))
                jButtonGuardarPaciente.setEnabled(true);
    }
    
    private boolean esNumero(String s){
        try{
            int dni = Integer.parseInt(s);
            return true;
        }catch(NumberFormatException e){
            return false;        
        }
    }
    
    private void anadirPaciente(){
        Date fechaNac = jDateChooserFechaNac.getDate();
        
        Paciente[] p = {new Paciente(Integer.parseInt(jTextFieldDni.getText()),
                                    jTextFieldNombre.getText(),
                                    jTextFieldApe1.getText(),
                                    jTextFieldApe2.getText(),
                                    Integer.parseInt(jTextFieldTelefono.getText()),
                                    fechaNac)};
        
        Clinica.anadirPaciente(p);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new JFrameAltaPacientes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarAlta;
    private javax.swing.JButton jButtonGuardarPaciente;
    private com.toedter.calendar.JDateChooser jDateChooserFechaNac;
    private javax.swing.JLabel jLabelAlergias;
    private javax.swing.JLabel jLabelApe1;
    private javax.swing.JLabel jLabelApe2;
    private javax.swing.JLabel jLabelDatosPaciente;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelFechaNac;
    private javax.swing.JLabel jLabelImgFondo;
    private javax.swing.JLabel jLabelNombrePaciente;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTlf;
    private javax.swing.JPanel jPanelAltaPacienteForm;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAlergias;
    private javax.swing.JTextField jTextFieldApe1;
    private javax.swing.JTextField jTextFieldApe2;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
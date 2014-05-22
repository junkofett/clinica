/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionagenda;

import clinicadental.*;
import gestionarticulos.JFrameArticulos;
import gestionempleados.Empleado;
import gestionempleados.JFrameEmpleados;
import gestionintervencion.JFrameIntervencion;
import gestionpacientes.JFramePacientes;
import java.awt.Dimension;
import java.util.ArrayList;

/**
 *
 * @author Lucky
 */
public class JFrameAgenda extends javax.swing.JFrame {

    /**
     * Creates new form LoginJframe
     */
    public JFrameAgenda() {
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
        jButtonArticulo = new javax.swing.JButton();
        jButtonSalir1 = new javax.swing.JButton();
        jButtonEmpleado = new javax.swing.JButton();
        jButtonPaciente = new javax.swing.JButton();
        jButtonAgenda = new javax.swing.JButton();
        jButtonIntervencion = new javax.swing.JButton();
        jPanelTabla = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAgenda = new javax.swing.JTable();
        jButtonBuscarCita = new javax.swing.JButton();
        jButtonFiltrarCita = new javax.swing.JButton();
        jButtonModificarCita = new javax.swing.JButton();
        jButtonMarcarRealizada = new javax.swing.JButton();
        jButtonEliminarCita = new javax.swing.JButton();
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
        jLabelTitulo.setText("Gestión de Agenda");

        jLabelError.setForeground(new java.awt.Color(204, 0, 0));

        jButtonArticulo.setBackground(new java.awt.Color(153, 204, 255));
        jButtonArticulo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonArticulo.setText("ARTÍCULOS");
        jButtonArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonArticuloActionPerformed(evt);
            }
        });

        jButtonSalir1.setBackground(new java.awt.Color(153, 204, 255));
        jButtonSalir1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonSalir1.setText("SALIR");

        jButtonEmpleado.setBackground(new java.awt.Color(153, 204, 255));
        jButtonEmpleado.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonEmpleado.setText("EMPLEADOS");
        jButtonEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpleadoActionPerformed(evt);
            }
        });

        jButtonPaciente.setBackground(new java.awt.Color(153, 204, 255));
        jButtonPaciente.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonPaciente.setText("PACIENTES");
        jButtonPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPacienteActionPerformed(evt);
            }
        });

        jButtonAgenda.setBackground(new java.awt.Color(255, 204, 102));
        jButtonAgenda.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonAgenda.setText("AGENDA");
        jButtonAgenda.setFocusable(false);

        jButtonIntervencion.setBackground(new java.awt.Color(153, 204, 255));
        jButtonIntervencion.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonIntervencion.setText("INTERVENCIONES");
        jButtonIntervencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIntervencionActionPerformed(evt);
            }
        });

        jPanelTabla.setOpaque(false);

        jTableAgenda.setAutoCreateRowSorter(true);
        jTableAgenda.setModel(new javax.swing.table.DefaultTableModel(datos(),cabecera()){
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableAgenda);

        jButtonBuscarCita.setBackground(new java.awt.Color(0, 128, 192));
        jButtonBuscarCita.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscarCita.setText("Buscar");
        jButtonBuscarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarCitaActionPerformed(evt);
            }
        });

        jButtonFiltrarCita.setBackground(new java.awt.Color(0, 128, 192));
        jButtonFiltrarCita.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFiltrarCita.setText("Filtrar");

        jButtonModificarCita.setBackground(new java.awt.Color(0, 128, 192));
        jButtonModificarCita.setForeground(new java.awt.Color(255, 255, 255));
        jButtonModificarCita.setText("Modificar");

        jButtonMarcarRealizada.setBackground(new java.awt.Color(0, 128, 192));
        jButtonMarcarRealizada.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMarcarRealizada.setText("Marcar Realizada");
        jButtonMarcarRealizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarcarRealizadaActionPerformed(evt);
            }
        });

        jButtonEliminarCita.setBackground(new java.awt.Color(0, 128, 192));
        jButtonEliminarCita.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEliminarCita.setText("Eliminar");
        jButtonEliminarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTablaLayout = new javax.swing.GroupLayout(jPanelTabla);
        jPanelTabla.setLayout(jPanelTablaLayout);
        jPanelTablaLayout.setHorizontalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                    .addGroup(jPanelTablaLayout.createSequentialGroup()
                        .addComponent(jButtonBuscarCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFiltrarCita)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelTablaLayout.createSequentialGroup()
                        .addComponent(jButtonModificarCita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMarcarRealizada)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminarCita)))
                .addContainerGap())
        );
        jPanelTablaLayout.setVerticalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBuscarCita)
                    .addComponent(jButtonFiltrarCita))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificarCita)
                    .addComponent(jButtonMarcarRealizada)
                    .addComponent(jButtonEliminarCita))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelContenidoLayout = new javax.swing.GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitulo)
                            .addComponent(jLabelError, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonIntervencion)
                                    .addComponent(jButtonAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(jPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22))
        );

        jPanelContenidoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAgenda, jButtonArticulo, jButtonEmpleado, jButtonIntervencion, jButtonPaciente, jButtonSalir1});

        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenidoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelTitulo)
                .addGroup(jPanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButtonAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonIntervencion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanelContenidoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButtonSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
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
        rellenarTablaCitasPendientes();
    }//GEN-LAST:event_formWindowOpened

    private void jButtonEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpleadoActionPerformed
        JFrameEmpleados empleados = new JFrameEmpleados();
        empleados.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonEmpleadoActionPerformed

    private void jButtonPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPacienteActionPerformed
        JFramePacientes pacientes = new JFramePacientes();
        pacientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonPacienteActionPerformed

    private void jButtonIntervencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIntervencionActionPerformed
        JFrameIntervencion intervencion = new JFrameIntervencion();
        intervencion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonIntervencionActionPerformed

    private void jButtonArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonArticuloActionPerformed
        JFrameArticulos articulos = new JFrameArticulos();
        articulos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonArticuloActionPerformed

    private void jButtonBuscarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarCitaActionPerformed

    private void jButtonMarcarRealizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarcarRealizadaActionPerformed
        encontrarCita().setRealizada(true);
        
    }//GEN-LAST:event_jButtonMarcarRealizadaActionPerformed

    private void jButtonEliminarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarCitaActionPerformed
        ArrayList<Cita> citas = Clinica.getAgenda();             
       
        for (int i = 0; i < jTableAgenda.getSelectedRows().length; i++) {
            for (int j = 0; j < citas.size(); j++) {
                if (jTableAgenda.getValueAt(jTableAgenda.getSelectedRows()[i], 0).equals(citas.get(j).getId())){
                    citas.remove(j);
                }
            }  
        }
    }//GEN-LAST:event_jButtonEliminarCitaActionPerformed
    
    private Cita encontrarCita(){
        ArrayList<Cita> citas = Clinica.getAgenda();
        Cita citaEncontrada = null;
        boolean encontrado = false;
        
        for (int i = 0; i < citas.size() && !encontrado; i++) {
            if(jTableAgenda.getValueAt(jTableAgenda.getSelectedRow(),0).equals(citas.get(i).getId())){
                encontrado = true;
                citaEncontrada = citas.get(i);                 
            }
        }
        
        return citaEncontrada;
    }
    private void rellenarTablaCitasPendientes(){
        ArrayList<Cita> citas = Clinica.getCitasPendientes();
        
        for (int i = 0; i < citas.size(); i++) {
            for (int j = 0; j < citas.get(i).datosTabla().length; j++) {
                jTableAgenda.setValueAt(citas.get(i).datosTabla()[j],i,j);
            }
        }
    
    }
    
    private void rellenarTabla() {
        ArrayList<Cita> citas = Clinica.getAgenda();
        
        for (int i = 0; i < citas.size(); i++) {
            for (int j = 0; j < citas.get(i).datosTabla().length; j++) {
                jTableAgenda.setValueAt(citas.get(i).datosTabla()[j],i,j);
            }
        }
    }
    
    private Object[][] datos() {
        ArrayList<Cita> citas = Clinica.getAgenda();
        Object[][] datos = new Object[citas.size()][cabecera().length];
        
        for (int i = 0; i < citas.size(); i++)
        {
            for (int j = 0; j < cabecera().length; j++){
                datos[i][j] = null;                
            }
        }
        return datos;
    }
    
    private String[] cabecera() {
        String[] cabecera = {"ID", "Paciente", "Tipo Intervencion", "Consulta", "Fecha", "Realizada"};
        return cabecera;
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
            java.util.logging.Logger.getLogger(JFrameAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JFrameAgenda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgenda;
    private javax.swing.JButton jButtonArticulo;
    private javax.swing.JButton jButtonBuscarCita;
    private javax.swing.JButton jButtonEliminarCita;
    private javax.swing.JButton jButtonEmpleado;
    private javax.swing.JButton jButtonFiltrarCita;
    private javax.swing.JButton jButtonIntervencion;
    private javax.swing.JButton jButtonMarcarRealizada;
    private javax.swing.JButton jButtonModificarCita;
    private javax.swing.JButton jButtonPaciente;
    private javax.swing.JButton jButtonSalir1;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelImgFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelContenido;
    private javax.swing.JPanel jPanelTabla;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAgenda;
    // End of variables declaration//GEN-END:variables
}

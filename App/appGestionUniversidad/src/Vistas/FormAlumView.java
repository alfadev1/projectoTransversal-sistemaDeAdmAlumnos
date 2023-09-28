/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.AlumnoData;
import Entidades.Alumno;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author @SimonettaDaniel
 */
public class FormAlumView extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormAlumView
     */
    AlumnoData ad = new AlumnoData();

    public FormAlumView() {
        initComponents();
        desactivarBotones();

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTDniAlum = new javax.swing.JTextField();
        jTApeAlum = new javax.swing.JTextField();
        jTNomAlum = new javax.swing.JTextField();
        jRBestadoAlum = new javax.swing.JRadioButton();
        jBNewAlu = new javax.swing.JButton();
        jBSalirAlumno = new javax.swing.JButton();
        jBDeleAlu = new javax.swing.JButton();
        jBSaveAlu = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jDfNac = new com.toedter.calendar.JDateChooser();
        jbLimpiar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setForeground(java.awt.Color.gray);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setText("GESTION DE ALUMNO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Documento:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");

        jBNewAlu.setText("GUARDAR");
        jBNewAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNewAluActionPerformed(evt);
            }
        });

        jBSalirAlumno.setText("SALIR");
        jBSalirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirAlumnoActionPerformed(evt);
            }
        });

        jBDeleAlu.setText("ELIMINAR");
        jBDeleAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeleAluActionPerformed(evt);
            }
        });

        jBSaveAlu.setText("MODIFICAR");
        jBSaveAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveAluActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel7.setText("R.I.P. Lupita");

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBNewAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBDeleAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBSaveAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBSalirAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTDniAlum, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jTApeAlum)
                            .addComponent(jTNomAlum)
                            .addComponent(jRBestadoAlum)
                            .addComponent(jDfNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbBuscar)
                                    .addComponent(jbLimpiar))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTDniAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTApeAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbLimpiar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTNomAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5))
                    .addComponent(jRBestadoAlum))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jDfNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNewAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDeleAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSaveAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalirAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSaveAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveAluActionPerformed
        // TODO add your handling code here:
        Alumno alumnoBuscado = ad.buscarAlumnoDni(Integer.parseInt(jTDniAlum.getText()));

        try {
            //alumnoBuscado.setDni(Integer.parseInt(jTDniAlum.getText()));
            alumnoBuscado.setApellido(jTApeAlum.getText());
            alumnoBuscado.setNombre(jTNomAlum.getText());
            alumnoBuscado.setfNac(jDfNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            alumnoBuscado.setEstado(jRBestadoAlum.isSelected());
            ad.modificarAlumno(alumnoBuscado);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Datos Inválidos");
            return;
        }

    }//GEN-LAST:event_jBSaveAluActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        try {
            Alumno alumnoBuscado = ad.buscarAlumnoDni(Integer.parseInt(jTDniAlum.getText()));

        if (alumnoBuscado != null) {
            jTApeAlum.setText(alumnoBuscado.getApellido());
            jTNomAlum.setText(alumnoBuscado.getNombre());
            jRBestadoAlum.setSelected(true);
            jDfNac.setDate(java.sql.Date.valueOf(alumnoBuscado.getfNac()));
            activarBotones();
        } else {
            jTDniAlum.setText("");
            jTDniAlum.requestFocus();
            jTApeAlum.setText("");
            jTNomAlum.setText("");
            jRBestadoAlum.setSelected(false);
            jDfNac.setDate(null);
        }

            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error campos vacios o erroneos");
            jTDniAlum.setText("");
            jTDniAlum.requestFocus();
        }
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jBSalirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirAlumnoActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirAlumnoActionPerformed

    private void jBNewAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNewAluActionPerformed
        // TODO add your handling code here:
        try {
            int dni = Integer.parseInt(jTDniAlum.getText());
            String apellido = jTApeAlum.getText();
            String nombre = jTNomAlum.getText();
            LocalDate fNac = jDfNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            boolean estado = jRBestadoAlum.isSelected();
            Alumno alumno = new Alumno(nombre, apellido, dni, fNac, estado);
            ad.guardarAlumno(alumno);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Datos Inválidos");
            return;
        }

    }//GEN-LAST:event_jBNewAluActionPerformed

    private void jBDeleAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeleAluActionPerformed
        try {
            int dni = Integer.parseInt(jTDniAlum.getText());
            if (jTDniAlum.getText() != null) {
                ad.eliminarAlumno(dni);
            }
            jTApeAlum.setText("");
            jTDniAlum.setText("");
            jTNomAlum.setText("");
            jDfNac.setDate(null);
            jRBestadoAlum.setSelected(false);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error " + "Los valores no corresponden");
        }


    }//GEN-LAST:event_jBDeleAluActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed

        jTDniAlum.setText("");
        jTApeAlum.setText("");
        jTNomAlum.setText("");
        jRBestadoAlum.setSelected(false);
        jDfNac.setDate(null);

    }//GEN-LAST:event_jbLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBDeleAlu;
    private javax.swing.JButton jBNewAlu;
    private javax.swing.JButton jBSalirAlumno;
    private javax.swing.JButton jBSaveAlu;
    private com.toedter.calendar.JDateChooser jDfNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBestadoAlum;
    private javax.swing.JTextField jTApeAlum;
    private javax.swing.JTextField jTDniAlum;
    private javax.swing.JTextField jTNomAlum;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiar;
    // End of variables declaration//GEN-END:variables

    private void desactivar() {
        jTDniAlum.setEnabled(false);
        jTApeAlum.setEnabled(false);
        jTNomAlum.setEnabled(false);
    }

    private void activar() {
        jTDniAlum.setEnabled(true);
        jTApeAlum.setEnabled(true);
        jTNomAlum.setEnabled(true);

    }

    private void limpiar() {
        jTDniAlum.setText("");
        jTApeAlum.setText("");
        jTNomAlum.setText("");

    }

    private void desactivarBotones() {
        jBSaveAlu.setEnabled(false);
        jBDeleAlu.setEnabled(false);
    }

    private void activarBotones() {
        jBSaveAlu.setEnabled(true);
        jBDeleAlu.setEnabled(true);
    }

}

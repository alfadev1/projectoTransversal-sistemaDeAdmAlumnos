package Vistas;

import AccesoADatos.*;
import Entidades.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author @SimonettaDaniel
 */
public class FormNotasView extends javax.swing.JInternalFrame {

    AlumnoData ad = new AlumnoData();
    InscripcionData id = new InscripcionData();
    DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {

            return c == 2;
        }

    };

    /**
     * Creates new form FormNotasView
     */
    public FormNotasView() {
        initComponents();
        armarCabecera();
        llenarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBSaveNota = new javax.swing.JButton();
        jBSalirNotas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAluNota = new javax.swing.JTable();
        jCBAlumnos = new javax.swing.JComboBox<>();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("CARGA DE NOTAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("Seleccione un alumno:");

        jBSaveNota.setText("GUARDAR");
        jBSaveNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveNotaActionPerformed(evt);
            }
        });

        jBSalirNotas.setText("Salir");
        jBSalirNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirNotasActionPerformed(evt);
            }
        });

        jTAluNota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTAluNota);

        jCBAlumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new Alumno[] {}));
        jCBAlumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBAlumnosItemStateChanged(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBSalirNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jBSaveNota, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSaveNota, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSalirNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirNotasActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirNotasActionPerformed

    private void jBSaveNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveNotaActionPerformed
        // TODO add your handling code here:
        Alumno alusele = (Alumno) jCBAlumnos.getSelectedItem();
        try {
            if (alusele != null) {
                List<Inscripcion> Inscriptos = id.obtenerInscripcionesPorAlumno(alusele.getIdAlumno());
                int cont = 0;
                for (Inscripcion Inscripcion : Inscriptos) {
                    String notaA = modelo.getValueAt(cont, 2).toString();
                    double notaB = Double.parseDouble(notaA);
                    if (notaB >= 0 && notaB <= 10) {
                        if (notaB != Inscripcion.getNota()) {
                            id.actualizarNota(alusele.getIdAlumno(), Inscripcion.getMateria().getIdMateria(), notaB);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "La nota debe estar entre 0 a 10");
                    }
                    cont++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Datos sin seleccionar");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error campos vacios o erroneos");
        }
    }//GEN-LAST:event_jBSaveNotaActionPerformed

    private void jCBAlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBAlumnosItemStateChanged
        // TODO add your handling code here:
        cargarTabla();
    }//GEN-LAST:event_jCBAlumnosItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalirNotas;
    private javax.swing.JButton jBSaveNota;
    private javax.swing.JComboBox<Alumno> jCBAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTAluNota;
    // End of variables declaration//GEN-END:variables

    public void borrarFilas() {
        int f = modelo.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void armarCabecera() {

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
        jTAluNota.setModel(modelo);

        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) jTAluNota.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    }

    private void llenarCombo() {
        List<Alumno> lista = ad.listarAlumnos();
        jCBAlumnos.removeAllItems();
        for (Alumno alumno : lista) {
            jCBAlumnos.addItem(alumno);
        }
    }

    public void cargarTabla() {
        borrarFilas();
        Alumno alusele = (Alumno) jCBAlumnos.getSelectedItem();
        if (alusele != null) {
            List<Inscripcion> inscripciones = id.obtenerInscripcionesPorAlumno(alusele.getIdAlumno());
            for (Inscripcion insc : inscripciones) {
                Materia mat = insc.getMateria();
                modelo.addRow(new Object[]{
                    mat.getIdMateria(),
                    mat.getNombre(),
                    insc.getNota()
                });
            }
        }
    }
}

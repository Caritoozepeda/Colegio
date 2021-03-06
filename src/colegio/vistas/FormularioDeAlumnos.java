/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.vistas;

import colegio.Alumno;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Caro_Z
 */
public class FormularioDeAlumnos extends javax.swing.JInternalFrame {

    private HashSet<Alumno> alumnos;

    /**
     * Creates new form FormularioDeAlumnos
     */
    public FormularioDeAlumnos(HashSet<Alumno> alumnos) {
        initComponents();
        this.setSize(550, 550);
        this.alumnos = alumnos;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtLegajo = new javax.swing.JTextField();
        jtxtApellido = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jBtnGuardar = new javax.swing.JButton();
        jBtnNuevo = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FORMULARIO DE ALUMNOS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 60, 318, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LEGAJO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 140, 112, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APELLIDO:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 200, 112, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRE:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 260, 158, 17);

        jtxtLegajo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtLegajoFocusLost(evt);
            }
        });
        jtxtLegajo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtLegajoKeyTyped(evt);
            }
        });
        getContentPane().add(jtxtLegajo);
        jtxtLegajo.setBounds(309, 140, 130, 20);

        jtxtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtApellidoFocusLost(evt);
            }
        });
        jtxtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(jtxtApellido);
        jtxtApellido.setBounds(310, 200, 129, 20);

        jtxtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtNombreFocusLost(evt);
            }
        });
        jtxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(jtxtNombre);
        jtxtNombre.setBounds(310, 260, 129, 20);

        jBtnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnGuardar.setText("GUARDAR");
        jBtnGuardar.setEnabled(false);
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnGuardar);
        jBtnGuardar.setBounds(50, 360, 100, 40);

        jBtnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnNuevo.setText("NUEVO");
        jBtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnNuevo);
        jBtnNuevo.setBounds(210, 360, 100, 40);

        jBtnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnSalir.setText("SALIR");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnSalir);
        jBtnSalir.setBounds(360, 360, 110, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-formulario.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-18, 0, 630, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        // TODO add your handling code here:

        String ap = jtxtApellido.getText();
        String nom = jtxtNombre.getText();
        int leg = Integer.parseInt(jtxtLegajo.getText());

        Alumno a1 = new Alumno(leg, ap, nom);
        alumnos.add(a1);
        JOptionPane.showMessageDialog(this, "Se ha agregado el alumno");
        desactivar();
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private void jBtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
        activar();
        jBtnGuardar.setEnabled(false);

    }//GEN-LAST:event_jBtnNuevoActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jtxtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNombreFocusLost
        // TODO add your handling code here:
        if (jtxtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "??ste campo no puede estar vac??o");
            jtxtNombre.requestFocus();
        }
        if (!jtxtLegajo.getText().isEmpty()) {
            if (!jtxtApellido.getText().isEmpty()) {
                if (!jtxtNombre.getText().isEmpty()) {
                    jBtnGuardar.setEnabled(true);
                }
            }
        }


    }//GEN-LAST:event_jtxtNombreFocusLost

    private void jtxtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtApellidoFocusLost
        // TODO add your handling code here:

        if (jtxtApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "??ste campo no puede estar vac??o");
            jtxtApellido.requestFocus();
        }


    }//GEN-LAST:event_jtxtApellidoFocusLost

    private void jtxtLegajoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtLegajoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
// ////           JOptionPane.showMessageDialog(this, "El dato LEGAJO debe ser num??rico");
            evt.consume();
        }

    }//GEN-LAST:event_jtxtLegajoKeyTyped

    private void jtxtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtApellidoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
//            JOptionPane.showMessageDialog(this, "El dato APELLIDO  no debe ser num??rico");
            evt.consume();
        }


    }//GEN-LAST:event_jtxtApellidoKeyTyped

    private void jtxtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
//            JOptionPane.showMessageDialog(this, "El dato APELLIDO  no debe ser num??rico");
            evt.consume();
        }
    }//GEN-LAST:event_jtxtNombreKeyTyped

    private void jtxtLegajoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtLegajoFocusLost
        //////// // TODO add your handling code here:
        if (jtxtLegajo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "??ste campo no puede estar vac??o");
            jtxtLegajo.requestFocus();
        }


    }//GEN-LAST:event_jtxtLegajoFocusLost

    private void activar() {
        jtxtApellido.setEnabled(true);
        jtxtNombre.setEnabled(true);
        jtxtLegajo.setEnabled(true);
    }

    private void desactivar() {
        jtxtApellido.setEnabled(false);
        jtxtNombre.setEnabled(false);
        jtxtLegajo.setEnabled(false);
    }

    private void limpiar() {
        jtxtLegajo.setText("");
        jtxtApellido.setText("");
        jtxtNombre.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnNuevo;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextField jtxtLegajo;
    private javax.swing.JTextField jtxtNombre;
    // End of variables declaration//GEN-END:variables
}

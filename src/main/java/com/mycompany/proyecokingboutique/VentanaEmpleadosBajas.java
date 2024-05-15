/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecokingboutique;

import java.awt.*;
import javax.swing.*;
import java.sql.SQLException;
import vista.ResultSetTableModel;
import controlador.EmpleadoDAO;
import java.util.ArrayList;
import modelo.Empleados;

/**
 *
 * @author victo
 */
public class VentanaEmpleadosBajas extends javax.swing.JFrame {

    Empleados empleado;
    EmpleadoDAO eDAO = new EmpleadoDAO();
    
    public VentanaEmpleadosBajas() {
        initComponents();
        actualizarTablas(tabla1);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_idempleado = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        tf_direccion = new javax.swing.JTextField();
        tf_telefono = new javax.swing.JTextField();
        tf_salario = new javax.swing.JTextField();
        tf_ocupacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("BAJAS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 0, 300, 50);

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 60);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("ID Empleado:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 80, 90, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombre: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 110, 70, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Direccion");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 140, 70, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Telefono: ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 170, 80, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Ocupacion:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 230, 100, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Salario:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 200, 90, 20);
        jPanel1.add(tf_idempleado);
        tf_idempleado.setBounds(190, 80, 220, 25);

        tf_nombre.setEnabled(false);
        tf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(tf_nombre);
        tf_nombre.setBounds(190, 110, 220, 25);

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "Nombre", "Direccion", "Telefono", "Salario", "Ocupacion"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 330, 650, 130);

        tf_direccion.setEnabled(false);
        jPanel1.add(tf_direccion);
        tf_direccion.setBounds(190, 140, 220, 25);

        tf_telefono.setEnabled(false);
        jPanel1.add(tf_telefono);
        tf_telefono.setBounds(190, 170, 220, 25);

        tf_salario.setEnabled(false);
        tf_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_salarioActionPerformed(evt);
            }
        });
        jPanel1.add(tf_salario);
        tf_salario.setBounds(190, 200, 220, 25);

        tf_ocupacion.setEnabled(false);
        tf_ocupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ocupacionActionPerformed(evt);
            }
        });
        jPanel1.add(tf_ocupacion);
        tf_ocupacion.setBounds(190, 230, 220, 25);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(540, 90, 0, 120);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(620, 190, 90, 30);

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar);
        btnLimpiar.setBounds(620, 240, 90, 30);

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(510, 240, 90, 30);

        jInternalFrame1.getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 770, 510);

        jMenu1.setText("Productos");

        jMenuItem1.setText("Altas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Bajas");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Cambios");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Consultas");
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Proveedores");

        jMenuItem5.setText("Altas");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Bajas");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Cambios");
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("Consultas");
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Clientes");

        jMenuItem9.setText("Altas");
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Bajas");
        jMenu3.add(jMenuItem10);

        jMenuItem11.setText("Cambios");
        jMenu3.add(jMenuItem11);

        jMenuItem12.setText("Consultas");
        jMenu3.add(jMenuItem12);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Empleados");

        jMenuItem13.setText("Altas");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuItem14.setText("Bajas");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem14);

        jMenuItem15.setText("Cambios");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuItem16.setText("Consultas");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuBar1.add(jMenu4);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nombreActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (!(tf_idempleado.getText().equals(""))) {
            tf_nombre.setText(eDAO.buscarEmpleado(tf_idempleado.getText()).get(0).getNombre());
            tf_direccion.setText(eDAO.buscarEmpleado(tf_idempleado.getText()).get(0).getDirecccion());
            tf_telefono.setText(eDAO.buscarEmpleado(tf_idempleado.getText()).get(0).getTelefono());
            tf_salario.setText(String.valueOf(eDAO.buscarEmpleado(tf_idempleado.getText()).get(0).getSalario()));
            tf_ocupacion.setText(eDAO.buscarEmpleado(tf_idempleado.getText()).get(0).getOcupacion());
            tf_idempleado.setText(String.valueOf(eDAO.buscarEmpleado(tf_idempleado.getText()).get(0).getIdEmpleado()));
            btnEliminar.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(getContentPane(), "Falta el ID");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!tf_idempleado.getText().equals("")) {
            if (eDAO.eliminarEmpleado(Integer.valueOf(tf_idempleado.getText()))) {
                metodoRestablecer(tf_idempleado, tf_nombre, tf_direccion, 
                tf_telefono, tf_salario, tf_ocupacion);

                JOptionPane.showMessageDialog(getContentPane(), "Se eliminó correctamente");

                tf_idempleado.setText("");
            } else {
                JOptionPane.showMessageDialog(getContentPane(), "No existe este registro o no se pudo eliminar");
                tf_idempleado.setText("");
            }     
        } else {
            JOptionPane.showMessageDialog(getContentPane(), "Ingrese un ID antes de eliminar");
        }
        actualizarTablas(tabla1);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tf_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_salarioActionPerformed

    private void tf_ocupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ocupacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ocupacionActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        VentanaEmpleadosAltas V = new VentanaEmpleadosAltas();
        V.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
            
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        VentanaEmpleadosConsultas V = new VentanaEmpleadosConsultas();
        V.setVisible(true);      
        dispose();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        metodoRestablecer(tf_direccion, tf_idempleado, tf_nombre, 
                tf_ocupacion, tf_salario, tf_telefono);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        VentanaEmpleadosActualizar V = new VentanaEmpleadosActualizar();
        V.setVisible(true); 
        dispose();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEmpleadosBajas().setVisible(true);
            }
        });
    }
    
    public void metodoRestablecer(Component...componentes){
        for(Component x: componentes){
            if(x instanceof JTextField){
                ((JTextField)x).setText("");
            }
        }//foreach

    }
    
    public void actualizarTablas(JTable tabla) {
        String controlador = "com.mysql.cj.jdbc.Driver";
        String URL = "jdbc:mysql://localhost:3306/kingboutique";
        String consulta = "SELECT * FROM Empleados";
        ResultSetTableModel modeloTabla = null;

        try {
            modeloTabla = new ResultSetTableModel(controlador, URL, consulta);
        } catch (SQLException var7) {
            throw new RuntimeException(var7);
        } catch (ClassNotFoundException var8) {
            throw new RuntimeException(var8);
        }

        tabla.setModel(modeloTabla);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_idempleado;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_ocupacion;
    private javax.swing.JTextField tf_salario;
    private javax.swing.JTextField tf_telefono;
    // End of variables declaration//GEN-END:variables
}

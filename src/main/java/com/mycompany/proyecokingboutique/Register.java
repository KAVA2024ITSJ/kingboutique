/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecokingboutique;

import ConexionBD.ConexionBD;
import controlador.UsuariosDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import modelo.Usuarios;
/**
 *
 * @author victo
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    boolean mostrarUsuarios = false;
    Usuarios usu;
    UsuariosDAO uDAO = new UsuariosDAO();
    public Register() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelLogin = new javax.swing.JPanel();
        lbl_Usuario = new javax.swing.JLabel();
        tf_Usuario = new javax.swing.JTextField();
        lbl_Contraseña = new javax.swing.JLabel();
        tf_contraseña = new javax.swing.JPasswordField();
        btn_Ingresar = new javax.swing.JButton();
        lbl_imagen_login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 470));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 470));
        getContentPane().setLayout(null);

        PanelLogin.setBackground(new java.awt.Color(153, 255, 153));
        PanelLogin.setLayout(null);

        lbl_Usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Usuario.setText("Usuario:");
        PanelLogin.add(lbl_Usuario);
        lbl_Usuario.setBounds(60, 210, 60, 20);
        PanelLogin.add(tf_Usuario);
        tf_Usuario.setBounds(60, 240, 170, 30);

        lbl_Contraseña.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Contraseña.setText("Contraseña:");
        PanelLogin.add(lbl_Contraseña);
        lbl_Contraseña.setBounds(60, 280, 90, 20);
        PanelLogin.add(tf_contraseña);
        tf_contraseña.setBounds(60, 310, 170, 30);

        btn_Ingresar.setText("Registrar");
        btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarActionPerformed(evt);
            }
        });
        PanelLogin.add(btn_Ingresar);
        btn_Ingresar.setBounds(100, 380, 90, 30);

        lbl_imagen_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        PanelLogin.add(lbl_imagen_login);
        lbl_imagen_login.setBounds(90, 40, 110, 140);

        getContentPane().add(PanelLogin);
        PanelLogin.setBounds(0, 0, 300, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
       Connection c = ConexionBD.getConexion();
       if (verificar()) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    if (mostrarUsuarios) {
                        VentanaEmpleadosAltas VEA = new VentanaEmpleadosAltas();
                        VEA.setVisible(true);
                        dispose();
                    } else {
                        VentanaEmpleadosAltas VEA = new VentanaEmpleadosAltas();
                        VEA.setVisible(true);
                        dispose();
                    }
                }
            });
            setVisible(false);
            int cant=uDAO.buscarUsuario("").size();   
            int cont=0;
            for(int i=0;i<cant;i++){
                if(tf_Usuario.getText().equals(uDAO.buscarUsuario("").get(i).getUsuario())){
                    cont ++ ;
                }   
            }
            if(cont!=0){
                JOptionPane.showMessageDialog(null, "EL USUARIO YA EXISTE");
                tf_Usuario.setText("");
                tf_contraseña.setText("");
                cont=0;
            }else{
                if(tf_Usuario.getText().equals("")||tf_contraseña.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Ningun campo puede estar vacio!!!!. Revisa los campos!!!!");
                }else{
                    usu = new Usuarios(tf_Usuario.getText(), tf_contraseña.getText());
                    System.out.println(uDAO.agregarUsuario(usu));
                    JOptionPane.showMessageDialog(null,"Se agrego correctamente");
                    tf_Usuario.setText("");
                    tf_contraseña.setText("");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe");
        }
    }//GEN-LAST:event_btn_IngresarActionPerformed
    public boolean verificar() {
        try {
            ArrayList<Usuarios> listaUsuarios = uDAO.buscarUsuario(tf_Usuario.getText());
            uDAO.setFiltro("SELECT * FROM usuarios WHERE usuario = '"+tf_Usuario.getText()+"'");

            Thread hilo = new Thread(uDAO);
            hilo.start();

            // Esperar a que el hilo termine antes de continuar
            hilo.join();
            System.out.println(listaUsuarios.isEmpty());
            return listaUsuarios.isEmpty();

        } catch (InterruptedException | NullPointerException e) {
            e.printStackTrace();
        }
        return false;
    }
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.JLabel lbl_Contraseña;
    private javax.swing.JLabel lbl_Usuario;
    private javax.swing.JLabel lbl_imagen_login;
    private javax.swing.JTextField tf_Usuario;
    private javax.swing.JPasswordField tf_contraseña;
    // End of variables declaration//GEN-END:variables
}

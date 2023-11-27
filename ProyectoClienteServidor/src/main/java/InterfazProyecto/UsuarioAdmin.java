/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfazProyecto;

import com.mycompany.proyectoclienteservidor.Admin;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class UsuarioAdmin extends javax.swing.JFrame {

    /**
     * Creates new form UsuarioAdmin
     */
    public UsuarioAdmin() {
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

        jLabel3 = new javax.swing.JLabel();
        PanelBackground = new javax.swing.JPanel();
        PanelColorLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblLoginAdmin = new javax.swing.JLabel();
        lblEmailAdmin = new javax.swing.JLabel();
        txtPasswordAdmin = new javax.swing.JTextField();
        lblPassAdmin = new javax.swing.JLabel();
        btnLoginAdmin = new javax.swing.JButton();
        btnRegresarAdmin = new javax.swing.JButton();
        txtEmailAdmin = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        PanelBackground.setBackground(new java.awt.Color(204, 204, 204));
        PanelBackground.setPreferredSize(new java.awt.Dimension(1000, 1000));
        PanelBackground.setLayout(null);

        PanelColorLogin.setBackground(new java.awt.Color(3, 52, 114));
        PanelColorLogin.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel2.setBackground(new java.awt.Color(0, 71, 119));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\andre\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoClienteServidor\\src\\main\\java\\logo\\Avion_pasajeros_logo-removebg-preview (1).png")); // NOI18N

        javax.swing.GroupLayout PanelColorLoginLayout = new javax.swing.GroupLayout(PanelColorLogin);
        PanelColorLogin.setLayout(PanelColorLoginLayout);
        PanelColorLoginLayout.setHorizontalGroup(
            PanelColorLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColorLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        PanelColorLoginLayout.setVerticalGroup(
            PanelColorLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColorLoginLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        PanelBackground.add(PanelColorLogin);
        PanelColorLogin.setBounds(0, 0, 370, 520);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 500));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));

        lblLoginAdmin.setBackground(new java.awt.Color(0, 0, 0));
        lblLoginAdmin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblLoginAdmin.setText("LOGIN");

        lblEmailAdmin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmailAdmin.setText("Email");

        txtPasswordAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPasswordAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordAdminActionPerformed(evt);
            }
        });

        lblPassAdmin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPassAdmin.setText("Contraseña");

        btnLoginAdmin.setBackground(new java.awt.Color(0, 71, 119));
        btnLoginAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginAdmin.setText("Login");
        btnLoginAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAdminActionPerformed(evt);
            }
        });

        btnRegresarAdmin.setBackground(new java.awt.Color(0, 71, 119));
        btnRegresarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarAdmin.setText("Regresar");
        btnRegresarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarAdminActionPerformed(evt);
            }
        });

        txtEmailAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmailAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(lblLoginAdmin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRegresarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblEmailAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassAdmin)
                            .addComponent(txtPasswordAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblLoginAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEmailAdmin)
                .addGap(22, 22, 22)
                .addComponent(txtEmailAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPassAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPasswordAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        PanelBackground.add(jPanel1);
        jPanel1.setBounds(370, 0, 550, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PanelBackground.getAccessibleContext().setAccessibleName("Login Usuario");
        PanelBackground.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordAdminActionPerformed

    private void btnLoginAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAdminActionPerformed
        if (!txtEmailAdmin.getText().isEmpty()) {
            if (!txtPasswordAdmin.getText().isEmpty()) {
                Admin vUsuario = new Admin(txtEmailAdmin.getText(), txtPasswordAdmin.getText());
                
                if (vUsuario.getCorreo().equals("admin@admin.com") && vUsuario.getPassword().equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido Admin");
                    
                    //VAMOS A CREAR UNA NUEVA VENTANA
                    Home menu = new Home();
                    menu.setVisible(true);
                    
                    //OCULTAREMOS NUESTRA VENTANA DE LOGIN Y MOSTRAREMOS LA VENTANA PRINCIPAL          
                    
                } else {
                     JOptionPane.showMessageDialog(null, "Usuario o contrasena invalido");
                }
                
            }else{
             JOptionPane.showMessageDialog(null, "Favor suministre su contrasena");
            }      
        }else{
           JOptionPane.showMessageDialog(null, "Favor suministre su nombre de usuario"); 
        }
    }//GEN-LAST:event_btnLoginAdminActionPerformed

    private void btnRegresarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarAdminActionPerformed
       TipoUsuario tipoUsuario = new TipoUsuario();
       tipoUsuario.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnRegresarAdminActionPerformed

    private void txtEmailAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAdminActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UsuarioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBackground;
    private javax.swing.JPanel PanelColorLogin;
    private javax.swing.JButton btnLoginAdmin;
    private javax.swing.JButton btnRegresarAdmin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmailAdmin;
    private javax.swing.JLabel lblLoginAdmin;
    private javax.swing.JLabel lblPassAdmin;
    private javax.swing.JTextField txtEmailAdmin;
    private javax.swing.JTextField txtPasswordAdmin;
    // End of variables declaration//GEN-END:variables
}
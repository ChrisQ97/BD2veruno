/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author chr97lubuntu
 */
public class agregaremple extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection cn = con.conexion();
    Connection tr = con.conexion();
    Connection us = con.conexion();
    boolean disponible =true;
        Connection Consulta = con.conexion();
        
    /**
     * Creates new form agregaremple
     */
    public agregaremple() {
        initComponents();
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE); 
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();    
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
      //  boxpuesto.addItem("Vendedor");
       // boxpuesto.addItem("Dueño");
        pw.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
             pw.setText(null);
             
            }
        });
        Admin.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
             Admin.setText(null);
             
            }
        });
        contraseña.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
             contraseña.setText(null);
             
            }
        });
        
        cocontraseña.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
             cocontraseña.setText(null);
             
            }
        });
        Diponible.setVisible(false);
        correcto.setVisible(false);
                        this.setTitle("Ingreso Empleados - Sistema Inventario BTZ");

    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        paneldatos = new javax.swing.JPanel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        dpi = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Confirmar = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        boxpuesto = new javax.swing.JComboBox<>();
        Diponible = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        cocontraseña = new javax.swing.JPasswordField();
        correcto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Admin = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pw = new javax.swing.JPasswordField();
        guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(17, 111, 172));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneldatos.setBackground(new java.awt.Color(17, 111, 172));
        paneldatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        paneldatos.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 20, 338, -1));
        paneldatos.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 64, 338, -1));
        paneldatos.add(dpi, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 110, 175, -1));

        usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuarioFocusLost(evt);
            }
        });
        paneldatos.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 159, 135, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        paneldatos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido");
        paneldatos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DPI");
        paneldatos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 118, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Usuario");
        paneldatos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        Confirmar.setForeground(new java.awt.Color(255, 255, 255));
        Confirmar.setText("Contraseña");
        paneldatos.add(Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        paneldatos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 296, -1, -1));

        boxpuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador","Vendedor" }));
        boxpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxpuestoActionPerformed(evt);
            }
        });
        paneldatos.add(boxpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 160, -1));

        Diponible.setText("Disponible");
        paneldatos.add(Diponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 100, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Contraseña");
        paneldatos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        contraseña.setText("jPasswordField1");
        paneldatos.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 130, -1));

        cocontraseña.setText("jPasswordField1");
        cocontraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cocontraseñaFocusLost(evt);
            }
        });
        paneldatos.add(cocontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 130, -1));

        correcto.setText("Disponible");
        paneldatos.add(correcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 100, -1));

        jPanel2.setBackground(new java.awt.Color(20, 28, 225));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(64, 199, 243));

        Admin.setText("Usuario");
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Autorizacion");

        pw.setText("**************");
        pw.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwFocusGained(evt);
            }
        });

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-guardar-como-100.png"))); // NOI18N
        guardar.setContentAreaFilled(false);
        guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconoso/icons8-guardar-como-filled-100.png"))); // NOI18N
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(guardar)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        paneldatos.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 136, -1, -1));

        jPanel1.add(paneldatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 620, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        if(aut())
        {
            if (disponible==false || nombre.getText().equals("") || apellido.getText().equals("") || dpi.getText().equals("")
                || usuario.getText().equals("")|| contraseña.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Revise que todos los campos esten llenos");

            }
            else
            {
                if(Diponible.getText().equals("No Disponible")!=true&&correcto.getText().equals("No Coincide")!=true)
                {
                    try
                    {
                        PreparedStatement CrearEm = cn.prepareStatement("INSERT INTO Usuarios(Nombre,Apellido,Usuario,Contraseña,DPI,Privilegios) "
                            + "VALUES(?,?,?,?,?,?)");
                        CrearEm.setString(1, nombre.getText());
                        CrearEm.setString(2, apellido.getText());
                        CrearEm.setString(3,usuario.getText());
                        CrearEm.setString(4,contraseña.getText());
                        CrearEm.setString(5,dpi.getText());
                        CrearEm.setString(6,boxpuesto.getSelectedItem().toString());//puesto
                        CrearEm.executeUpdate();
                        CrearEm.close();
                        JOptionPane.showMessageDialog(null, "Nuevo empleado Agregado");
                    }
                    catch (SQLException ex)
                    {
                        Logger.getLogger(IngresarProve.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    rh x=new rh();
                    x.setVisible(true);
                    dispose();
                }
                else
                {
                    if(Diponible.getText().equals("No Disponible"))
                    {
                        JOptionPane.showMessageDialog(null, "Cambie de usuario");

                    }
                    if(correcto.getText().equals("No Coincide"))
                    {
                        JOptionPane.showMessageDialog(null, "Confirme su contraseña");

                    }

                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Acceso Denegado");

        }
    }//GEN-LAST:event_guardarActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminActionPerformed

    private void cocontraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cocontraseñaFocusLost
        if(Dipo2())
        {
            correcto.setVisible(true);
            correcto.setText("Coincide");
        }
        else
        {
            correcto.setText("No Coincide");
            correcto.setVisible(true);

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cocontraseñaFocusLost

    private void boxpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxpuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxpuestoActionPerformed

    private void usuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioFocusLost

        if(Dipo())
        {
            Diponible.setVisible(true);
            Diponible.setText("Disponible");
        }
        else
        {
            Diponible.setText("No Disponible");
            Diponible.setVisible(true);

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioFocusLost

    private void pwFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwFocusGained
        pw.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_pwFocusGained

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
            rh r=new rh();
            r.setVisible(true);
            dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing
    private Boolean aut()
    {
        Boolean valor=false;
        try {
            String us = Admin.getText();
            
            char claves[]=pw.getPassword();
            String clavedef=new String(claves);
            Statement sx = Consulta.createStatement();
            ResultSet Ca = sx.executeQuery("SELECT id from Usuarios where Usuario='"+us+"' && Contraseña='"+clavedef+"'");
            while(Ca.next())
            {
                valor=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(agregaremple.class.getName()).log(Level.SEVERE, null, ex);
        }
        return valor;
    }        
            
        
        private Boolean Dipo2()
    {
        if(contraseña.getText().equals(cocontraseña.getText()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }    private Boolean Dipo()
    {
        Boolean Valor=true;
        try {
            Statement sx = Consulta.createStatement();
            ResultSet Ca = sx.executeQuery("SELECT id from Usuarios where Usuario='"+usuario.getText()+"'");
            while(Ca.next())
            {
                Valor=false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(agregaremple.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Valor;
    }
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
            java.util.logging.Logger.getLogger(agregaremple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregaremple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregaremple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregaremple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregaremple().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Admin;
    private javax.swing.JLabel Confirmar;
    private javax.swing.JLabel Diponible;
    private javax.swing.JTextField apellido;
    private javax.swing.JComboBox<String> boxpuesto;
    private javax.swing.JPasswordField cocontraseña;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel correcto;
    private javax.swing.JTextField dpi;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel paneldatos;
    private javax.swing.JPasswordField pw;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}


package aplicacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;

public class Persona extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost:3306/escuela?serverTimezone=UTC";//Se establecio la tranja horaria para evitar errores
    public static final String usuario = "root";
    public static final String contrasenna = "M01s3s_20"; 
    PreparedStatement ps;
    ResultSet rs;
    
    
    public Connection getConnection(){
        Connection conexion = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection)DriverManager.getConnection(URL, usuario, contrasenna);
            //JOptionPane.showMessageDialog(null, "Se ha conectado exitosamente!");
        }catch(Exception ex){
            System.err.println("Error! "+ex);
        }
        
        return conexion;
    }
    
    private void limpiarComponentes(){
        cajaBuscar.setText("");
        cajaClave.setText("");
        cajaNombre.setText("");
        cajaDomicilio.setText("");
        cajaCelular.setText("");
        cajaCorreo.setText(""); 
        cajaNacimiento.setText("");
        comboGenero.setSelectedIndex(0);
    }
    
    public Persona() {
        initComponents();
        cajaId.setVisible(false); //Hace que no se muestre la casilla
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        panel = new javax.swing.JPanel();
        cajaBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        cajaId = new javax.swing.JTextField();
        etiquetaClave = new javax.swing.JLabel();
        cajaClave = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        etiquetaDomicilio = new javax.swing.JLabel();
        cajaDomicilio = new javax.swing.JTextField();
        etiquetaCelular = new javax.swing.JLabel();
        cajaCelular = new javax.swing.JTextField();
        etiquetaCorreo = new javax.swing.JLabel();
        cajaCorreo = new javax.swing.JTextField();
        etiquetaNacimiento = new javax.swing.JLabel();
        cajaNacimiento = new javax.swing.JTextField();
        etiquetaGenero = new javax.swing.JLabel();
        comboGenero = new javax.swing.JComboBox<>();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(cajaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 100, -1));

        botonBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        panel.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        cajaId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(cajaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 77, -1));

        etiquetaClave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaClave.setText("Clave:");
        panel.add(etiquetaClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, -1, -1));

        cajaClave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(cajaClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 320, -1));

        etiquetaNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaNombre.setText("Nombre: ");
        panel.add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 131, -1, -1));

        cajaNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 320, -1));

        etiquetaDomicilio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaDomicilio.setText("Domicilio:");
        panel.add(etiquetaDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 168, -1, -1));

        cajaDomicilio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(cajaDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 320, -1));

        etiquetaCelular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaCelular.setText("Celular:");
        panel.add(etiquetaCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        cajaCelular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(cajaCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 320, -1));

        etiquetaCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaCorreo.setText("Correo electrónico:");
        panel.add(etiquetaCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        cajaCorreo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(cajaCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 250, -1));

        etiquetaNacimiento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaNacimiento.setText("Fecha nacimiento:");
        panel.add(etiquetaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        cajaNacimiento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(cajaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 250, -1));

        etiquetaGenero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaGenero.setText("Género:");
        panel.add(etiquetaGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        comboGenero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Femenino", "Masculino" }));
        panel.add(comboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 320, -1));

        botonInsertar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });
        panel.add(botonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 90, -1));

        botonModificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        panel.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        botonEliminar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        panel.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 90, -1));

        botonLimpiar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        panel.add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 90, -1));
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Connection conexion = null;
        
        try{
            conexion = getConnection();
            ps = conexion.prepareStatement("CALL InsertarDatos (?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, cajaClave.getText());
            ps.setString(2, cajaNombre.getText());
            ps.setString(3, cajaDomicilio.getText());
            ps.setString(4,cajaCelular.getText());
            ps.setString(5, cajaCorreo.getText());
            ps.setDate(6, java.sql.Date.valueOf(cajaNacimiento.getText()));
            ps.setString(7, comboGenero.getSelectedItem().toString());
            
            int resultado = ps.executeUpdate(); //Se ejecuta la insercion en la base de datos
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "Insertado Correctamente");
                limpiarComponentes();
            }else{
                JOptionPane.showMessageDialog(null, "No se pude insertar");
                limpiarComponentes();
            }
            
            conexion.close();
        }catch(Exception ex){
            System.err.println("Error "+ex);   
        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiarComponentes();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        Connection conexion = null;
        
        try{
            conexion = getConnection();
            ps = conexion.prepareStatement("CALL Buscar (?)");
            ps.setString(1, cajaBuscar.getText());
            rs = ps.executeQuery();
            
            if(rs.next()){
                cajaId.setText(String.valueOf(rs.getInt("idPersona")));
                cajaClave.setText(rs.getString("Clave"));
                cajaNombre.setText(rs.getString("Nombre"));
                cajaDomicilio.setText(rs.getString("Domicilio"));
                cajaCelular.setText(rs.getString("Celular"));
                cajaCorreo.setText(rs.getString("CorreoElectronico"));
                cajaNacimiento.setText(String.valueOf(rs.getDate("FechaNacimiento")));
                comboGenero.setSelectedItem(rs.getString("Genero"));
            }
            else{
                JOptionPane.showMessageDialog(null, "No existe registro");
            }
            
            conexion.close();
        }catch(Exception ex){
            System.err.println("Error: "+ex);
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        Connection conexion = null;
        
        try{
            conexion = getConnection();
            ps = conexion.prepareStatement("CALL Modificar (?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, cajaClave.getText());
            ps.setString(2, cajaNombre.getText());
            ps.setString(3, cajaDomicilio.getText());
            ps.setString(4,cajaCelular.getText());
            ps.setString(5, cajaCorreo.getText());
            ps.setDate(6, java.sql.Date.valueOf(cajaNacimiento.getText()));
            ps.setString(7, comboGenero.getSelectedItem().toString());
            ps.setInt(8, Integer.parseInt(cajaId.getText()));
            
            int resultado = ps.executeUpdate(); //Se ejecuta la insercion en la base de datos
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "Modificado Correctamente");
                limpiarComponentes();
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");
                limpiarComponentes();
            }
            
            conexion.close();
        }catch(Exception ex){
            System.err.println("Error "+ex);   
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        Connection conexion = null;
        
        try{
            conexion = getConnection();
            ps = conexion.prepareStatement("CALL Eliminar (?)");
            ps.setInt(1, Integer.parseInt(cajaId.getText()));
            
            int resultado = ps.executeUpdate(); //Se ejecuta la insercion en la base de datos
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "Registro elimitado correctamente");
                limpiarComponentes();
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
                limpiarComponentes();
            }
            
            conexion.close();
        }catch(Exception ex){
            System.err.println("Error "+ex);   
        }

    }//GEN-LAST:event_botonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Persona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JTextField cajaCelular;
    private javax.swing.JTextField cajaClave;
    private javax.swing.JTextField cajaCorreo;
    private javax.swing.JTextField cajaDomicilio;
    private javax.swing.JTextField cajaId;
    private javax.swing.JTextField cajaNacimiento;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JLabel etiquetaCelular;
    private javax.swing.JLabel etiquetaClave;
    private javax.swing.JLabel etiquetaCorreo;
    private javax.swing.JLabel etiquetaDomicilio;
    private javax.swing.JLabel etiquetaGenero;
    private javax.swing.JLabel etiquetaNacimiento;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}

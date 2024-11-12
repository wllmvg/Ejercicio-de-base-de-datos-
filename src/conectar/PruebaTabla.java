package conectar;

import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;


public class PruebaTabla extends javax.swing.JFrame {


    public PruebaTabla() {
        
        initComponents();
        
        setTitle("CRUD POCIONES HENRY POTTER");
        
        Conectar conecta = new Conectar();
        Connection con = conecta.getConexion();
        
        try {
            
            String SQL = "SELECT * FROM escuela";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
               cboId.addItem(rs.getString("id_escuela")); 
            }

            rs.close();
            stmt.close();
        }
        catch (Exception e) {
            
            e.printStackTrace();
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cboId = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHabilidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCreador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFechaCreacion = new javax.swing.JTextField();
        btnAceptar1 = new javax.swing.JButton();
        btnAceptar2 = new javax.swing.JButton();
        btnAceptar3 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAnios = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("72", 0, 8)); // NOI18N
        setName("CRUD POCIONES HENRY PLOTTER"); // NOI18N

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnAceptar.setText("Modificar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel1.setText("ID de la escuela");

        jLabel2.setText("Nombre");

        jLabel3.setText("Habilidad principal");

        jLabel4.setText("Creador");

        txtCreador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreadorActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha de creación");

        btnAceptar1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnAceptar1.setText("Agregar");
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });

        btnAceptar2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnAceptar2.setText("Eliminar");
        btnAceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar2ActionPerformed(evt);
            }
        });

        btnAceptar3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnAceptar3.setText("Consultar");
        btnAceptar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Años de servicio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnAceptar3)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar2)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaCreacion))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboId, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtHabilidad))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAnios, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCreador)))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHabilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCreador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
        //Errores si usuario inserta mal un dato
        
        if(txtNombre.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Debe escribir un nombre");
            return;         
            
        }

         if(txtHabilidad.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Debe escribir la habilidad");
            return;         
            
        }
 
         if(txtCreador.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Debe escribir el creador");
            return;         
            
        }
         if(txtFechaCreacion.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Debe escribir la fecha de creacion");
            return;         
            
        }
 
        if(txtAnios.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Debe escribir los años de servicio");
            return;         
            
        }
        Conectar conecta = new Conectar();
        Connection con = conecta.getConexion();
        
        try {
            
            String SQL = "";
            Statement stmt;
            ResultSet rs;

            String ELid = (String) cboId.getSelectedItem();
            
            //ACTULIZAR
            
            SQL = "UPDATE escuela SET nombre=?, habilidad_principal=?, anios_de_servicio=?,creador=?,fecha_creacion=? WHERE id_escuela=" + ELid ;
            PreparedStatement comando = con.prepareStatement(SQL);
            
            comando.setString(1, txtNombre.getText());
            comando.setString(2, txtHabilidad.getText());
            comando.setInt(3, Integer.parseInt(txtAnios.getText()));
            comando.setString(4, txtCreador.getText());
            comando.setString(5, txtFechaCreacion.getText());
            
            comando.executeUpdate();
            
               
            JOptionPane.showMessageDialog(null, "Registro modificado con éxito");

            
            SQL = "SELECT * FROM escuela";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            
           cboId.removeAllItems();
            
            while (rs.next()) {
               cboId.addItem(rs.getString("id_escuela")); 
            }

            txtId.setText("");
            txtNombre.setText("");
            txtHabilidad.setText("");
            txtCreador.setText("");
            txtFechaCreacion.setText("");
            txtAnios.setText("");
            
            rs.close();
            stmt.close();
        }
        catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtCreadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreadorActionPerformed

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
       
        //Errores si no se ingresa nada
        
        if(txtId.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Debe haber un Id valido");
            return;
        }
        
        if(txtNombre.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Debe escribir un nombre");
            return;         
            
        }

         if(txtHabilidad.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Debe escribir la habilidad");
            return;         
            
        }
 
         if(txtCreador.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Debe escribir el creador");
            return;         
            
        }
         if(txtFechaCreacion.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Debe escribir la fecha de creacion");
            return;         
            
        }
 
        if(txtAnios.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Debe escribir los años de servicio");
            return;         
            
        }
        Conectar conecta = new Conectar();
        Connection con = conecta.getConexion();
        
        try {
            
            // Verificar si existe en la base de datos
            
            String SQL = "SELECT * FROM escuela WHERE id_escuela=" + txtId.getText();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            if(rs.next()){
                    JOptionPane.showMessageDialog(null, "El Id ya existe en la BD");
                    return; 
            }
           
            // INSERTAR
            
            SQL = "INSERT INTO escuela(id_escuela,nombre,habilidad_principal,anios_de_servicio,creador,fecha_creacion) VALUES(?,?,?,?,?,?)";
            PreparedStatement comando = con.prepareStatement(SQL);
            
            comando.setInt(1, Integer.parseInt(txtId.getText()));
            comando.setString(2, txtNombre.getText());
            comando.setString(3, txtHabilidad.getText());
            comando.setInt(4, Integer.parseInt(txtAnios.getText()));
            comando.setString(5, txtCreador.getText());
            comando.setString(6, txtFechaCreacion.getText());
            
            comando.executeUpdate();
            
               
            JOptionPane.showMessageDialog(null, "Registro exitoso");

            
            SQL = "SELECT * FROM escuela";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            
           cboId.removeAllItems();
            
            while (rs.next()) {
               cboId.addItem(rs.getString("id_escuela")); 
            }

            txtId.setText("");
            txtNombre.setText("");
            txtHabilidad.setText("");
            txtCreador.setText("");
            txtFechaCreacion.setText("");
            txtAnios.setText("");
            
            rs.close();
            stmt.close();
        }
        catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_btnAceptar1ActionPerformed

    private void btnAceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar2ActionPerformed
        
        Conectar conecta = new Conectar();
        Connection con = conecta.getConexion();
        
        try {
            
            // Ventana ¿esta seguro?
            
            int resp=JOptionPane.showConfirmDialog(null, "¿Desea realmente eliminar este registro?","ALERTA",JOptionPane.YES_NO_OPTION);
            
            if(resp==JOptionPane.NO_OPTION){
                return;
            }
            
            // ELIMINAR
            
            String ELid = (String) cboId.getSelectedItem();
            String SQL = "DELETE FROM escuela WHERE id_escuela=" + ELid;
            
            PreparedStatement comando = con.prepareStatement(SQL);
            
            
            comando.executeUpdate();
            
               
            JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");

            
            SQL = "SELECT * FROM escuela";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            
           cboId.removeAllItems();
            
            while (rs.next()) {
               cboId.addItem(rs.getString("id_escuela")); 
            }

            txtId.setText("");
            txtNombre.setText("");
            txtHabilidad.setText("");
            txtCreador.setText("");
            txtFechaCreacion.setText("");
            txtAnios.setText("");
            
            rs.close();
            stmt.close();
        }
        catch (Exception e) {
            
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAceptar2ActionPerformed

    private void btnAceptar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar3ActionPerformed
        

        //CONSULTA
        
        Conectar conecta = new Conectar();
        Connection con = conecta.getConexion();
        
        try {
            
            String ELid = (String) cboId.getSelectedItem();
            
            String SQL = "SELECT * FROM escuela WHERE id_escuela=" + ELid;
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {
                
               txtNombre.setText(rs.getString("nombre"));
               
               txtHabilidad.setText(rs.getString("habilidad_principal"));

               txtAnios.setText(rs.getString("anios_de_servicio"));
               
               txtCreador.setText(rs.getString("creador"));
               
               txtFechaCreacion.setText(rs.getString("fecha_creacion"));
               
              
            }

            rs.close();
            stmt.close();
        }
        catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_btnAceptar3ActionPerformed

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
            java.util.logging.Logger.getLogger(PruebaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PruebaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PruebaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PruebaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PruebaTabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JButton btnAceptar2;
    private javax.swing.JButton btnAceptar3;
    private javax.swing.JComboBox<String> cboId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAnios;
    private javax.swing.JTextField txtCreador;
    private javax.swing.JTextField txtFechaCreacion;
    private javax.swing.JTextField txtHabilidad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}

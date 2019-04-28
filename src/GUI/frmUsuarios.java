package GUI;

import Clases.Usuario;
import Constantes.ValorComboBox;
import ManejaArchivos.OperaUsuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daguaman
 */
public class frmUsuarios extends javax.swing.JFrame {

    /*Permite acceder a los métodos de Usuario dentro de:
    Paquete ManejaArchivos -> OperaUsuario
    Para ello se crea un objeto objArcUsuario y asi manipular los métodos de 
    la clase OperaUsuario que permite operar los archivos de la Clase
    */
    ManejaArchivos.OperaUsuario objArcUsuario = new OperaUsuario();
    /*
    Toda ejecución de UI empieza por el constructor del formulario, 
    en este caso frmUsuarios donde primero se ejecuta initComponents, 
    luego llamo al método Cargar Combos
    */
    public frmUsuarios() {
        initComponents();
        /*Método para cargar los comboBox (elementos Lista de UI*/
        CargarCombos();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        cmbEstado = new javax.swing.JComboBox();
        cmbPais = new javax.swing.JComboBox();
        cmbGenero = new javax.swing.JComboBox();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnConsultarTodos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblSeleccion = new javax.swing.JLabel();
        lblSeleccion2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIdBusqueda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIÓN DE USUARIOS");

        jLabel2.setText("Identificacion");

        jLabel3.setText("Nombres");

        jLabel4.setText("Apellidos");

        jLabel5.setText("Login");

        jLabel6.setText("Password");

        jLabel7.setText("Estado");

        jLabel8.setText("Pais");

        jLabel9.setText("Genero");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoActionPerformed(evt);
            }
        });

        cmbPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConsultarTodos.setText("ConsultarTodos");
        btnConsultarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarTodosActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setRowHeight(20);
        jTable1.setRowMargin(4);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Lista de Usuarios");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Valores Seleccionados");

        lblSeleccion.setText("-");

        lblSeleccion2.setText("-");

        jLabel12.setText("Criterio de Busqueda: Num_Identificacion");

        jButton1.setText("Buscar por Num Identificacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdentificacion)
                                    .addComponent(txtNombres)
                                    .addComponent(txtApellidos)
                                    .addComponent(txtLogin)
                                    .addComponent(txtPass)
                                    .addComponent(cmbEstado, 0, 186, Short.MAX_VALUE)
                                    .addComponent(cmbPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar)
                                .addGap(10, 10, 10)
                                .addComponent(btnConsultarTodos))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdBusqueda, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSeleccion2)
                                    .addComponent(jLabel11)
                                    .addComponent(lblSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSeleccion)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnCancelar)
                            .addComponent(btnConsultarTodos)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblSeleccion2)))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoActionPerformed
        // Para visualizar la obtención de indice y valor asociado al combobox
        System.out.println("Index: " + cmbEstado.getSelectedIndex());
        System.out.println("Item:  " + cmbEstado.getSelectedItem().toString());
    }//GEN-LAST:event_cmbEstadoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        /* Aqui Ud. podría controlar que se envien a almacenar datos siempre 
        y cuando se complete todos los controles
        */
        if (GuardarUsuario()==true){
            JOptionPane.showMessageDialog(this, "Datos Almacenados con exito");
            Limpiar();
            try {
                RecuperaDatos();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Error al Almacenar los datos");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConsultarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarTodosActionPerformed
        try {
            // TODO add your handling code here:
            RecuperaDatos();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConsultarTodosActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //Recupera la seleccion de filas y Columnas
        int row = (int) jTable1.getSelectedRow();
        int column = (int) jTable1.getSelectedColumn();
        //Obtiene el valor de la seleccion
        String strValor = (String) jTable1.getModel().getValueAt(row, column);
        //Muestra en la eqiqueta
        lblSeleccion.setText(strValor);
        String Id = (String) jTable1.getModel().getValueAt(row, 0);
        String Identificacion = (String) jTable1.getModel().getValueAt(row, 1);
        String Nombres = (String) jTable1.getModel().getValueAt(row, 2);
        String Apellidos = (String) jTable1.getModel().getValueAt(row, 3);
        String Login = (String) jTable1.getModel().getValueAt(row, 4);
        String Password = (String) jTable1.getModel().getValueAt(row, 5);
        lblSeleccion2.setText(Id + " - " + Identificacion + " - " + Nombres + " - " + Apellidos + " - " +
                              Login + " - " + Password);
        

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            RecuperaDatosPorCriterio(txtIdBusqueda.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUsuarios().setVisible(true);
            }
        });
    }
    
    /*
    Método que sirve para cargar los datos que se encuentran en el paquet de Constantes
    y que deben ser desplegados una sola vez en los controles combobox 
    */
    public void CargarCombos(){
        Constantes.ValorComboBox objCargar = new ValorComboBox();
        cmbEstado.setModel(new DefaultComboBoxModel(objCargar.CargaEstado().toArray()));
        cmbGenero.setModel(new DefaultComboBoxModel(objCargar.CargaGenero().toArray()));
        cmbPais.setModel(new DefaultComboBoxModel(objCargar.CargarPaises().toArray()));
    }
    
    /*
    Método que se usa para limpiar los controles como cajas de texto o combobox que se usan 
    dentro de la UI, limpiar significa poner todo a null o en vacio
    */
    public void Limpiar(){
        this.txtIdentificacion.setText(null);
        this.txtNombres.setText(null);
        this.txtApellidos.setText(null);
        this.txtLogin.setText(null);
        this.txtPass.setText(null);
        cmbEstado.setSelectedIndex(0);
        cmbGenero.setSelectedIndex(0);
        cmbPais.setSelectedIndex(0);
    }
    
    /*
    Método al que se llama para enviar a Guardar los objetos de Usuario en un archivo
    
    */
    public boolean GuardarUsuario(){
        System.out.println("Enviar a Insertar Usuario en txt");
        Usuario objUsuario = new Usuario(-1, txtIdentificacion.getText(), 
                                            txtNombres.getText(), 
                                            txtApellidos.getText(), 
                                            txtLogin.getText(), 
                                            txtPass.getText(), 
                                            cmbEstado.getSelectedIndex(), 
                                            cmbPais.getSelectedIndex(), 
                                            cmbGenero.getSelectedIndex());
        return objArcUsuario.RegistraObjetosUsuario(objUsuario);
        
    }
    /*
    Método que se ejecuta cuando se desea recuperar los datos desde el archivo
    donde se encuentran almacenados los objetos
    */
    public void RecuperaDatos() throws ClassNotFoundException, IOException{
        ArrayList<Usuario> lstUsuario = objArcUsuario.RecuperaObjetosUsuario();
        /*Es necesario crear un objeto con las columnas que se mostrarán en la tabla*/
        Object columnas[] = {"Id", "Identificacion", "Nombres", "Apellidos", "Login", "Password", "Estado", "Pais", "Genero"};
        /*Es necesario añadir las columnas al modelo de la Tabla*/
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        /*Añadidas las columnas y el modelo se setea en la Tabla*/
        jTable1.setModel(modelo);
        for (Usuario usu : lstUsuario) {
            String id = String.valueOf(usu.getIdUsuario());
            String identificacion = usu.getUsIdentificacion();
            String nombre = usu.getUsNombres();
            String apellido = usu.getUsApellidos();
            String login = usu.getUsLogin();
            String pass = usu.getUsPassword();
            String Estado = String.valueOf(usu.getUsEstado());
            String Pais = String.valueOf(usu.getUsPais());
            String Genero = String.valueOf(usu.getUsGenero());
            //Por cada registro se lo añade a una estructra tipo Arreglo para incluirlo en la Tabla
            String modeloTemp[] = {id, identificacion, nombre, apellido, login, pass, Estado, Pais, Genero};
            //Se añade la estructura al modelo de la Tabla
            modelo.addRow(modeloTemp);
        }
        this.pack();
    }
    
    /*
    Método que se usa para recuperar los datos en base a un criterio de búsqueda, este puede incorporarse
    en el método anterior con la finalidad d no tener código duplicado.
    */
    public void RecuperaDatosPorCriterio(String strIdentificacion) throws ClassNotFoundException, IOException{
        ArrayList<Usuario> lstUsuario = objArcUsuario.RecuperaObjetosUsuario();
        Object columnas[] = {"Id", "Identificacion", "Nombres", "Apellidos", "Login", "Password", "Estado", "Pais", "Genero"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);
        jTable1.setModel(modelo);
        boolean encontrado = false;
        for (Usuario usu : lstUsuario) {
            String identificacion = usu.getUsIdentificacion();
            if (identificacion.trim().equals(strIdentificacion.trim())){
                String id = String.valueOf(usu.getIdUsuario());
                String nombre = usu.getUsNombres();
                String apellido = usu.getUsApellidos();
                String login = usu.getUsLogin();
                String pass = usu.getUsPassword();
                String Estado = String.valueOf(usu.getUsEstado());
                String Pais = String.valueOf(usu.getUsPais());
                String Genero = String.valueOf(usu.getUsGenero());
                String modeloTemp[] = {id, identificacion, nombre, apellido, login, pass, Estado, Pais, Genero};
                modelo.addRow(modeloTemp);
                encontrado = true;
            }
        }
        if (encontrado == false){
            JOptionPane.showMessageDialog(this, "No existen datos asociados a la identificacion" + strIdentificacion);
        }
        this.pack();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultarTodos;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cmbEstado;
    private javax.swing.JComboBox cmbGenero;
    private javax.swing.JComboBox cmbPais;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblSeleccion;
    private javax.swing.JLabel lblSeleccion2;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtIdBusqueda;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}

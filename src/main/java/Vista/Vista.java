
package Vista;

import Modelo.cliente;
import Modelo.empleado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quiej
 */
public class Vista extends javax.swing.JFrame implements ActionListener{

    public Vista() {
        initComponents();
        btGuardar.addActionListener((ActionListener) this);
        TablaAc();
    }

    empleado empleados = new empleado();
    cliente clientes = new cliente();
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
        jLabel10 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        txtPuesto = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCli = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableEm = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        ComPersona = new javax.swing.JComboBox<>();
        btGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Listado de Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, -1));

        jLabel2.setText("id:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 42, -1, -1));

        jLabel3.setText("codigo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 68, -1, -1));

        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 100, -1, -1));

        jLabel5.setText("Apellido:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel6.setText("Direccion:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel7.setText("Telefono:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel8.setText("Puesto:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        jLabel9.setText("Saldo:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("solo si es Cliente");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, 20));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 142, -1));
        getContentPane().add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 142, -1));
        getContentPane().add(txtPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 142, -1));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 142, -1));
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 142, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 142, -1));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 142, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 142, -1));

        TableCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TableCli);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 690, 190));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Ingresar Datos");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 13, -1, -1));

        TableEm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TableEm);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 690, 190));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Listado de Empleado");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("solo si es empleado");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jLabel14.setText("Salario:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));
        getContentPane().add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 142, -1));

        ComPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Cliente" }));
        getContentPane().add(ComPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 110, 30));

        btGuardar.setText("Guardar Persona");
        getContentPane().add(btGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComPersona;
    private javax.swing.JTable TableCli;
    private javax.swing.JTable TableEm;
    private javax.swing.JButton btGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPuesto;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btGuardar){
            if (ComPersona.getSelectedItem().toString().equals("Empleado")){
               empleados.guardarPersona(Integer.parseInt(txtId.getText()), Integer.parseInt(txtCod.getText()),txtNombre.getText(),
                       txtApellido.getText(), txtDireccion.getText(), txtTelefono.getText(), txtPuesto.getText(), Integer.parseInt(txtSalario.getText()));         
            }
            if(ComPersona.getSelectedItem().toString().equals("Cliente")){
              clientes.consultarCliente(Integer.parseInt(txtId.getText()), Integer.parseInt(txtCod.getText()),txtNombre.getText(),
                       txtApellido.getText(), txtDireccion.getText(), txtTelefono.getText(), Integer.parseInt(txtSaldo.getText()));  
            }
            TablaAc();
        }
    }
    
        public void TablaAc(){
        DefaultTableModel modelo = new DefaultTableModel();
        DefaultTableModel model = new DefaultTableModel();
        empleados.Obtenerpersona(modelo);
        TableEm.setModel(modelo);
        
        clientes.ObtenerCliente(model);
        TableCli.setModel(model);
    }
}


package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quiej
 */
public class cliente extends persona{
    
    public ArrayList<cliente> clientes = new ArrayList();
    FicheroTexto fichero = new FicheroTexto();
    private int Codigo;
    private int saldo;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
       @Override
    public String toString() {
        return Codigo +", "+ saldo;
    }
    public void consultarCliente(int id,int codigo,String nombre, String apellido, String direccion, String telefono, int saldo){
        cliente persona = new cliente();
        persona.setId(id);
        persona.setCodigo(codigo);
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setDireccion(direccion);
        persona.setTelefono(telefono);
        persona.setSaldo(saldo);
        clientes.add(persona);
        fichero.crearFiichero("DatosClientes.txt");
        fichero.IngresarDatosClientes(clientes);
        clientes.clear();
        JOptionPane.showMessageDialog(null, "Cliente Guardado con Exito");
    }
        public void ObtenerCliente(DefaultTableModel model){
                //seteamos las columnas de la Jtable
        model.addColumn("id");
        model.addColumn("codigo");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Direccion");
        model.addColumn("Tefelono");
        model.addColumn("Saldo");
        model.setRowCount(0);
        //inicializamos un Arraylist con los datos del fichero que estamos leyendo
        ArrayList<cliente> listaReporte = fichero.leerFicheroCliente("DatosClientes.txt");
        //recorremos el arrayList para ingresarlar a la Jtable
        for (int i=0;i<listaReporte.size();i++){           
            Object[] fila={
              listaReporte.get(i).getId(),
              listaReporte.get(i).getCodigo(),
              listaReporte.get(i).getNombre(),
              listaReporte.get(i).getApellido(),
              listaReporte.get(i).getDireccion(),
              listaReporte.get(i).getTelefono(),
              listaReporte.get(i).getSaldo() + " Quetzales"
            };
            // ingresamos el modelo a el Jtable
            model.addRow(fila);
        }  
    }
}

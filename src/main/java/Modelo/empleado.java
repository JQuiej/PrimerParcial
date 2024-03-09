
package Modelo;

/**
 * @author Quiej
 */



import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class empleado extends persona{
   public ArrayList<empleado> empleados = new ArrayList();
   FicheroTexto fichero = new FicheroTexto();
   
   private int codigo;
   private String puesto;
   private int salario;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
       @Override
    public String toString() {
        return codigo +", "+ puesto + ", " + salario ;
    }

   
    public void guardarPersona( int id,int codigo,String nombre, String apellido, String direccion, String telefono, String puesto, int salario){
        empleado persona = new empleado();
        persona.setId(id);
        persona.setCodigo(codigo);
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setDireccion(direccion);
        persona.setTelefono(telefono);
        persona.setPuesto(puesto);
        persona.setSalario(salario);
        empleados.add(persona);
        fichero.crearFiichero("DatosEmpleado.txt");
        fichero.IngresarDatos(empleados);
        empleados.clear(); 
        JOptionPane.showMessageDialog(null, "Empleado Guardado con Exito");
    }
    public void Obtenerpersona(DefaultTableModel model){
         
        model.addColumn("id");
        model.addColumn("codigo");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Direccion");
        model.addColumn("Tefelono");
        model.addColumn("Puesto");
        model.addColumn("Salario");
        model.setRowCount(0);
        //inicializamos un Arraylist con los datos del fichero que estamos leyendo
        ArrayList<empleado> listaReporte = fichero.leerFichero("DatosEmpleado.txt");
        //recorremos el arrayList para ingresarlar a la Jtable
        for (int i=0;i<listaReporte.size();i++){           
            Object[] fila={
              listaReporte.get(i).getId(),
              listaReporte.get(i).getCodigo(),
              listaReporte.get(i).getNombre(),
              listaReporte.get(i).getApellido(),
              listaReporte.get(i).getDireccion(),
              listaReporte.get(i).getTelefono(),
              listaReporte.get(i).getPuesto(),
              listaReporte.get(i).getSalario()+ " Quetzales"
            };
            // ingresamos el modelo a el Jtable
            model.addRow(fila);
        }  
    }
}

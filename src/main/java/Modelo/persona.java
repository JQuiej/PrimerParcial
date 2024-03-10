
package Modelo;


/**
 * @author Quiej
 */
public class persona {
  public int id;
  public String nombre;
  public String apellido;
  public String direccion;
  public String telefono;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
  
       @Override
    public String toString() {
        return id +", "+ nombre + ", " + apellido + ", " + direccion + ", " + telefono  ;
    }
}

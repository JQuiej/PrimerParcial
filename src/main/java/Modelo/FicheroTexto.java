
package Modelo;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Quiej
 */
public class FicheroTexto {
    
    File fichero;
    
    public void crearFiichero(String txt){
        fichero = new File(txt);
        
        if (fichero.exists()) {
        System.out.println("El archivo ya existe.");
        }else{
        try {
            if(fichero.createNewFile()){
                System.out.println("Archivo Creado");
            }else{
                System.out.println("Archivo No creado");
            }
        }catch(IOException exception){
            exception.printStackTrace(System.out);
        }
        }
    }

        public void Elimar(){

            if(fichero.delete()){
                System.out.println("Archivo eliminado");
            }else{
                System.out.println("Erro, Archivo No eliminado");
            }
    }
        public void IngresarDatos(ArrayList<empleado> datos){
            try{
                
                FileWriter ingresar = new FileWriter(fichero, true);
                for(empleado reporte : datos){
                 ingresar.write(reporte.getId() + ", " +
                     reporte.getCodigo() + ", " + reporte.getNombre() + ", " +
                         reporte.getApellido()+ ", " + reporte.getDireccion() + ", " 
                         + reporte.getTelefono()+ ", " + reporte.getPuesto()+ ", "+
                         reporte.getSalario()+ "\n");   
                }
                ingresar.close();
                System.out.println("Dato ingresado con exito");
            }catch(IOException exception){
                exception.printStackTrace(System.out);
            }               
        }
        
           public void IngresarDatosClientes(ArrayList<cliente> datos){
            try{
                
                FileWriter ingresar = new FileWriter(fichero, true);
                for(cliente reporte : datos){
                    ingresar.write(reporte.getId() + ", " +
                    reporte.getCodigo() + ", " + reporte.getNombre() + ", " +
                         reporte.getApellido()+ ", " + reporte.getDireccion() + ", " 
                         + reporte.getTelefono()+ ", "+
                         reporte.getSaldo()+ "\n");   
                }
                ingresar.close();
                System.out.println("Dato ingresado con exito");
            }catch(IOException exception){
                exception.printStackTrace(System.out);
            }               
        }
        
        public ArrayList<empleado> leerFichero(String fichero) {
            //creamos un nuevo ArrayList para guardar los datos del fichero
            //con los datos guardados con anterioridad
            ArrayList<empleado> listaReporte = new ArrayList<>();

            try {
                //abrimos el fichero para empezar a leerlo
            FileReader lector = new FileReader(fichero);
            BufferedReader lectura = new BufferedReader(lector);
            String linea;
            //abrimos while para que lo recorra hasta qua ya no hayan lineas vacias
            while ((linea = lectura.readLine()) != null) {
            String[] partes = linea.split(", ");//declaramos el separador de los datos
            
            int id = Integer.parseInt(partes[0].trim()); 
            int codigo = Integer.parseInt(partes[1].trim());
            String nombre = partes[2].trim();
            String apellido = partes[3].trim();
            String direccion = partes[4].trim();
            String telefono = partes[5].trim();
            String puesto = partes[6].trim();
            int salario = Integer.parseInt(partes[7].trim()); // obtenemos el segundo valor del fichero
            // creamos un objeto del tipo Reporte para guardar los datos del fichero
            empleado empleados = new empleado();
            empleados.setId(id);
            empleados.setCodigo(codigo);
            empleados.setNombre(nombre);
            empleados.setApellido(apellido);
            empleados.setDireccion(direccion);
            empleados.setTelefono(telefono);
            empleados.setPuesto(puesto);
            empleados.setSalario(salario);
            // los ingresamos al Arraylist para poder guardarlos
            listaReporte.add(empleados);
            }
            //se cierra la lectura para evitar errores
            lectura.close();
            System.out.println("Datos leídos con éxito.");
         } catch(IOException exception) {
        exception.printStackTrace(System.out);
    }

    return listaReporte; // retornamos el ArrayList con los datos del Fichero
}
        
        public ArrayList<cliente> leerFicheroCliente(String fichero) {
            //creamos un nuevo ArrayList para guardar los datos del fichero
            //con los datos guardados con anterioridad
            ArrayList<cliente> listaReporte = new ArrayList<>();

            try {
                //abrimos el fichero para empezar a leerlo
            FileReader lector = new FileReader(fichero);
            BufferedReader lectura = new BufferedReader(lector);
            String linea;
            //abrimos while para que lo recorra hasta qua ya no hayan lineas vacias
            while ((linea = lectura.readLine()) != null) {
            String[] partes = linea.split(", ");//declaramos el separador de los datos
            
            int id = Integer.parseInt(partes[0].trim()); 
            int codigo = Integer.parseInt(partes[1].trim());
            String nombre = partes[2].trim();
            String apellido = partes[3].trim();
            String direccion = partes[4].trim();
            String telefono = partes[5].trim();
            int saldo = Integer.parseInt(partes[6].trim()); // obtenemos el segundo valor del fichero
            // creamos un objeto del tipo Reporte para guardar los datos del fichero
            cliente clientes = new cliente();
            clientes.setId(id);
            clientes.setCodigo(codigo);
            clientes.setNombre(nombre);
            clientes.setApellido(apellido);
            clientes.setDireccion(direccion);
            clientes.setTelefono(telefono);
            clientes.setSaldo(saldo);
            // los ingresamos al Arraylist para poder guardarlos
            listaReporte.add(clientes);
            }
            //se cierra la lectura para evitar errores
            lectura.close();
            System.out.println("Datos leídos con éxito.");
         } catch(IOException exception) {
        exception.printStackTrace(System.out);
    }

    return listaReporte; // retornamos el ArrayList con los datos del Fichero
}
}
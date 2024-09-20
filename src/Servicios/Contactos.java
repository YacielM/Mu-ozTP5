
package Servicios;

public class Contactos {
    //DNI, nombre, apellido, ciudad y dirección. Un contacto se empareja con un teléfono tipo Long.
   
   private int DNI;
   private String nombre;
   private String apellido;
   private String ciudad;
   private String direccion;
   
   long telefono;

    public Contactos(int DNI, String nombre, String apellido, String ciudad, String direccion, long telefono) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Directorio{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    
  
   
}

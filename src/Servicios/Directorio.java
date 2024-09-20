package Servicios;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
agregarContacto() que permite registrar un nuevo contacto con su respectivo nro. de 
teléfono. Siendo el nro. del teléfono la clave del mismo. 
B. buscarContacto() que en base al nro. de teléfono retorna el Contacto asociado al mismo. 
C. buscarTeléfono() que en base a un apellido nos devuelve un Set<Long> con los números 
de teléfono asociados a dicho apellido.  
D. buscarContactos() que en base a una ciudad nos devuelve un ArrayList con los 
Contactos asociados a dicha ciudad.  
E. borrarContacto() que en base al número de teléfono elimina el contacto del directorio. 
Importante: Armar el modelo UML representado las clases necesarias. Implementar en java 
con TreeMap<Long, Cliente> y TreeSet. Recuerde el uso de: Iterator y keySet() 
En el main, crear un Directorio, entre 4 y 5 Contactos, y probar todos los métodos entre A y E.  
*/
public class Directorio {
   private TreeMap<Long, Contactos> contactos;

   public Directorio(){
       contactos = new TreeMap<>();
   }
   public void agregarContacto(Contactos c){
       contactos.put(c.getTelefono(), c);
   }
   public Contactos buscarContacto(long telef){
       return contactos.get(telef);
   }
   public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new TreeSet<>();
        for (Contactos c : contactos.values()) {
            if (c.getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(c.getTelefono());
            }
        }
        return telefonos;
    }
   public ArrayList<Contactos> buscarContactos(String ciudad){
       ArrayList<Contactos> listcontactos = new ArrayList<>();
       for(Contactos c : contactos.values()){
           if(c.getCiudad().equalsIgnoreCase(ciudad)){
               listcontactos.add(c);
           }
       }
       return listcontactos;
   }
   public void borrarContacto(long telef){
       contactos.remove(telef);
   }
   public TreeMap<Long, Contactos> getContactos() {
    return contactos;
}

}

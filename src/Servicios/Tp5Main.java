
package Servicios;

public class Tp5Main {

    public static void main(String[] args) {
             System.out.println("Probando");

        Directorio directorio = new Directorio();
        Contactos contacto1 = new Contactos(46408906, "Yaciel", "Muñoz", "San Luis", "Barrio Mirador del Cerro 1", 2664256205L);
        Contactos contacto2 = new Contactos(87654321, "Maria", "Gomez", "Cordoba", "Avenida Siempre Viva 456", 2222222222L);
        Contactos contacto3 = new Contactos(11223344, "Carlos", "Lopez", "Rosario", "Boulevard Oroño 789", 3333333333L);
        Contactos contacto4 = new Contactos(55667788, "Ana", "Martinez", "Mendoza", "Calle San Martin 101", 4444444444L);
        
        directorio.agregarContacto(contacto1);
        directorio.agregarContacto(contacto2);
        directorio.agregarContacto(contacto3);
        directorio.agregarContacto(contacto4);

       System.out.println(directorio.buscarContacto(2664256205L));
       System.out.println("Hola");
        // Buscar teléfonos por apellido
       System.out.println(directorio.buscarTelefono("Martinez"));

        // Buscar contactos por ciudad
       System.out.println(directorio.buscarContactos("Cordoba"));

        // Borrar contacto por teléfono
       directorio.borrarContacto(2664256205L);
       System.out.println(directorio.buscarContacto(2664256205L)); // Debería ser null
    }
    
}


package ed06_tareaproyecto;

/**
 * Clase Main que hace uso de un objeto de la clase empleado, inserta datos en el objeto
 * y despues los muestra por pantalla.
 * @author Jose Cano
 * @version 1.0
 */
public class Main {

    /**
     * Metodo principal que crea un objeto de la clase empleado y muestra sus
     * valores por pantalla.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("999999M","Jose Cano Gil");
        
        empleado1.setDireccion("C/Castillo de aledo, ");
        empleado1.setNumHijos(0);
        
        imprimir_emp(empleado1);
    }

    /**
     * Metodo que recibe como parametro un objeto empleado y muestra por pantalas
     * sus valores.
     * @param empleado1 Un objeto de la clase Empleado.
     */
    public static void imprimir_emp(Empleado empleado1) {
        System.out.println("DNI: "+empleado1.getDni());
        System.out.println("Nombre: "+empleado1.getNombre());
        System.out.println("Cargo: "+empleado1.getCargo());
        System.out.println("Número de hijos: "+empleado1.getNumHijos());
        System.out.println("Sueldo: "+empleado1.calcula_sueldo(1200));
    }
    
}

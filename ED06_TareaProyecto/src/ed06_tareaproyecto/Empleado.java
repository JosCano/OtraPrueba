
package ed06_tareaproyecto;

/**
 * Clase Empleado 
 * 
 * Contiene informacion de cada empleado
 * 
 * @author José Cano
 * @version 1.0
 */
public class Empleado {
    //Atributos que tendrán los objetos de la clase empleado
    private String dni; //DNI del empleado
    private String nombre; //Nombre del empleado
    private String direccion; //Direccion del empleado
    private String cargo; //Cargo que ocupa en la empresa
    private int numHijos; //Numero de hijos que tiene a su cargo
    
    /**
     * Inicializa un objeto Empleado con los valores que se le pasan 
     * como parametros.
     * 
     * @param dni dni del empleado
     * @param nombre nombre del empleado
     */
    public Empleado (String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }
    
    /**
     * Método que calcula el sueldo en funcion del cargo que ocupe
     * y del numero de hijos que tenga. 
     * 
     * @param base el salario base del empleado
     * @return Nos decuelve el sueldo que recibirá el empleado.
     */
    public double calcula_sueldo(double base){
        double total=base;
        
        if(getCargo().equals("ENCARGADO"))
            total+=300;
        else if(getCargo().equals("DIRECTOR"))
            total+=1000;
        if(getNumHijos()>=3)
            total+=getNumHijos()*50;
        return total;
    }

    /**
     * Método que devuelve el dni del empleado
     * 
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * Método que modifica el dni del empleado
     * 
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Método que devuelve el nombre del empleado
     * 
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que modifica el nombre del empleado
     * 
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve la dirección del empleado
     * 
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método que modifica la direcció del empleado
     * 
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método que devuelve el cargo del empleado
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Método que modifica el cargo del empleado
     * 
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Método que devuelve el numero de hijos del empleado
     * @return the numHijos
     */
    public int getNumHijos() {
        return numHijos;
    }

    /**
     * Método que modifica el numero de hijos del empleado
     * 
     * @param numHijos the numHijos to set
     */
    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }
}

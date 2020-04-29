
package mx.itson.JesusNavarrete;

/**
 * esta es la calse se utilizara para crear personas
 * @author Jesus Navarrete id: 00000216698
 * @see <a href="http://itson.mx" > ir a itson a ver mas sobre el proyecto </a>
 */
public class Persona {
    
    private String nombre; 
    private String apellido; 
    private String id; 

    /**
     * este es el contructor de persona
     * @param nombre el nombre de la persona
     * @param apellido el apellido de la persona
     * @param id el identificador de la persona
     */
    public Persona(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }
    /**
     * con este metodo la persona va a saludar
     */
    public void saludar(){
        System.out.println("Hola!!");
    }
    /**
     * con este metodo la persona se va a despedir
     */
    public void despedirce(){
        System.out.println("Adios!!!");    
    }
    
    /**
     * con este metodo la persona hablara
     * @param dialogo es lo que la persona va a decir
     * @return retorna lo que se escribio en dialogo 
     */
    public String hablar(String dialogo){
        return dialogo;
    }
    // getters y setters
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
}

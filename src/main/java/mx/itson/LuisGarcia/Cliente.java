
package mx.itson.LuisGarcia;

/**
 * Esta clase  funcionara como el registro de un ciente
 * @author luis garcia
 * @version  29/04/2020
 * @see <a href="http://itson.mx" > ir a itson a ver mas sobre el proyecto </a>
 */
public class Cliente {
    
    //datos a ocupar para generar el ticket
    private String nombre;
    private String id;//numero de cliente
    private String tipo;//tipo de membresia
    private String rfc;
    private String apellido;
    private String correo;
    private String direccion;

    /**
     * constructor de la clase usuario
     * @param nombre nombre cel cliente
     * @param id numero de cliente
     * @param tipo tipo de membresia
     * @param rfc rfc del cliente
     * @param apellido apellido del cliente
     * @param correo correo del cliente
     * @param direccion direccion del cliente
     */
    public Cliente(String nombre, String id, String tipo, String rfc, String apellido, String correo, String direccion) {
        this.nombre = nombre;
        this.id = id;
        this.tipo = tipo;
        this.rfc = rfc;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
    }
    /**
     * 
     * @param nombre nombre del cliente para entrar a la pagina
     * @param correo correo del cliente
     * @return regrasa si los datos son correctos
     */
    public boolean login(String nombre,String correo){
        
        return true;
    }
    /**
     * 
     * @param nombre nombre del cliente a registrar
     * @param correo correo del cliente a registrar
     * @param tipo tipo de membresia que va a comprar
     * @return regrasa si el registro fue correcto
     */
    public boolean registrar(String nombre, String correo, String tipo){
        
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}

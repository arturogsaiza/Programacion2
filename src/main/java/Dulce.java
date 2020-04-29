

/**
 *Esta clase la utilizaremos para crear dulces de todo tipo
 *  @version 29/04/2020
 *  @author Arturo
 *  @see <a href="http://itson.mx" > ir a itson a ver mas sobre el proyecto </a>
 */
public class Dulce {

    private String nombre;
    private String marca;
    private int id;
    /**
     * Este constructor funcionara para instanciar dulces sin inicializar
     */
    public Dulce() {
    }
    /**
     *  este constructor funcionara para instanciar dulces inicializados 
     * @param nombre es el nombre del dulce
     * @param marca es la marca del dulce
     * @param id  es el id del dulce
     */
    public Dulce(String nombre, String marca, int id) {
        this.nombre = nombre;
        this.marca = marca;
        this.id = id;
    }
    /**
     *  este metodo sera utilizado para saber cuantos ducles se vendieron
     * @param cantidad cantidad de dulces vendidos
     */
    public void vender(int cantidad){
        System.out.println("Se vendieron "+cantidad+" dulces.");
    }
    
    /**
     * Ese metodo funcionara para concocer que dulce se esta comiendo
     * @param nombre el numbre del dulce que se esta comiendo
     * @return  retorna una frase que incluye el dulce comido
     */
    public String comer(String nombre){
    return   "Te estas comiendo un "+nombre;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}

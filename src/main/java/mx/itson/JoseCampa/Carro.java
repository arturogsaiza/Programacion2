
package mx.itson.JoseCampa;

/** Esta clase la utilizaremos para vender autos de todo tipo
 * @version 29/04/2020
 * @author Jose Campa id: 00000216584
 * @see <a href="http://itson.mx" > ir a itson a ver mas sobre el proyecto </a>
 */

//Datos a ocupar para la venta de carros
public class Carro {

    private String nombre;
    private String marca;
    private int id;
    
    /**
     * Este constructor funcionara para instanciar Carros sin inicializar
     */

    public Carro(String nombre, String marca, int id) {
        this.nombre = nombre;
        this.marca = marca;
        this.id = id;
    }
    

    public Carro() {
        /**
      *  Este constructor funcionara para instanciar Carros sin inicializar
     * @param nombre Muestra el nombre del carro
     * @param marca Muestra la marca del carro
     * @param id Muestra el id del carro
     */
    }
    /**
     * este metodo sera utilizado para saber cuantos carros se seleccionados
     * @param cantidad cantidad de autos vendidos
     * @param marca marca se carros vendido
     */
    public void Seleccionados(int cantidad, String marca){
        System.out.println("Se seleccionaron "+cantidad+" de carros de la marca" + marca);
        
    }
    /**
     * Ese metodo funcionara para concocer la cantidad de carros vendidos
     * @param nombre
     * @param cantidad
     * @return retorna una frase que incluye la cantiad de carros vendidos de una marca
     */
    public String venta(String nombre, int cantidad){
        return "Compraste"+ cantidad + " de la marca " + marca;
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




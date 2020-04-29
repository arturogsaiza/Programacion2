package mx.itson.JesusCaudillo;

/**
 * Esta clase son las propiedades de una fruta en una tienda
 * @author jesus ricardo caudillo lizarraga - 216585
 * @version  29/04/2020
 * @see <a href="http://itson.mx" > ir a itson a ver mas sobre el proyecto </a>
 */

public class Fruta {

    private int id; //id de la fruta
    private String nombre; //nombre de la fruta
    private String elaboracion; //fecha elaboracion de la fruta
    private String caducidad; //fecha de caducidad de la fruta

    /**
     * Este constructor instancia Fruta sin inicializar
     */
    public Fruta() {
    }

    /**
     * Este constructor instancia la fruta inicializada
     *
     * @param id ID de la fruta
     * @param nombre Nombre de la fruta
     * @param elaboracion Fecha de elaboracion de la fruta
     * @param caducidad Fecha de caducidad de la fruta
     */
    public Fruta(int id, String nombre, String elaboracion, String caducidad) {
        this.id = id;
        this.nombre = nombre;
        this.elaboracion = elaboracion;
        this.caducidad = caducidad;
    }

    /**
     * Este metodo calcula el precio total de una cantidad de frutas
     * 
     * @param cantidad La cantidad de frutas
     * @param precio El precio por fruta
     * @return regresa el precio total
     */
    public double vender(int cantidad, int precio) {
        System.out.println("Se han vendido " + cantidad + " unidades de " + this.nombre);
        return (cantidad * precio);
    }

    /**
     * Muestra la informacion de la fruta
     */
    public void verInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fecha de elaboracion: " + this.elaboracion);
        System.out.println("Fecha de caducidad: " + this.caducidad);
    }

    /**
     * Puede comerse una fruta!
     */
    public void comer() {
        System.out.println("Usted se ha comido una fruta");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public String getElaboracion() {
        return elaboracion;
    }

    public void setElaboracion(String elaboracion) {
        this.elaboracion = elaboracion;
    }

}

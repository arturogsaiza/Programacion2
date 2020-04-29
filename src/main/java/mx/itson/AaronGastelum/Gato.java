/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.AaronGastelum;

/**
 * Esta clase funcionara para mostrar datos de un gato
 * @author maste
 * @version 4/29/2020
 * @see <a href="http://itson.mx" > ir a itson a ver mas sobre el proyecto </a>
 */
public class Gato {

    
    private String nombre;  // variable que guardara el nombre.
    private String raza;    // variable que guardara la raza.
    private String edad;    // variable que guardara edad.

    /**
     * Constructor vacio.   
     */
    public Gato() {

    }

    /**
     * Constructor con todos los datos
     * @param nombre Guarda el nombre del gato.
     * @param raza  Guarda la raza del gato.
     * @param edad Guarda la edad del gato.
     */
    public Gato(String nombre, String raza, String edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    /**
     * Esta metodo alimentara al gato.
     *
     * @param cantidad Refiriendose a la cantidad de comida que le daras al
     * gato. System.out.println Regresara la cantidad de veces que se le dio de
     * comer al gato.
     */
    public void alimentar(int cantidad) {
        System.out.println("Se alimento:" + cantidad + "veces al gato");
    }

    /**
     * Este metodo presentara todos los datos del gato.
     *
     * @param nombre Nombre del gato.
     * @param raza Raza del gato.
     * @param edad Edad del gato.
     * @return Muestra todos los datos del gato.
     */
    public String datos(String nombre, String raza, String edad) {
        return "Los datos del gato son:" + nombre + " " + raza + " " + edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

}

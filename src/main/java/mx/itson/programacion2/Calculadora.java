
package mx.itson.programacion2;

/**
 * Esta clase  funcionara como una calculadora para sumar y multiplicar numero
 * @author Arturo Garcia Saiza
 * @version  27/04/2020
 * @see <a href="http://itson.mx" > ir a itson a ver mas sobre el proyecto </a>
 */
public class Calculadora {
    
    int resultado; //esta variable guardara el resultado de la su ma o multiplicacion
    
    /**
     * esta clase sumara numeros
     * @param n1 primer numero a sumar
     * @param n2 segundo numero a sumar
     * @return  regresara la suma de los dos numeros
     */
    public double sumar( double n1, double n2){
        return n1+n2;
    }  //termina sumar
    
    /**
     *  esta clase multiplicara numeros
     * @param n1 primer numero a multiplicar
     * @param n2 segundo numero a multiplicar
     * @return  regresara la multiplicacion de los dos numeros
     */
    public double multiplicar(double n1, double n2){
        return n1*n2;
    } //termina multiplicar
    
    
    
    
} //termina clase Calculadora

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.OscarGonzález;

/**
 *Esta clase registra datos de una institución y despliega su horario
 * @author Oscar González Leyva ID:216640
 * @version 29/04/2020
 * @see <a href="http://itson.mx" > ir a itson a ver mas sobre el proyecto </a>
 */

public class Escuela {
        
        private String nombre; //Variable que registra el nombre o apodo de la institución
        private int aulas; //Variable que refleja el número total de aulas en la institución
        private String docentes; //Variable que refleja el numero de docentes en la institución
        private int capacidad; //Variable que indica la capacidad de alumnos en el plantel
        private int hora_entrada; //Variable para designar una hora de entrada laboral
        private int hora_salida; //Variable para designar una hora de saluda laboral
        
    /**
    * Constructor vacío
    */
    public Escuela() {
    }

    /**
     * Constructor encapsulado
     * @param nombre nombre del plantel
     * @param aulas número de aulas del plantel
     * @param docentes número de docentes del plantel
     * @param capacidad capacidad total de personal y alumnado en el plantel
     * @param hora_entrada la hora de entrada aprovada por la escuela
     * @param hora_salida  la hora de salida y cierre de la escuela
     */
    public Escuela(String nombre, int aulas, String docentes, int capacidad, int hora_entrada, int hora_salida) {
        this.nombre = nombre;
        this.aulas = aulas;
        this.docentes = docentes;
        this.capacidad = capacidad;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
    }

    /**
     * En este metodo se comunicara la hora de entrada al plantel
     * @param hora_entrada se registra la hora de entrada de forma externa para desplegarla
     * @return despliega un mensaje para los alumnos y maestros sobre la hora oficial
     */
    public String abrirEscuela(int hora_entrada){
        return("La escuela abrio sus puertas a las "+hora_entrada);
    }
    //termina el metodo abrirEscuela
    
    /**
     * En este metodo se comunicara la hora de salida del plantel
     * @param hora_salida se registra la hora de saluda de forma externa para desplegarla
     * @return se muestra el mensaje para el personal y alumnado sobre la hora de salida oficial
     */
    public String cerrarEscuela(int hora_salida){
        return("La escuela cierra sus instalaciones a las"+hora_salida);
    }
    //termina el metodo cerrarEscuela  
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAulas() {
        return aulas;
    }

    public void setAulas(int aulas) {
        this.aulas = aulas;
    }

    public String getDocentes() {
        return docentes;
    }

    public void setDocentes(String docentes) {
        this.docentes = docentes;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(int hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public int getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(int hora_salida) {
        this.hora_salida = hora_salida;
    }
}//termina la clase Escuela

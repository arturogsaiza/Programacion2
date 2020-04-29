/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.programacion2;

import mx.itson.LuisGarcia.Cliente;

/**
 * 
 * @author Arturo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cliente c = new Cliente();
       // Calculadora c = new Calculadora();
       intercambio(2,6,1,4,9,5);
       
      
        
    }
    
    public static void intercambio(int... lista){
 
        //Usamos un bucle anidado
        for(int i=0;i<(lista.length-1);i++){
            for(int j=i+1;j<lista.length;j++){
                if(lista[i]>lista[j]){
                    //Intercambiamos valores
                    int variableauxiliar=lista[i];
                    lista[i]=lista[j];
                    lista[j]=variableauxiliar;
 
                }
            }
        }
        imprimirArray(lista);
        
    }
    
    
        public static void burbuja(int... lista){
 
        //Usamos un bucle anidado
        for(int i=0;i<(lista.length-1);i++){
            for(int j=i+1;j<lista.length;j++){
                if(lista[i]>lista[j]){
                    //Intercambiamos valores
                    int variableauxiliar=lista[i];
                    lista[i]=lista[j];
                    lista[j]=variableauxiliar;
 
                }
            }
        }
        imprimirArray(lista);
        
    }
    
    
    
    
        public static void imprimirArray (int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }
    
}

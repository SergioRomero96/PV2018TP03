/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto4.dominio;

/**
 * 
 * @author Sergio Romero
 */
public class ArregloNumero {
    /**
     * Atributo de la clase
     */
    private int[] numeros;
    
    /**
     * Constructor por defecto
     */
    public ArregloNumero(){
        this.numeros = new int[10];
    }
    
    /**
     * Constructor con parametro
     * @param numeros se le asigna al atributo numeros de la clase
     */
    public ArregloNumero(int[] numeros) {
        this.numeros = numeros;
    }

    /**
     * @return el arreglo de numeros
     */
    public int[] getNumeros() {
        return numeros;
    }

    /**
     * @param numeros se le asigna al atributo numeros que es un arreglo
     */
    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }   
    
    /**
     * Metodo que muestra los elementos del arreglo
     */
    public void mostrarElementosDelArreglo(){
        for(int i = 0; i < numeros.length; i++)
            System.out.println("elemento N° "+i+": "+numeros[i]);
    }
    
    /**
     * Metodo que muestra el numero menor y mayor que contiene el arreglo
     */
    public void mostrarMayorMenor(){
        boolean band = true;
        int min = 0;
        int max = 0;
        for(int i = 0; i < numeros.length; i++){
            if(band){
                min=numeros[i];
                max=numeros[i];
                band = false;
            }
            else{
                if(numeros[i] < min)
                    min = numeros[i];
                else if (numeros[i] > max)
                    max = numeros[i];
            }
        }
        System.out.println("\nEl Mayor es: " + max);
        System.out.println("El Menor es: " + min);
    }
    
    /**
     * Metodo para obtener el promedio de los numeros del arreglo
     * @return el promedio de los numero que contiene el arreglo
     */
    public double obtenerPromedio(){
        int suma = 0;
        for(int i = 0; i < numeros.length; i++)
            suma +=numeros[i];
        return (double)suma /numeros.length;
    }
}

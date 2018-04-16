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
    private int[] numeros;
    
    public ArregloNumero(){
        this.numeros = new int[10];
    }
    public ArregloNumero(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }   
    
    public void mostrarElementosDelArreglo(){
        for(int i = 0; i < numeros.length; i++)
            System.out.println("Valor de elemento: "+numeros[i]);
    }
    
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
    
    public double obtenerPromedio(){
        int suma = 0;
        for(int i = 0; i < numeros.length; i++)
            suma +=numeros[i];
        return (double)suma /numeros.length;
    }
}

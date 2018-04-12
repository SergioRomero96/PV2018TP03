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
    
}

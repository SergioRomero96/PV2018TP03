/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto4.test;

import java.util.Scanner;
import punto4.dominio.ArregloNumero;

/**
 * 
 * @author Sergio Romero
 */
public class ProgramaPrincipal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//objeto para leer por teclado
        ArregloNumero arreglo = new ArregloNumero();//objeto para almacenar un arreglo de numeros
        int contador = 0;
        
        while(contador < 10){//se cargan los 10 numeros
            System.out.print("Ingrese un numero: ");
            arreglo.getNumeros()[contador] = scanner.nextInt();
            contador++;
        }
        //se muestra los numeros, el mayor, menor y el promedio
        System.out.println("\nElementos  del arreglo");
        arreglo.mostrarElementosDelArreglo();
        arreglo.mostrarMayorMenor();
        System.out.println("El Promedio es: " + arreglo.obtenerPromedio());
    }
}

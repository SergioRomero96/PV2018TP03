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
        Scanner scanner = new Scanner(System.in);
        ArregloNumero arreglo = new ArregloNumero();
        int contador = 0;
        while(contador < 10){
            System.out.print("Ingrese un numero: ");
            arreglo.getNumeros()[contador] = scanner.nextInt();
            contador++;
        }
        arreglo.mostrarElementosDelArreglo();
    }
}

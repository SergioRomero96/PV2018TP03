/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto1.test;

import java.text.DecimalFormat;
import java.util.Scanner;
import punto1.dominio.Punto;
/**
 * 
 * @author Sergio Romero
 */
public class ProgramaPrincipal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//objeto para leer datos por consola
        DecimalFormat df = new DecimalFormat("#.00");//objeto para formatear los nros decimales
        //Se crea dos objetos de la clase Punto
        Punto unPunto = new Punto();
        Punto segundoPunto = new Punto();
        //Se lee las coordenadas de los puntos
        System.out.print("Punto1\nIngrese valor para x: ");
        unPunto.setX(scanner.nextDouble());
        System.out.print("Ingrese valor para y: ");
        unPunto.setY(scanner.nextDouble());
        System.out.print("Punto2\nIngrese valor para x: ");
        segundoPunto.setX(scanner.nextDouble());
        System.out.print("Ingrese valor para y: ");
        segundoPunto.setY(scanner.nextDouble());
        //se muestra la distancia desde el punto1 hasta el punto2
        System.out.println("La distancia desde el punto1 al punto2 es: "+
                df.format(unPunto.obtenerDistancia(unPunto.getX(), unPunto.getY(), segundoPunto.getX(), segundoPunto.getY())));
    }
}

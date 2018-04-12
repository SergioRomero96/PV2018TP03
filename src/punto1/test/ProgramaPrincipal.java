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
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        Punto unPunto = new Punto();
        Punto segundoPunto = new Punto();
        System.out.print("Punto1\nIngrese valor para x: ");
        unPunto.setX(scanner.nextDouble());
        System.out.print("Ingrese valor para y: ");
        unPunto.setY(scanner.nextDouble());
        System.out.print("Punto2\nIngrese valor para x: ");
        segundoPunto.setX(scanner.nextDouble());
        System.out.print("Ingrese valor para y: ");
        segundoPunto.setY(scanner.nextDouble());
        System.out.println("La distancia desde el punto1 al punto2 es: "+
                df.format(unPunto.obtenerDistancia(unPunto.getX(), unPunto.getY(), segundoPunto.getX(), segundoPunto.getY())));
    }
}

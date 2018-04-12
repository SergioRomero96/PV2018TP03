/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto2.test;

import java.util.Scanner;
import punto1.dominio.Punto;
import punto2.dominio.Rectangulo;

/**
 * 
 * @author Sergio Romero
 */
public class ProgramaPrincipal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Punto unPunto = new Punto();
        Rectangulo unRectangulo = new Rectangulo();
        System.out.print("Ingrese un Punto:\nx:");
        unPunto.setX(scanner.nextDouble());
        System.out.print("y: ");
        unPunto.setY(scanner.nextDouble());
        unRectangulo.setPunto1(unPunto);
        double base;
        do{
            System.out.print("Ingrese la Base:");
            base = scanner.nextDouble();
        }while(base < 0);
        unRectangulo.setBase(base);
        double altura;
        do{
            System.out.print("Ingrese la altura: ");
            altura = scanner.nextDouble();
        }while(altura < 0);
        unRectangulo.setAltura(altura);
        unRectangulo.mostrarPuntos();
        System.out.println("\nSuperficie del Rectangulo: "+ unRectangulo.obtenerSuperficie());
        System.out.println("Perimetro del Rectangulo: "+ unRectangulo.obtenerPerimetro());
        
    }
}

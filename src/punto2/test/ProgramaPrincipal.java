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
        Scanner scanner = new Scanner(System.in);//objeto para leer datos por consola
        Punto unPunto = new Punto();
        Rectangulo unRectangulo = new Rectangulo();//se crea un objeto rectangulo
        System.out.print("Ingrese un Punto:\nx:");//se asigna las coordenadas del punto
        unPunto.setX(scanner.nextDouble());
        System.out.print("y: ");
        unPunto.setY(scanner.nextDouble());
        unRectangulo.setPunto1(unPunto);
        double base;
        do{
            System.out.print("Ingrese la Base:");
            base = scanner.nextDouble();
        }while(base <= 0);//se valida que la base no sea menor o igual que 0
        unRectangulo.setBase(base);//se asigna la base
        double altura;
        do{
            System.out.print("Ingrese la altura: ");
            altura = scanner.nextDouble();
        }while(altura <= 0);//se valida que la altura no sea menor o igual q 0
        unRectangulo.setAltura(altura);//se asigna la altura
        unRectangulo.mostrarPuntos();//se muestra los puntos restantes
        //se muestra la superficie y perimetro del rectangulo
        System.out.println("\nSuperficie del Rectangulo: "+ unRectangulo.obtenerSuperficie());
        System.out.println("Perimetro del Rectangulo: "+ unRectangulo.obtenerPerimetro());
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto1.test;

import java.text.DecimalFormat;
import punto1.dominio.Punto;
/**
 * 
 * @author Sergio Romero
 */
public class ProgramaPrincipal {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.00");//objeto para formatear los nros decimales
        //Se crea dos objetos de la clase Punto
        Punto punto1 = new Punto(1.5, 2.5);
        Punto punto2 = new Punto(3.5, 5.0);
        System.out.println("Punto1: "+"("+punto1.getX()+", "+punto1.getY()+")");
        System.out.println("Punto2: "+"("+punto2.getX()+", "+punto2.getY()+")");
        //se muestra la distancia desde el punto1 hasta el punto2
        System.out.println("\nLa distancia desde el punto1 al punto2 es: "+
                df.format(punto1.obtenerDistancia(punto2)));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto2.dominio;

import punto1.dominio.Punto;

/**
 * 
 * @author Sergio Romero
 */
public class Rectangulo {
    //atributos de la clase rectangulo
    private Punto punto1;
    private double base;
    private double altura;
    
    //metodo para mostrar los puntos restantes del rectangulo
    public void mostrarPuntos(){
        Punto punto2 = new Punto();
        Punto punto3 = new Punto();
        Punto punto4 = new Punto();
        punto2.setX(punto1.getX()+base);
        punto2.setY(punto1.getX());
        punto3.setX(punto1.getX());
        punto3.setY(punto1.getY()+altura);
        punto4.setX(punto2.getX());
        punto4.setY(punto3.getY());
        
        System.out.println("\nPunto1: ("+punto1.getX()+", "+punto1.getY()+")");
        System.out.println("Punto2: ("+punto2.getX()+", "+punto2.getY()+")");
        System.out.println("Punto3: ("+punto3.getX()+", "+punto3.getY()+")");
        System.out.println("Punto4: ("+punto4.getX()+", "+punto4.getY()+")");

    }
    
    //metodo para obtener la superficie
    public double obtenerSuperficie(){
        return base * altura;
    } 
    //metodo para obtener el perimetro
    public double obtenerPerimetro(){
        return 2 * base + 2 * altura;
    }
    
    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
   
    
     
}

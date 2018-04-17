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
    /**
     * atributos de la clase rectangulo
     */
    private Punto punto1;
    private double base;
    private double altura;
    
    /**
     * Constructor por defecto
     */
    public Rectangulo(){
        
    }
    /**
     * Constructor con parametros
     * @param punto1 representa un punto del rectangulo
     * @param base  representa la base del rectangulo
     * @param altura representa la altura del rectangulo
     */
    public Rectangulo(Punto punto1, double base, double altura) {
        this.punto1 = punto1;
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * @return el un punto del rectangulo
     */
    public Punto getPunto1() {
        return punto1;
    }
    /**
     * @param punto1 se le asigna al atributo punto de la clase
     */
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }
    /**
     * @return la base del rectangulo
     */
    public double getBase() {
        return base;
    }
    /**
     * @param base se asigna al atributo base del clase
     */
    public void setBase(double base) {
        this.base = base;
    }
    /**
     * @return la altura del rectangulo
     */
    public double getAltura() {
        return altura;
    }
    /**
     * @param altura se asigna al atributo altura de la clase
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /**
     * metodo para mostrar los 3 puntos restantes del rectangulo
     */
    public void mostrarPuntos(){
        Punto punto2 = new Punto(punto1.getX()+base, punto1.getX());
        Punto punto3 = new Punto(punto1.getX(), punto1.getY()+altura);
        Punto punto4 = new Punto(punto2.getX(), punto3.getY());
        
        System.out.println("\nPunto1: ("+punto1.getX()+", "+punto1.getY()+")");
        System.out.println("Punto2: ("+punto2.getY()+", "+punto2.getY()+")");
        System.out.println("Punto3: ("+punto3.getX()+", "+punto3.getY()+")");
        System.out.println("Punto4: ("+punto4.getX()+", "+punto4.getY()+")");
    }
    
    /**metodo para obtener la superficie del rectangulo
     * @return la superficie
     */
    public double obtenerSuperficie(){
        return base * altura;
    } 
    
    /**metodo para obtener el perimetro del rectangulo
     * @return el perimetro
     */
    public double obtenerPerimetro(){
        return 2 * base + 2 * altura;
    }
    
}

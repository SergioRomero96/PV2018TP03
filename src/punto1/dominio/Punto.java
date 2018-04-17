/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto1.dominio;

/**
 * 
 * @author Sergio Romero
 */
public class Punto {
    /**
     * atributos de la clase punto
     */
    private double x;
    private double y;
    
    /**
     *Construtor por defecto
     */
    public Punto(){    
    }

    /**
     *Constructor con parametros
     * @param x coordenada x
     * @param y coordenada y
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * @return el valor del atributo x
     */
    public double getX() {
        return x;
    }
    /**
     * @param x se asigna al atributo x de la clase
     */
    public void setX(double x) {
        this.x = x;
    }
    /**
     * @return el valor del atributo y
     */
    public double getY() {
        return y;
    }
    /**
     * @param y se asigna al atributo y de la clase 
     */
    public void setY(double y) {
        this.y = y;
    }
    
    /**metodo para obtener la distancia entre 2 puntos
     * @param p2 Punto 2
     * @return la distancia entre dos puntos
     */
    public double obtenerDistancia(Punto p2){
        return Math.sqrt(Math.pow(p2.getX() - this.x, 2) + Math.pow(p2.getY() - this.y, 2));
    }
}

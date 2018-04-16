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
    private double x;//atributos de la clase punto
    private double y;
    
 
    //metodo para obtener la distancia entre 2 puntos
    public double obtenerDistancia(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

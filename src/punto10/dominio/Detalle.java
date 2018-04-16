/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto10.dominio;

/**
 * 
 * @author Sergio Romero
 */
public class Detalle {
    //atributos de la clase
    private Producto unProducto;
    private int cuota ;
    private double precioTotal;
    //constructor por defecto
    public Detalle(){
        
    }
    //constructor con parametros
    public Detalle(Producto unProducto, int cuota, double precioTotal) {
        this.unProducto = unProducto;
        this.cuota = cuota;
        this.precioTotal = precioTotal;
    }

    public Producto getUnProducto() {
        return unProducto;
    }

    public void setUnProducto(Producto unProducto) {
        this.unProducto = unProducto;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    //metodo estatico de la clase para calcular el precio en cuotas
    public static double calcularPrecioTotal(double precioUnitario, int cantidadCuota){
        double cuota = precioUnitario / cantidadCuota;
        double porcentaje;
        double total = 0;
        for(int i = 0; i<cantidadCuota; i++){
            porcentaje = cuota * 1.5 / 100;
            cuota = cuota + porcentaje;
            total = total + cuota;
        }
        return total;
    }
}

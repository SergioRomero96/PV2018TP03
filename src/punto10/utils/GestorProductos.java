/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto10.utils;

import java.util.ArrayList;
import punto10.dominio.Producto;

/**
 * 
 * @author Sergio Romero
 */

public class GestorProductos {
    /**Atributo de la clase*/
    private ArrayList<Producto> productos = new ArrayList();
    
    /**
     * Constructor por defecto
     */
    public GestorProductos() {
    }

    /**
     * @return the productos
     */
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    /**
     * Metodo para Agregar productos a un ArrayList de productos
     * @param producto que se almacena en el arraylist de productos
     */
    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }
    
    /**
     * Metodo para calcular el precio en cuotas a pagar
     * @param precioUnitario del producto
     * @param cantidadCuota del producto
     * @return el precio en cuotas 
     */
    public static double calcularCuotas(double precioUnitario, int cantidadCuota){
        double cuota = precioUnitario / cantidadCuota;
        double porcentaje;
        double total = 0;
        for(int i = 0; i<cantidadCuota; i++){
            porcentaje = cuota * 1.5 / 100;//se obtiene el 1.5% de la cuota
            cuota = cuota + porcentaje;//se le suma el 1.5% a una cuota
            total = total + cuota;//se acumulan las cuotas + el 1.5%
        }
        return total;
    }
    
    /**
     * Metodo para mostrar los productos en forma de Tabla
     * y la suma total a pagar por los productos
     */
    public void mostrarProductos(){
        double totalAPagar = 0;
        System.out.println("\nCodigo\tNombre\t\tPrecioUnitario\t\tCuota\tPrecioEnCuota");
        System.out.println("---------------------------------------------------------------------");
        for(Producto objProducto : productos){
            double cuotasAPagar = calcularCuotas(objProducto.getPrecioUnitario(), objProducto.getCantCuota());
            System.out.println(objProducto.getCodigo()+"\t"+objProducto.getNombre()+"\t\t"+
                    objProducto.getPrecioUnitario()+"\t\t"+objProducto.getCantCuota()+"\t"+ cuotasAPagar);
            totalAPagar += cuotasAPagar;
        }
        System.out.println("\nTotal a Pagar: " + totalAPagar);
    }
    

}

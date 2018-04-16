/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto10.dominio;

import java.util.ArrayList;

/**
 * 
 * @author Sergio Romero
 */
public class Venta {
    private ArrayList<Detalle> lista = new ArrayList();

    public Venta() {
    }

    public ArrayList<Detalle> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Detalle> lista) {
        this.lista = lista;
    }
    //metodo para cargar el producto mas la cantidad de cuota
    public void AgregarDetalle(Detalle detalle){
        lista.add(detalle);
    }
    //metodo para mostrar la tabla con los productos almacenados en la lista
    public void mostrarVenta(ArrayList<Detalle> lista){
        System.out.println("\nCodigo\tNombre\t\tPrecioUnitario\t\tCuota\tPrecioEnCuota");
        System.out.println("---------------------------------------------------------------------");
        for(Detalle objDetalle : lista){
            System.out.println(objDetalle.getUnProducto().getCodigo()+"\t"+objDetalle.getUnProducto().getNombre()+"\t\t"+
                    objDetalle.getUnProducto().getPrecioUnitario()+"\t\t"+objDetalle.getCuota()+"\t"+objDetalle.getPrecioTotal());
        }
        System.out.println("");
    }
    
    public double totalAPagar(ArrayList<Detalle> lista){
        double total = 0;
        for(Detalle objDetalle : lista){
            total += objDetalle.getPrecioTotal();
        }
        return total;
    }
    
}

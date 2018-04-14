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
    
    public void AgregarDetalle(Detalle detalle){
        lista.add(detalle);
    }
    
    public void mostrarVenta(ArrayList<Detalle> lista){
        System.out.println("\nCodigo\tNombre\t\tPrecioUnitario\tCuota\tPrecioEnCuota");
        System.out.println("---------------------------------------------------------------------");
        for(Detalle objDetalle : lista){
            System.out.println(objDetalle.getUnProducto().getCodigo()+"\t"+objDetalle.getUnProducto().getNombre()+"\t\t"+
                    objDetalle.getUnProducto().getPrecioUnitario()+"\t\t"+objDetalle.getCuota()+"\t"+objDetalle.getPrecioTotal());
        }
        System.out.println("");
    }
    
}

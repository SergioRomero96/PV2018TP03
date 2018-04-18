/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto10.test;

import punto10.dominio.Producto;
import punto10.utils.GestorProductos;

/**
 * 
 * @author Sergio Romero
 */
public class ProgramaPrincipal {
    public static void main(String[] args){
        GestorProductos objGestor = new GestorProductos();
        //se cargan 4 productos que son almacenados en una lista
        objGestor.agregarProducto(new Producto(100, "Mouse Sharknet", 120.0, 6));
        objGestor.agregarProducto(new Producto(101, "Teclado Genius", 320.0, 6));
        objGestor.agregarProducto(new Producto(102, "Monitor LG 19' ", 1900.0, 12));
        objGestor.agregarProducto(new Producto(103, "Mouse HiperX", 1100.0, 6));

        objGestor.mostrarProductos();//se muestra los productos almacenados
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto10.test;

import java.util.Scanner;
import punto10.dominio.Detalle;
import punto10.dominio.Producto;
import punto10.dominio.Venta;

/**
 * 
 * @author Sergio Romero
 */
public class ProgramaPrincipal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Venta objVenta = new Venta();
        int i = 0;
        char resp;
        do{
            System.out.println("Producto N° " + (++i));
            System.out.print("Ingrese el codigo: ");
            int codigo = input.nextInt();
            input.skip("\n");
            System.out.print("Ingrese el Nombre + Marca: ");
            String nombre = input.nextLine();
            System.out.print("Ingrese el Precio Unitario: ");
            double precioUnitario = input.nextDouble();
            Producto objProducto = new Producto(codigo, nombre, precioUnitario);
            objProducto.mostrarProducto();
            System.out.print("\nIngrese la cantidad de cuotas a pagar: ");
            int cuotas = input.nextInt();
            double precioTotal = Detalle.calcularPrecioTotal(precioUnitario, cuotas);
            Detalle detalle = new Detalle(objProducto, cuotas, precioTotal);
            objVenta.AgregarDetalle(detalle);
            
            System.out.print("\nDesea Continuar? S/N: ");
            resp = input.next().charAt(0);
        }while(resp != 'N');
        
        objVenta.mostrarVenta(objVenta.getLista());
    }

}

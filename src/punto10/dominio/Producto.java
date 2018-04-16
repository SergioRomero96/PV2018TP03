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
public class Producto {
    //atributos de la clase
    private int codigo;
    private String nombre;
    private double precioUnitario;
    //constructor por defecto
    public Producto(){
        
    }
    //constructor con parametros
    public Producto(int codigo, String nombre, double precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    //metodo para mostrar datos del producto
    public void mostrarProducto(){
        System.out.println("\n-----------------------");
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("PrecioUnitario: " + this.precioUnitario);
        System.out.println("-----------------------");
    }
}

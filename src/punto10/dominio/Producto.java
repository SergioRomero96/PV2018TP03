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
    /**
     * atributos de la clase
     */
    private int codigo;
    private String nombre;
    private double precioUnitario;
    private int cantCuota;
    /**
     * constructor por defecto
     */
    public Producto(){
        
    }
    /**
     * Constructor con parametros
     * @param codigo se le asigna al atributo codigo de la clase Producto
     * @param nombre se le asigna al atributo nombre de la clase Producto
     * @param precioUnitario se le asigna al atributo precioUnitario de la clase Producto
     * @param cantCuota se le asigna al atributo cantCuota de la clase Producto
     */
    public Producto(int codigo, String nombre, double precioUnitario, int cantCuota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantCuota = cantCuota;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precioUnitario
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * @return the cantCuota
     */
    public int getCantCuota() {
        return cantCuota;
    }

    /**
     * @param cantCuota the cantCuota to set
     */
    public void setCantCuota(int cantCuota) {
        this.cantCuota = cantCuota;
    }
    
    /**
     * metodo para mostrar los datos del producto
     */
    public void mostrarProducto(){
        System.out.println("\n-----------------------");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("PrecioUnitario: " + precioUnitario);
        System.out.println("Cantidad de Cuota a Pagar: " + cantCuota);
        System.out.println("-----------------------");
    }
}

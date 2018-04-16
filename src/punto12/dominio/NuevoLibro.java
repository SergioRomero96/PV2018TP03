/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto12.dominio;

import punto8.dominio.Libro;

/**
 * 
 * @author Sergio Romero
 */
public class NuevoLibro extends Libro{//se crea una nueva clase libro que hereda los atributos de la clase libro
    private String categoria;//se incluye el atributo categoria
    
    //constructor por defecto
    public NuevoLibro() {
    }
    //constructor con parametros
    public NuevoLibro(String ISBN, String titulo, String autor, double precio, String categoria) {
        super(ISBN, titulo, autor, precio);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}

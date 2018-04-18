/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto12.dominio;

import punto8.dominio.Libro;
import punto8.dominio.Autor;

/**
 * 
 * @author Sergio Romero
 */
/**
 * subclase que hereda los atributos de la clase libro e incluye un atributo categoria
 */
public class NuevoLibro extends Libro{
    private String categoria;//se incluye el atributo categoria
    
    /**
     * constructor por defecto
     */
    public NuevoLibro() {
    }
    
    /**
     * constructor con parametro
     * @param ISBN se asigna al atributo ISBN de la clase NuevoLibro
     * @param titulo se asigna al atributo titulo de la clase NuevoLibro
     * @param autor se asigna al atributo autor de la clase NuevoLibro
     * @param precio se asigna al atributo precio de la clase NuevoLibro
     * @param categoria se asigna al atributo categoria de la clase NuevoLibro
     */
    public NuevoLibro(String ISBN, String titulo, Autor autor, double precio, String categoria) {
        super(ISBN, titulo, autor, precio);
        this.categoria = categoria;
    }
    
    /**
     * @return el valor que contiene la categoria del libro
     */
    public String getCategoria() {
        return categoria;
    }
    
    /**
     * @param categoria se le asigna al atributo categoria del libro
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

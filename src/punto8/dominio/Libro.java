/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto8.dominio;

/**
 * 
 * @author Sergio Romero
 */
public class Libro {
    /**
     * atributos de la clase
     */
    private String ISBN;
    private String titulo;
    private Autor autor;
    private double precio;
    
    /**
     * constructor por defecto
     */
    public Libro(){
    }
    /**
     * constructor con parametros
     * @param ISBN se le asigna al atributo ISBN del libro
     * @param titulo se le asigna al atributo titulo del libro
     * @param autor se le asigna al atributo autor del libro
     * @param precio se le asigna al atributo precio del libro
     */
    public Libro(String ISBN, String titulo, Autor autor, double precio) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    /**
     * @return el valor del ISBN de la clase libro
     */
    public String getISBN() {
        return ISBN;
    }
    /**
     * @param ISBN se le asigna al atributo ISBN de la clase Libro
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    /**
     * @return el valor del titulo de la clase Libro
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * @param titulo se le asigna al atributo titulo de la clase Libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * @return el valor del autor de la clase Libro
     */
    public Autor getAutor() {
        return autor;
    }
    /**
     * @param autor se le asigna al atributo autor de la clase Libro
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    /**
     * @return el valor del precio de la clase Libro
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * @param precio se le asigna al atributo precio de la clase Libro
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

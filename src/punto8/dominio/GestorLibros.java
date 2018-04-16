/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto8.dominio;

import java.util.ArrayList;

/**
 * 
 * @author Sergio Romero
 */
public class GestorLibros {
    private ArrayList<Libro> lista = new ArrayList();
    
    //agrega objetos libro al arraylist
    public void agregarLibro(Libro libro){
        this.lista.add(libro);
    }
    //muestra los libros en formato tabla
    public void mostrarLibros(ArrayList<Libro> list){
        System.out.println("\nISBN\t\t\tTitulo\t\t\tAutor\t\t\tPrecio");
        System.out.println("---------------------------------------------------------------------------------------");
        for (Libro objLibro : list){
            System.out.println(objLibro.getISBN()+"\t"+objLibro.getTitulo()+"\t\t"+objLibro.getAutor()+"\t\t"+objLibro.getPrecio());
        }
    }

    /**
     * @return the lista
     */
    public ArrayList<Libro> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList<Libro> lista) {
        this.lista = lista;
    }
    
}

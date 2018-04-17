/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto8.utils;

import java.util.ArrayList;
import punto8.dominio.Libro;

/**
 * 
 * @author Sergio Romero
 */
public class GestorLibros {
    private ArrayList<Libro> lista = new ArrayList();
    
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
    
    /**
     * agrega objetos libro al arraylist
     * @param libro para guardar en el arraylist
     */
    public void agregarLibro(Libro libro){
        this.lista.add(libro);
    }
    
    /**
     * metodo que muestra los libros que contiene el arraylist en formato tabla
     */
    public void mostrarLibros(){
        System.out.println("\nISBN\t\t\tTitulo\t\t\t\tAutor\t\t\t\tPrecio");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        for (Libro objLibro : lista){
            System.out.println(objLibro.getISBN()+"\t"+objLibro.getTitulo()+"\t\t"+objLibro.getAutor()+"\t\t"+objLibro.getPrecio());
        }
    }
    /**
     * Metodo para buscar un libro por medio de su titulo en una lista de libros
     * Si lo encuentra muestra los datos del libro,
     * en caso de no encontrarlo muestra un mensaje
     * @param titulo
     */
    public void buscarLibro(String titulo){
        boolean encontrado = false; //variable para determinar si se encontro el libro
        for(Libro objLibro : lista){
            if( objLibro.getTitulo().equalsIgnoreCase(titulo)){//compara el titulo a buscar con los titulos de los libros almacenados
                //muestra los datos de los libros encontrados
                System.out.println("\n----------------------------------");
                System.out.println("ISBN: " + objLibro.getISBN());
                System.out.println("Titulo: " + objLibro.getTitulo());
                System.out.println("Autor: " + objLibro.getAutor());
                System.out.println("Precio: " + objLibro.getPrecio());
                System.out.println("----------------------------------");
                encontrado = true;
                //break;
            }   
        }
        if(encontrado == false)//en caso de no encontrar el libro
            System.out.println("\nNo se encontro el Libro...");
    }
}

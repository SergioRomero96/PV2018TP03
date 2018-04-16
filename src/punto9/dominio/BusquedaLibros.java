/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto9.dominio;

import java.util.ArrayList;
import punto8.dominio.Libro;

/**
 * 
 * @author Sergio Romero
 */
public class BusquedaLibros {
    private String Titulo;
    
    public BusquedaLibros(){
        
    }
    public BusquedaLibros(String Titulo){
        this.Titulo = Titulo;
    }
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    
    public void buscarLibro(ArrayList<Libro> libros, String titulo){
        boolean encontrado = false; //variable para determinar si se encontro el libro
        for(Libro objLibro : libros){
            if( objLibro.getTitulo().equalsIgnoreCase(titulo)){//compara el titulo a buscar con los titulos de los libros almacenados
                //muestra los datos de los libros encontrados
                System.out.println("----------------------------------");
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

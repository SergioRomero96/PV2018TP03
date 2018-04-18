/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto8.test;

import punto8.dominio.Autor;
import punto8.utils.GestorLibros;
import punto8.dominio.Libro;

/**
 * 
 * @author Sergio Romero
 */
public class ProgramaPrincipal {
    public static void main(String[] args){
        GestorLibros gestor = new GestorLibros();//objeto para administrar los libros

        gestor.agregarLibro(new Libro("978-950-1111-11-1", "Cien años de soledad",new Autor("Garcia Marquez", "Gabriel" ) , 270));
        gestor.agregarLibro(new Libro("978-950-2222-22-2", "La Isla del Tesoro",new Autor ("Stevenson", "Robert"), 345));
        gestor.agregarLibro(new Libro("978-950-3333-33-3", "Olvidado Rey Gudú", new Autor ("Matute", "Ana Maria "), 200));
        gestor.agregarLibro(new Libro("978-950-4444-44-4", "El viejo y el mar", new Autor ("Hemingway","Ernest" ), 318));
        gestor.agregarLibro(new Libro("978-950-5555-55-5", "El Ruido y la furia", new Autor("Faulkner", "William "), 320));
        gestor.agregarLibro(new Libro("978-950-6666-66-6", "Tres tristes tigres", new Autor("Infante", "Guillermo"), 180));
        
        gestor.mostrarLibros(); // se muestra la lista de los libros almacenados
       
    }
}

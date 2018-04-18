/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto9.test;

import java.util.Scanner;
import punto8.dominio.Autor;
import punto8.dominio.Libro;
import punto8.utils.GestorLibros;

/**
 * 
 * @author Sergio Romero
 */
public class ProgramaPrincipal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//objeto para leer datos por teclado
        GestorLibros gestor = new GestorLibros();//objeto para almacenar, mostrar..etc los libros 
        //se cargan los datos de varios libros que luego son almacenados en una lista
        gestor.agregarLibro(new Libro("978-950-1111-11-1", "Cien años de soledad",new Autor("Garcia Marquez", "Gabriel" ) , 270));
        gestor.agregarLibro(new Libro("978-950-2222-22-2", "La Isla del Tesoro",new Autor ("Stevenson", "Robert"), 345));
        gestor.agregarLibro(new Libro("978-950-3333-33-3", "Olvidado Rey Gudú", new Autor ("Matute", "Ana Maria "), 200));
        gestor.agregarLibro(new Libro("978-950-4444-44-4", "El viejo y el mar", new Autor ("Hemingway","Ernest" ), 318));
        gestor.agregarLibro(new Libro("978-950-5555-55-5", "El Ruido y la furia", new Autor("Faulkner", "William "), 320));
        gestor.agregarLibro(new Libro("978-950-6666-66-6", "Tres tristes tigres", new Autor("Infante", "Guillermo"), 180));
        
        System.out.print("\nIngrese el titulo del libro a buscar: ");       
        gestor.buscarPorTitulo(scanner.nextLine()); //se ingresa el titulo del libro a buscar por parametro
    }
}

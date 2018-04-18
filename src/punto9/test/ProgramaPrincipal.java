/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto9.test;

import java.util.Scanner;
import punto8.dominio.Libro;
import punto8.utils.GestorLibros;

/**
 * 
 * @author Sergio Romero
 */
public class ProgramaPrincipal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//objeto para leer datos por teclado
        GestorLibros objGestor = new GestorLibros();//objeto para almacenar, mostrar..etc los libros 

        Libro objLibro;
        objGestor.agregarLibro(objLibro = new Libro("978-950-1111-11-1", "Cien años de soledad", "Gabriel Garcia Marquez", 270));
        objGestor.agregarLibro(objLibro = new Libro("978-950-2222-22-2", "La Isla del Tesoro", "Robert Stevenson", 345));
        objGestor.agregarLibro(objLibro = new Libro("978-950-3333-33-3", "Olvidado Rey Gudú", "Ana Maria Matute", 200));
        objGestor.agregarLibro(objLibro = new Libro("978-950-4444-44-4", "El viejo y el mar", "Ernest Hemingway", 318));
        objGestor.agregarLibro(objLibro = new Libro("978-950-5555-55-5", "El Ruido y la furia", "William Faulkner", 320));
        objGestor.agregarLibro(objLibro = new Libro("978-950-6666-66-6", "Tres tristes tigres", "Guillermo Infante", 180));
        
        System.out.print("\nIngrese el titulo del libro a buscar: ");       
        objGestor.buscarPorTitulo(scanner.nextLine()); //se ingresa el titulo del libro a buscar por parametro
    }
}

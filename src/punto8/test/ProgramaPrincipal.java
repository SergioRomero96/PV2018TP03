/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto8.test;

import java.util.Scanner;
import punto8.dominio.GestorLibros;
import punto8.dominio.Libro;

/**
 * 
 * @author Sergio Romero
 */
public class ProgramaPrincipal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//objeto para leer por consola
        GestorLibros gestor = new GestorLibros();//objeto para administrar los libros
        int i = 0;
        String isbn;
        String titulo;
        String autor;
        double precio;
        char resp ;
        do{
          
            System.out.println("\nLibro N°"+ (++i));
            
            do{
                System.out.print("Ingrese el ISBN(978-950-####-##-#): 978-950-");
                isbn = "978-950-"+scanner.next();//se asigna los prefijos del isbn + los numeros faltantes #
            }while(!isbn.matches("\\d{3}-\\d{3}-\\d{4}-\\d{2}-\\d{1}"));//se pide que cumpla con el formato de isbn
            scanner.skip("\n");//Método que omite el salto de linea 
            do{
                System.out.print("Ingrese el Titulo(15 caracteres MAX): ");
                titulo = scanner.nextLine();  
            }while(titulo.isEmpty()|| titulo.length() > 15);//se valida que no este vacio o no supere los 15caracteres
            do{
                System.out.print("Ingrese el Autor(15 caracteres MAX): ");
                autor = scanner.nextLine(); 
            }while(autor.isEmpty() || autor.length() > 15);//se valida que no este vacio o no supere los 15caracteres
            do{
                System.out.print("Ingrese el precio(> $0): ");
                precio = scanner.nextDouble();  
            }while(precio <= 0);//se valida que el precio no sea menor o igual a $0
            
            Libro objLibro = new Libro(isbn, titulo, autor, precio); //se carga el constructor con parametros
            gestor.agregarLibro(objLibro); //agrego a la lista los objetos libros
            System.out.print("\nDesea Continuar S/N?: ");
            resp = scanner.next().charAt(0);
        }while(resp != 'N');
        gestor.mostrarLibros(gestor.getLista()); // se muestra la lista de los libros almacenados
       
    }
}

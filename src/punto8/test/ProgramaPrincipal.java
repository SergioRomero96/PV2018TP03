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
        Scanner scanner = new Scanner(System.in);
        GestorLibros gestor = new GestorLibros();
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
                isbn = "978-950-"+scanner.next();
            }while(!isbn.matches("\\d{3}-\\d{3}-\\d{4}-\\d{2}-\\d{1}"));
            //Método que se salta la lectura de n bytes del scanner.
            scanner.skip("\n");
            do{
                System.out.print("Ingrese el Titulo(15 caracteres MAX): ");
                titulo = scanner.nextLine();  
            }while(titulo.isEmpty()|| titulo.length() > 15);
            do{
                System.out.print("Ingrese el Autor(15 caracteres MAX): ");
                autor = scanner.nextLine(); 
            }while(autor.isEmpty() || autor.length() > 15);
            do{
                System.out.print("Ingrese el precio(> $0): ");
                precio = scanner.nextDouble();  
            }while(precio <= 0);
            
            Libro objLibro = new Libro(isbn, titulo, autor, precio); //obj libro es n 
            gestor.agregarLibro(objLibro); //agrego a la lista los objetos
            System.out.print("\nDesea Continuar S/N?: ");
            resp = scanner.next().charAt(0);
        }while(resp != 'N');
        gestor.mostrarLibros(gestor.getLista());
       
    }
}

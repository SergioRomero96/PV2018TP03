

package punto12.test;

import java.util.ArrayList;
import java.util.Scanner;
import punto12.dominio.BusquedaLibro;
import punto12.dominio.NuevoLibro;


public class ProgramaPrincipal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BusquedaLibro objBusqueda = new BusquedaLibro();
        ArrayList<NuevoLibro> lista = new ArrayList<>();
        int i = 0;
        String isbn;
        String titulo;
        String autor;
        double precio;
        String categoria;
        char resp ;
        String[] categorias = {"Idioma", "Programacion", "Geografia", "Matematica", "Musica", "Historia", "Economia","Otros"};
        do{
          
            System.out.println("\nLibro N°"+ (++i));
            
            do{
                System.out.print("Ingrese el ISBN(978-950-####-##-#): 978-950-");
                isbn = "978-950-"+scanner.next();
            }while(!isbn.matches("\\d{3}-\\d{3}-\\d{4}-\\d{2}-\\d{1}"));
            scanner.skip("\n");
            do{
                System.out.print("Ingrese el Titulo(15 caracteres MAX): ");
                titulo = scanner.nextLine();  
            }while(titulo.isEmpty() || titulo.length() > 15);
            do{
                System.out.print("Ingrese el Autor(15 caracteres MAX): ");
                autor = scanner.nextLine(); 
            }while(autor.isEmpty() || autor.length() > 15);
            do{
                System.out.print("Ingrese el precio(> $0): ");
                precio = scanner.nextDouble();  
            }while(precio <= 0);
            
            System.out.println("Categorias: ");
            for(String cadena : categorias){
                System.out.println("\t"+cadena);
            }
            boolean band = false;
            do{
                System.out.print("Ingrese una categoria: ");
                categoria = scanner.next();
                for (String categoria1 : categorias) {
                    if(categoria1.equals(categoria)){
                        band = true;
                        break;
                    }
                        
                }
            }while(band == false);
            
            
            
            NuevoLibro objLibro = new NuevoLibro(isbn, titulo, autor, precio, categoria); //obj libro es n 
            lista.add(objLibro); //agrego a la lista los objetos
            System.out.print("\nDesea Continuar S/N?: ");
            resp = scanner.next().charAt(0);
        }while(resp != 'N');
        scanner.skip("\n");
        objBusqueda.buscarLibro(lista);
    }
}

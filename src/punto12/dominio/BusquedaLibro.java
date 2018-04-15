


package punto12.dominio;

import java.util.ArrayList;
import java.util.Scanner;
import punto8.dominio.Libro;


public class BusquedaLibro {
    private Libro libro;
    private String categoria;

    public BusquedaLibro() {
    }
    
    public BusquedaLibro(Libro libro, String categoria) {
        this.libro = libro;
        this.categoria = categoria;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void buscarLibro(ArrayList<NuevoLibro> lista){
        Scanner input = new Scanner(System.in);
        System.out.println("\n1-Buscar por Categoria");
        System.out.println("2-Buscar por Titulo");
        System.out.println("3-Buscar por Categoria y Titulo");
        System.out.println("4-Buscar por Autor");
        System.out.print("Ingrese una Opcion: ");
        int opc = input.nextInt();
        switch (opc){
            case 1: buscarPorCategoria(lista); break;
            case 2: buscarPorTitulo(lista); break;
            case 3: buscarPorCategoriayTitulo(lista); break;
            case 4: buscarPorAutor(lista); break;
            default: System.out.println("OPCION INCORRECTA...");
        }
    }
    
    public void buscarPorCategoria(ArrayList<NuevoLibro> lista){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la categoria: ");
        String categoria = input.next();
        boolean encontrado = false;
        for(NuevoLibro objLibro : lista){
            if(objLibro.getCategoria().equals(categoria)){
                System.out.println("----------------------------------");
                System.out.println("ISBN: " + objLibro.getISBN());
                System.out.println("Titulo: " + objLibro.getTitulo());
                System.out.println("Autor: " + objLibro.getAutor());
                System.out.println("Precio: " + objLibro.getPrecio());
                System.out.println("Categoria: " + objLibro.getCategoria());
                System.out.println("----------------------------------");
                encontrado = true;
            }
        }

        if(encontrado == false)
            System.out.println("\nNo se encontro el Libro...");
    }
    
    public void buscarPorTitulo(ArrayList<NuevoLibro> lista){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el titulo: ");
        String titulo = input.nextLine();
        boolean encontrado = false;
        for(NuevoLibro objLibro : lista){
            if( objLibro.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("----------------------------------");
                System.out.println("ISBN: " + objLibro.getISBN());
                System.out.println("Titulo: " + objLibro.getTitulo());
                System.out.println("Autor: " + objLibro.getAutor());
                System.out.println("Precio: " + objLibro.getPrecio());
                System.out.println("Categoria: " + objLibro.getCategoria());
                System.out.println("----------------------------------");
                encontrado = true;
                //break;
            }   
        }
        if(encontrado == false)
            System.out.println("\nNo se encontro el Libro...");
    }
    
    public void buscarPorCategoriayTitulo(ArrayList<NuevoLibro> lista){
        Scanner input = new Scanner(System.in);
        System.out.print("\nIngrese la categoria: ");
        String categ = input.next();
        input.skip("\n");
        System.out.print("Ingrese el titulo: ");
        String titulo = input.nextLine();
        boolean encontrado = false;
        for(NuevoLibro objLibro : lista){
            if(objLibro.getCategoria().equals(categ) && objLibro.getTitulo().equals(titulo)){
                System.out.println("----------------------------------");
                System.out.println("ISBN: " + objLibro.getISBN());
                System.out.println("Titulo: " + objLibro.getTitulo());
                System.out.println("Autor: " + objLibro.getAutor());
                System.out.println("Precio: " + objLibro.getPrecio());
                System.out.println("Categoria: " + objLibro.getCategoria());
                System.out.println("----------------------------------");
                encontrado = true;
            }
        }

        if(encontrado == false)
            System.out.println("\nNo se encontro el Libro...");
    }
    
    public void buscarPorAutor(ArrayList<NuevoLibro> lista){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el Autor: ");
        String autor = input.nextLine();
        boolean encontrado = false;
        for(NuevoLibro objLibro : lista){
            if(objLibro.getAutor().equals(autor)){
                System.out.println("----------------------------------");
                System.out.println("ISBN: " + objLibro.getISBN());
                System.out.println("Titulo: " + objLibro.getTitulo());
                System.out.println("Autor: " + objLibro.getAutor());
                System.out.println("Precio: " + objLibro.getPrecio());
                System.out.println("Categoria: " + objLibro.getCategoria());
                System.out.println("----------------------------------");
                encontrado = true;
            }
        }

        if(encontrado == false)
            System.out.println("\nNo se encontro el Libro...");
    }
}

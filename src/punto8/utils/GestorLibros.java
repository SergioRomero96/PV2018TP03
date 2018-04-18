/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto8.utils;

import java.util.ArrayList;
import java.util.Scanner;
import punto12.dominio.NuevoLibro;
import punto8.dominio.Libro;

/**
 * 
 * @author Sergio Romero
 */
public class GestorLibros {
    private ArrayList<Libro> lista = new ArrayList();
    private ArrayList<NuevoLibro> lista2 = new ArrayList();
    
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
     * @return the lista2
     */
    public ArrayList<NuevoLibro> getLista2() {
        return lista2;
    }

    /**
     * @param lista2 the lista2 to set
     */
    public void setLista2(ArrayList<NuevoLibro> lista2) {
        this.lista2 = lista2;
    }
    
    /**
     * agrega objetos libro al arraylist
     * @param libro para guardar en el arraylist
     */
    public void agregarLibro(Libro libro){
        lista.add(libro);
    }
      /**
     * agrega objetos libro al arraylist
     * @param libro para guardar en el arraylist
     */
    public void agregarLibro2(NuevoLibro libro){
        lista2.add(libro);
    }
    
    /**
     * metodo que muestra los libros que contiene el arraylist en formato tabla
     */
    public void mostrarLibros(){
        System.out.println("\nISBN\t\t\tTitulo\t\t\t\tAutor\t\t\t\tPrecio");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        for (Libro objLibro : getLista()){
            System.out.println(objLibro.getISBN()+"\t"+objLibro.getTitulo()+"\t\t"+objLibro.getAutor().getApelido()+" "+objLibro.getAutor().getNombre()+"\t\t"+objLibro.getPrecio());
        }
    }
    /**
     * Metodo para buscar un libro por medio de su titulo en una lista de libros
     * Si lo encuentra muestra los datos del libro,
     * en caso de no encontrarlo muestra un mensaje
     * @param titulo
     */
    public void buscarPorTitulo(String titulo){
        boolean encontrado = false; //variable para determinar si se encontro el libro
        for(Libro objLibro : getLista()){
            if( objLibro.getTitulo().equalsIgnoreCase(titulo)){//compara el titulo a buscar con los titulos de los libros almacenados
                //muestra los datos de los libros encontrados
                System.out.println("\n----------------------------------");
                System.out.println("ISBN: " + objLibro.getISBN());
                System.out.println("Titulo: " + objLibro.getTitulo());
                System.out.println("Autor: " + objLibro.getAutor().getApelido()+" "+objLibro.getAutor().getNombre());
                System.out.println("Precio: " + objLibro.getPrecio());
                System.out.println("----------------------------------");
                encontrado = true;
                //break;
            }   
        }
        if(encontrado == false)//en caso de no encontrar el libro
            System.out.println("\nNo se encontro el Libro...");
    }
    
    /**
     * metodo para buscar por diferentes opciones, autor o categoria
     */
    public void buscarLibro(){
        Scanner input = new Scanner(System.in); 
        //opciones para buscar
        System.out.println("\n1-Buscar por Categoria");
        System.out.println("2-Buscar por Autor");
        System.out.print("Ingrese una Opcion: ");
        int opc = input.nextInt();
        switch (opc){
            case 1: buscarPorCategoria(); break;
            case 2: buscarPorAutor(); break;
            default: System.out.println("OPCION INCORRECTA...");
        }
    }
    /**
     * metodo para buscar una categoria ingresada y mostrar los datos
     * de los libros que pertenecen a esa categoria.
     * Caso contrario mostrara un mensaje que no se encontro el libro
     */
    public void buscarPorCategoria(){
        Scanner input = new Scanner(System.in);
        String[] categorias = {"Programacion", "Drama", "Accion", "Suspenso", "Aventura", "Terror"};
        System.out.println("\nCategorias Disponibles: ");
        for(String categ : categorias){
            System.out.println(categ);
        }
        boolean band = false; // bandera para determinar si se encontro el libro
        String categoria;
        do{
            System.out.print("\nIngrese la categoria: ");
            categoria = input.next(); 
            for(String categ : categorias){
                if (categ.equals(categoria))
                    band = true;
            }
            if (band == false)
                System.out.println("\nIngrese una categoria valida!!");
        }while(!band);
        
        
        boolean encontrado = false;
        for(NuevoLibro objLibro : lista2){
            if(objLibro.getCategoria().equals(categoria)){
                System.out.println("----------------------------------");
                System.out.println("ISBN: " + objLibro.getISBN());
                System.out.println("Titulo: " + objLibro.getTitulo());
                System.out.println("Autor: " + objLibro.getAutor().getApelido()+" "+objLibro.getAutor().getNombre());
                System.out.println("Precio: " + objLibro.getPrecio());
                System.out.println("Categoria: " + objLibro.getCategoria());
                System.out.println("----------------------------------");
                encontrado = true;
            }
        }

        if(encontrado == false)
            System.out.println("\nNo se encontro el Libro...");
    }
 

    /**
     * metodo para buscar por el apellido de un autor ingresado
     * y mostrar los datos de los libro que pertenecen a ese autor.
     * Caso contrario mostrara un mensaje que no se encontro el libro
     */
    public void buscarPorAutor(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nIngrese el/los apellido/s del Autor: ");
        String apellido = input.nextLine();
        boolean encontrado = false; // bandera para determinar si se encontro el libro
        for(NuevoLibro objLibro : lista2){
            if(objLibro.getAutor().getApelido().equals(apellido)){
                System.out.println("----------------------------------");
                System.out.println("ISBN: " + objLibro.getISBN());
                System.out.println("Titulo: " + objLibro.getTitulo());
                System.out.println("Autor: " + objLibro.getAutor().getApelido()+" "+objLibro.getAutor().getNombre());
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

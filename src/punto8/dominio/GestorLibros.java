/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto8.dominio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Sergio Romero
 */
public class GestorLibros {
    private ArrayList<Libro> lista = new ArrayList();
    
    public void agregarLibro(Libro libro){
        this.lista.add(libro);
    }
    
    public void mostrarLibros(ArrayList<Libro> list){
        System.out.println("\nISBN\t\t\tTitulo\t\t\tAutor\t\t\tPrecio");
        System.out.println("---------------------------------------------------------------------------------------");
        for (Libro objLibro : list){
            System.out.println(objLibro.getISBN()+"\t"+objLibro.getTitulo()+"\t\t"+objLibro.getAutor()+"\t\t"+objLibro.getPrecio());
        }
    }

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
    public void buscarLibro(){
        Scanner scanner=new Scanner(System.in);
        String tit;
       scanner.skip("\n");
            do{
                System.out.print("Ingrese el Titulo a buscar (15 caracteres MAX): ");
                tit = scanner.nextLine();  
            }while(tit.isEmpty()|| tit.length() > 15);
    for(Libro l:lista){
        if(l.getTitulo().toUpperCase().equals(tit.toUpperCase())){
            System.out.println("Si se econtro el libro");
            mostrarLibros(lista);
        }else{
            System.out.println("No se encontro el libro");
        }
    }
    }
    
}



package punto12.test;


import punto12.dominio.NuevoLibro;
import punto8.dominio.Autor;
import punto8.utils.GestorLibros;


public class ProgramaPrincipal {
    public static void main(String[] args){
        GestorLibros gestor = new GestorLibros();//objeto para administrar los libros
        
        //Se cargan los datos de varios libros para ser almacenados en una lista
        gestor.agregarLibro2(new NuevoLibro("978-950-1111-11-1", "La Biblia de PHP",new Autor("Garcia Marquez", "Gabriel") , 270,"Programacion"));
        gestor.agregarLibro2(new NuevoLibro("978-950-2222-22-2", "La Isla del Tesoro",new Autor("Stevenson", "Robert"), 345, "Aventura"));
        gestor.agregarLibro2(new NuevoLibro("978-950-3333-33-3", "Programacion en C++",new Autor("Joyanes Aguilar", "Luis"), 200, "Programacion"));
        gestor.agregarLibro2(new NuevoLibro("978-950-4444-44-4", "El viejo y el mar",new Autor("Hemingway", "Ernest"), 318, "Drama"));
        gestor.agregarLibro2(new NuevoLibro("978-950-5555-55-5", "El Ruido y la furia",new Autor("Faulkner", "William"), 320, "Accion"));
        gestor.agregarLibro2(new NuevoLibro("978-950-6666-66-6", "Tres tristes tigres",new Autor("Infante", "Guillermo"), 180, "Drama"));
        gestor.agregarLibro2(new NuevoLibro("978-950-7777-77-7", "Dracula",new Autor("Stoker", "Bram"), 278, "Terror"));
        gestor.agregarLibro2(new NuevoLibro("978-950-8888-88-8", "Un final Perfecto",new Autor("Katzebach", "John"), 366, "Suspenso"));
        
        gestor.buscarLibro();//se llama al metodo buscarLibro para buscar por diferentes opciones
        
    }
}

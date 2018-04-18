

package punto12.test;


import punto12.dominio.NuevoLibro;
import punto8.utils.GestorLibros;


public class ProgramaPrincipal {
    public static void main(String[] args){
        GestorLibros gestor = new GestorLibros();//objeto para administrar los libros

        NuevoLibro objLibro;
        gestor.agregarLibro2(objLibro = new NuevoLibro("978-950-1111-11-1", "La Biblia de PHP", "Gabriel Garcia Marquez", 270,"Programacion"));
        gestor.agregarLibro2(objLibro = new NuevoLibro("978-950-2222-22-2", "La Isla del Tesoro", "Robert Stevenson", 345, "Aventura"));
        gestor.agregarLibro2(objLibro = new NuevoLibro("978-950-3333-33-3", "Programacion en C++", "Joyanes Luis Aguilar", 200, "Programacion"));
        gestor.agregarLibro2(objLibro = new NuevoLibro("978-950-4444-44-4", "El viejo y el mar", "Ernest Hemingway", 318, "Drama"));
        gestor.agregarLibro2(objLibro = new NuevoLibro("978-950-5555-55-5", "El Ruido y la furia", "William Faulkner", 320, "Accion"));
        gestor.agregarLibro2(objLibro = new NuevoLibro("978-950-6666-66-6", "Tres tristes tigres", "Guillermo Infante", 180, "Drama"));
        gestor.agregarLibro2(objLibro = new NuevoLibro("978-950-7777-77-7", "Dracula", "Stoker Bram", 278, "Terror"));
        gestor.agregarLibro2(objLibro = new NuevoLibro("978-950-8888-88-8", "Un final Perfecto", "Katzebach John", 366, "Suspenso"));
        
        gestor.buscarLibro();
        
    }
}

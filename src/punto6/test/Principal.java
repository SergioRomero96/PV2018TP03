package punto6.test;

import punto6.dominio.GestorRectangulo;

public class Principal {

    public static void main(String[] args) {
        GestorRectangulo gestor = new GestorRectangulo();
       //se cargaran los objetos a la lista
        gestor.cargarDatos();
        //se mostrata por pantalla todo el contenido que se encuentra en el ArrayList llamdo gestor
        gestor.mostarDatos();
        //permite eliminar un triangulo mediante el numero re rectangulo ingresado por el usuario
        gestor.eliminarTriangulo();
        //una ves eliminado algun datos se actualiza la lista y muestra los datos actualizados
        gestor.mostarDatos();

    }
}

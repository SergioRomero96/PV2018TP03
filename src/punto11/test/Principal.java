
package punto11.test;

import punto11.dominio.GestorZapatilla;

public class Principal {
    public static void main(String[] args) {
     //se llama a la clase GestorZapatilla 
        GestorZapatilla gestor =new GestorZapatilla();
        //se solicita al metodo cargar el cual permite la carga de datos
        gestor.cargarZapatallias();
        //muestra por pantalla los datos cargados
        gestor.mostarLista(gestor.getLista());
    }
}

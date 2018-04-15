
package punto12.test;

import punto11.dominio.GestorZapatilla;


public class ProgramaPrincipal {
    public static void main(String[] args) {
        GestorZapatilla gestor=new GestorZapatilla();
        gestor.cargarZapatallias();
        gestor.mostarLista(gestor.getLista());
    }
}

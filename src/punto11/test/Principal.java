/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto11.test;

import punto11.dominio.GestorZapatilla;

/**
 *
 * @author LENOVO
 */
public class Principal {
    public static void main(String[] args) {
        GestorZapatilla gestor =new GestorZapatilla();
        gestor.cargarZapatallias();
        gestor.mostarLista(gestor.getLista());
    }
}

package punto5.test;


import java.util.Scanner;
import punto5.dominio.GestorCirculo;


public class ProgramaPrincipal {
    public static void main(String[] args){
        char rsp;double radio;String color;
        Scanner input=new Scanner(System.in);
      GestorCirculo gestor=new GestorCirculo();
      gestor.cargarDatos();
      gestor.mostrarLista(gestor.getList());
    }
    
}

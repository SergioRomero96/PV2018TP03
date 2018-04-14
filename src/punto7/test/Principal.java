
package punto7.test;


import punto7.dominio.GestorAuto;
import java.util.Scanner;



public class Principal {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        GestorAuto vector =new GestorAuto(6);
        vector.cargaDatos();
        vector.mostrar();
        vector.cambiarDatos();
    }

}

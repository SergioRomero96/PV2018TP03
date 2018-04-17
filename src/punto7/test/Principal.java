package punto7.test;
/**
 *
 * @author LENOVO
 */
import punto7.dominio.GestorAuto;

public class Principal {

    public static void main(String[] args) {
        //se define un vetor de GestorAuto con tamaño de 6
        GestorAuto vector = new GestorAuto(6);
        //permitira cargar datos al vector
        vector.cargaDatos();
        //se mostrara por pantalla los datos ingresados 
        vector.mostrar();
        //perimete cambiar datos de un determinado auto 
        vector.cambiarDatos();
    }

}

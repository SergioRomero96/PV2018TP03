package punto3.test;
/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
import punto3.dominio.Triangulo;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();
        boolean band;
        System.out.println("Ingrese el primer lado"); //se solicita el ingreso de los tres lados de un triangulo
        triangulo.setLado1(input.nextInt());
        System.out.println("Ingrese el segundo lado");
        triangulo.setLado2(input.nextInt());
        int ladob = input.nextInt();
        System.out.println("Ingrese el tercer lado");
        triangulo.setLado3(input.nextInt());
        band = triangulo.verificarTriangulo(); //verifica dado los lados ingresados si forman un triangulo
        //si devuelve true entonces si es un tringulo sino no
        if (band == true) {
            System.out.println("ES UN TRIANGULO");
            System.out.println("el perimetro es:" + triangulo.obtenerPerimetro());
        } else {
            System.out.println("No es un TRIANGULO Debe ingresar datos validos");
        }

    }
}

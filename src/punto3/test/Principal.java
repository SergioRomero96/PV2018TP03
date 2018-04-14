
package punto3.test;

import java.util.Scanner;
import punto3.dominio.Triangulo;


public class Principal {
     public static void main(String[] args) {
     Scanner input=new Scanner(System.in); 
     Triangulo triangulo=new Triangulo();
     boolean band;
        System.out.println("Ingrese el primer lado"); //se solicita el ingreso de los tres lados de un triangulo
        int ladoa=input.nextInt();
        System.out.println("Ingrese el segundo lado");
        int ladob=input.nextInt();
        System.out.println("Ingrese el tercer lado");
        int ladoc=input.nextInt();
        triangulo.setLado1(ladoa);
        triangulo.setLado2(ladob);
        triangulo.setLado3(ladoc);
        band=triangulo.verificarTriangulo(); //verifica dado los lados ingresados si forman un triangulo
        if(band==true){
            System.out.println("ES UN TRIANGULO");
            System.out.println("el perimetro es:"+triangulo.obtenerPerimetro());
        }else{
            System.out.println("Deve ingresar datos validos");
        }
                
    }
}

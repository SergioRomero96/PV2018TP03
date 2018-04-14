
package punto6.test;

import java.util.ArrayList;
import java.util.Scanner;
import punto6.dominio.TablaRectangulo;


public class Principal {
     public static void main(String[] args) {
        int cont=0;
        Scanner input=new Scanner(System.in);
        TablaRectangulo bj1=new TablaRectangulo("1","6","1","2","3");
        TablaRectangulo bj2=new TablaRectangulo("2","5","1","2","4");
        TablaRectangulo bj3=new TablaRectangulo("3","4","1","2","4");
        TablaRectangulo bj4=new TablaRectangulo("4","3","1","2","4");
        TablaRectangulo bj5=new TablaRectangulo("5","2","1","2","4");
        TablaRectangulo bj6=new TablaRectangulo("6","1","1","2","4");
        
        ArrayList<TablaRectangulo> listas=new ArrayList<>();
        listas.add(bj1);
        listas.add(bj2);
        listas.add(bj3);
        listas.add(bj4);
        listas.add(bj5);
        listas.add(bj6);
        
        for(TablaRectangulo elemento:listas){
            System.out.println("NUMERO DE RECTANGULO:"+cont);
            System.out.println(elemento);
            cont++;
        }
        System.out.println("Ingrese el numero de triangulo que desea eliminar");
        int i=input.nextInt();
        listas.remove(i);
        cont=0;
        for(TablaRectangulo elemento:listas){
             System.out.println("NUMERO DE RECTANGULO:"+cont);
            System.out.println(elemento);
             cont++;
        }
    }  
}

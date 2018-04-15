
package punto6.dominio;

import java.util.ArrayList;
import java.util.Scanner;
//se define el gestorde recatangulos
public class GestorRectangulo {
    ArrayList<TablaRectangulo> lista =new ArrayList();

    public ArrayList<TablaRectangulo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<TablaRectangulo> lista) {
        this.lista = lista;
    }
   
    public double calcularArea(double b,double h){
        return b*h;
    }
   
    public double calcularPerimetro(double b,double h){
        return 2 * b + 2 * h;
    }
    public double calcularPunto(double a,double b){
        return Math.sqrt(Math.pow(a-b, 2));
    }
    public void cargarDatos(){
       TablaRectangulo obj1=new TablaRectangulo(3,4,calcularPunto(3,4),calcularArea(3,4),calcularPerimetro(3,4));
       TablaRectangulo obj2=new TablaRectangulo(5,3,calcularPunto(5,3),calcularArea(3,5),calcularPerimetro(3,5));
       TablaRectangulo obj3=new TablaRectangulo(11,8,calcularPunto(11,8),calcularArea(8,11),calcularPerimetro(8,11)); 
       TablaRectangulo obj4=new TablaRectangulo(12,5,calcularPunto(12,5),calcularArea(5,12),calcularPerimetro(5,12));
       TablaRectangulo obj5=new TablaRectangulo(8,9,calcularPunto(8,9),calcularArea(9,8),calcularPerimetro(9,8));
            lista.add(obj1);
            lista.add(obj2);
            lista.add(obj3);
            lista.add(obj4);
            lista.add(obj5);
    }
    public void mostarDatos(){
        int i=0;
        System.out.println("\nN°\t\tBASE\t\tALTURA\t\tPUNTO\t\tSUPERFICIE\t\tPERIMETRO");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        for(TablaRectangulo a:lista){
            System.out.println(i+"\t\t"+a.getBase()+"\t\t"+a.getAltura()+"\t\t"+a.getPunto()+"\t\t"+a.getSuperficie()+"\t\t\t"+a.getPerimetro());
            i++;
        }
    }
    public void eliminarTriangulo(){
        Scanner input=new Scanner(System.in);
        int i;
        System.out.println("Ingrese el numero de tringulo que desea eliminar");
        i=input.nextInt();
        lista.remove(i);
    }
    
}

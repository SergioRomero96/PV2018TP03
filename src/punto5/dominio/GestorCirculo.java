
package punto5.dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorCirculo {
//se define una lista de Ciruclo
    ArrayList<Circulo> list =new ArrayList();
    
    public void agregarCirculo(Circulo circulo){
        this.list.add(circulo);
    }

    public ArrayList<Circulo> getList() {
        return list;
    }

    public void setList(ArrayList<Circulo> list) {
        this.list = list;
    }
    
    public double calcularSuperficie(double r){
        double s;
        s=Math.pow(r, 2)*Math.PI;
        return s;
    }
    //permite mostrar el contenido de la lista
    public void mostrarLista(ArrayList<Circulo> lista){
        int i=1;
        System.out.println("\nN°\tRadio\t\tColor\t\tSuperficie");
        System.out.println("******************************************************");
        for(Circulo c: lista){
            System.out.println(i+"\t"+c.getRadio()+"\t\t"+c.getColor()+"\t\t"+c.getSuperficie());
            i++;
        }
    }
    //se solicitara al usuario el ingreso de datos 
    public void cargarDatos(){
        Scanner input=new Scanner(System.in);
        char rsp;double radio;String color;
        //se repetira hasta que el usuario desea finalizar
        do{
          System.out.println("Ingrese el radio"); radio=input.nextDouble();
          System.out.println("Ingrese el color de Circulo");color=input.next();
          //obtenido el radio permite calcular la superficie
          double calculoSuperficie=calcularSuperficie(radio);
          //se crea un objeto el cual tiene cargado los datos ingresado por el usuario
          Circulo obj=new Circulo(radio,color,calculoSuperficie);
          //luego se agrega a la lista
          agregarCirculo(obj);
          System.out.println("Desea seguir S/N");
          rsp=input.next().charAt(0);
      }while(rsp!='N'&& rsp!='n');
    }
}

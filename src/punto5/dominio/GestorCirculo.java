
package punto5.dominio;
/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.Scanner;

public class GestorCirculo {
//se define una lista de Ciruclo
    ArrayList<Circulo> list =new ArrayList();
    /**
     *  permite la agregacion de datos a la lista
     * @param circulo 
     */
    public void agregarCirculo(Circulo circulo){
        this.list.add(circulo);
    }
/**
 * 
 * @return list
 */
    public ArrayList<Circulo> getList() {
        return list;
    }
/**
 * 
 * @param list the list to set
 */
    public void setList(ArrayList<Circulo> list) {
        this.list = list;
    }
    /**
     * Permiete calcular la superficie dado el radio ingresado
     * @param r
     * @return 
     */
    public double calcularSuperficie(double r){
        double s;
        s=Math.pow(r, 2)*Math.PI;
        return s;
    }
    //permite mostrar el contenido de la lista
 /**
  * Permite mostrar la lista de datos
  * @param lista 
  */
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
   /**
    * Permite la carga de datos
    */
    public void cargarDatos(){
        Scanner input=new Scanner(System.in);
        char rsp;double radio;String color;
        //se repetira hasta que el usuario desea finalizar
        do{
          System.out.println("Ingrese el radio"); radio=input.nextDouble();
          System.out.println("Ingrese el color de Circulo");color=input.next();
          //obtenido el radio permite calcular la superficie
          double calculoSuperficie=calcularSuperficie(radio);
          //datos precaragados
          Circulo obj2=new Circulo(5,"Rojo",calcularSuperficie(5));
          Circulo obj1=new Circulo(9,"Violeta",calcularSuperficie(9));
          //se crea un objeto el cual tiene cargado los datos ingresado por el usuario
          Circulo obj3=new Circulo(radio,color,calculoSuperficie);
          //luego se agrega a la lista
          agregarCirculo(obj1);
          agregarCirculo(obj2);
          agregarCirculo(obj3);
          System.out.println("Desea seguir S/N");
          rsp=input.next().charAt(0);
      }while(rsp!='N'&& rsp!='n');
    }
}

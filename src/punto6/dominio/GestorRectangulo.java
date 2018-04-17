
package punto6.dominio;
/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.Scanner;
//se define el gestor de recatangulos
public class GestorRectangulo {
    ArrayList<TablaRectangulo> lista =new ArrayList();
    //se definen los set y get para el ArrayList
    public ArrayList<TablaRectangulo> getLista() {
        return lista;
    }

    public void setLista(ArrayList<TablaRectangulo> lista) {
        this.lista = lista;
    }
   /**
    * El metodo requiere dos variables de ingrese para poder calcular el area
    * @param b 
    * @param h 
    * @return 
    */
    public double calcularArea(double b,double h){
        return b*h;
    }
   /**
    * para poder calcular el perimetro se requieren dos variables de ingreso  base y altura 
    * @param b base
    * @param h altura
    * @return 
    */
    public double calcularPerimetro(double b,double h){
        return 2 * b + 2 * h;
    }
    /**
     * Permite calcular la distancia que existe entre dos variables dadas
     * @param a 
     * @param b
     * @return 
     */
    public double calcularPunto(double a,double b){
        return Math.sqrt(Math.pow(a-b, 2));
    }
    //Se crean los objetos para poder luego almacenarlos en la lista
    public void cargarDatos(){
       TablaRectangulo obj1=new TablaRectangulo(3,4,calcularPunto(3,4),calcularArea(3,4),calcularPerimetro(3,4));
       TablaRectangulo obj2=new TablaRectangulo(5,3,calcularPunto(5,3),calcularArea(3,5),calcularPerimetro(3,5));
       TablaRectangulo obj3=new TablaRectangulo(11,8,calcularPunto(11,8),calcularArea(8,11),calcularPerimetro(8,11)); 
       TablaRectangulo obj4=new TablaRectangulo(12,5,calcularPunto(12,5),calcularArea(5,12),calcularPerimetro(5,12));
       TablaRectangulo obj5=new TablaRectangulo(8,9,calcularPunto(8,9),calcularArea(9,8),calcularPerimetro(9,8));
       
         //se agregan los objetos a las listas
            lista.add(obj1);
            lista.add(obj2);
            lista.add(obj3);
            lista.add(obj4);
            lista.add(obj5);
    }
    
    //permite mostrar por pantlla los objetos que estan alamacenados en el ArrayList
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
        int i;char op;
     do{
        System.out.println("Ingrese el numero de tringulo que desea eliminar");
        i=input.nextInt();
        //verifica si el numero ingresado es valido para poder elimniar un triangulo
        if(i>lista.size()-1){
            System.out.println("Deve ingresar un numero de triangulo valido");   
        }else{
            lista.remove(i);
            System.out.println("Se elimino los datos del triangulo numero:"+i);
        }
            System.out.println("Desea seguir elimniando S/N");
            op=input.next().charAt(0);
      }while(op!='N');
    }   
}

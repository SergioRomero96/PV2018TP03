
package punto11.dominio;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class GestorZapatilla {
    ArrayList<Zapatilla> lista =new ArrayList();
/**
 * Permite la carga de datos a la lista
 * @param zapatilla  
 */
    public void cargarLista(Zapatilla zapatilla){
        this.lista.add(zapatilla);
    }
    /**
     * Permite la carga de datos a la lista
     * @return ArrayList 
     */
    public ArrayList<Zapatilla> getLista() {
        return lista;
    }
/**
 * Permite poder mostrar el contenido de la lista
 * @param lista 
 */
    public void setLista(ArrayList<Zapatilla> lista) {
        this.lista = lista;
    }
    //el metodo permite mostrar los objetos almacenados en la lista
  /**
   * Permite mostar todo el contenido de la lista
   * @param lista 
   */
    
    public void mostarLista(ArrayList<Zapatilla> lista){
        int i=0;boolean bandera;
        //con \t\t permite realizar tabulacion
        System.out.println("\nN°\tMARCA\t\t\tNUMERO\t\tCOLOR\t\tTipo\t\tORIGINAL O COPIA");
        //recorrera todo lo que contiene la lista
        for(Zapatilla z:lista){
            System.out.println(i+"\t"+z.getMarca()+"\t\t\t"+z.getNumero()+"\t\t"+z.getColor()+"\t\t"+z.getTipo()+"\t\t"+z.getInformacion());
        i++;
        }
    }
    /**el metodo permite la carga de los datos de zapatillas
      la marca
      * el numero de zapatilla
      * color de zapatilla
      * tipo de zapatilla
      * original o replica
    **/   
public void cargarZapatallias(){
        Scanner scanner=new Scanner(System.in);
        String marcas,color,tipo,verificador;char op;
        double num;
        //el bucle repetira asta que el usuario no quiera cargar mas zapatillas
        do{
            System.out.println("\nIngrese la marca de la zapatilla");
            marcas=scanner.nextLine(); 
            System.out.println("Ingrese el numero de la zapatilla");
            num=scanner.nextDouble();
            System.out.println("Ingrese el color de la zapatilla");
            color=scanner.next().toLowerCase(); 
            System.out.println("Ingrese el tipo de zapatilla");
            tipo=scanner.next().toLowerCase(); 
            System.out.println("Ingrese si la zapatilla es replica o  es original");
            verificador=scanner.next().toLowerCase();
            Zapatilla z1=new Zapatilla(marcas,num,color,tipo,verificador);
            cargarLista(z1);
            System.out.println("Dese seguir cargando S/N");
            op=scanner.next().charAt(0);
            scanner.skip("\n");
        }while(op!='N');
    }
}


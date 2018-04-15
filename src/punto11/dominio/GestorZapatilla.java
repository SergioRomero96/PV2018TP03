
package punto11.dominio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class GestorZapatilla {
    ArrayList<Zapatilla> lista =new ArrayList();

    public void cargarLista(Zapatilla zapatilla){
        this.lista.add(zapatilla);
    }
   
    public void mostarLista(ArrayList<Zapatilla> lista){
        int i=0;String verifica;boolean bandera;String original;
        System.out.println("\nN°\t\tMARCA\t\tNUMERO\t\tCOLOR\t\tTipo\t\tORIGINAL O COPIA");
        for(Zapatilla z:lista){
            verifica=z.getMarca();
        bandera=verificarVOF(verifica);
        if(bandera==true){
            original="Original";
        }else{
            original="Copia";
        }
            System.out.println(i+"\t\t"+z.getMarca()+"\t\t"+z.getNumero()+"\t\t"+z.getColor()+"\t\t"+z.getTipo()+"\t\t"+original);
        i++;
        }
    }
    public ArrayList<Zapatilla> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Zapatilla> lista) {
        this.lista = lista;
    }
    public void cargarZapatallias(){
        Scanner scanner=new Scanner(System.in);
        String marcas,color,tipo;char op;
        double num;
        do{
        System.out.println("Ingrese la marca de la zapatilla");
        marcas=scanner.nextLine();
        System.out.println("Ingrese el numero de la zapatilla");
        num=scanner.nextDouble();
        System.out.println("Ingrese el color de la zapatilla");
        color=scanner.next();
        System.out.println("Ingrese el tipo de zapatilla");
        scanner.skip("\n");
        tipo=scanner.nextLine();
         Zapatilla z1=new Zapatilla(marcas,num,color,tipo);
         cargarLista(z1);
         System.out.println("Dese seguir cargando S/N");
         op=scanner.next().charAt(0);
        }while(op!='N');
    }
    public boolean verificarVOF(String buscar){
       boolean band=false;
        switch(buscar){
  case "Adidas":
                 band=true;break;
  case "Nike":
                band=true;break;
  case "Lqs Sporty":band=true;
  case "Reebok":band=true;break;
  case "Olympia":band=true;break;
  case "Ubro":band=true;break;
  case "New Balnace":band=true;break;
  case"Mizubo":band=true;break;          
        }
        
        return band;
    }
}


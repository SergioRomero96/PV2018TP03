
package punto7.dominio;

import java.util.Scanner;

public class GestorAuto {
    private Autos[] vector;
// cantidad de autos que se carga
    public GestorAuto(int a){
       vector=new Autos[a];
    }
  
    public Autos[] getVector() {
        return vector;
    }
    public void setVector(Autos[] vector) {
        this.vector = vector;
    }
    public void cargaDatos(){
       Autos auto1=new Autos("A00032","Ford",2018,"Gris","Diesel");
       Autos auto2=new Autos("A0048","Toyota",2016,"Negro","Super");
       Autos auto3=new Autos("A0087","Chevrolet",2015,"Morado","Diesel");
       Autos auto4=new Autos("A0087","Nisan",2010,"Azul","Super"); 
       Autos auto5=new Autos("A04863","BMW",2018,"Azul","Infinia");
       Autos auto6=new Autos("AB558","Bentley",2016,"Gris","Diese");
       vector[0]=auto1;
       vector[1]=auto2;
       vector[2]=auto3;
       vector[3]=auto4;
       vector[4]=auto5;
       vector[5]=auto6;
    }
     public void mostrar(){
         int i=0;
         System.out.println("\nN°\tPATENTE\t\tMARCA\t\tMODELO\t\tCOLOR\t\tCOMBUSTIBLE");
          System.out.println("---------------------------------------------------------------------------------------------------");
        for(Autos a:vector){
            System.out.println(i+"\t"+a.getPatente()+"\t\t"+a.getMarca()+"\t\t"+a.getModelo()+"\t\t"+a.getColor()+"\t\t"+a.getCombustible());
            i++;
        }
    }
     public void mostrarOpciones(){
         System.out.println("1)cambiar Patente");
         System.out.println("2)Cambiar Marca");
         System.out.println("3)Cambiar Modelo");
         System.out.println("4)Cambiar Color");
         System.out.println("5)Cambiar Combustible");
         System.out.println("6)Salir");
     }
       public void cambiarDatos(){
           Scanner input=new Scanner(System.in);
           int opc;
           System.out.println("Ingrese el numero de auto que desea cambiar:");
        int nauto=input.nextInt();
        do{
            mostrarOpciones();
            System.out.println("Ingrese una opc:");
             opc=input.nextInt();
        switch(opc){
   case 1:System.out.println("Ingrese la nueva patente:");String pat=input.next();
        vector[nauto].setPatente(pat);break;
   case 2:System.out.println("Ingrese la nueva marca:");String mar=input.next();
          vector[nauto].setMarca(mar);break;   
   case 3:System.out.println("Ingrese el nuevo modelo:");int mode=input.nextInt();
         vector[nauto].setModelo(mode);break;
   case 4: System.out.println("Ingrese el nuevo color:");String col=input.next();
        vector[nauto].setColor(col);break;
   case 5:
        System.out.println("Ingrese el nuevo combustible");String com=input.next();
        vector[nauto].setCombustible(com);
   case 6:
        System.out.println("Fin de cambios");
   default:
        System.out.println("Deve ingresar datos validos");
        }
        }while(opc!=6);
       mostrar();
       } 
}

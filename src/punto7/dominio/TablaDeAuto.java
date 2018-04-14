
package punto7.dominio;

import java.util.Scanner;


public class TablaDeAuto {
    private String patente;
    private int modelo;
    private String color;
    private String combustible;
    
    Scanner input=new Scanner(System.in);
    public TablaDeAuto(String patente,int modelo,String color,String combustible){
        this.patente=patente;
        this.modelo=modelo;
        this.color=color;
        this.combustible=combustible;
    }
 public void mostrarDatos(){
     System.out.println("PATENTE:"+getPatente());
     System.out.println("MODELO:"+getModelo());
     System.out.println("COLOR:"+getColor());
     System.out.println("Combustible:"+getCombustible());
 } 
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
      public void mostrarOpciones(){
     System.out.println("1)Cambiar patente");
     System.out.println("2)Cambiar modelo");
     System.out.println("3)Cambiar color ");
     System.out.println("4)Cambiar combustible");
     System.out.println("5)Salir");
     System.out.println("Ingrese una opc:");
     }
      public void cambiarDatos(TablaDeAuto vector[],int numerodeauto){
          int opc;
          do{
          vector[numerodeauto].mostrarOpciones();
           opc=input.nextInt();
        switch(opc){
      case 1:System.out.println("Ingrese la nueva patente:");String pat=input.next();
                vector[numerodeauto].setPatente(pat);break;
      case 2:
          System.out.println("Ingrese el nuevo modelo:");int model=input.nextInt();
                vector[numerodeauto].setModelo(model);break;
      case 3:
          System.out.println("Ingrese el nuevo color:");String col=input.next();
          vector[numerodeauto].setColor(col);break;
      case 4:
          System.out.println("Ingrese el nuevolo combustible");String com=input.next();
                vector[numerodeauto].setCombustible(com);break;
      case 5:
          System.out.println("Fin de cambios");break;
      default:  System.out.println("Deve ingresar datos validos");break;}   
      }while(opc!=5);
      }
    }

  


package punto5.test;



import punto5.dominio.GestorCirculo;


public class ProgramaPrincipal {
    public static void main(String[] args){
       //se llama a la clase GestorCirculo
      GestorCirculo gestor=new GestorCirculo();
      //se cargaran los datos que se requiere 
      gestor.cargarDatos();
      //se mostrara por pantalla los datos ingresados
      gestor.mostrarLista(gestor.getList());
    }
    
}

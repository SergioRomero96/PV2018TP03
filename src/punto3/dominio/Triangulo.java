package punto3.dominio;
/**
 *..
 * @author LENOVO
 */

public class Triangulo {

    int lado1;
    int lado2;
    int lado3;
//para obtener el perimetro de un triangulo consta de las suma de los tres lados que lo forman

    
    /**
     * 
     * @return the lado
     */ 
    public int getLado1() {
        return lado1;
    }
/**
 * 
 * @param lado1 the codigo to set 
 */
    
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
/**
 * 
 * @return the lado2
 */
    public int getLado2() {
        return lado2;
    }
/**
 * 
 * @param lado2 the lado2 to set 
 */
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
/**
 * 
 * @return lado3 
 */
    public int getLado3() {
        return lado3;
    }
/**
 * 
 * @param lado3 the lado3 to set 
 */
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    /**
     * metodo que permite obtener el permimetro
     * @return 
     */
    public int obtenerPerimetro() {
        int perim = this.lado1 + this.lado2 + this.lado3;
        return perim;
    }
    /**verificara si es un triangulo utilizando el teorema de desigualdad 
    es la suma de dos lados del triangulo siempre es mayor que la medida del tercer lado
    si resulta verdadero para todas las combianciones(3) entonces es un triangulo**/
    public boolean verificarTriangulo() {
        boolean ban = false, bandera1 = false, bandera2 = false, bandera3 = false;
        int a, b, c;
        a = this.lado1 + this.lado2; //a+b
        b = this.lado2 + this.lado3; //b+c
        c = this.lado3 + this.lado1; //c+a
        
        if (a > this.lado3 && c>this.lado2 && b>this.lado1) {
            ban=true;       
        }    
        return ban;
   
}
}

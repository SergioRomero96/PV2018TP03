
package punto6.dominio;
/**
 *
 * @author LENOVO
 */
//se definen los atributos
public class TablaRectangulo {
   private double base;
   private double altura;
   private double punto;
   private double superficie;
   private double perimetro;
   private int ID;

 
//se define el constructor
    public TablaRectangulo(double base, double altura, double punto, double superficie, double perimetro, int ID) {  
        this.base = base;
        this.altura = altura;
        this.punto = punto;
        this.superficie = superficie;
        this.perimetro = perimetro;
        this.ID = ID;
    }

//se definene los get y set de los atributos
    /**
     * 
     * @return the Base
     */
    public double getBase() {
        return base;
    }
/**
 * 
 * @param base the base to set
 */
    public void setBase(double base) {
        this.base = base;
    }
/**
 * 
 * @return Altura
 */
    public double getAltura() {
        return altura;
    }
/**
 * 
 * @param altura the altura to set 
 */
    public void setAltura(double altura) {
        this.altura = altura;
    }
/**
 * 
 * @return Punto 
 */
    public double getPunto() {
        return punto;
    }
/**
 * 
 * @param punto the punto to set 
 */
    public void setPunto(double punto) {
        this.punto = punto;
    }
/**
 * 
 * @return Superficie 
 */
    public double getSuperficie() {
        return superficie;
    }
/**
 * 
 * @param superficie the superficie to set 
 */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
/**
 * 
 * @return Perimetro 
 */
    public double getPerimetro() {
        return perimetro;
    }
/**
 * 
 * @param perimetro the perimetro to set
 */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
/**
 * 
 * @return ID 
 */
    public int getID() {
        return ID;
    }
/**
 * 
 * @param ID the ID to set 
 */
    public void setID(int ID) {
        this.ID = ID;
    }
   
}

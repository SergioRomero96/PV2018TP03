

package punto5.dominio;

/**
 *
 * @author LENOVO
 */
public class Circulo {
    //se definen los atributos de Circulo
   private double radio;
   private String color;
   private double superficie;
   //se define el constructor
     public Circulo(double radio, String color, double superficie) {
        this.radio = radio;
        this.color = color;
        this.superficie = superficie;
    }
     /**
      * 
      * @return the superficie 
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
 * @return Radio
 */
    public double getRadio() {
        return radio;
    }
/**
 * 
 * @param radio the radio to set 
 */
    public void setRadio(double radio) {
        this.radio = radio;
    }
/**
 * 
 * @return Color 
 */
    public String getColor() {
        return color;
    }
/**
 * 
 * @param Color the Color to set 
 */
    public void setColor(String color) {
        this.color = color;
    }
    
}



package punto5.dominio;


public class Circulo {
   private double radio;
   private String color;
   private double superficie;

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public Circulo(double radio, String color, double superficie) {
        this.radio = radio;
        this.color = color;
        this.superficie = superficie;
    }
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}


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
//se define el constructor
    public TablaRectangulo(double base, double altura, double punto, double superficie, double perimetro) {
        this.base = base;
        this.altura = altura;
        this.punto = punto;
        this.superficie = superficie;
        this.perimetro = perimetro;
    }
//se definene los get y set de los atributos
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPunto() {
        return punto;
    }

    public void setPunto(double punto) {
        this.punto = punto;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
   
}

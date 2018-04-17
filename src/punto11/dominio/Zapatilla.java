
package punto11.dominio;
/**
 *
 * @author LENOVO
 */

public class Zapatilla {
//se definen los atributos de zapatilla
    private String marca;
    private double numero;
    private String color;
    private String tipo;
    private String informacion;
//se define el constructor 
    public Zapatilla(String marca, double numero, String color, String tipo, String informacion) {
        this.marca = marca;
        this.numero = numero;
        this.color = color;
        this.tipo = tipo;
        this.informacion = informacion;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
      
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}

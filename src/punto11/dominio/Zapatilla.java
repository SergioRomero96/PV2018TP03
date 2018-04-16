
package punto11.dominio;


public class Zapatilla {
//se definen los atributos de zapatilla
    private String marca;
     private double numero;
    private String color;
    private String tipo;
//se define el constructor 
    public Zapatilla(String marca, double numero, String color, String tipo) {
        this.marca = marca;
        this.numero = numero;
        this.color = color;
        this.tipo = tipo;
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

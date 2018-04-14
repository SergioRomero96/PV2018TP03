
package punto11.dominio;


public class Zapatilla {
    private String marca;
     private double numero;
    private String color;
    private String tipo;

    public Zapatilla(double numero, String marca, String color, String tipo) {
        this.numero = numero;
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
    }

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

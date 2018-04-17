
package punto7.dominio;
/**
 *
 * @author LENOVO
 */

public class Autos {
    //se definen los atributos 
    private String patente;
    private String marca;
    private int modelo;
    private String color;
    private String combustible;             
    //se define el constructor
    public Autos(String patente,String marca, int modelo, String color, String combustible) {
        this.patente = patente;
        this.marca=marca;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
    }
//se definen los get y set de los atributos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
  
}

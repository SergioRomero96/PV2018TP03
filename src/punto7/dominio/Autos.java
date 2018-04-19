
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
    /**
     * 
     * @return Marca 
     */
    public String getMarca() {
        return marca;
    }
/**
 * 
 * @param marca the marca to set
 */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * 
     * @return Patente 
     */
    public String getPatente() {
        return patente;
    }
/**
 * 
 * @param patente the patente to set 
 */
    public void setPatente(String patente) {
        this.patente = patente;
    }
/**
 * 
 * @return Modelo 
 */
    public int getModelo() {
        return modelo;
    }
/**
 * 
 * @param modelo the modelo to set
 */
    public void setModelo(int modelo) {
        this.modelo = modelo;
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
 * @param color the color to set 
 */
    public void setColor(String color) {
        this.color = color;
    }
/**
 * 
 * @return Combustible 
 */
    public String getCombustible() {
        return combustible;
    }
/**
 * 
 * @param combustible the combustible to set 
 */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
  
}

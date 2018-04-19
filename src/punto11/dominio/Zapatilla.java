
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
/**
 * Permite definir el constructor para poder asignar valores a los atributos
 * @param marca
 * @param numero
 * @param color
 * @param tipo
 * @param informacion 
 */ 
    
    public Zapatilla(String marca, double numero, String color, String tipo, String informacion) {
        this.marca = marca;
        this.numero = numero;
        this.color = color;
        this.tipo = tipo;
        this.informacion = informacion;
    }
/**
 * 
 * @return Informacion 
 */
    public String getInformacion() {
        return informacion;
    }
/**
 * Permite el ingreso de informacion si la zapatilla es original o copia
 * @param informacion the informacion to set 
 */
    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
     /**
      * 
      * @return Numero numero de zapatilla  
      */ 
    public double getNumero() {
        return numero;
    }
/**
 * Permite mostrar por pantalla el contenido del atributo Numero
 * @param numero 
 */
    public void setNumero(double numero) {
        this.numero = numero;
    }
/**
 * Permite la carga de la marca de zapatilla
 * @return Marca  
 */
    public String getMarca() {
        return marca;
    }
/**
 * Permite mostrar por pantalla el contenido del atributo Marca
 * @param marca 
 */
    public void setMarca(String marca) {
        this.marca = marca;
    }
/**
 * Permite el ingreso del color de zapatilla
 * @return Color
 */
    public String getColor() {
        return color;
    }
/**
 * Permite mostar por pantalla el color de zapatilla
 * @param color 
 */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Permite cargar el tipo de zapatilla que es
     * @return 
     */
    public String getTipo() {
        return tipo;
    }
/**
 * Permite mostar por pantalla el tipo de zapatilla 
 * @param tipo 
 */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}

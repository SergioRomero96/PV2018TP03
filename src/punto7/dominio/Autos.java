
package punto7.dominio;


public class Autos {
    private String patente;
    private String marca;
    private int modelo;
    private String color;
    private String combustible;             
    
    public Autos(String patente,String marca, int modelo, String color, String combustible) {
        this.patente = patente;
        this.marca=marca;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
    }

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
    public void mostrar(){
        System.out.println("Patente:"+getPatente());
        System.out.println("Marca:"+getMarca());
        System.out.println("Modelo:"+getModelo());
        System.out.println("Color:"+getColor());
        System.out.println("Combustible:"+getCombustible());
    }
}

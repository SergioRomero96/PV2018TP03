
package punto6.dominio;


public class TablaRectangulo {
     private String base;
   private String altura;
   private String punto;
   private String superficie;
   private String perimetro;
   public TablaRectangulo(String base,String altura,String punto,String superficie,String perimtro){
       this.base=base;
       this.altura=altura;
       this.punto=punto;
       this.superficie=superficie;
       this.perimetro=perimtro;
   }
    public void mostar(){
       System.out.println("Base:"+getBase());
       System.out.println("Altura"+getAltura());
       System.out.println("Punto:"+getPunto());
       System.out.println("Superficie:"+getSuperficie());
       System.out.println("Perimetro:"+getPerimetro());
   }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPunto() {
        return punto;
    }

    public void setPunto(String punto) {
        this.punto = punto;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public String getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(String perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "{" + "base=" + base + ", altura=" + altura + ", punto=" + punto + ", superficie=" + superficie + ", perimetro=" + perimetro + '}';
    }

}

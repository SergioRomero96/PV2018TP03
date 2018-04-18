/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punto8.dominio;

/**
 * 
 * @author Sergio Romero
 */
public class Autor {
    /**
     * Atributos de la clase Autor
     */
    private String apelido;
    private String nombre;
    /**
     * Constructor por defecto
     */
    public Autor(){
        
    }
    /**
     * Constructor con Parametros
     * @param apelido se asigna al Atributo Apellido de la clase Autor
     * @param nombre se asigna al Atributo nombre de la clase Autor
     */
    public Autor(String apelido, String nombre) {
        this.apelido = apelido;
        this.nombre = nombre;
    }
    
    /**
     * @return the apelido
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * @param apelido the apelido to set
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

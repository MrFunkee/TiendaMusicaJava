/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiendaMusica;

/**
 *
 * @author matia
 */
public class Disco extends Producto{
    private String artista;
    private int annio;
        //Podríamos también agregar "private String formato;" para especificar si es casset, cd, vinilo o digital.
    
    public Disco(){
        
    }

    public Disco(String banda, int annio, String codigo, String nombre, int precio, int cantidad) {
        super(codigo, nombre, precio, cantidad);
        this.artista = banda;
        this.annio = annio;
    }

    public String getBanda() {
        return artista;
    }

    public void setBanda(String banda) {
        this.artista = banda;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }
    
    @Override
    public String toString()
    {
        return "=== Informacion Album === \n"+
                "Codigo:"+super.codigo+"\n"+
                "Nombre:"+super.nombre+"\n"+
                "Precio:"+super.precio+"\n"+
                "Artista:"+artista+"\n"+
                "Año:"+annio+"\n";
                
                
    }
}

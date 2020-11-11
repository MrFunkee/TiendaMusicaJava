/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusicamatijon;

/**
 *
 * @author jhon_
 */
public class Album extends Producto{
    private String artista;
    private int nroCanciones;
    private int annio;

    public Album() {
        super();
    }

    public Album(String artista, int nroCanciones, int annio, String codigo, String nombreProducto, int precio) {
        super(codigo, nombreProducto, precio);
        this.artista = artista;
        this.nroCanciones = nroCanciones;
        this.annio = annio;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNroCanciones() {
        return nroCanciones;
    }

    public void setNroCanciones(int nroCanciones) {
        this.nroCanciones = nroCanciones;
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
                "Nombre:"+super.nombreProducto+"\n"+
                "Precio:"+super.precio+"\n"+
                "Artista:"+artista+"\n"+
                "Año:"+annio+"\n"+
                "N° Canciones:"+nroCanciones+"\n";
                
                
    }
}

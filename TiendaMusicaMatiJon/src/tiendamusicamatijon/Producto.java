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
public abstract class Producto implements Operable {
    protected String codigo;
    protected String nombreProducto;
    protected int precio;

    public Producto() {
    }

    public Producto(String codigo, String nombreProducto, int precio) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    

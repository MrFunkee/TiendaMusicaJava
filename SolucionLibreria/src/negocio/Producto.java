/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author claus
 */
public class Producto {
    private String codigo;
    private String nombre;
    private int precio;
    private int cantidad;

    public Producto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) throws Exception {
     if (codigo.trim().length()>=4)
     {
        this.codigo = codigo;
     }
     else
     {
         throw new Exception("Debe ingresar un código");
     }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
     if (!nombre.equals("seleccionar"))
     {
        this.nombre = nombre;
     }
     else
     {
         throw new Exception("Debe seleccionar un producto");
     }
     
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) throws Exception {
      if (precio>=300)
      {
        this.precio = precio;
      }
      else
      {
          throw new Exception("Precio debe ser mayor o igual a 300");
      }
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString()
    {
       return  "Código:"+codigo+"\n"+ 
               "Producto:"+nombre+"\n"+
               "Precio:"+precio+"\n"+
               "Cantidad:"+cantidad+"\n";
               
    }
    
   
}

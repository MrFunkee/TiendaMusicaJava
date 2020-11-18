/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;
import negocio.Venta;

/**
 *
 * @author cetecom
 */
public class Registro {
    public static ArrayList<Venta> listaVenta = new ArrayList();
    
  /**
   * recibe y agrega un objeto venta con un cliente y una colecciòn de productos
   * @param venta 
   */
    public static void ingresarVenta(Venta venta)
    {
        listaVenta.add(venta);
    }        
    
    /**
     * retorna la lista para en la GUI listarla
     * @return listaVenta
     */
    public static ArrayList<Venta> listarVenta()
    {
        return listaVenta;
    }
          
}

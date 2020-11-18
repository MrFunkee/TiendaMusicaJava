/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author claus
 */
public class Venta implements Calculable
{
    private int numero;
    private String fecha;   
    private String tipoCliente;
    private Cliente cliente; //tiene asociado un cliente
    ArrayList<Producto> lista = new ArrayList();
    
    
    public Venta() {
        cliente = new Cliente();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
      
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) throws Exception {
     if (fecha.trim().length()==10)
     {
        this.fecha = fecha;
     }
     else
     {
         throw new Exception("Debe ingresar una fecha con formato:DD/MM/AAAA");
     }
    }

     
    
    
    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) throws Exception {
      if (tipoCliente.equals("persona") ||
              tipoCliente.equals("empresa"))
      {
        this.tipoCliente = tipoCliente;
      }
      else
      {
          throw new Exception("Debe seleccionar tipo cliente");
      }
    }
    
    //se agregò en etapa 2 junto con el ArrayList<Producto>
    public  void ingresarProducto(Producto producto)
    {
        lista.add(producto);
    }        
       
    public ArrayList<Producto> listarProducto()
    {
        return lista;
    } 
           
    
    
    
    @Override
    public String toString()
    {
        return "============  N° venta:"+numero+"============  \n"+
                "Tipo Cliente:"+tipoCliente+"\n"+                
                "Fecha:"+fecha+"\n"+
                "RUT cliente:"+getCliente().getRut()+"\n"+
                "Nombre cliente:"+getCliente().getNombre()+"\n"+
                "---------------------------------------------- \n"+
                "Total sin descuento:"+calcularTotal()+"\n"+
                "Total (-10% empresa):"+calcularTotalConDescuento()+"\n"+
                "---------------------------------------------- \n";        
                
    }
    
    
    @Override
    public int calcularTotal()
    {
        int suma = 0;
        //Se recorre el ArrayList usando for
        for(Producto pro:lista)
        {
            suma += pro.getPrecio()*pro.getCantidad();
        }   
       return suma;     
    }        
            
    @Override
    public int calcularTotalConDescuento()
    {
       if (tipoCliente.equals("empresa"))
       {
          return calcularTotal() - (int)(calcularTotal()*DESCUENTO/100);
       }
       else
       {
         return calcularTotal();
       }    
          
    }
    
    
// ETAPA 1:
//    @Override
//    public int calcularTotal() {
//       return getProducto().getPrecio() * cantidad;
//    }

//    @Override
//    public int calcularTotalConDescuento() {
//       if (tipoCliente.equals("empresa"))
//       {
//           return calcularTotal() - (int)(calcularTotal()*DESCUENTO/100);
//       }
//       else
//       {
//           return 0;
//       }
//    }

    
    
    
    
}

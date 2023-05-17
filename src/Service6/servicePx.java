package Service6;

import Entidad6.producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class servicePx {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    producto p1 = new producto();
    
    public void IngresarProducto(HashMap <String, Double> p1){
        System.out.println("Ingrese el nombre del producto");
        String nombre= leer.next();
        System.out.println("Ingrese el precio");
        double precio = leer.nextDouble();
        
        p1.put(nombre, precio);   
    }
    
    public void mostrarPx(HashMap <String, Double> p1){
        for (Map.Entry<String, Double> entry : p1.entrySet()){
            System.out.println("Producto: " + entry.getKey() + ", precio: $" + entry.getValue());
        }
    }
    
    public void modificarPrecio(HashMap <String, Double> p1){
        String id;
        System.out.println("Ingrese el nombre del producto que desea modificar");
        id = leer.next();
     
        for (Map.Entry<String, Double> entry : p1.entrySet()){
            if (id.equals(entry.getKey())){
                System.out.println("Ingrese el nuevo precio");
                double precio1 = leer.nextDouble();
                p1.put(id, precio1);
            }
        }    
    }
    
    public void eliminarPx(HashMap <String, Double> p1){
        System.out.println("Ingrese el producto que desea eliminar");
        String ID = leer.next();
      
        for (Map.Entry<String, Double> entry : p1.entrySet()) {
           if(ID.equals(entry.getKey())){
               p1.remove(ID);
           }        
        }                       
    }    
}

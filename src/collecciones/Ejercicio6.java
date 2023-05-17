/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package collecciones;

import Entidad6.producto;
import Service6.servicePx;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String opc = "";
        int opcN = 0;
        producto p1 = new producto();
        servicePx pp = new servicePx();

        HashMap<String, Double> prod = new HashMap();

        System.out.println("ALMACENAMIENTO 3000");
        System.out.println("Bienvenido al sistema de Almacenamiento 3000, a continuacion se desplegara un menú"
                + "donde podrá elegir la opción que desee");

        do {
            System.out.println("MENÚ");
            System.out.println("1-Ingreso de productos y precios");
            System.out.println("2-Lista de productos");
            System.out.println("3-Modificar precios");
            System.out.println("4-Elimianr productos");
            System.out.println("5-Salir");
            opcN = leer.nextInt();
            switch (opcN) {
                case 1:
                    System.out.println("--Ingreso de productos y precios--");
                    do {
                        pp.IngresarProducto(prod);
                        System.out.println("Desea ingresar otro producto? S/N");
                        opc = leer.next();
                    } while (opc.equalsIgnoreCase("s"));
                    break;
                case 2:
                    System.out.println("--LISTA--");
                    pp.mostrarPx(prod);
                    break;
                case 3:
                    System.out.println("--Modificar productos--");
                    do {
                        pp.modificarPrecio(prod);
                        System.out.println("Desea modificar otro producto? S/N");
                        opc = leer.next();
                    } while (opc.equalsIgnoreCase("s"));
                    pp.mostrarPx(prod);
                    break;
                case 4:
                    System.out.println("--Eliminar productos--");
                    do {
                        pp.eliminarPx(prod);
                        System.out.println("Desea eliminar otro producto? S/N");
                        opc = leer.next();
                    } while (opc.equalsIgnoreCase("s"));
                    pp.mostrarPx(prod);
                    break;
            }
        } while (opcN != 5);
        System.out.println("GRACIAS por usar ALMACENAMIENTO 3000");
    }
}

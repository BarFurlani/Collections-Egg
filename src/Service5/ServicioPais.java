package Service5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class ServicioPais {

    Scanner leer = new Scanner(System.in);

    public void crearPaises(HashSet<String> paises) {
       
        String opcion = "";
        do {
            System.out.println("Ingrese el nombre del pais:");
            String pais = leer.next();
            paises.add(pais);
            System.out.println("Desea continuar?S/N");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));

        for (String pais : paises) {
            System.out.print("[" + pais + "]");
        }

    }

    public void eliminarPais(String p, HashSet<String> paises) {
       
        Iterator<String> it = paises.iterator();
        int contador = 0;
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(p)) {
                it.remove();
                contador++;
                for (String pais : paises) {
                    System.out.print("[" + pais + "]");
                }
            }
        }
        if (contador == 0) {
            System.out.println("El pais no se encuentra registrado");
        }
    }
}

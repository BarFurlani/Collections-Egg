/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package collecciones;

import Service5.ServicioPais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        HashSet<String> paises = new HashSet();
        ServicioPais sp = new ServicioPais();

        sp.crearPaises(paises);

        ArrayList<String> paisesLista = new ArrayList(paises);
        Collections.sort(paisesLista);

        System.out.println("");

        System.out.println("Paises ordenados alfabeticamente:");
        for (String pais : paisesLista) {
            System.out.print("[" + pais + "]");
        }
        System.out.println("");

        System.out.println("Ingrese el pais que desee eliminar:");
        String p = leer.nextLine();

        sp.eliminarPais(p, paises);
    }

}

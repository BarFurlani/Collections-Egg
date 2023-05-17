package collecciones;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
Ej-1: Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
Ej-2: Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
*/
/**
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    ArrayList <String> razas = new ArrayList();
    String aux = "N";
    
    do{
        System.out.println("Escriba una raza de perro");
            razas.add(leer.nextLine());
        System.out.println("Desea seguir agregando razas y salir? Responda S o N");    
            aux = leer.nextLine();
    }while(!"n".equals(aux.toLowerCase()));
    
        System.out.println("Las razas ingresadas fueron " + razas.size());
                                                                  //de esta forma lo hacemos con el FOR común
        razas.forEach((r1) -> {                                     // for (String r1 : razas) {         
            System.out.println(r1 + "");                            // System.out.println(r1 + "");
        });                                                         // };
        System.out.println("");
        Iterator <String> it = razas.iterator(); //recorre el ArrayList 
        
        System.out.println("Elija una de las razas ingresadas");
            String rz = leer.nextLine();
        System.out.println("");    
            
        while (it.hasNext()){
            if(it.next().equalsIgnoreCase(rz)){
                it.remove();
            }
        }
        System.out.println("Las demás razas son:");
        razas.forEach((r1) -> {
            System.out.println(r1 + "");
        });       
  }
    
}

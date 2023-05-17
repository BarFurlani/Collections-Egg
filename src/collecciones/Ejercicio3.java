/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package collecciones;

import java.util.Scanner;
import Service3.servicio3;
import java.util.ArrayList;
import Entidad3.Alumno;
import java.util.Iterator;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        servicio3 serv = new servicio3();
        
        ArrayList <Alumno> lista = new ArrayList();
        
        serv.CrearAlumno(lista);
        
        System.out.println("Ingrese el nombre del alumno que quiere buscar");
        String buscar = leer.nextLine();
        
        Iterator <Alumno> it = lista.iterator();
        int indice=0;
        
    //System.out.println(lista.get(0));  -> para verificar
  
       while(it.hasNext()){
          
        if (it.next().getNombre().equalsIgnoreCase(buscar)) {
            double NotaF = serv.notaFinal(lista.get(indice).getNota());
            System.out.println("Nota promedio de " + buscar + ", es: "+ NotaF);
        } else {
            indice ++;
        }
        }
    }
}

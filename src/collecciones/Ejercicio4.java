/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package collecciones;

import Entidad4.Pelicula;
import Service4.movieServ;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ACER ASPIRE V
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        ArrayList <Pelicula> movie = new ArrayList();
        movieServ sp = new movieServ();
        
        System.out.println("---M0V1€C1N€MA---");        
        sp.crearPelicula(movie); 
        
        sp.mostrarLista(movie);
        
        System.out.println("");
        System.out.println("Películas mayor a 1 hora");
        for (Pelicula p : movie){
            if (p.getDuracion() > 1){
                System.out.println("[" + p.toString() + "]");
            }            
        }
        
        System.out.println("");
        movie.sort(Pelicula.compararDuracionDesc);        
        System.out.println("Lista de películas ordenadas por duración descendente:");        
        for (Pelicula p : movie){
            System.out.println("[" + p.toString() + "]");
        }
        
        System.out.println("");
        movie.sort(Pelicula.compararDuracionAsc);
        System.out.println("Lista de películas ordenadas por duración ascendente:");
        for (Pelicula p : movie){
            System.out.println("[" + p.toString() + "]");
        }
        
        System.out.println("");
        movie.sort(Pelicula.compararTitulo);
        System.out.println("Lista de películas ordenada alfabeticamente por titulo:");
        for (Pelicula p : movie){
            System.out.println("[" + p.toString() + "]");
        }
        
        System.out.println("");
        movie.sort(Pelicula.compararDirector);        
        System.out.println("Lista de películas ordenada alfabeticamente por director:");
        for (Pelicula p : movie){
            System.out.println("[" + p.toString() + "]");
        }
    }   
}

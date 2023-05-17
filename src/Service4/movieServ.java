package Service4;

import Entidad4.Pelicula;
import Utilidades.comparadores;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 *
 * @author ACER ASPIRE V
 */
public class movieServ {
    ArrayList <Pelicula> movie;
    Pelicula pelicula = new Pelicula();
    
    public void crearPelicula(ArrayList <Pelicula> movie){
      String aux = "";
      
        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el título del film");
            String titulo = leer.nextLine();
            System.out.println("Ingrese el director");
            String director = leer.nextLine();
            System.out.println("Ingrese la duración en horas");
            int duracion = leer.nextInt();
            
            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            movie.add(pelicula);
            
            System.out.println("");
            System.out.println("Desea agregar otra película? S/N");
            aux = leer.next();              
        } while (aux.equalsIgnoreCase("S"));
    }
    
    public void mostrarLista(ArrayList <Pelicula> movie){
     System.out.println("LISTA DE PELÍCULAS");
        movie.forEach((pelicula) -> {
            System.out.println("[" + pelicula.toString() + "]");
        });
    }
        
}




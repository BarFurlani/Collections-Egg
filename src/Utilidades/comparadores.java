package Utilidades;


import Entidad4.Pelicula;
import java.util.Comparator;

/**
 *
 * @author ACER ASPIRE V
 */
public class comparadores {
    
    public static Comparator<Pelicula> duracionAscendente = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };  
    
    public static Comparator<Pelicula> duracionDescendente = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    }; 
    
    public static Comparator <Pelicula> ordenTitulo = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
          return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
    public static Comparator <Pelicula> ordenDirector = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}



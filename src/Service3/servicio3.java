package Service3;

import java.util.Scanner;
import Entidad3.Alumno;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ACER ASPIRE V
 */
public class servicio3 {
    
    Scanner leer = new Scanner(System.in);
    
    public void CrearAlumno(ArrayList <Alumno> lista){
        String aux ="";
    
       do { 
        System.out.println("Ingrese el nombre del alumno");
        String nombre = leer.next();
        Alumno alumno;
       
        ArrayList <Integer> nota = new ArrayList();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota n° " + (i+1) + ": "); 
            nota.add(leer.nextInt());
        }      
        System.out.println("Desea agregar otro alumno? S/N");
         aux = leer.next();    
         alumno = new Alumno(nombre, nota);
         lista.add(alumno);
       } while (aux.equalsIgnoreCase("S"));
    }  
           
    public double notaFinal (ArrayList <Integer> nota){
        double NotaF = 0;
        for (Integer aux : nota) {
            NotaF += aux;
        }
        NotaF/=3;    
        return NotaF;
    }
}

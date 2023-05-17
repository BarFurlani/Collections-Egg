package Entidad3;

import java.util.ArrayList;

/**
 *
 * @author ACER ASPIRE V
 */
public class Alumno {
    
    public String nombre;
    public ArrayList <Integer> nota;

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }
}

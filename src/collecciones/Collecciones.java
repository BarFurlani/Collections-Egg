/*
 MANOS A LA OBRA!
1-Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno
2-Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
cada forma que aprendiste arriba.
 */
package collecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.TreeMap;

/**
 *
 * @author ACER ASPIRE V
 */
public class Collecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    //Cada colección que se crea debe importarse
      
     /*
      SINTAXIS DE LAS COLECCIONES:
       ClaseColec' <tipo_objeto> nombreX = new ClaseColec'();
        |                |-> Integer, Double, Long, Character, Boolean, String
        |->Listas: ArrayList, LinkedList => Control sobre el lugar que ocupa c/elemento, estan ordenados y puden ser duplicados
        |->Conjuntos: HashSet, TreeSet, LinkedHashSet => Le da un valor único a c/elemento, s/duplicados
        |->Mapas: HashMap, TreeMap, LinkedTreeMap => modelan el obj a través de una LLAVE y un VALOR (2 datos = o no)
                                                                                       |        |-> puede repetirse
                                                                                       |-> No puede repetirse 
     */        
        //LISTA:
        ArrayList <Integer> numerosA = new ArrayList();
        int x = 20;
        numerosA.add(x); //agrega el n° 20 en la lista, en la posición 0
        numerosA.add(23); //agrega n° 23 a la 2° posición (1), y así sucesivamente
        numerosA.add(26); 
        numerosA.add(12); 
        numerosA.add(80); 
        numerosA.add(54);          
        
        System.out.println("Dimensión: " + numerosA.size()); //Me permite conocer la dimención de mi ArrayList 
       
        /*
        --Remover elementos de la lista:
        lista.remove(int índice) --> remuevo el obj de x posición
        lista.remove(elemento) --> remuevo el elemento indicado o el 1° elemento con dicho 'nombre' que aparezca
        */
        numerosA.remove(2); //remuevo 1 de los objetos, en este caso el ubicado en la posi' 3
        
        System.out.println("Dimensión: " + numerosA.size());
        
        //Para mostrar la lista/conjunto usamos un for each:
    /*for (tipoDato nuevaVariable : nombreLista){
        System.out.println(nuevaVariable);
      }
        */
        for (Integer numeros : numerosA){
            System.out.println(numeros + "");
        }
        System.out.println("");
        
        //CONJUNTOS:
        HashSet <Integer> numerosB = new HashSet();
        Integer y = 20;
        numerosB.add(y);
        numerosB.add(5);
        numerosB.add(6);
        numerosB.add(7);
        numerosB.add(8);
        numerosB.add(9);
       
        numerosB.remove(6); //Se elimina el primer n° 6 que aparezca en el conjunto, elimina la 1° aparición del objeto
        System.out.println("Conjunto");
         for (Integer numeros : numerosB){
            System.out.println(numeros + "");
        }
        System.out.println("");
        
        System.out.println("MAPAS");  
        //MAPAS:
        HashMap <Integer, String> alumnos = new HashMap();
        int dni = 34576189;
        String nombreAlumno = "Pepe";
        alumnos.put(dni, nombreAlumno); //agrega la llave y el valor
        alumnos.put(12315465, "Claudia");
        alumnos.put(12315462, "Fernanda");
        alumnos.put(12315463, "Paula");
        alumnos.put(12315478, "Freya");
        alumnos.put(12312345, "Isis");
        
        //para mostrar MAPAS, tanto llave como valor
        for (Map.Entry<Integer, String> entry: alumnos.entrySet()){
            System.out.println("DNI: " + entry.getKey()
                + ", nombre: " + entry.getValue());
        }
        
        alumnos.remove(12315465); //en el caso de los mapas, sólo se puede elimiar a través de la llave
                                    //eliminando la 1° aparición del objeto
                                    
        //mostrar MAPA por separado, sin Map.Entry
        for (Integer num : alumnos.keySet()){
            System.out.println("DNI: " + num);  
        }
        for (String nombres : alumnos.values()){
            System.out.println("Nombre: " + nombres);
        }
    
    /* --ITERATOR--
       Permite recorrer y acceder a la inf, además de que se pueden eliminar elementos al recorrela
       Creación del it, se crea el obj it: Iterator iterator = lista.iterator(); 
       Contiene 3 métodos:
            boolean hasNext() --> retorna True si al it le quedan elementos por recorrer
            Object next() --> devuelve el sigiente elemento en la colección
            vold remove() --> elimina el elemento actual de la colección
       Para eliminar elementos se utiliza el "remove()", en los mapas no se pueden eliminar elementos
       mientras se itera
        
    */
    
       Iterator it = numerosA.iterator(); //Debe importarse la utilidad, este recorrerá el ArrayList
       System.out.println("Elementos de la lista: ");
       //se crea un bucle while para mostrar los elementos, siempre que el hasnext() sea True
       while (it.hasNext()){
           System.out.println(it.hasNext() + " ");
           break;
       }
       System.out.println();
       
    //Eliminación de elementos iterando:
        //Listas:
       while (it.hasNext()){
           if (it.next().equals(12)) {  //va a eliminar en este caso al objeto 12
              it.remove(); 
           }
       }
        for (Integer in : numerosA) {
           System.out.println(in + "");
        }
        System.out.println("");
    
       //Conjuntos:
       Iterator <Integer> it2 = numerosB.iterator(); //Puedo o no colocar el tipo de dato
       while (it2.hasNext()){
           if (it2.next() == 7) { 
             it2.remove(); 
           }
       }
        for (Integer ine : numerosB) {
            System.out.println(ine + "");
        }
     
    /*ORDENAR COLECCIONES: se utiliza "Collections.sort(nombreLista)"
                                            |-> Recibe la colec' y la ordena de forma ascendente 
                                            |-> Solo en listas! No en Conjuntos y Mapas
                                                                                   |->Para ordenar
                                                                            convertir el HashMap en 
                                                                            TreeMap (se ordena por si mismo)                                                                 
     */                                     
      
        System.out.println("Odenar Lista:");
        Collections.sort(numerosA); //debe importarse la utilidad Collections
        System.out.println(numerosA);
        
        System.out.println("Convertir en lista y ordenar el conjunto:");
        ArrayList <Integer> numB = new ArrayList(numerosB); //se trae por parámetro el conjunto para convertirlo en lista
        Collections.sort(numB); 
        System.out.println(numB);
        
        System.out.println("MAPAS: Convertir en TreeMap y ordenar el HashMap:");
        TreeMap <Integer, String> alumnosTree = new TreeMap(alumnos);
        System.out.println(alumnosTree);
        
    /*Cuando tenemos objetos creados por nosotros:
     --AÑADIR OBJETOS--> cdo creamos una clase y se llama, se alladen usando el ".add(obj)" visto antes
        En el caso de los TreeSet/TreeMap, se debe usar un "Comparator", que le dará la pauta de 
        como ordenarse y sobre que atributo Ej:
            HashMap <Integer, Alumno> alumnos = new HashMap();
            int dni = 3333333,
            Alumno alumno = new Alumno("Pepe", "Honguito");
            alumnos.put(dni, alumno); 
     --RECCORRER--> en este caso se hace utilizando en "for each" o el "iterator", pero al realizar
        el sout, se va a ver así: nombreClase.objeto@codigoHash, para que esto no suceda dentro
        de la clase se debe crear al igual que los constructores un toString(), este método "se 
        llama sólo" en el main
     --ORDENAR--> uso del COMPARATOR
        Se debe usar la función "compare()" dentro de nuestra clase entidad de la sig forma:
        
                 |-> se crea un obj estático, para poder llamarlo solo llamando la clase, 
                 | sin tener que crear un obj Comparator
        public static Comparator <Perro> compararEdad = new Comparator <Perro>() {
            @Override
            public int compare(Perro p1, Perro p2){           --> este es el método que va a 
                return p2.getEdad().compareTo(p1.getEdad());      recibir a los objetos a comparar
            }     |
        }         |-> va a devolver 0 si son iguales, 1 si p2>p1 y -1 si p2<p1
        
        *este mét COMPARATOR se usa para ordenar nuestras colecciones, llamando la fx 
        Collections.sort():
            En listas:  ArrayList <Perro> perros = new ArrayList();
                        perros.sort(Perro.compararEdad);    --> se llama al mét a través de la 
                                                                clase y se pone a ordenar
            En conjuntos:   HashSet <Perro> perrosSet = new HashSet();
                            ArrayList <Perro> perrosList = new ArrayList(perrosSet);
                            perrosList.sort(Perro.compararEdad);
        *En el caso de los TreeSet como se ordenan solos se debe pasar el comparator
         en el constructor:
                           TreeSet <Perro> perrosConjunto = new TreeSet(Perro.compararEdad):
                           Perro perro = new Perro();
                           perros.add(perro);
        *En los MAPAS, se usa una fx para traer todos los valores:
                        HashMap <Integer, Alumno> map = new HashMap();
                        ArrayList <Alumno> nombres = new ArrayList(map.values());
                        nombres.sort(Alumno.comararDni);
    */
    
    /*COLLECCIONES EN FUNCIONES
        Para usarla dentro de las funciones, es muy importante poner el tipo de colección,
        dato y nombre:
        *Listas -> en la clase: public void llenarLista(ArrayList <Integer> num)}
                |                   num.add(20);
                |               }
                |-> en el Main: ArrayList <Integer> notas = new ArrayList();
                |               service.llenarLista(notas);
                |-> para devolverla en una fx: public ArrayList <Integer> llenarLista() {
                                                    ArrayList <Integer> num = new ArrayList();
                                                    num.add(20);
                                                    return num;
                                               }
        *Conjuntos -> en la clase: public void llenarHashSet(HashSet <String> pal)}
                   |                   pal.add("Hola");
                   |               }
                   |-> en el Main: HashSet <String> pal = new HashSet();
                   |               service.llenarHashSet(pal);
                   |-> para devolverla en una fx: public HashSet <String> llenarHashSet() {
                                                    HashSet <String> pal = new HashSet();
                                                    pal.add("Hola");
                                                    return pal;
                                                  }                                       
        *MAPAS -> en la clase: public void llenarMapa(HashMap <Integer, String> alumnos)}
               |                   alumnos.put(2, "Pepe");
               |               }
               |-> en el Main: HashMap <Integer, String> alumnos = new HashMap();
               |               service.llenarMapa(alumnos);
               |-> para devolverla en una fx: public HashMap <Integer, String> llenarMapa() {
                                                  HashMap <Integer, String> alumnos = new HashMap();
                                                  alumnos.put(2, "Pepe");
                                                  return alumnos;
                                              }    
    */
    }
    
}

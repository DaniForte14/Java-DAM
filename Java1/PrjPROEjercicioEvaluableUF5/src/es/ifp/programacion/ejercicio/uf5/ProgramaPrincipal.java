package es.ifp.programacion.ejercicio.uf5;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Dani Forte
 */

public class ProgramaPrincipal {

    
    /** 
     * @param 
     */
    public static void main(String[] args) {

        /**
         * Creamos las variables de tipo cliente y tipo jefedeproyecto para poder utilizarlas mas adelante en el TreeMap y la variable tipo proyecto para poder llamarla
         * más abajo
         */
    Cliente c1 = new Cliente("Antonio", "García Pérez", "98765432R", "CLI","73");
    Cliente c2 = new Cliente("David", "Montero Matamoros", "12345678F", "CLI","74");
    Cliente c3 = new Cliente("David", "Montero Matamoros", "12345678F", "CLI","75");
    Cliente c4 = new Cliente("David", "Montero Matamoros", "12345678F", "CLI","76");

    JefeDeProyecto jp1 = new JefeDeProyecto("Juan", "Noriega León", "87630491T", "JP", 3);
    JefeDeProyecto jp2 = new JefeDeProyecto("Mario", "López Gómez", "2948571105G", "JP", 4);    
    JefeDeProyecto jp3 = new JefeDeProyecto("Mario", "López Gómez", "2948571105G", "JP", 5); 

    Proyecto proyecto = new Proyecto("BOG", "PRJ1001", "Broker Online Ba", new Date());

    /**
     * Creamos los TreeMaps para cada variable, en este caso seria el TreeMap de cliente y de jefedeproyecto.
     * Utilizamos el TreeMap ya que a la hora de implementar las variables de tipo cliente y tipo jefe, da igual en el orden en el que este
     * ya que se ordena en este caso alfabeticamente, por ejemplo el TreeMap de JefeDeProyecto esta puesto C, B, A pero en la salida del programa sale A, B, C
     * Podriamos añadir tantos como quisieramos y eliminarlos y el orden se mantendria
     */
    TreeMap<String, Cliente> lista = new TreeMap<String, Cliente>();
    
    lista.put("A ", c1);
    lista.put("B ", c2);
    //lista.put("C ", c3);
    lista.put("D ", c4);
    
    TreeMap<String, JefeDeProyecto> lista2 = new TreeMap<String, JefeDeProyecto>();
    lista2.put("C ", jp3);
    lista2.put("B ", jp2);
    lista2.put("A ", jp1);



    
    System.out.println("===================================================================");
    System.out.println("                           DATOS PROYECTO");
    System.out.println("===================================================================");
    
    /**
     * Mostramos toda la informacion de la clase proyecto
     */
    System.out.println(proyecto.toString());

    System.out.println("===================================================================");
    System.out.println("                           DATOS CLIENTE");
    System.out.println("===================================================================");
    
    /**
     * Este for junto al for mas de abajo, lo que haria seria recorrer toda la lista mostrando todos los valores que tienen los hashmaps, en este caso
     * solo muestra 2 ya que solo le hemos pasado dos.
     */

    for(Map.Entry<String, Cliente> c : lista.entrySet()){
        System.out.println(c.getValue());
        System.out.println("--------------------------------------------------------");

    }
    System.out.println("===================================================================");
    System.out.println("                           DATOS JEFE DE PROYECTO");
    System.out.println("===================================================================");

    for(Map.Entry<String, JefeDeProyecto> jp : lista2.entrySet()){
        System.out.println(jp.getValue());
        System.out.println("--------------------------------------------------------");

    }
   


    }
}
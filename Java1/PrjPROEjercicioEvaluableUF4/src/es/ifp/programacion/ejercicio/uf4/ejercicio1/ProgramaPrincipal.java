package es.ifp.programacion.ejercicio.uf4.ejercicio1;

import java.util.Date;

/**
 * @author Dani Forte
 */

public class ProgramaPrincipal {

    
    /** 
     * @param 
     */
    public static void main(String[] args) {
     
        
        /**
         * Asignamos los valores pertinentes a las variables de cada clase y llamamos a la clase proyecto donde nos mostrara todo en orden
         */
    Cliente cliente = new Cliente("David", "Montero Matamoros", "12345678F", "CLI", "73");

    JefeDeProyecto JP = new JefeDeProyecto("Juan", "Noriega León", "98765432D", "JP",3);

    Proyecto proyecto = new Proyecto("BOG", "PRJ1001", "Broker Online Ba", new Date(), cliente, JP);

    
    System.out.println("===================================================================");
    System.out.println("                           DATOS PROYECTO");
    System.out.println("===================================================================");
    
    System.out.println(proyecto.toString());


    }
}
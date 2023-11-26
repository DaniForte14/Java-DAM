package es.ifp.programacion.ejercicio.uf5;

import java.util.Random;

public class JefeDeProyecto extends Persona{
    
    /**
     * En esta pasamos el numero de empleado ya que es una variable unica del jefe de proyecto
     * 
     */
    private int numEmpleado;
    
    //Constructores

    public JefeDeProyecto(String Nombre, String Apellidos, String DNI, String Rol){
        super(Nombre, Apellidos, DNI, Rol);
    }
    public JefeDeProyecto(String Nombre, String Apellidos, String DNI, String Rol, int numEmpleado){
        super(Nombre, Apellidos, DNI, Rol);
        this.numEmpleado=numEmpleado;
    }

    /**
     * 
     * @return numEmpleado
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * 
     * @param numEmpleado the numEmpleado to set
     */
    public int numEmpleado() {
        Random r = new Random();
        int low = 10;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        return result;
    }


    
    /** 
     * @override
     */
    public String toString(){
        return super.toString()+
                "Número de empleado: "+this.numEmpleado;
    }
}

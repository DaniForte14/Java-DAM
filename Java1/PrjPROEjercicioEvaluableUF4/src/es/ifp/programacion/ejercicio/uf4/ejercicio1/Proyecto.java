package es.ifp.programacion.ejercicio.uf4.ejercicio1;

import java.util.Date;


public class Proyecto {

    /**
     * En esta clase pasaremos los valores propios del proyecto, la fecha de inicio del proyecto y llamaremos a la clase cliente y jefe de proyecto
     * 
     */


    private String idProyecto;
    private String nombreProyecto;
    private String descProyecto;
    
    private Date Fechaini;
    
    private Cliente cliente;
    private JefeDeProyecto JP;


    public Proyecto(String nombreProyecto, String idProyecto, String descProyecto, Date Fechaini, Cliente cliente, JefeDeProyecto jP) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.descProyecto = descProyecto;
        this.Fechaini = Fechaini;
        this.cliente = cliente;
        this.JP = jP;
    }


    
    /** 
     * @return String
     */
    public String getIdProyecto() {
        return idProyecto;
    }


    
    /** 
     * @param idProyecto
     */
    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }


    
    /** 
     * @return String
     */
    public String getNombreProyecto() {
        return nombreProyecto;
    }


    
    /** 
     * @param nombreProyecto
     */
    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }


    
    /** 
     * @return String
     */
    public String getDescProyecto() {
        return descProyecto;
    }


    
    /** 
     * @param descProyecto
     */
    public void setDescProyecto(String descProyecto) {
        this.descProyecto = descProyecto;
    }


    public Date getFechaini() {
        return Fechaini;
    }


    public void setFechaini(Date Fechaini) {
        this.Fechaini = Fechaini;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public JefeDeProyecto getJP() {
        return JP;
    }


    public void setJP(JefeDeProyecto jP) {
        this.JP = jP;
    }

    /**
     * @override aqui hacemos que muestre los datos del proyecto mismo y todos los datos que pasamos por cliente y por el jefe de proyectos
     */
    public String toString(){
        return "Nombre proycto: " + this.getNombreProyecto()+"\n"+
                "Id. Proyecto: " + this.getIdProyecto()+"\n"+
                "Descripción: "+ this.getDescProyecto()+"\n"+
                "Fecha de inicio: "+ this.getFechaini()+"\n"+
                "==================================================================="+"\n"+
                "                           DATOS CLIENTE"+"\n"+
                "==================================================================="+"\n"+
                this.getCliente().toString()+"\n"+
                "==================================================================="+"\n"+
                "                           DATOS JP"+"\n"+
                "==================================================================="+"\n"+
                this.getJP().toString();          
    }
    
    
}

package es.ifp.programacion.ejercicio.uf5;


public class Cliente extends Persona{

    /**
     * 
     * En esta solo necesitamos pasar el id del cliente ya que es lo unico que tiene la clase cliente diferente al jefe de proyecto
     */
    private String idCliente;
    
    //Constructores

    public Cliente(String Nombre, String Apellidos, String DNI, String Rol){
        super(Nombre, Apellidos, DNI, Rol);
    }
    public Cliente(String Nombre, String Apellidos, String DNI,String Rol, String idCliente){

        super(Nombre, Apellidos, DNI, Rol);
        this.idCliente=idCliente;

    }

    
    /** 
     * @return String
     */
    public String getIdCliente() {
        return idCliente;
    }

    
    /** 
     * @param idCliente
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    
    
    /** 
     * @override
     */
    public String toString(){
            
        return super.toString()+
                "Identificador de cliente: ID"+ this.getIdCliente();
    }
   
}

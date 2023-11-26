package es.ifp.programacion.ejercicio.uf5;

public class Persona {
    
    /**
     * Esta clase la utilizaremos para inicializar y definir los parametros comunes que tienen las clases de cliente y jefe de proyecto
     * 
     * 
     */
    private String Nombre;
    private String Apellidos;
    private String DNI;
    private String Rol;



    /**
     * 
     * @param Nombre
     * @param Apellidos
     * @param DNI
     */
    public Persona(String Nombre, String Apellidos, String DNI){
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.DNI=DNI;
        }
    /**
     * 
     * @param Nombre
     * @param Apellidos
     * @param DNI
     * @param Rol
     */
    public Persona(String Nombre, String Apellidos, String DNI, String Rol){
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.DNI=DNI;
        this.Rol=Rol;

    }

    /**
     * 
     * @return Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * 
     * @return Apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * 
     * @return DNI
     */
    public String getDNI() {
        return DNI;
    }

    

    
    /** 
     * @return String
     */
    public String getRol() {
        return Rol;
    }

    
    /** 
     * @param rol
     */
    public void setRol(String rol) {
        Rol = rol;
    }

    
    /** 
     * @override
     */
    public String toString() {
        return "Nombre: " + this.getNombre() + "\n" +
                "Apellidos: " + this.getApellidos() + "\n" +
                "DNI: " + this.getDNI() + "\n"+
                "Rol: " +this.getRol() + "\n";
    }
}

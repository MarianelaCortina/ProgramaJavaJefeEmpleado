package domain;

public class Jefe {
    
    private String nombre;
    private int edad;
    private Empleado empleado = null;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void contratarEmpleado(Empleado empleado){
        if(this.empleado == null){
            this.empleado = empleado;
            System.out.println("Se contrato al empleado con exito");
        } else {
            System.out.println("Error: Ya tiene un empleado contratado");
        }
    }

    public void despedirEmpleado(){
        if(this.empleado != null){
            this.empleado = null;
            System.out.println("Se despidio al empleado");
        } else {
            System.out.println("Error: No tiene empleados contratados");
        }
    }
    
    public String obtenerDatos(){
        String datos = "Tipo: Jefe, Nombre: " + this.nombre + ", Edad: " + this.edad + "\n";
        if(this.empleado != null){
            datos += "Datos Empleado: Tipo: Empleado, Nombre: " + empleado.getNombre() + ", Edad: " + empleado.getEdad();
        } else {
            datos += "No tengo empleados a cargo";
        }
        return datos;
    }

}

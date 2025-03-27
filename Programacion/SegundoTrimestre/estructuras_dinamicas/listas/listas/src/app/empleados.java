//Empleados


package app;


import java.time.LocalDate;


public class empleados implements Comparable<empleados> {


    protected String nombre;
    protected String apellido;
    protected LocalDate antiguedad;


    public String getNombre() {
        return nombre;
    }


    public empleados(LocalDate antiguedad) {
        this.antiguedad = antiguedad;
    }


    public empleados(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }






    @Override
    public int compareTo(empleados o) {
        if (nombre.compareTo(o.nombre) != 0){
            return nombre.compareTo(o.nombre);
        }else return apellido.compareTo(o.apellido);
    }


    @Override
    public String toString() {
        return nombre + apellido;


    }
}

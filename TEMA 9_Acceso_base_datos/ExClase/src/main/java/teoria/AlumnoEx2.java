package teoria;

import java.util.ArrayList;

public class AlumnoEx2 {

    private String nombre;
    private String aplleido;
    private String direccion;
    private int edad;
    private ArrayList<Asignatura> asignaturas;

    public AlumnoEx2(String nombre, String aplleido, String direccion, int edad) {
        this.nombre = nombre;
        this.aplleido = aplleido;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAplleido() {
        return aplleido;
    }

    public void setAplleido(String aplleido) {
        this.aplleido = aplleido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "AlumnoEx2{" +
                "nombre='" + nombre + '\'' +
                ", aplleido='" + aplleido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                ", asignaturas=" + asignaturas +
                '}';
    }
}

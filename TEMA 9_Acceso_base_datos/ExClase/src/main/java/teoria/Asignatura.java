package teoria;

public class Asignatura {

    private String nombre;
    private int horas;

    public Asignatura(String nombre, int horas) {
        this.nombre = nombre;
        this.horas = horas;
    }

    public Asignatura(String nombre) {
        this(nombre,4);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", horas=" + horas +
                '}';
    }
}

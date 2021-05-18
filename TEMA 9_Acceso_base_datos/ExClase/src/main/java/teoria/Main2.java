package teoria;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {

        AlumnoEx2 alumno = new AlumnoEx2("Pepe","Pérez","Aquí",30);

        //Creamos el objeto Gson, se encarga de las conversiones
        Gson gson = new Gson();

        //Convertimos a un objeto secillo a Json.
        System.out.println(gson.toJson(alumno));


        //Creamos las asignaturas
        Asignatura asg1 = new Asignatura("LM",4);
        Asignatura asg2 = new Asignatura("Programación",8);

        //Creamos una lista, donde guardar las asignaturas para incluirla despues en un alumno
        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        asignaturas.add(asg1);
        asignaturas.add(asg2);

        //Pasamos la lsita de asignaturas al alumno
        alumno.setAsignaturas(asignaturas);

        //Convertimos un objeto compuesto con ArrayLista a Json
        System.out.println(gson.toJson(alumno));
        String json_completo = gson.toJson(alumno);

        AlumnoEx2 alum_new = gson.fromJson(json_completo, AlumnoEx2.class);
        System.out.println(alum_new);

        String json_array = gson.toJson(asignaturas);

        Type listType = new TypeToken<ArrayList<Asignatura>>() {}.getType();
        ArrayList<Asignatura> array_de_json = gson.fromJson(json_array,listType);
        System.out.println(array_de_json);
    }
}

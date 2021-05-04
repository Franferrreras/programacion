package ejemplo_inicial;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hola mundo!!!");

        //Realizo la serialización
        /*
        BagOfPrimitives bop = new BagOfPrimitives();
        Gson gson = new Gson();

        String json = gson.toJson(bop);

        System.out.println(json);

        BagOfPrimitives bop2 = gson.fromJson(json,BagOfPrimitives.class);

        System.out.println(bop2);
         */
        AlumnoEx1 alm = new AlumnoEx1();
        Gson gson = new Gson();

        String json = gson.toJson(alm);

        System.out.println(json);

        AlumnoEx1 alm2 = gson.fromJson(json, AlumnoEx1.class);

        System.out.println(alm2);
    }
}

public class Main {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("LISTA DE EMPLEADOS");
        System.out.println(ADClassicModels.getEmployees());
        System.out.println("-----------------------------");


        System.out.println("-----------------------------");
        System.out.println("LISTA DE OFFICINAS");
        System.out.println(ADClassicModels.getOffices());
        System.out.println("-----------------------------");


        //cerrar conexión
        ConexionBD.close();

    }
}

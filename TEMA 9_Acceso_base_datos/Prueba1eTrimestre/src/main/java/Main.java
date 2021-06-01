public class Main {

    public static void main(String[] args) {

        System.out.println("-----------------------------");
        System.out.println("LISTA DE EMPLEADOS");
        System.out.println(AccesoDatos.getEmpleados());
        System.out.println("-----------------------------");


        System.out.println("-----------------------------");
        System.out.println("LISTA DE OFICINAS");
        System.out.println(AccesoDatos.getOffices());
        System.out.println("-----------------------------");


        ConexionBD.close();
    }
}

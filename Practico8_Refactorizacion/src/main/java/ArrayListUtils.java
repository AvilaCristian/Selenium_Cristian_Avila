import java.util.ArrayList;

public class ArrayListUtils {

    public static void imprimirListaEnteros(ArrayList<Integer> listaEnteros){
        if (listaEnteros.isEmpty()) {
            System.out.println("No hay numeros en la lista");
        } else {
            for (Integer num : listaEnteros){
                System.out.println(num);
            }
        }
    }

    public static void imprimirListaString(ArrayList<String> listaStrings){
        if (listaStrings.isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            for (String palabra : listaStrings){
                System.out.println(palabra);
            }
        }
    }

    public static void imprimirEmpleados(ArrayList<Empleado> listaEmpleados){
        System.out.println("******* LISTA DE EMPLEADOS *******");
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados en el sistema");
        } else {
            for (Empleado unEmpleadoDelSistema : listaEmpleados ){
                System.out.println(unEmpleadoDelSistema);
            }
        }

    }
}

import java.util.Scanner;

public class JavaUtils {

    public static void bienvenida(){

        System.out.println("Bienvenido al Programa!!");
    }

    public static void finalizarPrograma(){

        System.out.println("El programa ha finalizado!!");
    }

    public static String ingresarPalabra (String mensaje){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        String palabra = input.next();
        return palabra;
    }

    public static int ingresarNumero(String mensaje){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        int num = input.nextInt();
        return num;
    }
}

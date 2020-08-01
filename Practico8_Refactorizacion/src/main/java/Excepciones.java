import java.util.InputMismatchException;

public class Excepciones {

    public static void main (String args[]){
        JavaUtils.bienvenida();
        int num = -1;
        int suma = 0;
        int contador = 0;


        int [] arreglo = new int[5];
        try {
            System.out.println(arreglo[4]);
        } catch (ArrayIndexOutOfBoundsException exceptionArreglos){
            System.out.println("Esa posicion no existe en el arreglo!!");
        } catch (Exception exceptionGenerica){
            System.out.println("Ha ocurrido un error!!" + exceptionGenerica.getMessage());
        }


        num = JavaUtils.ingresarNumero("Ingrese numeros hasta presionar 0");
        while (num != 0) {
            suma = suma + num;
            contador ++;
            num = JavaUtils.ingresarNumero("Ingrese un numero");
        }

        try {
            float promedio = suma / contador;
            System.out.println("El promedio es " + promedio);
        } catch (Exception ex) {
            System.out.println("El promedio es 0!!!");
        }

        try {
            int edad = JavaUtils.ingresarNumero("Ingrese su edad");
            System.out.println("Su edad es " + edad);
        }
        catch (InputMismatchException e){
            System.out.println("Deberia haber ingresado un numero!!!");
        } catch (Exception ex) {
            System.out.println("Ha occurrido un error desconocido. Contacte a un admin");
        }

        JavaUtils.finalizarPrograma();

    }
}

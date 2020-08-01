import java.util.ArrayList;
import java.util.Scanner;

public class GestionCamiones {

    public static void main(String args[]){

        Camion c1 = new Camion();
        int chapa = JavaUtils.ingresarNumero("Ingrese el numero de chapa");
        c1.setChapa(chapa);

        String color = JavaUtils.ingresarPalabra("Ingrese el color");
        c1.setColor(color);

        Cliente unDueño = new Cliente();

        c1.setDueño(unDueño);

        System.out.println(c1);

//        ArrayListUtils.imprimirEmpleados(listaEmpleados);

    }



}
package Practica4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) { //1.Escribir un método que reciba un número y retorne su doble
        Scanner teclado = new Scanner(System.in);

        System.out.println(" Ingrese un numero");
        int numero = teclado.nextInt();

        int duplicar = doble (numero);
        System.out.println(" El doble de "+numero+ " es: " +duplicar );
    }

    public static int doble( int numero){
        return numero * 2;
    }


}
